import java.util.ArrayList;

class Interval{
	int buy, sell;
}

public class a121_stocks_problem_efficient_multiple_buy_sell {

	public static void stock_strategy(int[] arr,int n) {
		if(n==1) {
			return;
		}
		int count = 0;
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i = 0;
		while(i<n-1) {
			while(i<n-1 && arr[i+1]<=arr[i]) {
				i++;
			}
			if(i==n-1) {break;}
			Interval e = new Interval();
			e.buy =i++;
			
			while(i<n && arr[i]>=arr[i-1]) {
				i++;
			}
			e.sell = i-1;
			sol.add(e);
			
			count++;
		}
		if(count == 0) {
			System.out.print("There is no way to make profit");
		}
		else {
			int profit = 0;
			for(int j = 0; j<count; j++) {
				int buy = sol.get(j).buy;
				int sell = sol.get(j).sell;
				int lprofit = arr[sell]-arr[buy];
				profit = profit + lprofit;
				System.out.println("Buy on day : "+buy+" for : "+arr[buy]+" \t\t sell on day : "+sell+" for : "+arr[sell]+"\t\t for profit of : "+(lprofit));
			}
			System.out.println("Total profit = "+profit);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stocks[] = {32,54,10,26,87,98,23,18,12,43,56,23,45,32,5632,43,3444,1345};
		int n = stocks.length;
		stock_strategy(stocks,n);		
	}
	
}
