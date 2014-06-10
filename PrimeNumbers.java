/**
 * The sole purpose of the class was to do a "find primes numbers between given 2 numbers"
 */

/**
 * @author Roshan Thalang Limbu
 *
 */
public class PrimeNumbers {

	/**
	 * 
	 */
	private PrimeNumbers() {
		// private to make the class non-instantiable
	}
	
	/**
	 * Prints out the primes between 2 given numbers (inclusive)
	 * @param firstNum the number to begin with. this number is inclusive
	 * @param lastNum the end of the range. this number is inclusive
	 * @return
	 */
	public static Collection<Integer> getEven(int firstNum, int lastNum) {
	List<Integer> primes = new ArrayList<>();
	
	//the check should start from 2 
	//(0 and 1 can divide any number and are not prime numbers either)
	if (firstNum < 2) {
		firstNum = 2;
	}
	//looping through the given range
	for (int num = firstNum; num <= lastNum; num++) {
		if (PrimeNumbers.isPrime(num)){
				primes.add(num);
			}
		}
	
	return primes;	
}
	
	/**
	 * is it a prime number?
	 * 
	 * @param number the number to be checked whether it is a prime
	 * @return true if it is a prime, false if it isn't
	 */
	public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //divisible by another number. not a prime
           }
        }
        return true; 
    }

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		System.out.println("Listing Prime Numbers from " + firstNum + " to " + lastNum);
		System.out.println(PrimeNumbers.getEven(1,100));
	}

}
