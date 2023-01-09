 package ex1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) {
		
		String hungry="yes";
		if(hungry=="yes")
		{
			System.out.println("eat something");
		}
		else
		{
			System.out.println("do work");
		}
		
		String s1="Arpita";
		String s2="vaibhav"; //yashya
		String s3="";
		
		Map<Character,Character>m=new HashMap<>();
		
		int ch=0;
		for(int i=0;i<s2.length();i++)
		{
			if(!m.containsKey(s2.charAt(i)))
			{
				m.put(s2.charAt(i),s1.charAt(ch));
				s3=s3+s1.charAt(ch);
				ch++;
				if(ch==4)
				{
					ch=0;
				}
				
			}
			else
			{
				m.put(s2.charAt(i), s2.charAt(i));
				//System.out.println(m.get(s2.charAt(i)));
				s3=s3+(m.get(s2.charAt(i)));
				
				if(ch==4)
				{
					ch=0;
				}
			}
			
			
		}
		System.out.println(s3);
		
	}

}
