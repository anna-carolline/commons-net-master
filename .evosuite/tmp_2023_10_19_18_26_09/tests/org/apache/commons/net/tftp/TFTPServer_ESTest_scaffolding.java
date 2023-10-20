/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 19 23:03:56 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TFTPServer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.net.tftp.TFTPServer"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TFTPServer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.net.io.FromNetASCIIOutputStream",
      "org.apache.commons.net.tftp.TFTP",
      "org.apache.commons.net.DatagramSocketFactory",
      "org.apache.commons.net.tftp.TFTPWriteRequestPacket",
      "org.apache.commons.net.tftp.TFTPServer$1",
      "org.apache.commons.net.tftp.TFTPPacket",
      "org.apache.commons.net.tftp.TFTPReadRequestPacket",
      "org.apache.commons.net.tftp.TFTPServer",
      "org.apache.commons.net.tftp.TFTPAckPacket",
      "org.apache.commons.net.tftp.TFTPErrorPacket",
      "org.apache.commons.net.DatagramSocketClient",
      "org.apache.commons.net.tftp.TFTPServer$ServerMode",
      "org.apache.commons.net.tftp.TFTPServer$TFTPTransfer",
      "org.apache.commons.net.tftp.TFTPRequestPacket",
      "org.apache.commons.net.tftp.TFTPPacketException",
      "org.apache.commons.net.tftp.TFTPDataPacket",
      "org.apache.commons.net.io.ToNetASCIIInputStream",
      "org.apache.commons.net.DefaultDatagramSocketFactory"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.io.File", false, TFTPServer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TFTPServer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.net.tftp.TFTPServer$1",
      "org.apache.commons.net.tftp.TFTPServer",
      "org.apache.commons.net.tftp.TFTPServer$TFTPTransfer",
      "org.apache.commons.net.tftp.TFTPServer$ServerMode",
      "org.apache.commons.net.DefaultDatagramSocketFactory",
      "org.apache.commons.net.DatagramSocketClient",
      "org.apache.commons.net.tftp.TFTP",
      "org.apache.commons.net.tftp.TFTPPacket",
      "org.apache.commons.net.tftp.TFTPDataPacket",
      "org.apache.commons.net.tftp.TFTPRequestPacket",
      "org.apache.commons.net.tftp.TFTPReadRequestPacket",
      "org.apache.commons.net.tftp.TFTPAckPacket",
      "org.apache.commons.net.tftp.TFTPPacketException",
      "org.apache.commons.net.tftp.TFTPWriteRequestPacket",
      "org.apache.commons.net.tftp.TFTPErrorPacket"
    );
  }
}
