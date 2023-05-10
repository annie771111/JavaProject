package calltestreference;
class Fish{
	public static String name ="fish";
	
	public static void swim() {
		System.out.println("fish can swim");
	}
	
			
}

public class CallTestStaticMembersEx1 {

	public static void main(String[] args) {
		System.out.println("Fish.name:"+Fish.name);
        Fish.swim();
        
	}

}
