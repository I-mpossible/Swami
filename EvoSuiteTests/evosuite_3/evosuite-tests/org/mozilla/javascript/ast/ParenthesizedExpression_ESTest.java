/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:40:39 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.UnaryExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParenthesizedExpression_ESTest extends ParenthesizedExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(4898);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(4898, 4898, breakStatement0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "(break;\n)");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      parenthesizedExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("(break;\n)4898\tLP 4898 4898\n4898\t  BREAK 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(88, parenthesizedExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(4898);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(4898, 4898, breakStatement0);
      AstNode astNode0 = parenthesizedExpression0.getExpression();
      assertEquals(88, parenthesizedExpression0.getType());
      assertNotNull(astNode0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(unaryExpression0);
      StringBuilder stringBuilder0 = new StringBuilder("bk&by'^2#D]W");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        parenthesizedExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.UnaryExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(0, 0);
      assertEquals(88, parenthesizedExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(0);
      assertEquals("88", parenthesizedExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
      // Undeclared exception!
      try { 
        parenthesizedExpression0.toSource((-2454));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ParenthesizedExpression", e);
      }
  }
}