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
public class a198_angle_between_hour_and_minute_hand {
    
    static int get_angle(int h,int m){
        if(h==12) { h=0; }
        if(m==60) { m=0; }
        
        int hour_angle = (int) (0.5*(h*60+m));
        int min_angle = 6*m;
        int angle = Math.abs(hour_angle-min_angle);
        return Math.min(angle, 360-angle);
    }
    
    public static void main(String args[]){
        System.out.println("The angle between angle and minute hand :-");
        System.out.println("1.\t3:20\t"+get_angle(3,20));
    }
}
