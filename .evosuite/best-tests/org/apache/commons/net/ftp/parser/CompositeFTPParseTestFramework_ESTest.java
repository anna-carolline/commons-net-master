/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:13:14 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.AssertionFailedError;
import org.apache.commons.net.ftp.parser.NTFTPEntryParserTest;
import org.apache.commons.net.ftp.parser.OS400FTPEntryParserAdditionalTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompositeFTPParseTestFramework_ESTest extends CompositeFTPParseTestFramework_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NTFTPEntryParserTest nTFTPEntryParserTest0 = new NTFTPEntryParserTest("T?E");
      // Undeclared exception!
      try { 
        nTFTPEntryParserTest0.testBadListing();
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // Should have Failed to parse 20-05-97  03:31PM                  681 .bash_history
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NTFTPEntryParserTest nTFTPEntryParserTest0 = new NTFTPEntryParserTest(">>y/");
      nTFTPEntryParserTest0.testInconsistentListing();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OS400FTPEntryParserAdditionalTest oS400FTPEntryParserAdditionalTest0 = new OS400FTPEntryParserAdditionalTest("!");
      oS400FTPEntryParserAdditionalTest0.testConsistentListing();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OS400FTPEntryParserAdditionalTest oS400FTPEntryParserAdditionalTest0 = new OS400FTPEntryParserAdditionalTest("!");
      oS400FTPEntryParserAdditionalTest0.testBadListing();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NTFTPEntryParserTest nTFTPEntryParserTest0 = new NTFTPEntryParserTest(">>y/");
      String[] stringArray0 = nTFTPEntryParserTest0.getBadListing();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NTFTPEntryParserTest nTFTPEntryParserTest0 = new NTFTPEntryParserTest(">>y/");
      String[] stringArray0 = nTFTPEntryParserTest0.getGoodListing();
      assertEquals(22, stringArray0.length);
  }
}
