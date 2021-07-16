package com.test.probleme1;

import static org.junit.Assert.*;			

import org.junit.Test;	
import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;	

/**
 * Classe de test de la fonction du probleme 2
 * @author Jean-Marc Dje Bi
 * @since 16-07-2021
 */
public class Probleme1Test {

	
	/**
	 * Test de reussite de la recherche du nombres d'occurences de "3"
	 */
	@Test
	public void test1() {
				
		 String [] book = new String [] {"6","13","14","3","10","20","11","5","6","13","20","6"}; 
		 		 
		 int result = Probleme1.rechercherOccurences(book,"3");
		 
		 System.out.println("Test 1 réussite:");
		 
		 System.out.println("Tableau: " + "{\"6\",\"13\",\"14\",\"3\",\"10\",\"20\",\"11\",\"5\",\"6\",\"13\",\"20\",\"6\"}");
		 
		 System.out.println("Nombre d'occurences de 3 (8): " + result);
		 
		 System.out.println("---------------------------------------");

		 assertEquals(1,result);
		 
	}
	
	/**
	 * Test d'echec du nombre d'occurences de "1"
	 */
	@Test
	public void test2() {
				
		 String [] book = new String [] {"1","2","3","85","1","1","5","88"};
		 
		 int result = Probleme1.rechercherOccurences(book,"1");
		 
		 System.out.println("Test 2 echec:");
		 
		 System.out.println("Tableau: " + "{\"1\",\"2\",\"3\",\"85\",\"1\",\"1\",\"5\",\"88\"}");
		 		 
		 System.out.println("Nombre d'occurences de 1 (1): " + result);
		 		 		 
		 System.out.println("---------------------------------------");

		 assertNotEquals(1,result);
		 
	}
	
	/**
	 * Methode de test
	 */
	public static void main(String[] args) {	
		
		Result result = JUnitCore.runClasses(Probleme1Test.class);					
		for (Failure failure : result.getFailures()) {							
		     System.out.println(failure.toString());					
		 }		
		 
		System.out.println("Resultat des tests == " + result.wasSuccessful());
		
		System.out.println("Durée des tests: " + result.getRunTime() + "ms");
		
		
	}

}
