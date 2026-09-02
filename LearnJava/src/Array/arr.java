package Array;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
            int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9};
//            int[] arr2 = arr1;
//            arr2[0] = 1;
//            arr2[1] = 10;
//            System.out.println(Arrays.toString(arr2));
//            System.out.println(Arrays.toString(arr1));

//            int[] arr3 = arr1.clone();
//            arr3[0] = 1;
//            arr3[1] = 10;
//            System.out.println(Arrays.toString(arr3));
//            System.out.println(Arrays.toString(arr1));

            int[] arr4 = new int[arr1.length];
            System.arraycopy(arr1, 0, arr4, 0, arr1.length );
            arr4[0] = 1;
            System.out.println(Arrays.toString(arr4));
            System.out.println(Arrays.toString(arr1));
    }
}
