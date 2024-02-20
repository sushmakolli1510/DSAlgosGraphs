public class ReverseNumber {
    public static int sum=0;
    public static int count=0;
    public static int revNumber(int n){

        if(n==0){
            return 0;
        }

        int r=n%10;
        sum=sum*10+r;
        revNumber(n/10);
        return sum;
    }
    //another way of reversing number
    public static int revNumber2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n==0){
            return 0;
        }
        return n%10*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
    public static boolean palindrom(int n){
        if(n==revNumber(n)){
            return true;
        }
        else return false;
    }
    //count the number of zeros in a number
    public static int countZero(int n){
        if(n==0){
            return 0;
        }
        int r=n%10;
        if(r==0){
            count++;
        }
        countZero(n/10);
        return count;
    }
    //leet code 1342. Number of Steps to Reduce a Number to Zero
    //Given an integer num, return the number of steps to reduce it to zero.
    //In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    int step=0;
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
        if(num%2==0) {
            step++;
            numberOfSteps(num/2);
        }else{
            step++;
            numberOfSteps(num-1);
        }
        return step;
    }
}
