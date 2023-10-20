/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 19 22:58:27 GMT 2023
 */

package org.apache.commons.net.ftp.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DownloadListings_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.net.ftp.parser.DownloadListings"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\anaba\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\anaba\\Downloads\\commons-net-master"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\anaba"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "anaba"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DownloadListings_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "org.apache.commons.net.ftp.FTP",
      "org.apache.commons.net.ftp.FTPListParseEngine",
      "org.apache.commons.net.MalformedServerReplyException",
      "org.apache.commons.net.ftp.FTPClient$HostnameResolver",
      "org.apache.commons.net.io.SocketInputStream",
      "org.apache.commons.net.ProtocolCommandSupport",
      "org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory",
      "org.apache.commons.net.ftp.FTPFileEntryParser",
      "org.apache.commons.net.ftp.FTPCmd",
      "org.apache.commons.net.SocketClient",
      "org.apache.commons.net.PrintCommandListener",
      "org.apache.commons.net.ftp.FTPClient$NatServerResolverImpl",
      "org.apache.commons.net.ftp.parser.ParserInitializationException",
      "org.apache.commons.net.ftp.FTPClient",
      "org.apache.commons.net.ftp.FTPClientConfig",
      "org.apache.commons.net.DefaultSocketFactory",
      "org.apache.commons.net.ftp.FTPFileFilter",
      "org.apache.commons.net.io.ToNetASCIIOutputStream",
      "org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory",
      "org.apache.commons.net.io.SocketOutputStream",
      "org.apache.commons.net.ftp.Configurable",
      "org.apache.commons.net.ProtocolCommandListener",
      "org.apache.commons.net.ftp.FTPFile",
      "org.apache.commons.net.io.CRLFLineReader",
      "org.apache.commons.net.util.ListenerList",
      "org.apache.commons.net.ftp.parser.DownloadListings",
      "org.apache.commons.net.io.CopyStreamListener",
      "org.apache.commons.net.io.FromNetASCIIInputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DownloadListings_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.net.SocketClient",
      "org.apache.commons.net.ftp.FTP",
      "org.apache.commons.net.ftp.FTPClient",
      "org.apache.commons.net.ftp.parser.DownloadListings",
      "org.apache.commons.net.ftp.FTPCmd",
      "org.apache.commons.net.ProtocolCommandSupport",
      "org.apache.commons.net.util.ListenerList",
      "org.apache.commons.net.ftp.FTPClient$NatServerResolverImpl",
      "org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory",
      "org.apache.commons.net.PrintCommandListener",
      "org.apache.commons.net.ftp.DurationUtils",
      "org.apache.commons.net.io.CopyStreamAdapter",
      "org.apache.commons.net.ftp.FTPFileFilters",
      "org.apache.commons.net.ftp.parser.ParserInitializationException",
      "org.apache.commons.net.ftp.FTPCommand",
      "org.apache.commons.net.ftp.FTPFileEntryParserImpl",
      "org.apache.commons.net.ftp.parser.RegexFTPFileEntryParserImpl",
      "org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl",
      "org.apache.commons.net.ftp.parser.NetwareFTPEntryParser",
      "org.apache.commons.net.ftp.parser.FTPTimestampParserImpl",
      "org.apache.commons.net.ftp.FTPClientConfig",
      "org.apache.commons.net.DefaultSocketFactory",
      "org.apache.commons.net.ProtocolCommandEvent"
    );
  }
}
