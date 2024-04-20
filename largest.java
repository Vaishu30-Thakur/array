package github.array;

public class largest {

    public static int largest_number(int[] arr){
        int max=Integer.MIN_VALUE;
        int large=0;
        for(int i=0;i<arr.length;i++){
           // max=Math.max(max, arr[i]);           
           if(arr[i]>large)
           large=arr[i];
        }
           //return max;
           return large;
    }
    public static void main(String[] args){
        int[] numbers={1,6,7,3,5,9};
        int n=largest_number(numbers);
        System.out.println(n);
    }
    
}
