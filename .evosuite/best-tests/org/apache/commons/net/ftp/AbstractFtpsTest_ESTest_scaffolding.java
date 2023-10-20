/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Oct 19 21:51:31 GMT 2023
 */

package org.apache.commons.net.ftp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class AbstractFtpsTest_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.net.ftp.AbstractFtpsTest"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractFtpsTest_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.ftpserver.command.impl.RNTO",
      "org.apache.commons.net.io.SocketInputStream",
      "org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory",
      "org.apache.commons.net.ftp.FTPFileEntryParser",
      "org.apache.ftpserver.command.impl.AUTH",
      "org.apache.ftpserver.command.impl.MODE",
      "org.apache.ftpserver.impl.DefaultFtpStatistics",
      "org.apache.ftpserver.command.impl.LIST",
      "org.apache.ftpserver.command.impl.NLST",
      "org.apache.ftpserver.command.impl.USER",
      "org.apache.commons.net.ftp.parser.ParserInitializationException",
      "org.apache.ftpserver.command.impl.MD5",
      "org.apache.commons.net.ftp.FTPClientConfig",
      "org.apache.ftpserver.listener.Listener",
      "org.apache.ftpserver.command.impl.listing.FileFormater",
      "org.apache.commons.net.io.ToNetASCIIOutputStream",
      "org.apache.ftpserver.command.impl.CWD",
      "org.apache.ftpserver.command.impl.REST",
      "org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory",
      "org.apache.ftpserver.impl.DefaultConnectionConfig",
      "org.apache.ftpserver.ftplet.FtpException",
      "org.apache.ftpserver.command.impl.PBSZ",
      "org.apache.commons.net.ftp.FTPSServerSocketFactory",
      "org.apache.ftpserver.ftplet.Ftplet",
      "org.apache.ftpserver.message.impl.DefaultMessageResource",
      "org.apache.ftpserver.FtpServerFactory",
      "org.apache.ftpserver.impl.FtpServerContext",
      "org.apache.ftpserver.ftplet.FileSystemView",
      "org.apache.ftpserver.ftpletcontainer.impl.DefaultFtpletContainer",
      "org.apache.commons.net.ftp.Configurable",
      "org.apache.ftpserver.usermanager.impl.AbstractUserManager",
      "org.apache.ftpserver.command.impl.RMD",
      "org.apache.ftpserver.usermanager.impl.ConcurrentLoginPermission",
      "org.apache.ftpserver.command.impl.RETR",
      "org.apache.ftpserver.impl.PassivePorts",
      "org.apache.ftpserver.message.MessageResourceFactory",
      "org.apache.ftpserver.command.impl.OPTS_MLST",
      "org.apache.commons.net.io.FromNetASCIIInputStream",
      "org.apache.ftpserver.command.impl.MKD",
      "org.apache.ftpserver.ftplet.Authority",
      "org.apache.ftpserver.ftplet.Authentication",
      "org.apache.ftpserver.DataConnectionConfiguration",
      "org.apache.ftpserver.command.Command",
      "org.apache.commons.net.ftp.FTPListParseEngine",
      "org.apache.ftpserver.impl.FtpHandler",
      "org.apache.ftpserver.command.impl.APPE",
      "org.apache.commons.net.util.TrustManagerUtils$TrustManager",
      "org.apache.ftpserver.command.impl.SIZE",
      "org.apache.ftpserver.command.impl.NOOP",
      "org.apache.ftpserver.command.impl.STOU",
      "org.apache.ftpserver.command.impl.STOR",
      "org.apache.mina.core.service.IoAcceptor",
      "org.apache.ftpserver.command.impl.RNFR",
      "org.apache.ftpserver.usermanager.PropertiesUserManagerFactory",
      "org.apache.ftpserver.ConnectionConfig",
      "org.apache.commons.net.ftp.FTPFileFilter",
      "org.apache.ftpserver.command.impl.PASS",
      "org.apache.ftpserver.ftplet.FileSystemFactory",
      "org.apache.ftpserver.command.impl.PASV",
      "org.apache.commons.net.ftp.AbstractFtpsTest",
      "org.apache.ftpserver.command.impl.EPSV",
      "org.apache.ftpserver.ftplet.AuthenticationFailedException",
      "org.apache.ftpserver.command.impl.MDTM",
      "org.apache.ftpserver.ssl.SslConfiguration",
      "org.apache.ftpserver.usermanager.impl.WritePermission",
      "org.apache.ftpserver.listener.nio.AbstractListener",
      "org.apache.mina.transport.socket.SocketAcceptor",
      "org.apache.commons.net.ftp.FTPSClient",
      "org.apache.ftpserver.command.impl.OPTS",
      "org.apache.mina.filter.codec.ProtocolCodecFactory",
      "org.apache.mina.core.service.IoHandler",
      "org.apache.ftpserver.ipfilter.SessionFilter",
      "org.apache.ftpserver.command.impl.HELP",
      "org.apache.commons.net.ftp.DurationUtils",
      "org.apache.ftpserver.command.impl.MLST",
      "org.apache.ftpserver.impl.DefaultFtpServerContext",
      "org.apache.commons.io.output.NullOutputStream",
      "org.apache.ftpserver.ftplet.UserManager",
      "org.apache.commons.net.util.ListenerList",
      "org.apache.ftpserver.command.impl.SITE_HELP",
      "org.apache.ftpserver.ftplet.User",
      "org.apache.commons.net.io.CopyStreamListener",
      "org.apache.ftpserver.util.BaseProperties",
      "org.apache.ftpserver.DataConnectionException",
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "org.apache.ftpserver.usermanager.impl.PropertiesUserManager",
      "org.apache.ftpserver.filesystem.nativefs.NativeFileSystemFactory",
      "org.apache.ftpserver.command.impl.EPRT",
      "org.apache.ftpserver.command.impl.FEAT",
      "org.apache.ftpserver.command.impl.MLSD",
      "org.apache.commons.net.ftp.FTP",
      "org.apache.ftpserver.command.impl.TYPE",
      "org.apache.ftpserver.DataConnectionConfigurationFactory",
      "org.apache.commons.net.ftp.FTPClient$HostnameResolver",
      "org.apache.commons.net.ProtocolCommandSupport",
      "org.apache.commons.net.ftp.FTPCmd",
      "org.apache.ftpserver.command.impl.SITE_WHO",
      "org.apache.ftpserver.util.IoUtils",
      "org.apache.commons.net.util.TrustManagerUtils",
      "org.apache.ftpserver.message.impl.DefaultMessageResource$PropertiesPair",
      "org.apache.ftpserver.command.impl.SITE",
      "org.apache.ftpserver.command.impl.SYST",
      "org.apache.ftpserver.command.impl.DefaultCommandFactory",
      "org.apache.ftpserver.ftplet.FtpletContext",
      "org.apache.ftpserver.ftpletcontainer.FtpletContainer",
      "org.apache.mina.core.service.IoService",
      "org.apache.commons.net.PrintCommandListener",
      "org.apache.ftpserver.command.impl.OPTS_UTF8",
      "org.apache.ftpserver.command.impl.SITE_STAT",
      "org.apache.ftpserver.command.impl.SITE_DESCUSER",
      "org.apache.ftpserver.command.impl.listing.FileFilter",
      "org.apache.commons.net.ftp.FTPClient",
      "org.apache.ftpserver.command.impl.QUIT",
      "org.apache.commons.net.DefaultSocketFactory",
      "org.apache.ftpserver.command.impl.listing.LISTFileFormater",
      "org.apache.commons.net.ftp.FTPSSocketFactory",
      "org.apache.ftpserver.ftplet.FtpStatistics",
      "org.apache.ftpserver.command.impl.STAT",
      "org.apache.commons.net.ftp.FTPSClientTest",
      "org.apache.commons.net.io.SocketOutputStream",
      "org.apache.ftpserver.command.AbstractCommand",
      "org.apache.ftpserver.command.impl.ACCT",
      "org.apache.ftpserver.usermanager.PasswordEncryptor",
      "org.apache.ftpserver.util.IllegalInetAddressException",
      "org.apache.ftpserver.impl.DefaultDataConnectionConfiguration",
      "org.apache.ftpserver.FtpServerConfigurationException",
      "org.apache.ftpserver.command.impl.STRU",
      "org.apache.ftpserver.command.impl.MFMT",
      "org.apache.ftpserver.command.impl.PROT",
      "org.apache.commons.net.ProtocolCommandListener",
      "org.apache.commons.net.ftp.FTPFile",
      "org.apache.ftpserver.ftplet.AuthorizationRequest",
      "org.apache.commons.net.ftp.FTPReply",
      "org.apache.ftpserver.command.impl.SITE_ZONE",
      "org.apache.ftpserver.usermanager.Md5PasswordEncryptor",
      "org.apache.ftpserver.command.impl.LANG",
      "org.apache.mina.core.filterchain.IoFilter",
      "org.apache.commons.net.MalformedServerReplyException",
      "org.apache.ftpserver.usermanager.UserManagerFactory",
      "org.apache.ftpserver.util.IllegalPortException",
      "org.apache.ftpserver.command.impl.PORT",
      "org.apache.ftpserver.usermanager.impl.BaseUser",
      "org.apache.commons.net.SocketClient",
      "org.apache.commons.net.ftp.FTPClient$NatServerResolverImpl",
      "org.apache.ftpserver.listener.nio.NioListener",
      "org.apache.ftpserver.listener.ListenerFactory",
      "org.apache.ftpserver.impl.ServerFtpStatistics",
      "org.apache.ftpserver.command.CommandFactoryFactory",
      "org.apache.ftpserver.command.impl.REIN",
      "org.apache.ftpserver.message.MessageResource",
      "org.apache.ftpserver.command.impl.ABOR",
      "org.apache.ftpserver.FtpServer",
      "org.apache.ftpserver.usermanager.impl.TransferRatePermission",
      "org.apache.ftpserver.ConnectionConfigFactory",
      "org.apache.ftpserver.command.CommandFactory",
      "org.apache.ftpserver.command.impl.CDUP",
      "org.apache.ftpserver.impl.DefaultFtpHandler",
      "org.apache.ftpserver.command.impl.PWD",
      "org.apache.commons.net.io.CRLFLineReader",
      "org.apache.mina.filter.executor.OrderedThreadPoolExecutor",
      "org.apache.ftpserver.command.impl.DELE",
      "org.apache.ftpserver.command.impl.listing.DirectoryLister",
      "org.apache.mina.core.session.IoSession",
      "org.apache.ftpserver.command.impl.listing.NLSTFileFormater"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractFtpsTest_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.net.ftp.AbstractFtpsTest",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.io.output.NullOutputStream",
      "org.apache.commons.net.ftp.FTPSClientTest",
      "org.apache.commons.net.SocketClient",
      "org.apache.commons.net.ftp.FTP",
      "org.apache.commons.net.ftp.FTPClient",
      "org.apache.commons.net.ftp.FTPSClient",
      "org.apache.commons.net.ProtocolCommandSupport",
      "org.apache.commons.net.util.ListenerList",
      "org.apache.commons.net.ftp.FTPClient$NatServerResolverImpl",
      "org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory",
      "org.apache.commons.net.util.TrustManagerUtils$TrustManager",
      "org.apache.commons.net.util.TrustManagerUtils",
      "org.apache.commons.net.ftp.DurationUtils",
      "org.apache.ftpserver.FtpServerFactory",
      "org.apache.ftpserver.usermanager.impl.WritePermission",
      "org.apache.ftpserver.usermanager.impl.ConcurrentLoginPermission",
      "org.apache.ftpserver.usermanager.impl.TransferRatePermission",
      "org.apache.ftpserver.impl.DefaultFtpServerContext",
      "org.apache.ftpserver.message.MessageResourceFactory",
      "org.apache.ftpserver.message.impl.DefaultMessageResource",
      "org.apache.ftpserver.message.impl.DefaultMessageResource$PropertiesPair",
      "org.apache.ftpserver.util.IoUtils",
      "org.apache.ftpserver.usermanager.PropertiesUserManagerFactory",
      "org.apache.ftpserver.usermanager.Md5PasswordEncryptor",
      "org.apache.ftpserver.usermanager.impl.AbstractUserManager",
      "org.apache.ftpserver.usermanager.impl.PropertiesUserManager",
      "org.apache.ftpserver.util.BaseProperties",
      "org.apache.ftpserver.filesystem.nativefs.NativeFileSystemFactory",
      "org.apache.ftpserver.ftpletcontainer.impl.DefaultFtpletContainer",
      "org.apache.ftpserver.impl.DefaultFtpStatistics",
      "org.apache.ftpserver.command.AbstractCommand",
      "org.apache.ftpserver.command.impl.ABOR",
      "org.apache.ftpserver.command.impl.ACCT",
      "org.apache.ftpserver.command.impl.APPE",
      "org.apache.ftpserver.command.impl.AUTH",
      "org.apache.ftpserver.command.impl.CDUP",
      "org.apache.ftpserver.command.impl.CWD",
      "org.apache.ftpserver.command.impl.DELE",
      "org.apache.ftpserver.command.impl.EPRT",
      "org.apache.ftpserver.command.impl.EPSV",
      "org.apache.ftpserver.command.impl.FEAT",
      "org.apache.ftpserver.command.impl.HELP",
      "org.apache.ftpserver.command.impl.LANG",
      "org.apache.ftpserver.command.impl.listing.LISTFileFormater",
      "org.apache.ftpserver.command.impl.LIST",
      "org.apache.ftpserver.command.impl.listing.DirectoryLister",
      "org.apache.ftpserver.command.impl.MD5",
      "org.apache.ftpserver.command.impl.MFMT",
      "org.apache.ftpserver.command.impl.MDTM",
      "org.apache.ftpserver.command.impl.MLST",
      "org.apache.ftpserver.command.impl.MKD",
      "org.apache.ftpserver.command.impl.MLSD",
      "org.apache.ftpserver.command.impl.MODE",
      "org.apache.ftpserver.command.impl.listing.NLSTFileFormater",
      "org.apache.ftpserver.command.impl.NLST",
      "org.apache.ftpserver.command.impl.NOOP",
      "org.apache.ftpserver.command.impl.OPTS_MLST",
      "org.apache.ftpserver.command.impl.OPTS_UTF8",
      "org.apache.ftpserver.command.impl.OPTS",
      "org.apache.ftpserver.command.impl.PASS",
      "org.apache.ftpserver.command.impl.PASV",
      "org.apache.ftpserver.command.impl.PBSZ",
      "org.apache.ftpserver.command.impl.PORT",
      "org.apache.ftpserver.command.impl.PROT",
      "org.apache.ftpserver.command.impl.PWD",
      "org.apache.ftpserver.command.impl.QUIT",
      "org.apache.ftpserver.command.impl.REIN",
      "org.apache.ftpserver.command.impl.REST",
      "org.apache.ftpserver.command.impl.RETR",
      "org.apache.ftpserver.command.impl.RMD",
      "org.apache.ftpserver.command.impl.RNFR",
      "org.apache.ftpserver.command.impl.RNTO",
      "org.apache.ftpserver.command.impl.SITE",
      "org.apache.ftpserver.command.impl.SIZE",
      "org.apache.ftpserver.command.impl.SITE_DESCUSER",
      "org.apache.ftpserver.command.impl.SITE_HELP",
      "org.apache.ftpserver.command.impl.SITE_STAT",
      "org.apache.ftpserver.command.impl.SITE_WHO",
      "org.apache.ftpserver.command.impl.SITE_ZONE",
      "org.apache.ftpserver.command.impl.STAT",
      "org.apache.ftpserver.command.impl.STOR",
      "org.apache.ftpserver.command.impl.STOU",
      "org.apache.ftpserver.command.impl.STRU",
      "org.apache.ftpserver.command.impl.SYST",
      "org.apache.ftpserver.command.impl.TYPE",
      "org.apache.ftpserver.command.impl.USER",
      "org.apache.ftpserver.command.CommandFactoryFactory",
      "org.apache.ftpserver.command.impl.DefaultCommandFactory",
      "org.apache.ftpserver.ConnectionConfigFactory",
      "org.apache.ftpserver.impl.DefaultConnectionConfig",
      "org.apache.ftpserver.listener.ListenerFactory",
      "org.apache.ftpserver.DataConnectionConfigurationFactory",
      "org.apache.ftpserver.impl.PassivePorts",
      "org.apache.ftpserver.impl.DefaultDataConnectionConfiguration",
      "org.apache.ftpserver.listener.nio.AbstractListener",
      "org.apache.ftpserver.listener.nio.NioListener",
      "org.apache.ftpserver.impl.DefaultFtpHandler",
      "org.apache.commons.net.ftp.FTPReply",
      "org.apache.ftpserver.FtpServerConfigurationException",
      "org.apache.commons.net.ftp.parser.ParserInitializationException",
      "org.apache.ftpserver.impl.DefaultFtpServer",
      "org.apache.commons.net.PrintCommandListener"
    );
  }
}
