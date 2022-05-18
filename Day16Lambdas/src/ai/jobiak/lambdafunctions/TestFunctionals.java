package ai.jobiak.lambdafunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.*;
public class TestFunctionals {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Function<String,Integer> lengthFunction=(String str)->{return str.length()/2;};
      ArrayList<String> ar=new ArrayList<String>();
      ar.add("apple");
      ar.add("mango");
      ar.add("pineapple");
      ar.add("grapes");
      List<Integer> flen=method(ar,lengthFunction);
      for(int i:flen)
      {
    	  System.out.println(i);
      }      
     int r=lengthFunction.apply("naveen");
      System.out.println(r);
      Predicate<Boolean> pre=(Boolean)->{return 100>30;};
      System.out.println(pre.test(true));
      
      Consumer<String> consumer=(String str)->{System.out.println(str);};
      consumer.accept("naveen");
      
      Supplier<Double> supplier=()->Math.random();
      System.out.println(supplier.get());
      
      Supplier<Integer> supplier1=()-> 6;
      System.out.println(supplier1.get());
      
	}
	static List<Integer> method(ArrayList<String> list,Function<String,Integer> functionParam)
	{
		ArrayList<Integer> intList=new ArrayList<Integer>();
		for(String str:list)
		{
			int len=functionParam.apply(str);
			intList.add(len);
		}
		return intList;
	}
}