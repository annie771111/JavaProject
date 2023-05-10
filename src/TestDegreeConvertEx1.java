
public class TestDegreeConvertEx1 {

	public static void main(String[] args)
	
		{
		int index=2,degree=40;
		System.out.println("c->f");
        double degreeF =(9/5.0)*degree+32;
        System.out.println("degreeF" + degreeF);
        System.out.printf("degreeF:%3.2f", degreeF);
	
        if (index==2) {System.out.println("f->c");
		double degreeC = (degree-32)*5/9.0;
		System.out.println("degreeC:" + degreeC);
		System.out.printf("degreeF:%3.2f", degreeC);
	}}}

