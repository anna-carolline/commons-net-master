/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:18:45 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.parser.MVSFTPEntryParser;
import org.apache.commons.net.ftp.parser.NTFTPEntryParser;
import org.apache.commons.net.ftp.parser.OS2FTPEntryParser;
import org.apache.commons.net.ftp.parser.OS400FTPEntryParser;
import org.apache.commons.net.ftp.parser.UnixFTPEntryParser;
import org.apache.commons.net.ftp.parser.VMSVersioningFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegexFTPFileEntryParserImpl_ESTest extends RegexFTPFileEntryParserImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OS2FTPEntryParser oS2FTPEntryParser0 = new OS2FTPEntryParser((FTPClientConfig) null);
      // Undeclared exception!
      try { 
        oS2FTPEntryParser0.setRegex((String) null, (-2395));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      // Undeclared exception!
      try { 
        mVSFTPEntryParser0.setRegex("=Vs5Pe>s(C#", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unparseable regex supplied: =Vs5Pe>s(C#
         //
         verifyException("org.apache.commons.net.ftp.parser.RegexFTPFileEntryParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnixFTPEntryParser unixFTPEntryParser0 = new UnixFTPEntryParser();
      // Undeclared exception!
      try { 
        unixFTPEntryParser0.setRegex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      // Undeclared exception!
      try { 
        mVSFTPEntryParser0.setRegex("(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unparseable regex supplied: (
         //
         verifyException("org.apache.commons.net.ftp.parser.RegexFTPFileEntryParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      // Undeclared exception!
      try { 
        mVSFTPEntryParser0.matches((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      NTFTPEntryParser nTFTPEntryParser0 = new NTFTPEntryParser(fTPClientConfig0);
      // Undeclared exception!
      try { 
        nTFTPEntryParser0.getGroupsAsString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.ftp.parser.RegexFTPFileEntryParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      boolean boolean0 = mVSFTPEntryParser0.matches("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      boolean boolean0 = mVSFTPEntryParser0.matches("OS/2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      NTFTPEntryParser nTFTPEntryParser0 = new NTFTPEntryParser(fTPClientConfig0);
      String string0 = nTFTPEntryParser0.group((-1360));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      mVSFTPEntryParser0.setType(0);
      // Undeclared exception!
      try { 
        mVSFTPEntryParser0.parseFTPEntry("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = mVSFTPEntryParser0.getDefaultConfiguration();
      OS400FTPEntryParser oS400FTPEntryParser0 = new OS400FTPEntryParser(fTPClientConfig0);
      int int0 = oS400FTPEntryParser0.getGroupCnt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MVSFTPEntryParser mVSFTPEntryParser0 = new MVSFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = mVSFTPEntryParser0.getDefaultConfiguration();
      OS400FTPEntryParser oS400FTPEntryParser0 = new OS400FTPEntryParser(fTPClientConfig0);
      boolean boolean0 = oS400FTPEntryParser0.setRegex("VMS", (-282));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FTPClientConfig fTPClientConfig0 = UnixFTPEntryParser.NUMERIC_DATE_CONFIG;
      VMSVersioningFTPEntryParser vMSVersioningFTPEntryParser0 = new VMSVersioningFTPEntryParser(fTPClientConfig0);
      boolean boolean0 = vMSVersioningFTPEntryParser0.setRegex("I6h,C#hM\u0001/.5n");
      assertTrue(boolean0);
  }
}
