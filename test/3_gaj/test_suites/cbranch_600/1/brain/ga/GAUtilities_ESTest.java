/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 28 21:30:18 GMT 2017
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
   * Goal 1. Branch brain.ga.GAUtilities.nextPos(I)I: I21 Branch 1 IF_ICMPGT L21 - false in context: brain.ga.GAUtilities:nextPos(I)I
   * Goal 2. Branch brain.ga.GAUtilities.nextPos(I)I: I30 Branch 2 IF_ICMPGE L21 - false in context: brain.ga.GAUtilities:nextPos(I)I
   * Goal 3. Branch brain.ga.GAUtilities.nextPos(I)I: I21 Branch 1 IF_ICMPGT L21 - true in context: brain.ga.GAUtilities:nextPos(I)I
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = GAUtilities.nextPos(1);
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. Branch brain.ga.GAUtilities.nextPos(I)I: I21 Branch 1 IF_ICMPGT L21 - false in context: brain.ga.GAUtilities:nextPos(I)I
   * Goal 2. Branch brain.ga.GAUtilities.nextPos(I)I: I30 Branch 2 IF_ICMPGE L21 - true in context: brain.ga.GAUtilities:nextPos(I)I
   * Goal 3. Branch brain.ga.GAUtilities.nextPos(I)I: I30 Branch 2 IF_ICMPGE L21 - false in context: brain.ga.GAUtilities:nextPos(I)I
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = GAUtilities.nextPos(2460);
      assertEquals(1, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. Branch brain.ga.GAUtilities.<init>()V: root-Branch in context: brain.ga.GAUtilities:<init>()V
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GAUtilities gAUtilities0 = new GAUtilities();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. Branch brain.ga.GAUtilities.flipCoin(D)Z: root-Branch in context: brain.ga.GAUtilities:flipCoin(D)Z
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = GAUtilities.flipCoin(2460);
      assertFalse(boolean0);
  }
}
