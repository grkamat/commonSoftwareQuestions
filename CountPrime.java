/**
 * Class which contains a method to count the number of prime numbers upto a
 * given input number
 * 
 * @author grkamat
 *
 */
public class CountPrime {

	/**
	 * Count the number of prime numbers upto N
	 * @param n input number upto which prime number is to be found
	 * @return count of prime numbers
	 */
	public int countPrimes(int n) {
        if(n<=2)
            return 0;
        
        
        
		int countPrime = 1;
		for(int number=3;number<n;number+=2) {
			boolean isPrime = true;
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number % i == 0){
                    //System.out.println("InnerLoop_number:"+number+"mod_by:"+ i);
                    isPrime = false;
					break;
            }
			}
            if(isPrime){
			//System.out.println(number);
            countPrime = countPrime + 1;
        }
			
			
		}
			

		return countPrime;
	}

}
