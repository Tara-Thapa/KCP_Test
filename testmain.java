class test
{
	int a,b;
	test(int x,int y)
	{
		
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class testmain
{
	public static void main(String args[])
	{
		test t1=new test(10,20);
		t1.display();
	}			
}