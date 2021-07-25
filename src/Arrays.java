import java.util.Scanner;

public class Arrays {
    public int[] getIntegers(int size){
        int[] my_array = new int[size];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(count<size){
            System.out.println("Please enter the number");
            int numberEntered = scanner.nextInt();
            scanner.nextLine();
            my_array[count]=numberEntered;
            count++;
        }
        scanner.close();
        return my_array;
    }
    public void printArray(int[] array){
        int i =0;
        for (int element:
             array) {
            System.out.println("Element "+ i +"contents" + element);
        }
    }
//    public int sortIntegers(int[] unsortedArray){
//        int[] arrayToSort = unsortedArray;
//        for(int i =0 ; i< unsortedArray.length;i++){
//
//        }
//    }
}
