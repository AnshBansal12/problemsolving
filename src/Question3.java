import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input any number to obtain table 1-10:");
        int n = sc.nextInt();
        for(int i=1;
            i<=10;
            i=i+1)
            System.out.println(n + " * " + i
                    + " = " + n * i);


        System.out.println(n);


    }

}
