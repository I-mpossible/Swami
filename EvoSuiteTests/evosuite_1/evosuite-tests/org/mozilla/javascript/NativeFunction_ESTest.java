/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 06:56:31 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeFunction_ESTest extends NativeFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "catch", "s[TpR)qSl}@", true);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(120, "", "", true);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-209), "))", "))", false);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
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
      InterpreterData interpreterData0 = new InterpreterData((-2632), (String) null, (String) null, true);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
