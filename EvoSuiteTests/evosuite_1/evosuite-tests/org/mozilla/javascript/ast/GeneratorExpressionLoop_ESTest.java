/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:06:25 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneratorExpressionLoop_ESTest extends GeneratorExpressionLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      XmlString xmlString0 = new XmlString();
      generatorExpressionLoop0.setIteratedObject(xmlString0);
      generatorExpressionLoop0.setIterator(xmlString0);
      String string0 = generatorExpressionLoop0.debugPrint();
      assertEquals("-1\tFOR -1 1\n-1\t  XML 0 1\n-1\t  XML 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      XmlString xmlString0 = new XmlString();
      generatorExpressionLoop0.setIterator(xmlString0);
      // Undeclared exception!
      try { 
        generatorExpressionLoop0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      // Undeclared exception!
      try { 
        generatorExpressionLoop0.setIsForEach(false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // this node type does not support for each
         //
         verifyException("org.mozilla.javascript.ast.GeneratorExpressionLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop((-1202), 1273);
      assertEquals(13, Node.INCRDECR_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop(2879);
      assertEquals(14, Node.CATCH_SCOPE_PROP);
  }
}