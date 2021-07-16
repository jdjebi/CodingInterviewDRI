package com.test.probleme1;

/**
 * Classe de representation la resolution du probleme 1
 * @author Jean-Marc Dje Bi
 * @since 16-07-2021
 */
public class Probleme1 {
	
	/**
	 * Compte le nombre d'occurences d'un mot dans une liste
	 * @param book Liste de mot
	 * @param word a rechercher
	 * @return nombre d'occurence. -1 si aucune occurence n'est trouve
	 */
	public static int rechercherOccurences(String [] book, String word) {
		// La complexite est de n
					 
		int counter = 0; // Compteur d'occurences
	        
        for(String w: book) { 	
        	if(w.equals(word)) counter += 1; // Si une occurence est trouve alors on incremente le compteur
        }
                
        return counter > 0 ? counter : -1;
	}

}
