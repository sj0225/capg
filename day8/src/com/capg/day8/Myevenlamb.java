package com.capg.day8;
@FunctionalInterface
interface modLambda {
	
public void print(int a);
}

interface even {
    public void evennum(int a);
}




public class Myevenlamb {
	public static void main(String[] args) {
		
		
		
		Lambda result = ()-> System.out.println("example lambda");
        result.print();
        modLambda modLambda = (int a) -> {
           if ( a%2==0)
            System.out.println("the given num is even "+a);
           else
            System.out.println("the given num is odd  "+a);
	};
	modLambda.print(12);
	}
	
}
