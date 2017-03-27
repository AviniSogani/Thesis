/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 08 03:22:45 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import brain.ga.GAUtilities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GAUtilities_ESTest extends GAUtilities_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. brain.ga.GAUtilities.nextPos(I)I: I21 Branch 1 IF_ICMPGT L21 - false
   * Goal 2. brain.ga.GAUtilities.nextPos(I)I: I30 Branch 2 IF_ICMPGE L21 - true
   * Goal 3. brain.ga.GAUtilities.nextPos(I)I: I30 Branch 2 IF_ICMPGE L21 - false
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = GAUtilities.nextPos(2112);
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. brain.ga.GAUtilities.nextPos(I)I: I21 Branch 1 IF_ICMPGT L21 - true
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = GAUtilities.nextPos((-2699));
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. brain.ga.GAUtilities.flipCoin(D)Z: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = GAUtilities.flipCoin((-1334.5929951736));
      assertFalse(boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. brain.ga.GAUtilities.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GAUtilities gAUtilities0 = new GAUtilities();
  }
}
