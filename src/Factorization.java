import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
            for(int div=2;div<=num;div++){
                while(num%div==0){
                    num=num/div;
                    System.out.println(div);
            }
        }
    }
}
    

