package functionalPrograming;

public class StockBuyAndSell_Approach2 {

    public int maxProfit(int[] prices) {
        int maxprofit=0,minprofit=prices[0];
        for (int price:prices){
            maxprofit=Math.max(maxprofit,price-minprofit);
            minprofit=Math.min(minprofit,price);
        }
        return maxprofit;
    }

    public static void main(String[] args){
        int[] price={7,1,5,3,6,4};
        StockBuyAndSell_Approach2 stockBuyAndSell= new StockBuyAndSell_Approach2();
       System.out.println(stockBuyAndSell.maxProfit(price));
    }
}
