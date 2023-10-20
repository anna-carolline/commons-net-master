/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:16:25 GMT 2023
 */

package org.apache.commons.net.smtp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.smtp.SMTPCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SMTPCommand_ESTest extends SMTPCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = SMTPCommand.getCommand(0);
      assertEquals("HELO", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SMTPCommand.getCommand((-401));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -401
         //
         verifyException("org.apache.commons.net.smtp.SMTPCommand", e);
      }
  }
}
