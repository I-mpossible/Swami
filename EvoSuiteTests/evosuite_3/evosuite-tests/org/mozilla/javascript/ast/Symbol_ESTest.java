/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:43:44 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.Symbol;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Symbol_ESTest extends Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Symbol symbol0 = new Symbol(155, "METHOD");
      String string0 = symbol0.toString();
      assertEquals("Symbol (CONST) name=METHOD", string0);
      assertEquals(155, symbol0.getDeclType());
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      PropertyGet propertyGet0 = new PropertyGet();
      symbol0.setNode(propertyGet0);
      String string0 = symbol0.toString();
      assertEquals("Symbol (EOF) name=null line=-1", string0);
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Symbol symbol0 = new Symbol(155, "METHOD");
      symbol0.setIndex(155);
      assertEquals(155, symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Symbol symbol0 = null;
      try {
        symbol0 = new Symbol(24, "CONST");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid declType: 24
         //
         verifyException("org.mozilla.javascript.ast.Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      ScriptNode scriptNode0 = new ScriptNode();
      symbol0.setContainingTable(scriptNode0);
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      symbol0.getNode();
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Symbol symbol0 = new Symbol(154, "gN>aY<KtK:l:w'|p");
      int int0 = symbol0.getIndex();
      assertEquals(154, symbol0.getDeclType());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      int int0 = symbol0.getDeclType();
      assertEquals(0, int0);
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Symbol symbol0 = new Symbol(154, "Symbol (");
      symbol0.getName();
      assertEquals(154, symbol0.getDeclType());
      assertEquals((-1), symbol0.getIndex());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Symbol symbol0 = new Symbol();
      symbol0.getContainingTable();
      assertEquals((-1), symbol0.getIndex());
  }
}