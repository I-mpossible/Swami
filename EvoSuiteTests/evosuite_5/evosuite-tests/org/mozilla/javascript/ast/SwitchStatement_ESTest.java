/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:04:01 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.SwitchStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwitchStatement_ESTest extends SwitchStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      SwitchCase switchCase0 = new SwitchCase(4);
      switchStatement0.addCase(switchCase0);
      switchStatement0.setExpression(switchCase0);
      assertEquals((-1675), switchCase0.getPosition());
      
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals(1679, switchStatement0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      SwitchCase switchCase0 = new SwitchCase(4);
      switchStatement0.addCase(switchCase0);
      switchStatement0.setExpression(switchCase0);
      assertEquals((-1675), switchCase0.getPosition());
      
      String string0 = switchStatement0.toSource((-1));
      assertEquals("switch (default:\n) {\ndefault:\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(221);
      switchStatement0.setRp(51);
      assertEquals(51, switchStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(0);
      switchStatement0.setParens(115, (-27));
      assertEquals(115, switchStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      switchStatement0.setLp(6);
      assertEquals(6, switchStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(221);
      LinkedList<SwitchCase> linkedList0 = new LinkedList<SwitchCase>();
      SwitchCase switchCase0 = new SwitchCase(4);
      linkedList0.add(switchCase0);
      switchStatement0.setCases(linkedList0);
      assertEquals((-1), switchStatement0.getRp());
      assertEquals(221, switchStatement0.getAbsolutePosition());
      assertEquals((-1), switchStatement0.getLp());
      assertEquals(115, switchStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      int int0 = switchStatement0.getRp();
      assertEquals((-1), switchStatement0.getLp());
      assertEquals((-1), int0);
      assertEquals(115, switchStatement0.getType());
      assertEquals(1679, switchStatement0.getLength());
      assertEquals(1679, switchStatement0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      int int0 = switchStatement0.getLp();
      assertEquals((-1), int0);
      assertEquals(1679, switchStatement0.getLength());
      assertEquals((-1), switchStatement0.getRp());
      assertEquals(1679, switchStatement0.getPosition());
      assertEquals(115, switchStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(0);
      switchStatement0.getExpression();
      assertEquals(115, switchStatement0.getType());
      assertEquals(0, switchStatement0.getAbsolutePosition());
      assertEquals((-1), switchStatement0.getLp());
      assertEquals((-1), switchStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(1679, 1679);
      SwitchCase switchCase0 = new SwitchCase(4);
      switchStatement0.addCase(switchCase0);
      assertEquals((-1675), switchCase0.getPosition());
      
      List<SwitchCase> list0 = switchStatement0.getCases();
      switchStatement0.setCases(list0);
      assertEquals("115", switchStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      assertEquals((-1), switchStatement0.getRp());
      assertEquals("115", switchStatement0.toString());
      assertEquals((-1), switchStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement((-1149), (-1149));
      switchStatement0.setCases((List<SwitchCase>) null);
      assertEquals((-1), switchStatement0.getRp());
      assertEquals((-1149), switchStatement0.getLength());
      assertEquals((-1149), switchStatement0.getPosition());
      assertEquals(115, switchStatement0.getType());
      assertEquals((-1), switchStatement0.getLp());
  }
}