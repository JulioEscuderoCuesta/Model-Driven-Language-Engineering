/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica3.ui;

import com.google.inject.Injector;
import es.unican.ildm.practica3.factory.ui.internal.FactoryActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FactoryExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FactoryActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FactoryActivator activator = FactoryActivator.getInstance();
		return activator != null ? activator.getInjector(FactoryActivator.ES_UNICAN_ILDM_PRACTICA3_FACTORY) : null;
	}

}
