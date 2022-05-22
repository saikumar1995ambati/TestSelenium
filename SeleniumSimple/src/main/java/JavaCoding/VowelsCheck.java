package JavaCoding;

import java.util.Scanner;

public class VowelsCheck {

	public static void main(String[] args) {
		System.out.println("Please enter the String");
		Scanner sc = new Scanner(System.in);
		
	String Str1 =	sc.nextLine();
	String Str2 = Str1.toLowerCase();
	System.out.println(Str2);
	char[] w =Str2.toCharArray();
		for(int i= 0;i< w.length-1;i++)
		{
			if(w[i] == 'a'||w[i] =='e'||w[i] =='i'||w[i] =='o'||w[i] == 'u')
			{
				System.out.println("String contains an vowel");
			}
		}

	}

}
