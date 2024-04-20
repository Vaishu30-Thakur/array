import java.util.Arrays;

public class remove {
    

    public static int removeValue(int[] nums, int val) {
        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != val) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }

    public static int removeDuplicate(int[] nums){
        int writerPointer=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[writerPointer]=nums[i];
                writerPointer++;
            }
        }
        return writerPointer;
    }

    public static int removeDuplicate2(int[] nums){
        int writePointer=2;          
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[writePointer-2]){
                nums[writePointer]=nums[i];
                writePointer++;
            }
        }            /*int writePointer=1;
        for(int i=1;i<nums.length;i++){
            int count=0;
            while(nums[i]==nums[i-1]){
                count++;
            }
            if(count>=1){
                nums[writePointer]=nums[i-1];
                writePointer++;
            }
            nums[writePointer]=nums[i];
            writePointer++;*/
            return writePointer;
        }
        
    

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4,4};
        int val = 3;
        System.out.println("Original Array: " + Arrays.toString(nums));
        int newLength = removeDuplicate2(nums);

        
        //System.out.println("Value to Remove: " + val);
        System.out.println("Array after removing the value: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("Number of elements not equal to val: " + newLength);
    }
}

    

