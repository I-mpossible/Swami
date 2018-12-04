/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:23:41 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.RegExpLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegExpLiteral_ESTest extends RegExpLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      regExpLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tREGEXP -1 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.toSource(1933);
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(133, 133);
      regExpLiteral0.setValue("");
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.setFlags("");
      assertEquals(48, regExpLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(133, 133);
      regExpLiteral0.getFlags();
      assertEquals(48, regExpLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(130);
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.getValue();
      assertEquals("48", regExpLiteral0.toString());
  }
}