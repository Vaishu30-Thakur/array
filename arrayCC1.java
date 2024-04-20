package github.array;

public class arrayCC1 {
    
    //trapped rainwater problem
    public static int trappedRainwater(int[] h){
        int n=h.length;
        
        //calculate left max boundary---array
        int[] leftmax=new int[n];
        leftmax[0]=h[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],h[i]);
        }

        //calculate right max boundary---array
        int[] rightmax=new int[n];
        rightmax[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],h[i]);
        }

        //loop
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappedwater+=waterlevel-h[i];

        }

        return trappedwater;

    }

    //stock price problem
    public static int buyAndSellStock(int[] prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                 maxProfit=Math.max(maxProfit,profit);
            }
            else
            buyPrice=prices[i];
        }
        return maxProfit;
    }
    public static void main(String[] args){
        //int[] height={4,2,0,6,3,2,5};
        int p[]={7,1,5,3,6,4};
        //int x=trappedRainwater(height);
        int x=buyAndSellStock(p);
        System.out.println(x);
    }
    
}
