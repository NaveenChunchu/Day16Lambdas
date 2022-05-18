package ai.jobiak.java8;
import java.util.function.Function;
public class TestFunctionals {
	public static void main(String[] args) {
		
		Function<String,Integer> lengthFunction = (String str)->{return str.length();};
		int result = lengthFunction.apply("Jobiak.ai");
		System.out.println(result);
		
		Function<String,String> uppercase = (String str)->{return str.toUpperCase();};
		String result1 = uppercase.apply("jobiak.ai");
		System.out.println(result1);
		
		Function<String,String> concat = (String str)->{return str.concat(" Grooming Technology ");};
	    String result2 = concat.apply("Jobiak.ai");
	    System.out.println(result2);
	
	    Function<String,String> s = (String str)->{return str.indent(8);};
	    String result3 = s.apply(result2);
	    System.out.println(result3);
	    
	    Function<String,String> s1 = (String str)->{return str.repeat(6);};
	    String result4 = s1.apply("Good Morning ");
	    System.out.println(result4);
	    
	    Function<String,String> s2 = (String str)->{return str.stripIndent();};
	    String result5 = s2.apply("   Jobiak.com");
	    System.out.println(result5);
	    
	    Function<String,Character> s3 = (String str)->{return str.charAt(5);};
	    Character result6 = s3.apply("Jobiak.com");
	    System.out.println(result6);
	    	
	    Function<String,String> s4 = (String str)->{return str.replace('o', 'a');};
	    String result7 = s4.apply("Jobiak.com");
	    System.out.println(result7);
	}
	}


