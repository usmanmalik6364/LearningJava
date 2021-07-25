import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
    //System.out.println("Hello World");
    //int myFirstNumber  = 5;
    //System.out.println(myFirstNumber);
    //createByteIntShortLongVariables();
        // System.out.println(DigitSumChallenge(12011345));
        //if(isPalindrome(-1221)) System.out.println("isPalindrom");
//        System.out.println(Integer.parseInt("-1221"));
//        System.out.println(sumFirstAndLastDigit(1211212167));
//        System.out.println(getEvenDigitSum(12348));
        //if(hasSharedDigit(12,30)) System.out.println("Shared Digit is True");
//        System.out.println(greatestCommonDivisor(25,15));
//        printFactors(25);
//        if(isPerfectNumber(6)) System.out.println("Perfect Number");
//        numberToWords(123456789);
//        boolean result = canPack(0,5,4);
//        System.out.println(result);
     //   System.out.println(getLargestPrime(7));
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//        Ceiling ceiling = new Ceiling(12,55);
//        Bed bed = new Bed("Modern", 4,3,2,1);
//
        int [] myArray = {0,1,2,3,4};
        reverse(myArray);
}

    private static void reverse(int[] myArray){
        System.out.println("Array = " + Arrays.toString(myArray));
        int [] reversedArray = new int[myArray.length];
        int count =0;
        for (int i = myArray.length-1;i>=0;i--){
            reversedArray[count] = myArray[i];
            count++;
        }
        myArray = reversedArray;
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }
    public static void printSquareStar(int number){
        if(number <5) {
            System.out.println("Invalid Value");
            return;
        }

    }
    public static int getLargestPrime(int number){
        if(number<=1) return -1;
        int largestPrimeNumber = -1;
        for(int i =1;i<number;i++){
            if(number %i==0) largestPrimeNumber = i;
        }
        return largestPrimeNumber;
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        //bigCount => count of big flour bags. 5kg each
        //smallCount=> count of small flour bags. 1kg each
//        if (bigCount< 0 || smallCount <0) return false;
//        int sumBigCount=0;
//        int sumSmallCount = 0;
//        sumBigCount = bigCount *5;
//        sumSmallCount = smallCount *1;
//        if(sumBigCount +sumSmallCount > goal) {
//            if(sumBigCount > 0 && sumSmallCount > 0){
//                if(goal%sumBigCount==0 || goal % sumSmallCount == 0) return true;
//
//            }
//            //return   true;
//        }
    return false;
//

    }
    public static void numberToWords(int number){
        int lastDigit = 0;
        if(number<=0) System.out.println("Invalid Value");
        else if(number == 0){
            System.out.println("Zero");
            return;
        }
        else{

            int numberCopy = number;
            while(numberCopy>0){
                lastDigit= numberCopy  % 10;
                numberCopy  = numberCopy / 10;
                if(lastDigit == 0){
                    System.out.println("Zero");
                }else if(lastDigit == 1){
                    System.out.println("One");
                }else if(lastDigit ==2){
                    System.out.println("Two");
                }else if(lastDigit ==3){
                    System.out.println("Three");
                }else if(lastDigit == 4){
                    System.out.println("Four");
                }else if (lastDigit == 5){
                    System.out.println("Five");
                }else if (lastDigit == 6){
                    System.out.println("Six");
                }else if (lastDigit == 7){
                    System.out.println("Seven");
                }else if(lastDigit == 8){
                    System.out.println("Eight");
                }else if(lastDigit == 9){
                    System.out.println("Nine");
                }


            }
            return;
        }
    }
    public static boolean isPerfectNumber(int number){
        if(number<=1) return false;
        boolean result = false;
        int sumOfDivisors = 0;
        for (int i = 1; i < number;i++){
            if(number%i==0)
            sumOfDivisors+=i;
        }
        if(sumOfDivisors==number) result= true;
        return result;
    }
    public static void printFactors(int number){
        if (number<1) System.out.println("Invalid Value");
        else{
            for(int i = 1; i<=number;i++){
                if(number%i==0)
                    {
                        System.out.println(i);
                  }
            }
        }

    }
    public static int greatestCommonDivisor(int number1, int number2){
        if(number1 <10 || number2 < 10 ) return -1;
        int greatestCommonDivisor = -1;
        int largerNumber = 0;
        if(number1>number2) largerNumber=number1;
        else largerNumber=number2;
        for (int i = 1;i<largerNumber;i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((!isValid(num1) || (!isValid(num2)) || (!isValid(num3)))) return false;
        int lastDigitNum1, lastDigitNum2, lastDigitNum3 = 0;
        lastDigitNum1 = num1 %10;
        lastDigitNum2 = num2 %10;
        lastDigitNum3 = num3 % 10;
        if((lastDigitNum1 == lastDigitNum2) || (lastDigitNum1 == lastDigitNum3) || (lastDigitNum2 ==lastDigitNum3)) return true;
        return false;
    }
    public static boolean isValid(int number){
        if(number>=10 && number<=1000) return true;
        return false;
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if ((number1 <10 || number1 >99) || (number2 <10 || number2>99)) return false;
        int number1Copy = number1;
        int number2Copy = number2;
        ArrayList<Integer> number1List = new ArrayList<Integer>();
        ArrayList<Integer> number2List = new ArrayList<Integer>();
        while(number1Copy > 0 && number2Copy > 0){
            int lastDigitNum1 = number1Copy%10;
            int lastDigitNum2 = number2Copy%10;
            number1Copy = number1Copy / 10;
            number2Copy = number2Copy/10;
            number1List.add(lastDigitNum1);
            number2List.add(lastDigitNum2);
        }
        for(int i = 0 ; i < number1List.size();i++){
            for(int j = i ; j < number2List.size();j++){
                if(number1List.get(i)==number2List.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static int getEvenDigitSum(int number){
        if(number<=0) return -1;
        int numberCopy = number;
        int evenDigitSum = 0;
        while(numberCopy>0){
            int lastDigit = numberCopy % 10 ;
            numberCopy = numberCopy / 10;
            if(lastDigit%2==0){
                evenDigitSum +=lastDigit;
            }
        }
        return evenDigitSum;
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<=0 ) return -1;
        if (number ==0) return 0;
        int numberCopy = number;
        int firstDigit = 0;
        int lastDigit  = numberCopy%10;
        while(numberCopy>0){
            firstDigit = numberCopy % 10;
            numberCopy = numberCopy / 10;
        }
        int sum = firstDigit + lastDigit ;
        return sum;
    }
    public static boolean isPalindrome(int number){
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int numberCopy = Math.abs(number);
        String numberReverse = "";
        while(true){
            int lastDigit = numberCopy % 10;
            numberCopy = numberCopy / 10;
            numberList.add(lastDigit);
            if(numberCopy  == 0 ) break;
        }
        for(int i = 0 ; i < numberList.size();i++){
            numberReverse += String.valueOf((numberList.get(i)));
        }
        System.out.println("Reversed Number => "+numberReverse);
        int reversedNumber = Integer.parseInt(numberReverse);
        if (Math.abs(reversedNumber) == Math.abs(number)){
            return true;
        }
        return false;
    }
    public static void createByteIntShortLongVariables(){
        byte byteNumber = Byte.MIN_VALUE;
        short shortNumber = Short.MIN_VALUE;
        int intNumber = Integer.MIN_VALUE;
        long longNumber = (long) 50000 + (10* byteNumber) + shortNumber + intNumber;
        System.out.println("LongNumber after operations is \t" + longNumber);



    }
    public static int  DigitSumChallenge(int number){
        int sum = 0;
        if (number <=0) return -1;
        int numberCopy = number;
        while(numberCopy>=10){
            int lastDigit = numberCopy %10;
            numberCopy = numberCopy/10;
            sum+=lastDigit;
        }
        sum+=numberCopy;
        return sum;
    }
    public static boolean isOdd(int number){
        if(number>0 && number % 2 != 0 ) return true;
        return false;
    }
    public static  int sumOdd(int start, int end){
        if ((start <= 0) || (end<start) || (end<=0) ) return -1;
            int sum = 0;
        for (int i = start;i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }


}
