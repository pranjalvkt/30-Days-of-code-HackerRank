import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String even, odd;
            even = odd = "";
            String S = scan.next();
            char[] charArray = S.toCharArray();
            for (int j = 0; j < charArray.length; j +=2) {
                even += charArray[j];
            }
            for (int k = 1; k < charArray.length; k += 2) {
                odd += charArray[k];
            }
            System.out.println(even + " " + odd);
        }
    }    
}