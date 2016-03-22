/*
 * generated by Xtext 2.9.2
 */
package no.sintef.xtext.dsl.operator.serializer;

import com.google.inject.Inject;
import java.util.List;
import no.sintef.xtext.dsl.operator.services.RealopGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RealopSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RealopGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RealopGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAND_TOKENRule())
			return getAND_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLOSE_OP_TOKENRule())
			return getCLOSE_OP_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOND_END_TOKENRule())
			return getCOND_END_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOND_ST_TOKENRule())
			return getCOND_ST_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNOT_TOKENRule())
			return getNOT_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPEN_OP_TOKENRule())
			return getOPEN_OP_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOP_TOKENRule())
			return getOP_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOR_TOKENRule())
			return getOR_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPOST_TOKENRule())
			return getPOST_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRED_NEGATIVE_TOKENRule())
			return getPRED_NEGATIVE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRED_POSITIVE_TOKENRule())
			return getPRED_POSITIVE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRED_REALISED_TOKENRule())
			return getPRED_REALISED_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRE_TOKENRule())
			return getPRE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getXOR_TOKENRule())
			return getXOR_TOKENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AND_TOKEN : 'and';
	 */
	protected String getAND_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "and";
	}
	
	/**
	 * CLOSE_OP_TOKEN : '}';
	 */
	protected String getCLOSE_OP_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * COND_END_TOKEN : ';';
	 */
	protected String getCOND_END_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * COND_ST_TOKEN : ':';
	 */
	protected String getCOND_ST_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * NOT_TOKEN : 'not';
	 */
	protected String getNOT_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "not";
	}
	
	/**
	 * OPEN_OP_TOKEN : '{';
	 */
	protected String getOPEN_OP_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * OP_TOKEN : 'operator';
	 */
	protected String getOP_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "operator";
	}
	
	/**
	 * OR_TOKEN : 'or';
	 */
	protected String getOR_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "or";
	}
	
	/**
	 * POST_TOKEN : 'post';
	 */
	protected String getPOST_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "post";
	}
	
	/**
	 * PRED_NEGATIVE_TOKEN : 'negative';
	 */
	protected String getPRED_NEGATIVE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "negative";
	}
	
	/**
	 * PRED_POSITIVE_TOKEN : 'positive';
	 */
	protected String getPRED_POSITIVE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "positive";
	}
	
	/**
	 * PRED_REALISED_TOKEN : 'realised';
	 */
	protected String getPRED_REALISED_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "realised";
	}
	
	/**
	 * PRE_TOKEN : 'pre';
	 */
	protected String getPRE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "pre";
	}
	
	/**
	 * XOR_TOKEN: 'xor';
	 */
	protected String getXOR_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "xor";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
