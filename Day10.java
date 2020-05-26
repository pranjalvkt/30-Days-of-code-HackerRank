public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int rem=0,s=0,t=0;
        while(n>0) {

            rem=n%2;
            n=n/2;
            if(rem==1) {   
                s++;
                if(s>=t)
                    t=s;
            }
            else {
                s=0;
            }   
        }
        System.out.println(t);
        scanner.close();
    }
}
