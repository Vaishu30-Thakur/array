package github.array;

import java.util.Scanner;
import java.util.Arrays;

public class operation {
    public static void main(String[] args){
        //array creation
        int[] arr=new int[5];
        int [] marks={20,44,60};
        String [] fruits={"mango","apple"};

        //input in array
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();

        //output in array
        System.out.println("math="+arr[0]);
        System.out.println("phy="+arr[1]);
        System.out.println("che="+arr[2]);

        //update in arrays
        arr[2]=arr[2]+5;
        System.out.println("che="+arr[2]);

        //array length
        System.out.print("length of array is:"+arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,2)));   
    }

    
}
