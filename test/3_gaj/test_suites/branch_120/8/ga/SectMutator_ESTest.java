/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 07 02:58:16 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.GAEnumAllelesSet;
import brain.ga.SectMutator;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SectMutator_ESTest extends SectMutator_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. brain.ga.SectMutator.<init>()V: root-Branch
   * Goal 2. brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - true
   * Goal 3. brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - false
   * Goal 4. brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I25 Branch 2 IFGT L22 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) null);
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      int int0 = sectMutator0.mutate(vectorGenome0, (-1588.57525));
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. brain.ga.SectMutator.<init>()V: root-Branch
   * Goal 2. brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - false
   * Goal 3. brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I25 Branch 2 IFGT L22 - false
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<Object> vector0 = new Vector<Object>();
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      vector0.add((Object) "");
      // Undeclared exception!
      try { 
        sectMutator0.mutate(vectorGenome0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.SectMutator", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.SectMutator.<init>()V: root-Branch
   * Goal 2. brain.ga.SectMutator.setAllelesSet(Lbrain/ga/GAEnumAllelesSet;)V: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      sectMutator0.setAllelesSet(gAEnumAllelesSet0);
  }
}
