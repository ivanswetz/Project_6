import java.util.Scanner;
import java.util.Random;

public class Part_2 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args){
        System.out.println("Enter size of an array: ");
        int size = scan.nextInt();
        inputArr(size);
        inputRandomArr(size);
    }
    public static int[] inputArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        arrCalculate(arr);
        return arr;
    }
    public static int[] inputRandomArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(100);
        }
        largeArr(arr);
        return arr;
    }
    public static void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("#" + i + " == " + arr[i]);
        }
    }
    public static void arrCalculate(int[] arr){
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void largeArr(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Biggest value: " + max);
    }
    public static int searchArr(int[] arr, int value){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(value == arr[i]){
                index = i;
            }
        }
        return index;
    }
}
