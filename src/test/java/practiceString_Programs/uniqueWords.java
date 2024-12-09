package practiceString_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class uniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				if(hash.getValue()==1) {
					System.out.println(hash.getKey()+" "+hash.getValue());
				}
			}

	}

}
