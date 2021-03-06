/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:05:05 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.VariableDeclaration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LetNode_ESTest extends LetNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.debugPrint();
      assertEquals((-1), letNode0.getLp());
      assertEquals("-1\tLETEXPR -1 1\n-1\t  VAR 0 1\n", string0);
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      letNode0.setBody(letNode0);
      // Undeclared exception!
      try { 
        letNode0.toSource(3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.toSource(3);
      assertEquals((-1), letNode0.getRp());
      assertEquals((-1), letNode0.getLp());
      assertEquals("159", letNode0.toString());
      assertEquals("      let () ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LetNode letNode0 = new LetNode((-170), 54);
      letNode0.setRp((-170));
      assertEquals((-170), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.setParens(14, 3264);
      assertEquals(3264, letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.setLp(1421);
      assertEquals(1421, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      ErrorNode errorNode0 = new ErrorNode();
      letNode0.setBody(errorNode0);
      assertEquals(0, errorNode0.getPosition());
      
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.debugPrint();
      assertEquals("-1\tLETEXPR -1 1\n-1\t  VAR 0 1\n-1\t  ERROR 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.getVariables();
      assertEquals(159, letNode0.getType());
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      int int0 = letNode0.getRp();
      assertEquals(159, letNode0.getType());
      assertEquals((-1), int0);
      assertEquals((-1), letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      int int0 = letNode0.getLp();
      assertEquals((-1), int0);
      assertEquals((-1), letNode0.getRp());
      assertEquals(159, letNode0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LetNode letNode0 = new LetNode(0);
      assertEquals((-1), letNode0.getRp());
      assertEquals((-1), letNode0.getLp());
      assertEquals(159, letNode0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.getBody();
      assertEquals((-1), letNode0.getLp());
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getRp());
  }
}
