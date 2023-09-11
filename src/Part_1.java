public class Part_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 10;
        int[] arr1 = new int[size];
        int[] arr2 = {1, 2, 3, 4, 5};
        double[] arr3 = new double[1];
        String[] arr4 = new String[1];
        char[] arr5 = new char[1];
        boolean[] arr6 = new boolean[1];
        System.out.println(arr1.length);
        arr2[0] = 2;
        System.out.println("The fourth's element of an array is:" + arr2[3]);
        //arr2[1000] = 5;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        for (int element : arr2) {
            System.out.println(element);
            int count = 0;
            while (count != arr2.length) {
                System.out.println(arr2[count]);
                count++;
            }

        }
    }

}