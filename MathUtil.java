class MathUtil{
	 static boolean isEven(int num){
		return num%2==0;
	}
	
	 static boolean isOdd(int num){
		return num%2==1;
	}
	
	 static boolean isPrime(int num){
		if(num%2==0 || num%3==0 || num%5==0)
			return false;
			
		for(int i =7;i<num;i+=2){
			if(num%i==0)
				return false;
		}
		return true;
	}
	 static int countPrime(int start, int end){
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i))
				count++;
		}
		return count;
	}
	
	 static int reverse(int num){
		int sign=1;
		int sum=0;
		if(num<0){
			sign=-1;
			num*=-1;
		}
		while(num>0){
			sum=sum*10+num%10;
			num/=10;
		}
		
		return sign*sum;
	}
	
	 static int digitCount(int num){
		int count=0;
		if(num<0)
			num*=-1;
		
		while(num>0){
			count++;
			num/=10;
		}
		return count;
	}
}