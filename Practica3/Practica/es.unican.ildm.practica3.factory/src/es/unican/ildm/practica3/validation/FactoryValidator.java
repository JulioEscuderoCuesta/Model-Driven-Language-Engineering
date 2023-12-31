/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica3.validation;

import org.eclipse.xtext.validation.Check;

import es.unican.ildm.practica3.factory.*;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class FactoryValidator extends AbstractFactoryValidator {
	
	private static final String INVALID_NAME = "invalidName";
	private static final String INVALID_DURATION = "invalidDuration";
	
	@Check
	public void checkIdIsDifferent(Factory factory) {
		boolean nameUnique = false;
		for(Element e: factory.getElements()) {
			nameUnique = true;
			for(Element other: factory.getElements()) {
				if(e != other && e.getName().equals(other.getName())) {
					nameUnique = false;
					break;
				}
			}
		if(!nameUnique)
			error("Element name cant be repeated", FactoryPackage.Literals.ELEMENT__NAME, INVALID_NAME);
		}
	}
	
	@Check
	public void checkTaskDurationIsNotNegative(Task task) {
		if(task.getDuration() < 0) 
			error("Task duration cannot be negative", FactoryPackage.Literals.TASK__DURATION, INVALID_DURATION);
	}
	
	@Check
	public void checkShiftDurationLessThan20(Shift shift) {
		int shiftDuration = 0;
		for(Task task: shift.getWork()) {
			shiftDuration+=task.getDuration();
		}
		if(shiftDuration > 20)
			error("Shift duration must be less than 20", FactoryPackage.Literals.SHIFT__WORK, INVALID_DURATION);
	}
	
}
