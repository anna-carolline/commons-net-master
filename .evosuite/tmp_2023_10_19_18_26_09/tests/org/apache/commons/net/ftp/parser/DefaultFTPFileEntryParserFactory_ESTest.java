/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:28:19 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.MVSFTPEntryParser;
import org.apache.commons.net.ftp.parser.MacOsPeterFTPEntryParser;
import org.apache.commons.net.ftp.parser.NetwareFTPEntryParser;
import org.apache.commons.net.ftp.parser.UnixFTPEntryParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultFTPFileEntryParserFactory_ESTest extends DefaultFTPFileEntryParserFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser("d4.dnMgT9");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown parser type: d4.dnMgT9
         //
         verifyException("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.net.ftp.parser.RegexFTPFileEntryParserImpl").when(fTPClientConfig0).getServerSystemKey();
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error initializing parser
         //
         verifyException("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory does not implement the interface org.apache.commons.net.ftp.FTPFileEntryParser.
         //
         verifyException("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn("lU`8As\"R4{zQ3").when(fTPClientConfig0).getServerSystemKey();
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown parser type: lU`8As\"R4{zQ3
         //
         verifyException("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fTPClientConfig0).getServerSystemKey();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn("WINDOWS").when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn("JOBID", "JOBID").when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn("JOBID").when(fTPClientConfig0).getServerLanguageCode();
      doReturn("WINDOWS", "\"G<8{K,.m@8N").when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'J'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn("OS/400", (String) null).when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      UnixFTPEntryParser unixFTPEntryParser0 = (UnixFTPEntryParser)defaultFTPFileEntryParserFactory0.createFileEntryParser("TYPE: L8");
      assertEquals(0, unixFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      MacOsPeterFTPEntryParser macOsPeterFTPEntryParser0 = (MacOsPeterFTPEntryParser)defaultFTPFileEntryParserFactory0.createFileEntryParser("MACOS PETER");
      assertEquals(0, macOsPeterFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      NetwareFTPEntryParser netwareFTPEntryParser0 = (NetwareFTPEntryParser)defaultFTPFileEntryParserFactory0.createFileEntryParser("NETWARE");
      assertEquals(0, netwareFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn("MVS").when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPFileEntryParser fTPFileEntryParser0 = defaultFTPFileEntryParserFactory0.createFileEntryParser("AS/400");
      assertNotNull(fTPFileEntryParser0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn("OS/2").when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn("VMS").when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      UnixFTPEntryParser unixFTPEntryParser0 = (UnixFTPEntryParser)defaultFTPFileEntryParserFactory0.createFileEntryParser("UNIX_LTRIM");
      assertEquals(0, unixFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPFileEntryParser fTPFileEntryParser0 = defaultFTPFileEntryParserFactory0.createFileEntryParser("org.apache.commons.net.ftp.parser.MLSxEntryParser");
      assertNotNull(fTPFileEntryParser0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Parser key cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPFileEntryParser fTPFileEntryParser0 = defaultFTPFileEntryParserFactory0.createOS400FTPEntryParser();
      assertNotNull(fTPFileEntryParser0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      MVSFTPEntryParser mVSFTPEntryParser0 = (MVSFTPEntryParser)defaultFTPFileEntryParserFactory0.createMVSEntryParser();
      assertEquals(0, mVSFTPEntryParser0.getGroupCnt());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      defaultFTPFileEntryParserFactory0.createVMSVersioningFTPEntryParser();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      defaultFTPFileEntryParserFactory0.createNetwareFTPEntryParser();
      FTPClientConfig fTPClientConfig1 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig1).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig1).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig1).getServerLanguageCode();
      doReturn("OS/400", (String) null).when(fTPClientConfig1).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig1).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPFileEntryParser fTPFileEntryParser0 = defaultFTPFileEntryParserFactory0.createNTFTPEntryParser();
      assertNotNull(fTPFileEntryParser0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      FTPFileEntryParser fTPFileEntryParser0 = defaultFTPFileEntryParserFactory0.createUnixFTPEntryParser();
      FTPFileEntryParser fTPFileEntryParser1 = defaultFTPFileEntryParserFactory0.createFileEntryParser(((UnixFTPEntryParser) fTPFileEntryParser0).NUMERIC_DATE_CONFIG);
      assertFalse(fTPFileEntryParser1.equals((Object)fTPFileEntryParser0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultFTPFileEntryParserFactory defaultFTPFileEntryParserFactory0 = new DefaultFTPFileEntryParserFactory();
      defaultFTPFileEntryParserFactory0.createOS2FTPEntryParser();
      FTPClientConfig fTPClientConfig0 = mock(FTPClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(fTPClientConfig0).getDefaultDateFormatStr();
      doReturn((String) null, (String) null).when(fTPClientConfig0).getRecentDateFormatStr();
      doReturn((String) null).when(fTPClientConfig0).getServerLanguageCode();
      doReturn("WINDOWS", (String) null).when(fTPClientConfig0).getServerSystemKey();
      doReturn((String) null).when(fTPClientConfig0).getShortMonthNames();
      // Undeclared exception!
      try { 
        defaultFTPFileEntryParserFactory0.createFileEntryParser(fTPClientConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultFormatString cannot be null
         //
         verifyException("org.apache.commons.net.ftp.parser.FTPTimestampParserImpl", e);
      }
  }
}
