/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:38:03 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConditionalExpression_ESTest extends ConditionalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-3724), (-3724));
      Yield yield0 = new Yield(7);
      conditionalExpression0.setTestExpression(yield0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        conditionalExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ConditionalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-3724), (-3724));
      Yield yield0 = new Yield(13, 15, (AstNode) null);
      conditionalExpression0.setTestExpression(yield0);
      // Undeclared exception!
      try { 
        conditionalExpression0.toSource((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ConditionalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-851), (-851));
      conditionalExpression0.setQuestionMarkPosition((-851));
      assertEquals((-851), conditionalExpression0.getQuestionMarkPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      conditionalExpression0.setColonPosition(428);
      assertEquals(428, conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(23, 2);
      conditionalExpression0.setFalseExpression(xmlMemberGet0);
      xmlMemberGet0.setOperator(7);
      conditionalExpression0.setTrueExpression(xmlMemberGet0);
      conditionalExpression0.setTestExpression(xmlMemberGet0);
      boolean boolean0 = conditionalExpression0.hasSideEffects();
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals(103, conditionalExpression0.getType());
      assertTrue(boolean0);
      assertEquals((-1), conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      // Undeclared exception!
      try { 
        conditionalExpression0.hasSideEffects();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-1108), (-1284));
      conditionalExpression0.getTrueExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals(103, conditionalExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-3724), (-3724));
      conditionalExpression0.getTestExpression();
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      conditionalExpression0.getFalseExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals(103, conditionalExpression0.getType());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-3724), (-3724));
      int int0 = conditionalExpression0.getQuestionMarkPosition();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals(103, conditionalExpression0.getType());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-989));
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      int int0 = conditionalExpression0.getColonPosition();
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
      assertEquals((-1), int0);
  }
}
