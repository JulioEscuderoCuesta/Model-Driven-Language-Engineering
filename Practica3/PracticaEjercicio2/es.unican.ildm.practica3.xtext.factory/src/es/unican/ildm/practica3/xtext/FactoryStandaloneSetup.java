/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica3.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class FactoryStandaloneSetup extends FactoryStandaloneSetupGenerated {

	public static void doSetup() {
		new FactoryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}