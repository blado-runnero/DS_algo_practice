
public class a045_ust_even_odd_rearrange_array {

	public static void arrangeOddAndEven(int arr[], int n)
	  {
	      int i = 0, j = n - 1;
	      while (true) {
	  
	         
	          while ((i < n) &&
	            ((i + arr[i]) % 2 == 0))
	              i++;
	  
	          while ((j >= 0) &&
	            ((j + arr[j]) % 2 == 0))
	              j--;
	  
	          if (i >= j)
	              break;
	  
	          int temp = arr[i];
	          arr[i] = arr[j];
	          arr[j] = temp;
	      }
	  }
	  
	  public static void printArray(int arr[], int n)
	  {
	      for (int i = 0; i < n; i++)
	          System.out.print(arr[i] + "\t");
	  }
	     
	  public static void main(String args[]){
	    int arr[] = { 1,5,11,15,999,67,2,4,6,8,34,20 };
	    int n = 12;
	  
	    System.out.print("Before : \n");
	    printArray(arr, n);
	  
	    arrangeOddAndEven(arr, n);
	  
	    System.out.print("\n\n\nAfter : \n");
	    printArray(arr, n);
	  }
	         
	}

