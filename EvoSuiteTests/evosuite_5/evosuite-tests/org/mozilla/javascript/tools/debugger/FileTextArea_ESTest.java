/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 19:55:11 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.IllegalComponentStateException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.FileTextArea;
import org.mozilla.javascript.tools.debugger.FileWindow;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileTextArea_ESTest extends FileTextArea_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.select(127);
      assertFalse(fileTextArea0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      JScrollPane jScrollPane0 = new JScrollPane(fileTextArea0);
      fileTextArea0.setSize(1, 1);
      fileTextArea0.select(0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JScrollPane jScrollPane0 = new JScrollPane(fileTextArea0);
      fileTextArea0.setBounds(0, (-28), 149, 1279);
      fileTextArea0.select(0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.select(0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(jRadioButtonMenuItem0);
      fileTextArea0.popupMenuWillBecomeVisible(popupMenuEvent0);
      assertFalse(fileTextArea0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(fileTextArea0);
      fileTextArea0.popupMenuWillBecomeInvisible(popupMenuEvent0);
      assertTrue(fileTextArea0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      PopupMenuEvent popupMenuEvent0 = new PopupMenuEvent(fileTextArea0);
      fileTextArea0.popupMenuCanceled(popupMenuEvent0);
      assertFalse(fileTextArea0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, 127, (-1L), 127, 127, 127, 9, 127, 9, false, 9, 127, 9, 127);
      fileTextArea0.mouseReleased(mouseWheelEvent0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MenuElement[] menuElementArray0 = new MenuElement[2];
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(fileTextArea0, 1354, 0, 8, 92, 0, 199, false, menuElementArray0, menuSelectionManager0);
      fileTextArea0.mouseExited(menuDragMouseEvent0);
      assertTrue(menuDragMouseEvent0.isAltDown());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.mouseEntered((MouseEvent) null);
      assertTrue(fileTextArea0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jRadioButtonMenuItem0, 9, 9, 1024, 570, 110, 1984, 0, 10, false, 2476, 2820, 2476);
      fileTextArea0.mouseClicked(mouseWheelEvent0);
      assertTrue(fileTextArea0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      KeyEvent keyEvent0 = new KeyEvent(jRadioButtonMenuItem0, 2, 2, 2, 1354, '\'');
      fileTextArea0.keyTyped(keyEvent0);
      assertEquals(128, keyEvent0.getModifiersEx());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      KeyEvent keyEvent0 = new KeyEvent(jRadioButtonMenuItem0, 0, 0, 92, 1354, '\'');
      fileTextArea0.keyReleased(keyEvent0);
      assertFalse(keyEvent0.isActionKey());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      KeyEvent keyEvent0 = new KeyEvent(jRadioButtonMenuItem0, 8, 8, 0, 0, '-');
      keyEvent0.setKeyCode(8);
      fileTextArea0.keyPressed(keyEvent0);
      assertEquals('-', keyEvent0.getKeyChar());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseEvent mouseEvent0 = new MouseEvent(fileTextArea0, (-982), (-982), (-982), 2, 292, 292, false, 2);
      fileTextArea0.mousePressed(mouseEvent0);
      assertFalse(mouseEvent0.isPopupTrigger());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(fileTextArea0, (-2147483511), (-2147483511), (-2147483511), (-2147483511), (-2147483511), (-2147483511), (-2147483511), (-2147483511), true, (-2147483511), (-2147483511), (-2147483511), (-2147483511));
      // Undeclared exception!
      try { 
        fileTextArea0.mouseReleased(mouseWheelEvent0);
        fail("Expecting exception: IllegalComponentStateException");
      
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      SynthSplitPaneUI synthSplitPaneUI0 = new SynthSplitPaneUI();
      ActionEvent actionEvent0 = new ActionEvent(synthSplitPaneUI0, 2431, "Run", 2431, 2431);
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      JViewport jViewport0 = new JViewport();
      ActionEvent actionEvent0 = new ActionEvent(jViewport0, 32, "Set Breakpoint", 32);
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      fileTextArea0.setBounds(0, 2218, 2218, 127);
      ActionEvent actionEvent0 = new ActionEvent(fileTextArea0, 138, "Shift+Alt Graph", 382);
      fileTextArea0.actionPerformed(actionEvent0);
      assertFalse(fileTextArea0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileTextArea fileTextArea0 = new FileTextArea((FileWindow) null);
      ActionEvent actionEvent0 = new ActionEvent("Clear Breakpoint", (-5087), "Clear Breakpoint");
      // Undeclared exception!
      try { 
        fileTextArea0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.FileTextArea", e);
      }
  }
}
