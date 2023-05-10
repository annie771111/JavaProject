package calltestreference;


    class Shirt{
    	char size='L';
    	int price=2000;
    }
    public class calltestex1 {     
	public static void main(String[] args) {
		Shirt myShirt=new Shirt();
		myShirt.size='M';
		myShirt.price=3000;
		
		Shirt yourShirt=new Shirt();
		myShirt.size='M';
		myShirt.price=5000;
		
		System.out.println("myshirt_1"+myShirt);
		System.out.println("yourshirt_1"+yourShirt);
		
		System.out.println("myShirt.size"+myShirt.size);
		System.out.println("myShirt.price"+myShirt.price);
		
		System.out.println("yourShirt.size"+yourShirt.size);
		System.out.println("yourShirt.price"+yourShirt.price);

		//測試記憶地址覆蓋
		myShirt=yourShirt;
		
		System.out.println("myShirt_2"+myShirt);
		System.out.println("yourShirt_2"+yourShirt);
		//myShirt更新值,yourShirt也更新
		
		myShirt.size='X';
		myShirt.price=6000;
		
		System.out.println("yourShirt_1"+yourShirt);
		System.out.println("yourShirt.price_1"+yourShirt.price);

	}

}
