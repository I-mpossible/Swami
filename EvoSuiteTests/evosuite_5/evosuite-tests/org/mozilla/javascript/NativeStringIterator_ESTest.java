/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 04:48:50 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeStringIterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeStringIterator_ESTest extends NativeStringIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      NativeError nativeError0 = new NativeError();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeError0);
      Scriptable scriptable1 = ScriptableObject.getArrayPrototype(scriptable0);
      NativeStringIterator nativeStringIterator0 = new NativeStringIterator(scriptable1, scriptable0);
      Object object0 = nativeStringIterator0.nextValue(context0, scriptable0);
      assertEquals("[", object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      NativeError nativeError0 = new NativeError();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeError0);
      Scriptable scriptable1 = ScriptableObject.getArrayPrototype(scriptable0);
      NativeStringIterator nativeStringIterator0 = new NativeStringIterator(scriptable1, scriptable0);
      boolean boolean0 = nativeStringIterator0.isDone(context0, nativeError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      NativeError nativeError0 = new NativeError();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeError0);
      Scriptable scriptable1 = ScriptableObject.getArrayPrototype(scriptable0);
      NativeStringIterator nativeStringIterator0 = new NativeStringIterator(scriptable1, scriptable0);
      String string0 = nativeStringIterator0.getClassName();
      assertEquals("String Iterator", string0);
  }
}
