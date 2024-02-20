public class SearchRange {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,10,10,10};
        int target=10;
        int[] ans=searchRange(nums,target);
        System.out.println(ans);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        int start=binarySearch(nums,target,true);
        int end=binarySearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int binarySearch(int[] nums, int target,boolean isStartIndex){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isStartIndex){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else

                low=mid+1;
        }
        return ans;
    }
}
