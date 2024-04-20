import javax.swing.plaf.synth.SynthEditorPaneUI;

public class array2d {


    public static void spiralMatrix(int[][] arr){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){break;}
                System.out.print(arr[endRow][j]+" ");
            }

            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol){break;}
                System.out.print(arr[i][startCol]+" ");
            }

            startRow++;startCol++;endCol--;endRow--;
        }
    } 

    public static void diagonalSum(int[][] arr){
        int sum=0;
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if((i+j)==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);*/
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i)
            sum+=arr[i][arr.length-1-i];
        }
        System.out.print(sum);
    }

    public static boolean search(int[][] arr, int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key)
            {System.out.print("("+row+","+col+")");
            return true;}
            else if(arr[row][col]<key)
            row++;
            else
            col--;
        }
        System.out.println("key not found");
        return false;
    }

    public static int practice1(int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7)
                count++;
            }
        }
        return count;
    }

    public static void practice2(int[][] arr){
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        System.out.print(sum);
    }

    public static void transpose(int [][] arr){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},
                        {4,5,6},{7,8,9}};
        spiralMatrix(matrix);
        //diagonalSum(matrix);
        //boolean b=search(matrix, 8);
        //int x=practice1(matrix);
        //System.out.println(x); 
       // practice2(matrix);
       //transpose(matrix);
    }
    
}
