package day5.com.capg;

public class Mystr {
	public static void main(String[] args) {
		String str="Sagar";
		String str1=new String("jadhav");
		String str2="jadhav";
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("wrong");
		}
		
		String a="s";
		String b="j";
		{
		System.out.println(a.compareTo(b));
		}
		str.charAt(2);
		{
			System.out.println(str.charAt(2));
			System.out.println(str.concat(str2));
			System.out.println(str.contains(""));
		}
		
	}
		

}
