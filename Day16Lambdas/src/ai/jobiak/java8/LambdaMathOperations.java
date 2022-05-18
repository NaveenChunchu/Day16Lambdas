package ai.jobiak.java8;

interface prime{
	public int primNum(int n);
}

interface fibo{
	public int fibonacci(int n);
}

interface sum{
	public int sumOfDigits(int n);
}

interface GcdLcm{
	public int GcdLcmOfNums(int a,int b);
}


interface perfect{
	public int perfectOrNor(int n);
	
}

public class LambdaMathOperations {
	public static void main(String[] args) {

		prime p = (int n)->{
			//int flag=0;
			int i=2;
			while(i<n) {
				if(n%i==0) {
					System.out.println(n+" is not prime");
					 //flag =1;
					break;
					
				}
			//	if(flag==0) {
				else {
					System.out.println(n+ "  is prime");
				}
			   i++;
			}
			return 0;
			};
		int prime = p.primNum(6);
		System.out.println();
		
			
	fibo f = (int n)->{
		int i=2;
		int a=0,b=1,c;
		System.out.println("The Fibonacci Sequence is");
		System.out.println(a);
		System.out.println(b);
		while(i<=n) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
		return 0;
		
	};
	int fibo = f.fibonacci(7);
	System.out.println();
	
	//sum of digits of a number
	sum s = (int n)->{

		int rem,sum=0;
		while(n>0) {
			rem = n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println("Sum Of Digits Of number is "+sum);
			return sum;
	};
	int sum = s.sumOfDigits(345);
	System.out.println();
	
	//GCD  LCM
	GcdLcm gl = (int a,int b)->{
		int i=1,gcd=0,lcm;
		while(i<=a&&i<=b) {
			if(a%i==0 && b%i==0)
				gcd=i;
			i++;
		}
		lcm = ((a*b)/gcd);
		System.out.println("Gcd and Lcm of "+a+" and "+b+ " is "+gcd+" , "+lcm);
		
		
		return 0;
		
	};
	int GcdLcm = gl.GcdLcmOfNums(14,30);
	System.out.println();
	
	perfect pe = (int n)->{
		int i=1;
		//int s=0;
		int	temp =n;
		int c=0;
		while(i<n) {
			if(n%i==0) 
				 c =c+i;
			
			i++;
		}
		if(temp==c) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
		return 0;
		
		
	};
	int perfect = pe.perfectOrNor(6);
	
	
	
	
	
	
	
	

		}
		
	}


