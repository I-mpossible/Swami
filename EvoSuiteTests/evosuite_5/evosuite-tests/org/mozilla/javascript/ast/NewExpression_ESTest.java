/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:24:03 GMT 2018
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
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.ObjectLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewExpression_ESTest extends NewExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.target = (AstNode) objectLiteral0;
      newExpression0.setInitializer(objectLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tNEW -1 1\n-1\t  OBJECTLIT 0 1\n-1\t  OBJECTLIT 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.target = (AstNode) objectLiteral0;
      StringBuilder stringBuilder0 = new StringBuilder();
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      newExpression0.arguments = (List<AstNode>) linkedList0;
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      linkedList0.add((AstNode) objectLiteral0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tNEW -1 1\n-1\tOBJECTLIT -1 1\n-1\tOBJECTLIT -1 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.target = (AstNode) objectLiteral0;
      newExpression0.setInitializer(objectLiteral0);
      assertEquals(0, objectLiteral0.getPosition());
      
      String string0 = newExpression0.toSource(4);
      assertEquals("        new {}() {}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.target = (AstNode) objectLiteral0;
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      newExpression0.arguments = (List<AstNode>) linkedList0;
      String string0 = newExpression0.toSource(4);
      assertEquals("        new {}()", string0);
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0, 72);
      newExpression0.getInitializer();
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0);
      assertEquals(30, newExpression0.getType());
  }
}