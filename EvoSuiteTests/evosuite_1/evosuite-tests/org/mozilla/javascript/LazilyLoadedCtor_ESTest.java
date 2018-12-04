/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:05:54 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LazilyLoadedCtor_ESTest extends LazilyLoadedCtor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "language version", "org.mozilla.javascript.typedarrays.NativeArrayBufferView", true, true);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeError0, "9 &n$t,h=", "org.mozilla.javascript.LazilyLoadedCtor$1", false);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "language version", "org.mozilla.javascript.typedarrays.NativeUint8ClampedArray", true, true);
      // Undeclared exception!
      try { 
        lazilyLoadedCtor0.init();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "language version", "org.mozilla.javascript.BaseFunction", true, true);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }
}