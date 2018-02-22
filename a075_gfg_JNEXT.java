import java.io.IOException;
import java.util.Arrays;

public class a075_gfg_JNEXT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		
		str = reader.readLine();
		int t = Integer.parseInt(str);
		
		while(t-->0){
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
			String[] sttr = str.split(" ");
			String string = "";
			char array[] = new char[n];
			for(int i=0; i<n; i++) {
				
				string =  string + sttr[i];
			}
			for(int i=0; i<n; i++) {
				
				array[i] = string.charAt(i);
			}
			
			findNext(array, n);
			
		}
	}
	
    static void findNext(char ar[], int n) 
    {
        int i;
      
        for (i = n - 1; i > 0; i--) 
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
        
        if (i == 0) 
        {
            System.out.println("Not possible");
        } 
        else
        {
            int x = ar[i - 1], min = i;
             
            for (int j = i + 1; j < n; j++) 
            {
                if (ar[j] > x && ar[j] < ar[min]) 
                {
                    min = j;
                }
            }
 
            swap(ar, i - 1, min);
 
            Arrays.sort(ar, i, n);
            
            for (i = 0; i < n; i++)
                System.out.print(ar[i]);
        }
    }
 
    static void swap(char ar[], int i, int j) 
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
	
}
