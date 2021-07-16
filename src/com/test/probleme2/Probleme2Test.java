package com.test.probleme2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Classe de test de la fonction du problème 2
 * @author Jean-Marc Dje Bi
 * @since 16-07-2021
 */
public class Probleme2Test {
	
	/**
	 * Test du mot anticonstitutionnellement
	 */
	@Test
	public void test1() {
		String word = "anticonstitutionnellement";
		
		String result = Probleme2.compterLettre(word);
		
		System.out.println("Test avec anticonstitutionnellement:");
		
		System.out.println("Mot: " + word);
		
		System.out.println("Résultat: " + result);
		 		 		 
		System.out.println("---------------------------------------");
		 
		assertEquals("[a1;c1;s1;t5;u1;e3;i3;l2;m1;n5;o2]",result);
	}
	
	/**
	 * Test du mot test
	 */
	@Test
	public void test2() {
		String word = "test";
		
		String result = Probleme2.compterLettre(word);
		
		System.out.println("Test avec test:");
		
		System.out.println("Mot: " + word);
		
		System.out.println("Résultat: " + result);
		 		 		 
		System.out.println("---------------------------------------");
		 
		assertEquals("[s1;t2;e1]",result);
	}
	
	/**
	 * Test du mot ordinateur
	 */
	@Test
	public void test3() {
		String word = "ordinateur";
		
		String result = Probleme2.compterLettre(word);
		
		System.out.println("Test avec ordinateur:");
		
		System.out.println("Mot: " + word);
		
		System.out.println("Résultat: " + result);
		 		 		 
		System.out.println("---------------------------------------");
		 
		assertEquals("[a1;r2;d1;t1;e1;u1;i1;n1;o1]",result);
	}
	
	/**
	 * Methode de test
	 */
	public static void main(String[] args) {		
		
		Result result = JUnitCore.runClasses(Probleme2Test.class);		
		
		for (Failure failure : result.getFailures()) {							
		     System.out.println(failure.toString());					
		 }		
		 
		System.out.println("Résultat des tests == " + result.wasSuccessful());
		
		System.out.println("Durée des tests: " + result.getRunTime() + "ms");
        
	}

}
