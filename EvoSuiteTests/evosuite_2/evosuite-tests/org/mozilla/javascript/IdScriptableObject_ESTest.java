/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:43:07 GMT 2018
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
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(importerTopLevel0, importerTopLevel0);
      // Undeclared exception!
      try { 
        nativeArrayIterator0.exportAsJSClass(110, importerTopLevel0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No id for constructor property
         //
         verifyException("org.mozilla.javascript.IdScriptableObject$PrototypeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, nativeObject0, 8, 0);
      // Undeclared exception!
      try { 
        idFunctionObject0.setInstanceIdValue((-711), nativeObject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -711
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, "3s$$hC8", 0, 1);
      SymbolKey symbolKey0 = SymbolKey.HAS_INSTANCE;
      // Undeclared exception!
      try { 
        idFunctionObject0.initPrototypeValue((-1163), (Symbol) symbolKey0, (Object) symbolKey0, (-3652));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.initPrototypeValue((-46), "/*\n", (Object) "/*\n", (-46));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(130);
      NativeString nativeString0 = new NativeString("error reporter");
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0.VERSION_DEFAULT, 0, "error reporter", 0, nativeString0);
      // Undeclared exception!
      try { 
        IdScriptableObject.incompatibleCallError(idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.hasPrototypeMap();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = nativeCall0.getOwnPropertyDescriptor(context0, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      // Undeclared exception!
      try { 
        nativeString0.getInstanceIdValue((-16));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -16
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(169);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint8Array0, "", 4, "", 2, nativeUint8Array0);
      // Undeclared exception!
      try { 
        idFunctionObject0.setInstanceIdAttributes(200, (-2934));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 200
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, nativeObject0, 8, 0);
      Object[] objectArray0 = idFunctionObject0.getIds(true, true);
      assertEquals(4, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Object[] objectArray0 = nativeArrayBuffer0.getIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = nativeIterator_StopIteration0.getOwnPropertyDescriptor(context0, "1'V'");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.findPrototypeId("k,[U~C@R:>!2z");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // k,[U~C@R:>!2z
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setExternalArrayData((ExternalArrayData) null);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, contextFactory0, 170, 4);
      idFunctionObject0.defaultPut("error reporter", contextFactory0);
      assertFalse(contextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      boolean boolean0 = nativeCall0.defaultHas("B5\"}S?_z'Oaw6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.defaultGet((String) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      SymbolKey symbolKey0 = SymbolKey.ITERATOR;
      // Undeclared exception!
      try { 
        importerTopLevel0.initPrototypeMethod((Object) "@", 2985, (Symbol) symbolKey0, "error reporter", 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject$PrototypeValues", e);
      }
  }
}