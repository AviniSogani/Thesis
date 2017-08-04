/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 28 21:52:33 GMT 2017
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
   * 3 covered goals:
   * Goal 1. Branch brain.ga.SectMutator.<init>()V: root-Branch in context: brain.ga.SectMutator:<init>()V
   * Goal 2. Branch brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - false in context: brain.ga.SectMutator:mutate(Lbrain/ga/Genome;D)I
   * Goal 3. Branch brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I25 Branch 2 IFGT L22 - false in context: brain.ga.SectMutator:mutate(Lbrain/ga/Genome;D)I
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<Integer> vector0 = new Vector<Integer>();
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      Integer integer0 = new Integer(0);
      vector0.add(integer0);
      // Undeclared exception!
      try { 
        sectMutator0.mutate(vectorGenome0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.SectMutator", e);
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. Branch brain.ga.SectMutator.<init>()V: root-Branch in context: brain.ga.SectMutator:<init>()V
   * Goal 2. Branch brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - true in context: brain.ga.SectMutator:mutate(Lbrain/ga/Genome;D)I
   * Goal 3. Branch brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I13 Branch 1 IF_ICMPGE L19 - false in context: brain.ga.SectMutator:mutate(Lbrain/ga/Genome;D)I
   * Goal 4. Branch brain.ga.SectMutator.mutate(Lbrain/ga/Genome;D)I: I25 Branch 2 IFGT L22 - true in context: brain.ga.SectMutator:mutate(Lbrain/ga/Genome;D)I
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<Integer> vector0 = new Vector<Integer>();
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      Integer integer0 = new Integer((-36));
      vector0.add(integer0);
      int int0 = sectMutator0.mutate(vectorGenome0, (-201.7112118));
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.SectMutator.setAllelesSet(Lbrain/ga/GAEnumAllelesSet;)V: root-Branch in context: brain.ga.SectMutator:setAllelesSet(Lbrain/ga/GAEnumAllelesSet;)V
   * Goal 2. Branch brain.ga.SectMutator.<init>()V: root-Branch in context: brain.ga.SectMutator:<init>()V
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      sectMutator0.setAllelesSet(gAEnumAllelesSet0);
  }
}