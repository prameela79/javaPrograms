package practiceString_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcdss";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap();
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
         System.out.println(map);


	}

}
