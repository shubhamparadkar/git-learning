public class Operator2
{
	public static void main(String args[])
	{
		int a = 15;
		int b = 10;
		//a = a+2; //17
		//a += 6; //21
		//b = b+5; //15
		//b += 2; //12
		a *= 5; //75
		b /= 5; //2
		System.out.println(a);
		System.out.println(b);
		
		byte c = 10;
		//c += 10; //20
		c = (byte) (c+1); //11
		System.out.println(c);

		int m =12;
		//++m; //13
		--m; //11
		System.out.println(m);

		int n=10;
		//int z = ++n;
		int z = n++; 
		System.out.println(n); //10
		System.out.println(z); //11

		int w = 15;
		System.out.println(++w); //16
		System.out.println(w); //16
			

	}
}