/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:48:17 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.NumberLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneratorExpression_ESTest extends GeneratorExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ErrorNode errorNode0 = new ErrorNode(2);
      generatorExpression0.setResult(errorNode0);
      NumberLiteral numberLiteral0 = new NumberLiteral(0, 0);
      generatorExpression0.setFilter(numberLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder("()");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      generatorExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("()-1\tGENEXPR -1 1\n2\t  ERROR 3 1\n0\t  NUMBER 1 0\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(163, generatorExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ErrorNode errorNode0 = new ErrorNode(2);
      generatorExpression0.setResult(errorNode0);
      StringBuilder stringBuilder0 = new StringBuilder("()");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      generatorExpression0.addLoop(generatorExpressionLoop0);
      // Undeclared exception!
      try { 
        generatorExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ErrorNode errorNode0 = new ErrorNode(5, 12);
      generatorExpression0.setResult(errorNode0);
      NumberLiteral numberLiteral0 = new NumberLiteral(17, 5);
      generatorExpression0.setFilter(numberLiteral0);
      assertEquals(18, numberLiteral0.getPosition());
      
      String string0 = generatorExpression0.toSource(27);
      assertEquals("( if (<null>))", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ErrorNode errorNode0 = new ErrorNode(7, 1);
      generatorExpression0.setResult(errorNode0);
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(4, 0);
      generatorExpression0.addLoop(generatorExpressionLoop0);
      // Undeclared exception!
      try { 
        generatorExpression0.toSource(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(10, 13);
      LinkedList<GeneratorExpressionLoop> linkedList0 = new LinkedList<GeneratorExpressionLoop>();
      linkedList0.offerLast(generatorExpressionLoop0);
      generatorExpression0.setLoops(linkedList0);
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getFilterRp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.setIfPosition(11);
      assertEquals(11, generatorExpression0.getIfPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.setFilterRp((-1));
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals("163", generatorExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.setFilterLp((-1651));
      assertEquals((-1651), generatorExpression0.getFilterLp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.getResult();
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals(163, generatorExpression0.getType());
      assertEquals((-1), generatorExpression0.getIfPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(1775);
      generatorExpression0.getLoops();
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals("163", generatorExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      int int0 = generatorExpression0.getFilterRp();
      assertEquals("163", generatorExpression0.toString());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      int int0 = generatorExpression0.getFilterLp();
      assertEquals((-1), int0);
      assertEquals("163", generatorExpression0.toString());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals((-1), generatorExpression0.getFilterRp());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      generatorExpression0.getFilter();
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getIfPosition());
      assertEquals("163", generatorExpression0.toString());
      assertEquals((-1), generatorExpression0.getFilterRp());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GeneratorExpression generatorExpression0 = new GeneratorExpression(2521, 2521);
      int int0 = generatorExpression0.getIfPosition();
      assertEquals((-1), generatorExpression0.getFilterLp());
      assertEquals((-1), generatorExpression0.getFilterRp());
      assertEquals((-1), int0);
      assertEquals(163, generatorExpression0.getType());
  }
}
