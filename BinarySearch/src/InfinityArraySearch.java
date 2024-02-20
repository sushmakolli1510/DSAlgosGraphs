public class InfinityArraySearch {
    public static void main(String[] args) {
int[] arr={1,10,30,40,50,100,200,250,350};
int target=250;
System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
             end=end+2*(end-start+1);
             start=temp;
        }
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
}
