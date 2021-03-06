/**
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.marking.ide;

import ac.soton.xmark.marking.XMarkingRuntimeModule;
import ac.soton.xmark.marking.XMarkingStandaloneSetup;
import ac.soton.xmark.marking.ide.XMarkingIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XMarkingIdeSetup extends XMarkingStandaloneSetup {
  @Override
  public Injector createInjector() {
    XMarkingRuntimeModule _xMarkingRuntimeModule = new XMarkingRuntimeModule();
    XMarkingIdeModule _xMarkingIdeModule = new XMarkingIdeModule();
    return Guice.createInjector(Modules2.mixin(_xMarkingRuntimeModule, _xMarkingIdeModule));
  }
}
