/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica4.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import factory.Factory
import factory.Machine

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FactoryGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (factory : resource.allContents.toIterable.filter(Factory)) {
			fsa.generateFile("machines.csv", factory.compileMachine);
		}

	}
	
	def compileMachine(Factory factory) 
	'''
		name, processingTime
		«FOR machine: factory.machines»
			«machine.name»,«machine.processingTime»,
		«ENDFOR»
	'''
	
	def machines(Factory factory) {
		return factory.elements.filter(Machine).toList
	}
}
