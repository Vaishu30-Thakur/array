package github.array;

public class arrayCC {

    public static void update(int marks[],int nonChangable){
        for(int i=0;i<marks.length;i++){
            nonChangable=10;
            marks[i]=marks[i]+1;
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args){
        //call by reference vs call by value
        int[] marks={56,78,90};              // array as argument is always passed by reference

        int nonChangable=5;         // call by value

        //function call
        update(marks,nonChangable);
        
        System.out.println(nonChangable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
    
}
