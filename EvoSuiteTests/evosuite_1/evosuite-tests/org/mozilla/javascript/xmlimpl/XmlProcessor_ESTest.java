/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:08:31 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlProcessor_ESTest extends XmlProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      // Undeclared exception!
      try { 
        xmlProcessor0.toXml("yKP$_\"\"", "yes");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Element type \"parent\" must be followed by either attribute specifications, \">\" or \"/>\".
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, (String) null);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "a");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "pS_]K-'*&ze!");
      XML xML0 = new XML((XMLLibImpl) null, (Scriptable) null, (XMLObject) null, xmlNode1);
      Node node0 = xML0.toDomNode();
      XmlNode[] xmlNodeArray0 = new XmlNode[7];
      xmlNodeArray0[0] = xmlNode0;
      xmlNodeArray0[1] = xmlNode0;
      xmlNodeArray0[2] = xmlNode0;
      xmlNodeArray0[3] = xmlNode0;
      xmlNodeArray0[4] = xmlNode1;
      xmlNodeArray0[5] = xmlNode0;
      xmlNodeArray0[6] = xmlNode1;
      xmlNode1.insertChildrenAt(0, xmlNodeArray0);
      // Undeclared exception!
      try { 
        xmlProcessor0.ecmaToXmlString(node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // javax.xml.transform.TransformerException: java.lang.NullPointerException
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isPrettyPrinting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreWhitespace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreProcessingInstructions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      boolean boolean0 = xmlProcessor0.isIgnoreComments();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      int int0 = xmlProcessor0.getPrettyIndent();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml("", "`");
      String string0 = xmlProcessor0.ecmaToXmlString(node0);
      assertEquals("`", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML((XMLLibImpl) null, nativeJavaClass0, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xmlProcessor0.escapeTextValue(xML0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLObjectImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Object object0 = new Object();
      String string0 = xmlProcessor0.escapeAttributeValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml("`", "");
      String string0 = xmlProcessor0.ecmaToXmlString(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "a");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "pS_]K-'*&ze!");
      XML xML0 = new XML((XMLLibImpl) null, (Scriptable) null, (XMLObject) null, xmlNode1);
      Node node0 = xML0.toDomNode();
      XmlNode[] xmlNodeArray0 = new XmlNode[7];
      xmlNodeArray0[0] = xmlNode0;
      xmlNodeArray0[1] = xmlNode0;
      xmlNodeArray0[2] = xmlNode0;
      xmlNodeArray0[3] = xmlNode0;
      xmlNodeArray0[4] = xmlNode1;
      xmlNodeArray0[5] = xmlNode0;
      xmlNodeArray0[6] = xmlNode1;
      xmlNode1.insertChildrenAt(0, xmlNodeArray0);
      String string0 = xmlProcessor0.ecmaToXmlString(node0);
      assertEquals("<a>\n  \n  \n  \n  \n  <a>\n    \n    \n    \n    \n    pS_]K-'*&amp;ze!\n  </a>\n  \n  <a>\n    \n    \n    \n    \n    <a>\n      \n      \n      \n      \n      pS_]K-'*&amp;ze!\n    </a>\n    \n    pS_]K-'*&amp;ze!\n  </a>\n  pS_]K-'*&amp;ze!\n</a>", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      // Undeclared exception!
      try { 
        xmlProcessor0.toXml("\">", "<a>\n  \n  \n  \n  \n  <a>\n    \n    \n    \n    \n    pS_]K-'*&amp;ze!\n  </a>\n  \n  <a>\n    \n    \n    \n    \n    <a>\n      \n      \n      \n      \n      pS_]K-'*&amp;ze!\n    </a>\n    \n    pS_]K-'*&amp;ze!\n  </a>\n  pS_]K-'*&amp;ze!\n</a>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: XML objects may contain at most one node.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}