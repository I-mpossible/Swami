/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:39:28 GMT 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstRoot_ESTest extends AstRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.setType(1856);
      // Undeclared exception!
      try { 
        astRoot0.checkParentLinks();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No parent for node: 1856
         //
         verifyException("org.mozilla.javascript.ast.AstRoot$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(27, 26, token_CommentType0, "");
      astRoot0.addChild(comment0);
      astRoot0.checkParentLinks();
      assertEquals(19, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(27, 26, token_CommentType0, "");
      astRoot0.addComment(comment0);
      StringBuilder stringBuilder0 = new StringBuilder("s]]m/^JHnWyk]X");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      astRoot0.visitComments(astNode_DebugPrintVisitor0);
      assertEquals("s]]m/^JHnWyk]X27\t  COMMENT 28 26\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
      Comment comment0 = new Comment(27, 26, token_CommentType0, "");
      astRoot0.addChild(comment0);
      String string0 = astRoot0.toSource(15);
      assertEquals("137", astRoot0.toString());
      assertEquals("                              ", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(21, 0, token_CommentType0, "9&i");
      astRoot0.addComment(comment0);
      SortedSet<Comment> sortedSet0 = astRoot0.getComments();
      astRoot0.setComments(sortedSet0);
      assertEquals(137, astRoot0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      astRoot0.setComments((SortedSet<Comment>) null);
      assertEquals("137", astRoot0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot((-1078));
      String string0 = astRoot0.debugPrint();
      assertEquals("-1078\tSCRIPT -1078 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(1, 137, token_CommentType0, "mZf*cFG`7HrD");
      treeSet0.add(comment0);
      astRoot0.setComments(treeSet0);
      assertEquals("137", astRoot0.toString());
  }
}