/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 07 02:23:16 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import brain.ga.Evaluator;
import brain.ga.UniformCrossover;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UniformCrossover_ESTest extends UniformCrossover_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. brain.ga.UniformCrossover.<init>()V: root-Branch
   * Goal 2. brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I24 Branch 1 IF_ICMPGE L18 - true
   * Goal 3. brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I24 Branch 1 IF_ICMPGE L18 - false
   * Goal 4. brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I31 Branch 2 IFEQ L20 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) uniformCrossover0);
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      VectorGenome vectorGenome1 = (VectorGenome)uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      assertEquals(1, vectorGenome1.getGenesCount());
      assertNotSame(vectorGenome1, vectorGenome0);
  }
}