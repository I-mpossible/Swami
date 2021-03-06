/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:57:36 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.WhileLoop;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WhileLoop_ESTest extends WhileLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      Label label0 = new Label();
      whileLoop0.setCondition(label0);
      whileLoop0.setBody(label0);
      String string0 = whileLoop0.debugPrint();
      assertEquals("-1\tWHILE -1 2\n-1\t  LABEL 0 1\n-1\t  LABEL 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      Label label0 = new Label();
      whileLoop0.setCondition(label0);
      whileLoop0.setBody(label0);
      String string0 = whileLoop0.toSource(2);
      assertEquals("118", whileLoop0.toString());
      assertEquals("    while (null:\n) \n      null:\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      Label label0 = new Label();
      label0.setType(130);
      whileLoop0.setCondition(label0);
      whileLoop0.setBody(label0);
      String string0 = whileLoop0.toSource(2);
      assertEquals("118", whileLoop0.toString());
      assertEquals("    while (null:\n) null:\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop((-11), (-11));
      whileLoop0.getCondition();
      assertEquals("118", whileLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop((-2297));
      assertEquals(118, whileLoop0.getType());
  }
}
