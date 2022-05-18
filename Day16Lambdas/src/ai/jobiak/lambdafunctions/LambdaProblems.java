package ai.jobiak.lambdafunctions;


interface Palindrome
{
	public void palin(String s);
}
interface PrimeNumber
{
	public Boolean prime(int n);
}
interface ReverseOfNumber
{
	public int reverse(int n);
}
interface SumOfDigits
{
	public int digitsSum(int n);
}
interface StringLength
{
	public void length(String s);
}
interface SubString
{
	public void sub(int a,int b,String s);
}
public class LambdaProblems {

	public static void main(String[] args)
	{
		//Palindrome
		Palindrome p=(String s)->{
			int i=0;
			int j=s.length()-1;
			boolean r=true;
			while(i<j)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					r=false;
					break;
				}
				i++;
				j--;
			}
			if(r)
			{
				System.out.println("Given string is palindrome");
			}
			else
			{
				System.out.println("Given string is not a palindrome");
			}
			
		};
		p.palin("ababa");
		//prime Number
		PrimeNumber pr=(int n)->{
			if(n>2)
			{
				if(n%2==0||n%3==0)
					return false;
				else
				{
					for(int i=4;i<Math.sqrt(n);i++)
					{
						if(n%i==0)
						{
							return false;
						}
					}
					return true;
				}
				
				
			}
			return false;
		};
		System.out.println(pr.prime(17));
		
		//Reverse Of a Number
        ReverseOfNumber r=(int a)->{
        	
        	int rev=0;
        	while(a!=0)
        	{
        		rev=rev*10+a%10;
        		a=a/10;
        	}
        	return rev;
        };
        System.out.println(r.reverse(1024));
        //Sum of digits of a number
        SumOfDigits sum=(int a)->{
        	int s=0;
        	while(a!=0)
        	{
        		s=s+a%10;
        		a=a/10;
        	}
        	return s;
        };
        System.out.println(sum.digitsSum(258));
        
        //String length
        StringLength l=(String s)->{System.out.println("Length of the string is "+s.length());};
        l.length("Naveen");
        //Substring
        SubString sub=(int a,int b,String s)->{System.out.println("Sub string from index "+a+" to index "+(b-1)+" is "+s.substring(a,b));};
	    sub.sub(0,4,"Naveenchunchu");
	}

}