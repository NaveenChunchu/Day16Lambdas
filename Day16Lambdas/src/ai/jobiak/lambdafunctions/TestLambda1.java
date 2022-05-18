package ai.jobiak.lambdafunctions;

@FunctionalInterface
interface Test
{
	public default void paint() {System.out.println("from default method");}
	public static void method() {System.out.println("From ststic method");}
	public void print();
}
interface Test2
{
	public void add(int a,int b);
}
interface Test3
{
	public int fact(int a);
}
interface Test4
{
	public String getString();
}
public class TestLambda1 {

	public static void main(String[] args) 
	{
		Test test=()->{System.out.println("from print");};
		test.print();
		test.paint();
		Test.method();
		
		Test2 test2=(int a,int b)->{
			int c=a+b;
			System.out.println(c);
		};
		test2.add(10,20);
		
		Test3 test3=(int a)->{
			int f=1;
			for(int i=1;i<=a;i++)
				f*=i;
		   return f;
		};
		
		int factorial=test3.fact(5);
		System.out.println(factorial);
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From run method");
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		Runnable r1=()->{System.out.println("From ()-> run method");};
		Thread t1=new Thread(r1);
		t1.start();
		
		Test4 test4=()-> "naveen";
		System.out.println(test4.getString());
	}
}