/*
 * generated by Xtext 2.9.2
 */
package no.sintef.xtext.dsl.operator


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RealopStandaloneSetup extends RealopStandaloneSetupGenerated {

	def static void doSetup() {
		new RealopStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}