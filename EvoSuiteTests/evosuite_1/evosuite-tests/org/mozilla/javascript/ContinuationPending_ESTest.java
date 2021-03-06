/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:54:56 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ContinuationPending;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinuationPending_ESTest extends ContinuationPending_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContinuationPending continuationPending0 = new ContinuationPending(nativeContinuation0);
      continuationPending0.setContinuation(nativeContinuation0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContinuationPending continuationPending0 = new ContinuationPending(nativeContinuation0);
      continuationPending0.setApplicationState(nativeContinuation0);
      assertEquals("object", nativeContinuation0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContinuationPending continuationPending0 = new ContinuationPending(nativeContinuation0);
      NativeContinuation nativeContinuation1 = continuationPending0.getContinuationState();
      assertSame(nativeContinuation0, nativeContinuation1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuationPending continuationPending0 = new ContinuationPending((NativeContinuation) null);
      Object object0 = continuationPending0.getContinuation();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContinuationPending continuationPending0 = new ContinuationPending((NativeContinuation) null);
      Object object0 = continuationPending0.getApplicationState();
      assertNull(object0);
  }
}
