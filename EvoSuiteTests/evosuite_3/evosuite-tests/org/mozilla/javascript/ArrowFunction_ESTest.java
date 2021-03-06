/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:00:52 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrowFunction_ESTest extends ArrowFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 3239, 4);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeArrayBuffer0, (Callable) null, nativeInt32Array0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(160);
      Synchronizer synchronizer0 = new Synchronizer(nativeUint32Array0);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeUint32Array0, synchronizer0, nativeUint32Array0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6((IdFunctionCall) null, (Object) null, 13, "", 3177, nativeBoolean0);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeBoolean0, idFunctionObjectES6_0, nativeBoolean0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(10);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 3239, 4);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeInt32Array0, (Callable) null, nativeArrayBuffer0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(160);
      Synchronizer synchronizer0 = new Synchronizer(nativeUint32Array0);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction(context0, nativeUint32Array0, synchronizer0, (Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }
}
