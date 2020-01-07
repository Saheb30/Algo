package number;

public class PowerofTwo {
	public static void main(String args[]) {

        int[] numbers = {0,1,2,6,8};
      
        for(int num: numbers){
            System.out.println("isPowerOfTwo()-- is " + num + " power of two in Java :" + isPowerOfTwo(num));
            System.out.println("powerOfTwo()-- is " + num + " power of two in Java :" + powerOfTwo(num));
            System.out.println("checkPowerOfTwo()-- is " + num + " power of two in Java :" + checkPowerOfTwo(num));
            System.out.println("-----------------------------------------------------------");
        }         

    }


	private static boolean isPowerOfTwo(int number) {
        if(number <0){
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }

	private static boolean checkPowerOfTwo(int number){
        if(number <0){
           throw new IllegalArgumentException("number: " + number);
       }
       return ((number & (number -1)) == 0);
   }
	private static boolean powerOfTwo(int number){
        int square = 1;
        while(number >= square){
            if(number == square){
                return true;
            }
            square = square*2;
        }
        return false;
    }

}
