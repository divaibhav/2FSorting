package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {100,80,60,40,20};
        MyBubbleSort obj = new MyBubbleSort();
        obj.bubbleSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){ // O(n2)
        //step 1
        for (int i = 0; i < arr.length ; i++) { //n times
            //step 2
            for (int j = 0; j < arr.length - 1; j++) { // n-1 times
                //step 3
                if(arr[j] > arr[j+1]){
                    //step 3.1 swap
                    System.out.println("swapping --> " + arr[j] + " with --> " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{
                    System.out.println("no swap");
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("after " + (i+1) + " pass");
            System.out.println(Arrays.toString(arr));
        }
    }
}
