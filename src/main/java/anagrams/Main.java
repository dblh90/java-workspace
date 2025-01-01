package anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(isAnagram(A,B));

    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            mapA.put(a.charAt(i), mapA.getOrDefault(a.charAt(i), 0) + 1);
            mapB.put(b.charAt(i), mapB.getOrDefault(b.charAt(i), 0) + 1);
        }
        for (int i = 0; i < a.length(); i++) {
            if (!mapB.containsKey(a.charAt(i))) {
                return false;
            }

            int valA = mapA.get(a.charAt(i));
            int valB = mapB.get(a.charAt(i));

            if (valA != valB) {
                return false;
            }
        }
        return true;
    }
}
