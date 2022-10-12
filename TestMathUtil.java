class TestMathUtil{
	public static void main(String ... ag){
		boolean result= MathUtil.isEven(24);
		System.out.println("24 is even: "+result);
		
		result=MathUtil.isOdd(29);
		System.out.println("29 is odd: "+result);
		
		result=MathUtil.isPrime(93);
		System.out.println("93 is prime: "+result);
		
		System.out.println("prime count 1 to 100 is: "+MathUtil.countPrime(1, 100));
		
		System.out.println("reverse of -365 is: "+MathUtil.reverse(-365));
		
		System.out.println("number of digits in 1234567890 is: "+MathUtil.digitCount(1234567890));
	}
}