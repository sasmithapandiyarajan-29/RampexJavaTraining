package day8.classtask;

import java.util.Arrays;
public class StringArrayReverse {
    public static void main(String[] args){
        String[] menu ={"Veg","Non-Veg","Sweets","Beverages"};
        String[] m1 =new String[menu.length];
        for(int i = 0; i < menu.length; i++){
            m1 [i]=menu[menu.length -1 -i];

        }
        String[] m2 = new String[m1.length];//we may use normal method by printing menu
        for(int i = 0; i < m1.length;i++){
            m2[i] = m1[m1.length-i-1];
        }
        System.out.println(Arrays.toString(m1));
        System.out.print(Arrays.toString(m2));
    }
}