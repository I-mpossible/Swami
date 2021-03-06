/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:30:17 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyGet_ESTest extends PropertyGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(3800);
      Name name0 = new Name(12);
      PropertyGet propertyGet0 = new PropertyGet((-4722), 1843, regExpLiteral0, name0);
      String string0 = propertyGet0.toSource(472);
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                /null/.<null>", string0);
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(2164);
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(xmlLiteral0, name0, 1);
      assertEquals(33, propertyGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(1361.36236);
      Name name0 = new Name(2, (-444), "");
      PropertyGet propertyGet0 = new PropertyGet(numberLiteral0, name0);
      propertyGet0.setProperty(name0);
      assertEquals(33, propertyGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(0, 0);
      SwitchCase switchCase0 = new SwitchCase(122, 144);
      propertyGet0.setTarget(switchCase0);
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(791);
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(3800);
      Name name0 = new Name(12);
      PropertyGet propertyGet0 = new PropertyGet((-4722), 1843, regExpLiteral0, name0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      propertyGet0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-4722\tGETPROP -4722 1843\n3800\t  REGEXP 8522 1\n12\t  NAME 4734 1 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(33, propertyGet0.getOperator());
  }
}
