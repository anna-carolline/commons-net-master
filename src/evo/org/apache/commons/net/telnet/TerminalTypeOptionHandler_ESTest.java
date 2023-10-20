/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:20:53 GMT 2023
 */

package org.apache.commons.net.telnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.telnet.TerminalTypeOptionHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TerminalTypeOptionHandler_ESTest extends TerminalTypeOptionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler");
      int[] intArray0 = new int[2];
      intArray0[0] = 1804;
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 1804);
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 1804);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.net.telnet.TerminalTypeOptionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler", false, false, false, true);
      int[] intArray0 = new int[3];
      intArray0[0] = 24;
      intArray0[1] = 1;
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 596);
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {24, 1, 0}, intArray0);
      assertEquals(57, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler", false, false, false, true);
      int[] intArray0 = new int[3];
      intArray0[0] = 24;
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 596);
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler((String) null);
      int[] intArray0 = new int[2];
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 24);
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler");
      int[] intArray0 = new int[2];
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 1804);
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler");
      int[] intArray0 = new int[2];
      int[] intArray1 = terminalTypeOptionHandler0.answerSubnegotiation(intArray0, 0);
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TerminalTypeOptionHandler terminalTypeOptionHandler0 = new TerminalTypeOptionHandler("org.apache.commons.net.telnet.TerminalTypeOptionHandler");
      int[] intArray0 = terminalTypeOptionHandler0.answerSubnegotiation((int[]) null, 0);
      assertNull(intArray0);
  }
}
