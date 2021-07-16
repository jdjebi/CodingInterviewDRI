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
	 * Test de reussite avec le mot anticonstitutionnellement
	 */
	@Test
	public void test1() {
		String word = "anticonstitutionnellement";
		assertEquals("[a1;c1;s1;t5;u1;e3;i3;l2;m1;n5;o2]",Probleme2.compterLettre(word));
	}
	
	/**
	 * Test d'echecs avec le mot anticonstitutionnellement
	 */
	@Test
	public void test2() {
		String word = "anticonstitutionnellement";
		assertNotEquals("contenu-different-du-mot",Probleme2.compterLettre(word));
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
        
	}

}
