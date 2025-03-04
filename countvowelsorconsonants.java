package oops;

public class countvowelsorconsonants {

	public static void main(String[] args) {
            String s="I am learning testing";
            int vowels=0;
            int consonants=0;
            for(int i=0;i<s.length();i++)
            {
            	char ch=s.charAt(i);
            	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            	{
            		vowels++;
            	}
            	else
            	{
            		consonants++;
            	}
            }
            System.out.println(vowels);
            System.out.println(consonants);
	}

}
