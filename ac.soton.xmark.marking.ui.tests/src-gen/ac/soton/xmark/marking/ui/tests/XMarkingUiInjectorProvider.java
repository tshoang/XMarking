/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.marking.ui.tests;

import ac.soton.xmark.marking.ui.internal.MarkingActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XMarkingUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MarkingActivator.getInstance().getInjector("ac.soton.xmark.marking.XMarking");
	}

}