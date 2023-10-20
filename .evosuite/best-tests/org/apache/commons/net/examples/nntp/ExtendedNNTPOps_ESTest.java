/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:32:03 GMT 2023
 */

package org.apache.commons.net.examples.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.examples.nntp.ExtendedNNTPOps;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedNNTPOps_ESTest extends ExtendedNNTPOps_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          stringArray0[0] = "";
          // Undeclared exception!
          try { 
            ExtendedNNTPOps.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:119\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:136)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:289)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:271)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:256)
             // org.apache.commons.net.examples.nntp.ExtendedNNTPOps.demo(ExtendedNNTPOps.java:55)
             // org.apache.commons.net.examples.nntp.ExtendedNNTPOps.main(ExtendedNNTPOps.java:43)
             // sun.reflect.GeneratedMethodAccessor14.invoke(Unknown Source)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        ExtendedNNTPOps.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtendedNNTPOps.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.nntp.ExtendedNNTPOps", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        ExtendedNNTPOps.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        ExtendedNNTPOps.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExtendedNNTPOps extendedNNTPOps0 = new ExtendedNNTPOps();
  }
}
