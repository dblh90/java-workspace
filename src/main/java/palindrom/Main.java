package palindrom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        boolean isSameChar = true;
        int wordLength = A.length();
        if (wordLength % 2 == 0) {
            for (int index = 0 , jndex = wordLength - 1; jndex > index; index++, jndex--) {
                char charVorne = A.charAt(index);
                char charHinten = A.charAt(jndex);
                isSameChar = charVorne == charHinten;

                if (!isSameChar) {
                    break;
                }
            }
        } else {
            for (int index = 0 , jndex = wordLength - 1; index != jndex; index++, jndex--) {

                char charVorne = A.charAt(index);
                char charHinten = A.charAt(jndex);
                isSameChar = charVorne == charHinten;

                if (!isSameChar) {
                    break;
                }
            }
        }

        if (isSameChar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
