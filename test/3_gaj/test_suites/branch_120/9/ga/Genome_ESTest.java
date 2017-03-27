/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 07 03:09:38 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.Genome;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Genome_ESTest extends Genome_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.Genome.<init>()V: root-Branch
   * Goal 2. brain.ga.Genome.getScore()D: I4 Branch 1 IFNE L23 - false
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Genome genome0 = new Genome();
      // Undeclared exception!
      try { 
        genome0.compareTo(genome0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.Genome", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.Genome.<init>()V: root-Branch
   * Goal 2. brain.ga.Genome.getEvaluator()Lbrain/ga/Evaluator;: root-Branch
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Genome genome0 = new Genome();
      Evaluator evaluator0 = genome0.getEvaluator();
      assertNull(evaluator0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.Genome.<init>()V: root-Branch
   * Goal 2. brain.ga.Genome.initialize()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Genome genome0 = new Genome();
      genome0.initialize();
  }
}
