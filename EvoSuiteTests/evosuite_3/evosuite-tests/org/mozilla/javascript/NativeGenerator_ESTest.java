/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:51:01 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeGenerator_ESTest extends NativeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeGenerator nativeGenerator0 = NativeGenerator.init((ScriptableObject) null, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      String string0 = nativeGenerator0.getClassName();
      assertEquals("Generator", string0);
      assertTrue(nativeGenerator0.isSealed());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, "Generator", 0, 13);
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeGenerator0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = Context.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, "Generator", 4, 2);
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeGenerator0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // undefined
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeObject0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeGenerator0, "send", context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null
         //
         verifyException("org.mozilla.javascript.NativeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, "Generator", 2, 13);
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeGenerator0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, "Generator", 1, 13);
      // Undeclared exception!
      try { 
        nativeGenerator0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Context context0 = Context.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      NativeGenerator nativeGenerator1 = (NativeGenerator)ScriptableObject.callMethod((Scriptable) nativeGenerator0, "__iterator__", context0.emptyArgs);
      assertTrue(nativeGenerator1.isSealed());
  }
}