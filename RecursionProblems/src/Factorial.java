public class Factorial {
    public static int fac(int n){
        if(n<=1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
