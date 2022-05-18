package ai.jobiak.java8;
//a interface can recognized as the functional interface in java8

@FunctionalInterface
interface Test{ // functional interface is used for more then one method is used in intferface
	public default void paint() {System.out.println("from default method....");}
	public static void method() {System.out.println("from static method....");}
	public void print();
	//not allowed only one abstract method per functionalinterface public abstract void paint();
}

class Testimpl implements Test{

	@Override
	public void print() {

		
	}
	
}

interface Test2{
	
	public void add(int a, int b);
}
interface Test3{
	public int factorial(int n);
}
interface Test4{
	
	public String getString();
}

public class TestLambda {

	public static void main(String[] args) {
		
		
		Test test = ()-> {System.out.println("from print....printing");};
		test.print();

		//test2
		Test2 test2 = (int a,int b)->{
			int c=a+b;
			System.out.println(c);
			
		};
		test2.add(10, 20);
		
		//test3
		Test3 test3 = (int n)->{
			int fact =1;
			int i=1;
			while(i<=n) {
				fact*=i;
				i++;
			}
			return fact;
		};
		int factorialResult = test3.factorial(5);
		System.out.println(factorialResult);
		
		
		
		Test4 t4 = ()-> "Naveen";
		System.out.println(t4.getString());
		
		
		//interfaces anonymous class
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("from run method........");
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		
		
		Runnable r1=()->{System.out.println("from()-> run method.....");};
		thread=new Thread(r1);
		thread.start();
		
		
	}

}
