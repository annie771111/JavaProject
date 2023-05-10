package calltestreference;

class person{
	//method:fields +methods
	//instance members:instance fields+ methods
	//static members:static fields +methods
	
	//instance method
	public void sayhello() {
		System.out.println("hola");
	}
	//instance method
	public void sayGoodbye() {
		System.out.println("adios");
		//sayGoodbye();
	}
}

public class method {

	public static void main(String[] args) {
		person person1=new person();
		person1.sayhello();
		//person1.sayGoodbye();
		System.out.println("keep alive");

	
			
		}
	}


