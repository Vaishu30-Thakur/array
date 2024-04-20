public class basicSorting {

    //bubble sorting
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Selection sorting
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int curr=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[curr])
                curr=j;
            }
            int temp=arr[curr];
            arr[curr]=arr[i];
            arr[i]=temp;
        }
    } 

    //insertion sorting
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countSort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             max=Math.max(arr[i],max);
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] nums={1,4,8,5,2};
        countSort(nums);
        printArr(nums);
    }
    
}
