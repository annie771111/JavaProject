package calltestreference;

public class ex2 {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		myShirt.size='M';
		myShirt.price=3000;
		
		Shirt yourShirt=new Shirt();
		yourShirt.size='S';
		yourShirt.price=5000;
		
		System.out.println("myShirt_1"+myShirt);
		System.out.println("yourShirt_1"+yourShirt);
		
        System.out.println("(myShirt==yourShirt):"+(myShirt==yourShirt));
        System.out.println("(myShirt.equals(yourShirt))"+(myShirt.equals(yourShirt)));
        
        myShirt = yourShirt;
        
    	System.out.println("(myShirt==yourShirt)_1:" + (myShirt==yourShirt));
		System.out.println("(myShirt.equals(yourShirt))_1:" + (myShirt.equals(yourShirt)));
	}

}
