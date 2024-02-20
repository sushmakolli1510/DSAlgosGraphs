

//Given sorted input,find the index of target element if not found return -1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7,8,10,10};
int target=10;
System.out.println(binarySearch(arr,target));
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
        //System.out.println(searchRange(arr,target));
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return -1;
    }
    public static int ceiling(int[] A, int B) {


        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Prevent potential overflow

            if (A[mid] == B) {
                return mid;
            } else if (A[mid] < B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If the target value is not found, return the index of the least element
        // greater than or equal to the target value.
        return low;
    }
//floor of number is nothing but greatest element which is smaller than target
    public static int floor(int[] A, int B) {


        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Prevent potential overflow

            if (A[mid] == B) {
                return mid;
            } else if (A[mid] < B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If the target value is not found, return the index of the least element
        // greater than or equal to the target value.
        return high;
    }


    }
