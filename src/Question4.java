import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input word you want to check for palindrome:");
        String n = sc.next();
        String str = n;

        String reverse = (new StringBuilder(str)).reverse().toString();
        
        if(str.equals(reverse)) {
            System.out.println(str+" is a Palindrome.");
        } else {
            System.out.println(str+" is not a Palindrome.");
        }
    }}




