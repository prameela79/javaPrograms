package practiceString_Programs;

import java.util.ArrayList;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}()";
        ArrayList<Character> list =new ArrayList(); 
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(list.size()>0 && 
            ((ch=='}' && list.get(list.size()-1)=='{')
            ||(ch==']' && list.get(list.size()-1)=='[')
            ||(ch==')' && list.get(list.size()-1)=='(')))
            {
                list.remove(list.size()-1);
            }
            else{
                list.add(ch);
            }
        }
        if(list.isEmpty()){
            System.out.println(s+" is balanced String");
        }
            else{
                System.out.println(s+" is not abalanced String");
            }

	}

}
