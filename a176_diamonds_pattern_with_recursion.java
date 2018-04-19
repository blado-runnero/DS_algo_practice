/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

/**
 *
 * @author bladeRUNNER
 */
public class a176_diamonds_pattern_with_recursion {
    static int num = 0;
    static int x = 0;
    static void print_diamond_with_recursion(int s, int e){
        if(s!=e){
            for(int i = 0; i<(e-s)/2; i++){System.out.print(" ");}
            x=0;
            for(int i = 0; i<s; i++){
                if(i==0 || i==s-1){
                System.out.print("*");
                x++;
                }
                else{if(x%2 == 1){
                    System.out.print(num);}else{
                    System.out.print("_");
                }
                    x++;
                }
            }
            x=0;
            num++;
            System.out.println();
        }
        if(s==e){ 
            x=0;
            for(int i = 0; i<e; i++){
               if(i==0 || i==s-1){
                System.out.print("*");x++;
                }
               else{
                   if(x%2==1){System.out.print(num);}
                   else{System.out.print("_");}
                   x++;
                }
            }
            x=0;
            System.out.println();
            num--;
            return;
        }
        print_diamond_with_recursion(s+2,e);    
        for(int i = 0; i<(e-s)/2; i++){System.out.print(" ");}
        x=0;
        for(int i = 0; i<s; i++){
                if(i==0 || i==s-1){
                System.out.print("*");
                x++;
                }
                else{if(x%2 == 1){
                    System.out.print(num);}else{
                    System.out.print("_");
                }
                    x++;
                }
            }
        num--;
        
        System.out.println();
        return;
        
    }
    
    public static void main(String[] args){
        int i = 9;
        print_diamond_with_recursion(1,(i*2)+1);
    }
}
