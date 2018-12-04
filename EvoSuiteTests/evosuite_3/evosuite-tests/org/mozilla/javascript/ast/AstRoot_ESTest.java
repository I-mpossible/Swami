/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:44:22 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SortedSet;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.XmlPropRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstRoot_ESTest extends AstRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      xmlPropRef0.parent = (AstNode) astRoot0;
      astRoot0.addChildToFront(xmlPropRef0);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      astRoot0.addChildToFront(xmlPropRef0);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot((-1052));
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2620, 27, token_CommentType0, "");
      astRoot0.addComment(comment0);
      String string0 = astRoot0.debugPrint();
      assertEquals("-1052\tSCRIPT -1052 1\n2620\t  COMMENT 3672 27\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      astRoot0.addChild(numberLiteral0);
      String string0 = astRoot0.toSource(80);
      assertEquals("                                                                                                                                                                <null>", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(85);
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(1, 21, token_CommentType0, "\n");
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot((-1052));
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      astRoot0.setComments(sortedSet0);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.checkParentLinks();
      assertEquals(27, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot((-1052));
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2620, 27, token_CommentType0, "");
      astRoot0.addComment(comment0);
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      astRoot0.setComments(sortedSet0);
      assertFalse(sortedSet0.contains(comment0));
      assertTrue(sortedSet0.isEmpty());
  }
}