package no.sintef.bvr.planner.repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import no.sintef.bvr.planner.FeatureSet;
import no.sintef.bvr.planner.State;
import no.sintef.bvr.planner.Status;

/**
 * Read states from properties file (*.properties)
 */
public class PropertiesStateReader implements StateReader {

    public static final String INVALID_STATUS = "Invalid status '%2$s' for feature '%1$s'";

    private final static Map<String, Status> statuses;

    static {
        statuses = new HashMap<>();
        statuses.put("negative", Status.NEGATIVE);
        statuses.put("-", Status.NEGATIVE);

        statuses.put("positive", Status.POSITIVE);
        statuses.put("+", Status.POSITIVE);

        statuses.put("pending", Status.PENDING);
        statuses.put("?", Status.PENDING);
        statuses.put("0", Status.PENDING);
    }

    
    private final String fileLocation;
    private final FileSystem fileSystem;
    
    public PropertiesStateReader(String location) {
        this(location, new FileSystem());
    }
    
    public PropertiesStateReader(String location, FileSystem fileSystem) {
        this.fileLocation = location;
        this.fileSystem = fileSystem;
    }

    @Override
    public State read() throws ReaderException {
        try {
            InputStream source = fileSystem.asInput(fileLocation);
            Properties properties = readProperties(source);
            FeatureSet features = extractFeatureSet(properties);
            Status[] statuses = extractStatuses(features, properties);
            return new State(features, statuses);

        } catch (IOException ex) {
            throw new ReaderException(this.fileLocation, ex);
        }
    }

    private Properties readProperties(InputStream source) throws IOException {
        Properties properties = new Properties();
        properties.load(source);
        return properties;
    }

    private FeatureSet extractFeatureSet(Properties properties) {
        List<String> featuresNames = new ArrayList<>(properties.stringPropertyNames());
        Collections.sort(featuresNames);
        return new FeatureSet(featuresNames);
    }

    private Status[] extractStatuses(FeatureSet features, Properties properties) throws ReaderException {
        Status[] statuses = new Status[features.count()];
        for (String eachFeature : features.names()) {
            String statusText = properties.getProperty(eachFeature);
            statuses[features.indexOf(eachFeature)] = parseStatus(eachFeature, statusText);
        }
        return statuses;
    }

    private Status parseStatus(String feature, String statusText) throws ReaderException {
        final String escapedStatus = statusText.trim().toLowerCase();
        final Status status = statuses.get(escapedStatus);
        if (status == null) {
            final String error = String.format(INVALID_STATUS, feature, statusText);
            throw new ReaderException(error);
        }
        return status;
    }

}
