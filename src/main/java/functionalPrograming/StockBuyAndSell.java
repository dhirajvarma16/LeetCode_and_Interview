package functionalPrograming;

public class StockBuyAndSell {
    int profit=0,temp=0;
    public int maxProfit(int[] prices) {
        for (int i=0;i< prices.length-1;i++){
            for (int j=i+1; j< prices.length-1;j++){
            temp=prices[j]-prices[i];
            if (temp>profit)
                profit=temp;
        }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] price={7,1,5,3,6,4};
        StockBuyAndSell stockBuyAndSell= new StockBuyAndSell();
       System.out.println(stockBuyAndSell.maxProfit(price));
    }
}
