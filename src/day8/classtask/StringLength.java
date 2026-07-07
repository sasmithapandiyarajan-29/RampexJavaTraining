package day8.classtask;

public class StringLength{
    public static void main(String[] args){
        String name="Afzal";
        int n=name.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}

