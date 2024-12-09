package practiceString_Programs;

import java.util.LinkedHashMap;

public class NoofOccurance_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bees in a fish bowl saw fish in a fish bowl";
		String[] s1 = s.split(" ");
		LinkedHashMap<String,Integer> map = new LinkedHashMap();
		for(String word:s1) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);

	}

}
