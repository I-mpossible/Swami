/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:38:00 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ScriptStackElement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptStackElement_ESTest extends ScriptStackElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("anonymous", "anonymous", (-1058));
      StringBuilder stringBuilder0 = new StringBuilder();
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("    at anonymous:0:0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("\npsinys", "\npsinys", 4422);
      String string0 = scriptStackElement0.toString();
      assertEquals("\npsinys()@\npsinys:4422", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("\npsinys", "\npsinys", 4422);
      StringBuilder stringBuilder0 = new StringBuilder("\npsinys");
      scriptStackElement0.renderJavaStyle(stringBuilder0);
      assertEquals("\npsinys\tat \npsinys:4422 (\npsinys)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("\npsinys", "\npsinys", 4422);
      StringBuilder stringBuilder0 = new StringBuilder("\npsinys");
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("\npsinys    at \npsinys (\npsinys:4422:0)", stringBuilder0.toString());
  }
}