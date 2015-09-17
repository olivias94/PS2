package MainPackage;

import java.lang.Math;

public class MyInteger {

	private int value;
	
		//constructor
		public MyInteger(){
		}
		
		public MyInteger(int newvalue){
			this.value = newvalue;
			
		}
			
		
		public int getvalue(){
			return this.value;
		}
		
		//the following 3 nonstatic methods use this.value
		
		public boolean isEven(){
			if (this.value % 2 == 0){
				return true;}
			else{
				return false;}
		}
		
		public boolean isOdd(){
			if (this.value % 2 != 0){
				return true;}
			else{
				return false;}
		}
		
		public boolean isPrime(){
			int isPrimeCounter = 2;
			/*this is the while loop conditional counter, goes up every iteration
			 * it starts at 2 because every number less than 2 is not prime
			*/
			
			int isNotPrimeCounter = 1;
			/*this will be checked for if no primes are found (it will = 2 if 
			 * the if statement inside the while loop returns false, meaning that a non-one
			 * and non-self factor was found)
			*/	
			
			int numberIsLessThan2Counter = 1;
			//This counter will be changed to 2 if the number entered is less than
			//2, because numbers less than 2 cannot be prime
			
			if (this.value < 2){
				isPrimeCounter = this.value; //while loop conditional
				numberIsLessThan2Counter = 2;
				return false;
				//because negative numbers, 1, and 0 cannot be prime
			}
			
			while (isPrimeCounter < this.value){
				if (this.value % isPrimeCounter == 0){
					isPrimeCounter = this.value; //while loop conditional, will exit the loop
					isNotPrimeCounter = 2;
					//this change is to signify that this.value is not prime
					return false;	
				}
				else{
					isPrimeCounter++;
					continue;
				}
			}
				if (isPrimeCounter == this.value && isNotPrimeCounter == 1 && numberIsLessThan2Counter == 1){
					return true;
				}
				else{
					return false;
					//this will return true if isNotPrimeCounter has not been changed in the first
					//if statement, meaning that the this.value has been found to be prime
				
				}
			
		}

		
	//the following 3 static methods use MyInteger.value 
		
		public static boolean isEven(MyInteger integer1){
			if (integer1.value % 2 == 0){
				return true;}
			else{
				return false;}
		}

		public static boolean isOdd(MyInteger integer1){
			if (integer1.value % 2 == 0){
				return false;}
			else{
				return true;}
		}

		public static boolean isPrime(MyInteger integer1){
			int isPrimeCounter = 2;
			/*this is the while loop conditional counter, goes up every iteration
			 * it starts at 2 because every number less than 2 is not prime
			*/
	
			int isNotPrimeCounter = 1;
			/*this will be checked for if no primes are found (it will = 2 if 
			 * the if statement inside the while loop returns false, meaning that a non-one
			 * and non-self factor was found)
			*/			
			
			int numberIsLessThan2Counter = 1;
			//This counter will be changed to 2 if the number entered is less than
			//2, because numbers less than 2 cannot be prime
			
			if (integer1.value < 2){
				isPrimeCounter = integer1.value; //while loop conditional
				numberIsLessThan2Counter = 2;
				return false;
				//because negative numbers, 1, and 0 cannot be prime
			}
			
			while (isPrimeCounter < integer1.value){
				if (integer1.value % isPrimeCounter == 0){
					isPrimeCounter = integer1.value; //while loop conditional, will exit the loop
					isNotPrimeCounter = 2;
					//this change is to signify that integer1.value is not prime
					return false;	
				}
				else{
					isPrimeCounter++;
					continue;
				}
			}
				if (isPrimeCounter == integer1.value && isNotPrimeCounter == 1 && numberIsLessThan2Counter == 1){
					return true;
				}
				else{
					return false;	
					//this will return true if isNotPrimeCounter has not been changed in the first
					//if statement, meaning that the this.value has been found to be prime
				
				}
			
		}
		
	//The following three static methods use staticvalue
		
		public static boolean isEven(int staticvalue){
			if (staticvalue % 2 == 0){
				return true;}
			else{
				return false;}
		}
		
		public static boolean isOdd(int staticvalue){
			if (staticvalue % 2 == 0){
				return false; 
				}
			else{
				return true;
				}
		}
		
		public static boolean isPrime(int staticvalue){
			int isPrimeCounter = 2;
			/*this is the while loop conditional counter, goes up every iteration
			 * it starts at 2 because every number less than 2 is not prime
			*/
			
			int isNotPrimeCounter = 1;
			/*this will be checked for if no primes are found (it will = 2 if 
			 * the if statement inside the while loop returns false, meaning that a non-one
			 * and non-self factor was found)
			*/
			
			int numberIsLessThan2Counter = 1;
			//This counter will be changed to 2 if the number entered is less than
			//2, because numbers less than 2 cannot be prime
			
			if (staticvalue < 2){
				isPrimeCounter = staticvalue; //while loop conditional
				numberIsLessThan2Counter = 2;
				return false;
				//because negative numbers, 1, and 0 cannot be prime
			}
			
			while (isPrimeCounter < staticvalue){
				if (staticvalue % isPrimeCounter == 0){
					isPrimeCounter = staticvalue; //while loop conditional, will exit the loop
					isNotPrimeCounter = 2;
					//this change is to signify that staticvalue is not prime
					return false;	
				}
				else{
					isPrimeCounter++;
					continue;
				}
			}
				if (isPrimeCounter == staticvalue && isNotPrimeCounter == 1 && numberIsLessThan2Counter == 1){
					return true;
				}
					else{
						return false;
					
					}
					//this will return true if isNotPrimeCounter has not been changed in the first
					//if statement, meaning that the this.value has been found to be prime
				
				}
			
		

		//The following 2 nonstatic methods check if the specified value is equal to the object value
		
		public boolean isEqual(int nonstaticvalue){
			if (nonstaticvalue == this.value){
				return true;
			}
			else{
				return false;
			}
			}
		
		
		public boolean isEqual(MyInteger integer1){
			if (integer1.value == this.value){
				return true;
			}
			else{
				return false;
			}
	
		}
		
		//The following 2 methods convert character arrays and strings to integer values
		
		public static int parseInt(char[] CharacterArrayToInt){
			/*This method first changed the character array into a string,
			 * then runs parseInt(String), which is the method that is below this one.
			 */
			
			//first check if all characters in the char array are numbers
			int isNotAllDigitsCounter = 1;
			for (int b : CharacterArrayToInt){
				if (Character.isDigit(b)){
					continue;
				}
				else{
					isNotAllDigitsCounter = 2;
					continue;
				}
					
			}
			if (isNotAllDigitsCounter == 1){
				
			String str = new String(CharacterArrayToInt);		
			//converted the character array into a string, now going to run the method for 
			//converting a string into an integer
			return parseInt(str);
			}
			else{
				System.out.println("The entered character array contains nonnumerical characters.  parseInt(char[]) cannot run.  A value of -1 will be returned by the method.");
				return (-1);
			}
		}
		
		public static int parseInt(String StringToInt){
			/*The purpose of this is the take the string (ex: "12345"), convert it into char numbers
			 * (ex: 1 2 3 4 5) and add them together to get an integer.  Math.pow is used to add the 
			 * numbers with decreasing powers of 10 for that they end up in the right place
			 * ex: 5 numbers means that StringLength = 5, so it will start with Math.pow(10, (StringLength - q))
			 * so, the numbers will be added like this:
			 * 10000 + 2000 + 300 + 40 + 5 = 12345
			 */
			int charIntToFinal = 0; //declaring the place holder for the final
			//int value that will be returned
			int StringLength = StringToInt.length();
			
			for (int q = 0 ; q <= (StringLength - 1) ; q++){//goes through each char in the string
				//and turns it to an integer, which is multiplied by 10 to the power of (StringLength - q)
				char currentCharacter = StringToInt.charAt(q);
				int currentInteger = Character.getNumericValue(currentCharacter);
				//System.out.println(currentInteger);
				//multiplying the current integer by a power of 10 to the power of (StringLength - q)
				int currentIntegerTenPower = (int) (currentInteger * Math.pow(10.0, (StringLength- (q + 1))));
				charIntToFinal = charIntToFinal + currentIntegerTenPower;
				
				}
			return charIntToFinal;
			
		
		}
		
}		
