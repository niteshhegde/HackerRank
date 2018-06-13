import java.util.*;


public class Test {
    static long num = 1;
    static long solve(long n, long k) {
        // Complete this function

        long count = 0;
        boolean flag = true;
        while (num<=n){
            loop : for(long i = 2 ; i<=num;i++){
                flag = true;
                if(isPrime(i)){
                    Long d = (long)(Math.pow(Double.valueOf(i),Double.valueOf(k))) ;
                    if(num%d == 0){
                        flag = false;
                        break loop;
                    }
                }
            }
            if(flag){
                System.out.println(num);
                count++;
            }
            num++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long result = solve(n, k);
        System.out.println(result);
    }

    private static Boolean isPrime(long val){
        boolean b = true;
        for(long i = 2; i < val;)
            b &= val % i++ != 0;
        return b;
    }
}
