/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 28 21:31:00 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Population;
import brain.ga.RankSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RankSelector_ESTest extends RankSelector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.RankSelector.<init>()V: root-Branch in context: brain.ga.RankSelector:<init>()V
   * Goal 2. Branch brain.ga.RankSelector.select(Lbrain/ga/Population;)Lbrain/ga/Genome;: root-Branch in context: brain.ga.RankSelector:select(Lbrain/ga/Population;)Lbrain/ga/Genome;
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RankSelector rankSelector0 = new RankSelector();
      Population population0 = new Population();
      // Undeclared exception!
      try { 
        rankSelector0.select(population0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }
}
