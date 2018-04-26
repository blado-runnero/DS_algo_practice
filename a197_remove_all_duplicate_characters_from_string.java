/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

/**
 *
 * @author bladeRUNNER
 */
public class a197_remove_all_duplicate_characters_from_string {
    public static void main(String args[]){
        String str = "geeksforgeeks";
        int ascii[] = new int[256];
        for(int i = 0; i<str.length(); i++){
            ascii[str.charAt(i)]++;
        }
        String out = "";
        for(int i = 0; i<256; i++){
            if(ascii[i]>0){
                char x = (char) i;
                out = out + x;
            }
        }
        System.out.println(out);
    }
}
