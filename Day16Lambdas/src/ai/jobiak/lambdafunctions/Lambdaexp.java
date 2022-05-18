package ai.jobiak.lambdafunctions;
@FunctionalInterface
interface Station{
	//void order();
	String order(String source, String destination);

}

/*class Test implements Station{
	
	@Override
	public void order() {
		System.out.println("your journey is confirmed....!");
		
	}

}
*/
public class Lambdaexp {
	
	public static void main(String [] args) {
	
	/*	//method=1 
		Test test =new Test();
		test.order();
	*/	
		
		//method =2 anonymous class
		
		Station s = new Station() {
		
			@Override
			public String order(String source, String destination) {
				System.out.println("your journey from "+source+" to "+ destination +" is reached...." );
				return destination;
			}

			
       };
       
       s.order("secundrabad","lakdikapul" );
       

//method=3  lambda function
Station s1 = (source,destination)->{
	System.out.println("your journey from  "+source+" to "+ destination +" is completed...." );
	return "success";
	
};
String status = s1.order("nad junction","Rtc complex");
System.out.println(status);


}
}
