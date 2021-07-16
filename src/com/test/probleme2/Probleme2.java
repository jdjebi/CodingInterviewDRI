package com.test.probleme2;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Classe de representation la resolution du probleme 2
 * @author Jean-Marc Dje Bi
 * @since 16-07-2021
 */
public class Probleme2 {
	
	/**
	 * Compte le nombre d'occurences des lettres d'un mot en enregistrant le nombre d'occurences par lettre dans une table de hashage
	 * @param word mot a analyser
	 * @return chaine exprimant le nombre d'occurences des lettres du mot
	 */
	public static String compterLettre(String word) {
		// La compexite est de n
			
        String output = "[%s]"; // Expression de la sortie
        String preOutput = ""; // Pre-expression de la sortie

		HashMap<Character,Integer> lettersRegister = new HashMap<Character,Integer>(); // Table de hashage associant une lettre a son nombre d'occurences
			
		// Determination des occurrences
        for(int i =0; i < word.length(); i++) { 
        	
        	Character letter = word.charAt(i);
        	
        	if(!lettersRegister.containsKey(letter)) { // Si la lettre n'a pas encore enregistree on l'ajoute a la table avec pour valeur initiale 1
        		lettersRegister.put(letter, 1);
        	}else { // On incremente la valeur courante du nombre d'occurences associees a la lettre
        		lettersRegister.replace(letter,lettersRegister.get(letter) + 1); 
        	}
        	   
        }
         
        // Construction de la pre-expression de sortie: [$lettre$nombreOccurences;...]
        for(Entry<Character,Integer> wordEntry: lettersRegister.entrySet()) {
        	
        	preOutput += wordEntry.getKey().toString() + wordEntry.getValue() + ";"; 
        	
        }
        
        // Formatage de la sortie avec retrait du ; de la derniere lettre de la pre-expression
        output.formatted(preOutput.substring(0, preOutput.length() - 1));
        
        return output.formatted(preOutput.substring(0, preOutput.length() - 1)); // Retour de la sortie
	}

}
