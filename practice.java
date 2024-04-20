package github.array;

public class practice {
    public static boolean distinct(int[] n){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[j]==n[i])
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] num={1,2,3,5};
        boolean b=distinct(num);
        System.out.println(b);
    } 
}
