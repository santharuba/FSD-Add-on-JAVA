package programs;

public class Bitwise_operator {
       public static void main(String[] args) {
		
    	  int a = 5, b = 3;
    	  
    	  /*
    	  *OR
    	  *0101
    	  *0011
    	  *----
    	  *0111--->7
    	  *----
    	  *
    	  *XOR
    	  *0101
    	  *0011
    	  *----
    	  *0110--->6
    	  *----
    	  *
    	  *NOT-->-(n+1)
    	  *0101--->5
    	  *0001--->1
    	  *----
    	  *0110--->6
    	  *----
    	  *
    	  *final answer-->6
    	  *----
    	  **/
    	  
    	  System.out.println("Bitwise AND: "+(a & b));
    	  System.out.println("Bitwise OR: "+(a | b));
    	  System.out.println("Bitwise XOR: "+(a ^ b));	
    	  System.out.println("Bitwise NOT: "+(~a));
    	  
       }
}
