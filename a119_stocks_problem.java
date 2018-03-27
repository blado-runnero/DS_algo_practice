
public class a119_stocks_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stocks[] = {32,54,10,26,87,98,23,18,12,43,56,23,45,32,5632,43,3444,1345};
		int n = stocks.length;
		int buy,sell,profit;
		buy=sell=profit=0;
		for(int i = 1 ; i<n; i++) {
			for(int j = i ; j<n;j++) {
				if(stocks[j]-stocks[i] > profit) {
					buy = stocks[i];
					sell = stocks[j];
					profit = stocks[j] - stocks[i];
				}
			}
		}
		
		System.out.println("buy for : "+buy+"\nsell for : "+sell+"\nprofit will be : "+profit);
		
	}

}
