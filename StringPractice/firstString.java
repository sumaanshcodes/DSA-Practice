package StringPractice;

import java.util.Scanner;

public class firstString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(str);
            String str2 = sc.next();
            System.out.println(str2);
        }
    }
}    