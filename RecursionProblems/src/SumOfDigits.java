public class SumOfDigits {
    public static int sumOfDigits(int n){
        if(n==0)
            return 0;
        return n%10+sumOfDigits(n/10);
    }

    public static int digitProduct(int n){
        if(n==0)
            return 1;
        return n%10*digitProduct(n/10);
    }

}
