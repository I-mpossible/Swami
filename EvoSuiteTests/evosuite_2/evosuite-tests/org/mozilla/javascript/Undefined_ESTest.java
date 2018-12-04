/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:23:22 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Undefined;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Undefined_ESTest extends Undefined_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Undefined undefined0 = (Undefined)Undefined.instance;
      // Undeclared exception!
      try { 
        NativeCallSite.make(undefined0.SCRIPTABLE_UNDEFINED, undefined0.SCRIPTABLE_UNDEFINED);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // undefined doesn't support get
         //
         verifyException("org.mozilla.javascript.Undefined$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Undefined undefined0 = (Undefined)Undefined.instance;
      Object object0 = undefined0.readResolve();
      assertSame(object0, undefined0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Undefined undefined0 = (Undefined)Undefined.instance;
      Class<ArrowFunction> class0 = ArrowFunction.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.reportConversionError(undefined0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot convert org.mozilla.javascript.Undefined@0 to org.mozilla.javascript.ArrowFunction
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Undefined undefined0 = (Undefined)Undefined.instance;
      boolean boolean0 = undefined0.equals((Object) null);
      assertFalse(boolean0);
  }
}