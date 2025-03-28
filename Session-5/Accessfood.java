package Session5;

public class Accessfood implements vegitems, nonvegitems{



	@Override

	public void fry() {

		System.out.println("chicken fry,prawn fry,mutton fry,fish fry....");

		

	}



	@Override

	public void gravy() {

		System.out.println("chicken gravy,mutton gravy.....");

		

	}



	@Override

	public void breakFast() {

		System.out.println("Idly,dosa,pongal....");

		

	}



	@Override

	public void lunch() {

		System.out.println("Tomato rice,curd rice,sambar");

		

	}

	public static void main(String[] args) {

		

		Accessfood afm = new Accessfood();

		afm.breakFast();

		afm.lunch();

		afm.fry();

		afm.gravy();

	}



		

	

}
