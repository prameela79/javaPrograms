package practiceString_Programs;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vninny";
		for(int i=0; i<=s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				String substr = s.substring(i, j);
		
				System.out.println(substr);
				// checking palindrome of string having length 3
				if(substr.length()==3)
				{ 
				String temp="";
					for(int k=substr.length()-1; k>=0; k--)
					{
						temp=temp+substr.charAt(k);
					}
					if(temp.equalsIgnoreCase(substr))
					{
						System.out.println(substr+" : is palindrome string");
					}
				}
			}
		}

	}

}
