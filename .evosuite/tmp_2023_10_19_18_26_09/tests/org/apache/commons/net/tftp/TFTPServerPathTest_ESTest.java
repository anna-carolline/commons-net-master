/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:16:40 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.tftp.TFTPServerPathTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPServerPathTest_ESTest extends TFTPServerPathTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
      // Undeclared exception!
      try { 
        tFTPServerPathTest0.testWriteVerifyContents();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerPathTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
      // Undeclared exception!
      try { 
        tFTPServerPathTest0.testWriteOutsideHome();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerPathTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
      // Undeclared exception!
      try { 
        tFTPServerPathTest0.testWriteOnly();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerPathTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
      tFTPServerPathTest0.afterEach();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
          // Undeclared exception!
          try { 
            tFTPServerPathTest0.beforeEach();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"C:\\Users\\anaba\\AppData\\Local\\Temp\\TFTPServerPathTest_00000000-0100-4000-8200-000003000000.source.txt\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.WindowsChannelFactory.open(WindowsChannelFactory.java:295)
             // sun.nio.fs.WindowsChannelFactory.newFileChannel(WindowsChannelFactory.java:162)
             // sun.nio.fs.WindowsFileSystemProvider.newByteChannel(WindowsFileSystemProvider.java:225)
             // java.nio.file.Files.newByteChannel(Files.java:361)
             // java.nio.file.Files.createFile(Files.java:632)
             // org.apache.commons.net.tftp.TFTPServerPathTest.createFileInDir(TFTPServerPathTest.java:53)
             // org.apache.commons.net.tftp.TFTPServerPathTest.beforeEach(TFTPServerPathTest.java:100)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TFTPServerPathTest tFTPServerPathTest0 = new TFTPServerPathTest();
      // Undeclared exception!
      try { 
        tFTPServerPathTest0.testReadOnly();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPServerPathTest", e);
      }
  }
}
