import java.io.IOException;

public class a073_SPOJ_JNEXT {

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
<<<<<<< HEAD
			String[] sttr = str.split("");
			int array[] = new int[n];
			for(int i=0; i<n; i++) {
				int te = Integer.parseInt(sttr[i]);
				array[i]= te;
			}
=======
			String[] sttr = str.split(" ");
			//int[] ints = new int[sttr.length];
			int array[] = new int[n];
			for(int i=0; i<n; i++) {
				
				int te = Integer.parseInt(sttr[i]);
				array[i]= te;
				//System.out.println(te);
			}
			
			
			    
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
			    int ii = array.length - 1;
			    while (ii > 0 && array[ii - 1] >= array[ii])
			        ii--;
			    
			    if (ii <= 0) {
			    	System.out.println("-1");
<<<<<<< HEAD
			        break;
=======
			        continue;
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
			    }
			    int j = array.length - 1;
			    while (array[j] <= array[ii - 1])
			        j--;
			    
			    int temp = array[ii - 1];
			    array[ii - 1] = array[j];
			    array[j] = temp;
			    
			    j = array.length - 1;
			    while (ii < j) {
			        temp = array[ii];
			        array[ii] = array[j];
			        array[j] = temp;
			        ii++;
			        j--;
			    }
			    for(int jj = 0; jj < array.length; jj++) {
					System.out.print(array[jj]);
				}
<<<<<<< HEAD
				System.out.println();

=======
			  
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
			}
			
			
		}
	}
