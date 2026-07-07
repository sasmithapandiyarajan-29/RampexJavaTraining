package day7.classtask;

public class minimumvalue {
    public static void main(String[] args){
        int [] num = {3,2,5,1,4};
        int min = 7;
        for(int i = 0; i < num.length;i++){
            if(num[i] < min ){
                min = num[i];
            }
        }
        System.out.println("Minimun number is "+min);

    }
}
