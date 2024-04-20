public class majority {

    public static int majorityElement(int[] nums){
        int key=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                key=nums[i];
            }
            else if(nums[i]==key)
            count++;
            else
            count--;
        }

        return key;
    }

    public static void main(String[] args){
        int[] nums={2,2,3,3,3};
        int majority=majorityElement(nums);
        System.out.println(majority);
    }
    
}
