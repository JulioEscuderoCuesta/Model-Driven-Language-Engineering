/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica3;

import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class FactoryRuntimeModule extends AbstractFactoryRuntimeModule {
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return MyConverterImplementation.class;
	}
}