package session3;

public class arraymethods {
       public static void main(String[] args) {
    	   //length of array
		    int[] num = {10,20,30,40,50};
		    System.out.println("length of num: "+num.length);
		    
		    //copying an array
		    int[] source = {1,2,3,4,5};
		    int[] destination = new int[5];
		    
		    //copy array
		    System.arraycopy(source, 0, destination, 0, source.length);
		    
		    for(int i:destination) {
		    	System.out.println(i+" ");
		    }
	}
}
