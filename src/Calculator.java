class Calculator
{
	public static void main(String argv[])
	{
		int a,b;
		double c;
		c=0.0;
		char d='/';
//		String s1="+";
		System.out.println("Give i/p in format a b op");
		a=Integer.parseInt(argv[0]);
		b=Integer.parseInt(argv[1]);
//		d=Character.parseCharacter(argv[2]);
//		System.out.println(d);
//		if(s1.equals(argv[2]))
//			 System.out.println("Addition done");
		switch(d)
		{
			case '+':System.out.println("Addition"+(a+b));
					break;
			case '-':System.out.println("Subtraction"+(a-b));
					break;
			case 'x':System.out.println("Multiplication"+(a*b));
					break;
			case '/':try
				 {
					c=a/(double)b;
				 }
				 catch(ArithmeticException e)
				 {
					System.out.println("Division By Zero"+e);
				 }
				 //finally
				 //{
					System.out.println("Quotient"+c);
				 //}
					break;
			default:System.out.println("Operator Faulty");
		}
	}
}