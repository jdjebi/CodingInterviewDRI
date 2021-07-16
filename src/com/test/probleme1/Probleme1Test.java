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
		
		 String [] book = new String [] {"1","2","3","85","1","1"}; // 1:3; 2:1; 3:1, 85:1
		 
		 assertEquals(1,Probleme1.rechercherOccurences(book,"3"));
	}
	
	/**
	 * Test d'echec du nombre d'occurences de "1"
	 */
	@Test
	public void test2() {
		
		 String [] book = new String [] {"1","2","3","85","1","1"}; // 1:3; 2:1; 3:1, 85:1
		 
		 assertNotEquals(1,Probleme1.rechercherOccurences(book,"1"));
	}
	
	/**
	 * Methode de test
	 */
	public static void main(String[] args) {	
		
		Result result = JUnitCore.runClasses(Probleme1Test.class);					
		for (Failure failure : result.getFailures()) {							
		     System.out.println(failure.toString());					
		 }		
		 
		System.out.println("Résultat des tests == "+result.wasSuccessful());
		
	}

}
