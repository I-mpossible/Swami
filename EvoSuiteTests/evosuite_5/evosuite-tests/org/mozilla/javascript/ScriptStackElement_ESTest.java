/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 03:24:41 GMT 2018
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
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("A-d", "kq", (-160));
      String string0 = scriptStackElement0.toString();
      assertEquals("kq()@A-d", string0);
      assertEquals((-160), scriptStackElement0.lineNumber);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("undefined", "undefined", (-3338));
      StringBuilder stringBuilder0 = new StringBuilder();
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("    at undefined:0:0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("bnpnzmosr", "bnpnzmosr", 57);
      StringBuilder stringBuilder0 = new StringBuilder();
      scriptStackElement0.renderMozillaStyle(stringBuilder0);
      assertEquals("bnpnzmosr()@bnpnzmosr:57", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("bnpnzmosr", "bnpnzmosr", 57);
      StringBuilder stringBuilder0 = new StringBuilder();
      scriptStackElement0.renderJavaStyle(stringBuilder0);
      assertEquals("\tat bnpnzmosr:57 (bnpnzmosr)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("bnpnzmosr", "bnpnzmosr", 57);
      StringBuilder stringBuilder0 = new StringBuilder();
      scriptStackElement0.renderV8Style(stringBuilder0);
      assertEquals("    at bnpnzmosr (bnpnzmosr:57:0)", stringBuilder0.toString());
  }
}
