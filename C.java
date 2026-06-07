//Best time to buy and sell stock 
import java.util.Arrays;

class C {
    public int maxProfit(int[] prices) {
        int Lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i=0; i<prices.length; i++) {
            if (prices[i] < Lsf) {
                Lsf = prices[i];
            }
            pist = prices[i] - Lsf;
            if(op<pist) {
                op = pist;
            }
        }
        return op;
    }
        public static void main(String[] args) {
        C obj = new C();

        int[] prices = {7,1,5,3,6,4};

        System.out.println(obj.maxProfit(prices));
        }
}