package programs;

public class variable {
	
	int a = 20;//instance variable
	static int b = 50;//static variable
	
	public static int print() {
		 int mark = 97;
		 return mark;
	}
	
	void display() {
		 int d = 60; //local variable
		 System.out.println("method inside variable:"+d);
	}
	
	public static void main(String[] args) {
		int c = 75;//local variable
				variable obj1 = new variable();
		System.out.println(obj1.a);
		obj1.display();
		System.out.println(b);
		System.out.println(c);	
        System.out.println(print());
        
        variable2.show();
        
        variable2 v2 = new variable2();
        v2.students();
	}
}
