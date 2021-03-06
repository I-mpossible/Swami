/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:45:09 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuleSourceProviderBase_ESTest extends ModuleSourceProviderBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null);
      URI uRI0 = MockURI.aFileURI;
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadSource(uRI0, uRI0, (Object) uRI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<URI> linkedList0 = new LinkedList<URI>();
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(linkedList0, linkedList0, defaultUrlConnectionExpiryCalculator0, urlConnectionSecurityDomainProvider0);
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadSource("}tI50N39P-f'_hh^", (Scriptable) nativeFloat64Array0, (Object) nativeFloat64Array0);
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null);
      Context.getCurrentContext();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(76);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "error reporter";
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayDeque<URI> arrayDeque0 = new ArrayDeque<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayDeque0, arrayDeque0);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(44);
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadSource((String) null, (Scriptable) nativeInt32Array0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
