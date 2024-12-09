package practiceString_Programs;

import java.util.HashSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;                  
import java.util.Set;

import org.testng.annotations.Test;

public class duplicateWords {
	@Test
	public void repeat() {
		String s="Java is a Java is a Programing Language Language";
		 
		String s1[]=s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(String words:s1) {
			if(map.containsKey(words)) {
				map.put(words, map.get(words)+1);
			}
			else {
				map.put(words, 1);
			}
		}
			for(Map.Entry<String,Integer> hash:map.entrySet()) {
				if(hash.getValue()>1) {
					System.out.println(hash.getKey()+" "+hash.getValue());
				}
			}
	     }
	
	
}
