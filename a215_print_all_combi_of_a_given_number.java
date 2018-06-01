
package new_package;

public class a215_print_all_combi_of_a_given_number {
    static void print_array(int[] arr,int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    
    static void print_composition(int[] arr, int n, int i){
        int max = 3;
        if(n==0){
            print_array(arr,i);
        }
        else if(n>0){
            for(int k = 1; k <= max; k++){
                arr[i] = k;
                print_composition(arr, n-k, i+1);
            }
        }
    }
    
    public static void main(String args[]){
        int n = 5;
        int size = 100;
        int[] arr = new int[size];
        print_composition(arr,n,0);
    }
 
}
