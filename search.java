package github.array;

public class search {
    public static int linear_search(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        
        }
        return -1;
    }

    public static int linear_search(String items[], String s){
        for(int i=0;i<items.length;i++){
            if(items[i].equals(s))
            return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
            return mid;
            if(key<arr[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }

    //program to reverse an array
    public static void reverseAnArray(int[] arr){
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // all pairs in array
    public static void pairsInArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    //print all subarrays and max sum
    public static int subArrays(int[] arr){
        int max=Integer.MIN_VALUE;
        int count;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                 count=0;
                for(int k=start;k<=end;k++){
                    //System.out.print(arr[k]+" ");
                    count=count+arr[k];
                }
                //System.out.println();
                 max=Math.max(max, count);
            }
           // System.out.println();
        }
        return max;
    } 

    public static int kadaneAlgorithm(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
                if(currentsum<0)
                currentsum=0;
                maxsum=Math.max(maxsum, currentsum);
            }
        
        return maxsum;
    }
    public static void main(String[] args){
        int marks[]={1,-2,6,-1,3};
        String items[]={"samosa","paav bhaji","pizza"};
        String s1="pizza";
        int k=4;
        //int index=linear_search(marks, k);
        //int index=linear_search(items, s1);
        //int index=binarySearch(marks, k);
        //reverseAnArray(marks);
        //pairsInArray(marks);
        //int x=subArrays(marks);
        int x=kadaneAlgorithm(marks);
        System.out.println(x);
        /*if(index==-1)
        System.out.print("number not found");
        else
        System.out.println("number found at index"+index);*/
    }
    
}
