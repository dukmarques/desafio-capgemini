package br.com.capgemini.questions;

import java.util.Arrays;
import java.util.HashMap;

public class Question3 {
	
	public void anagramSubstrings(String text) {
		HashMap<String, Integer> mapAnagrams = new HashMap<>();
		  
        for(int i = 0; i < text.length(); i++){
            for(int j = i; j < text.length(); j++){
                char[] valC = text.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (mapAnagrams.containsKey(val)) {
                	mapAnagrams.put(val, mapAnagrams.get(val)+1);                	
                } else {
                	mapAnagrams.put(val, 1);                	
                }
            }
        }
        int anagrams = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagrams += (n * (n-1))/2;
        }
        System.out.println(anagrams);
	}
}
