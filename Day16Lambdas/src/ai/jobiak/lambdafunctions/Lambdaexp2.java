package ai.jobiak.lambdafunctions;

@FunctionalInterface
interface A{
	int add(int a,int b) ;
}
		

public class Lambdaexp2 {

	public static void main(String[] args) {
		//using lambda function.....
		A addition = (int a,int b)->{
			int sum=a+b;
			System.out.println(sum);
			return sum;
			
		};
		addition.add(10, 20);
   
	//using anonymous class.......
	A addi = new A() {

		@Override
		public int add(int a, int b) {
              int c=a+b;
              System.out.println(c);
			return c;
		}
		
	};
	addi.add(10, 20);
	


}

}
