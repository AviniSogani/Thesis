/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 28 20:53:02 GMT 2017
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
   * Goal 1. Branch brain.ga.UniformCrossover.<init>()V: root-Branch in context: brain.ga.UniformCrossover:<init>()V
   * Goal 2. Branch brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I24 Branch 1 IF_ICMPGE L18 - false in context: brain.ga.UniformCrossover:cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;
   * Goal 3. Branch brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I24 Branch 1 IF_ICMPGE L18 - true in context: brain.ga.UniformCrossover:cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;
   * Goal 4. Branch brain.ga.UniformCrossover.cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;: I31 Branch 2 IFEQ L20 - true in context: brain.ga.UniformCrossover:cross(Lbrain/ga/Genome;Lbrain/ga/Genome;)Lbrain/ga/Genome;
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) vector0);
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      VectorGenome vectorGenome1 = (VectorGenome)uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      assertEquals(1, vectorGenome1.getGenesCount());
      assertNotSame(vectorGenome1, vectorGenome0);
  }
}
