package es.unican.ildm.practica3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class MyConverterImplementation extends Ecore2XtextTerminalConverters {
		
		@ValueConverter(rule = "EDate")
		public IValueConverter<Date> EDate() {
			return new AbstractNullSafeConverter<Date>() {

				@Override
				protected String internalToString(Date value) {
					return String.format("%d/%d/%d", value.getDay(), value.getMonth(), value.getYear());
				}

				@Override
				protected Date internalToValue(String string, INode node) throws ValueConverterException {
					try {
						return new SimpleDateFormat("dd/MM/yyyy").parse(string.substring(1, string.length()-1));
					} catch (ParseException e) {
						throw new ValueConverterException(string + " is not a valid date", node, null);
					} 
				}
			};
			
		}
	}
