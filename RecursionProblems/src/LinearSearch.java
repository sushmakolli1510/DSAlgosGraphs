public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,59};
        System.out.println(linearSearch(arr,69,0));
        System.out.println(linearSearch1(arr,69,0));
    }
    public static int linearSearch(int arr[],int target,int index){
        if(index==arr.length)
            return -1;
        if(arr[index]==target){
            return index;
        }
        else
          return  linearSearch(arr,target,index+1);

    }
    public static boolean linearSearch1(int arr[],int target,int index){
        if(index==arr.length)
            return false;
        return (arr[index]==target)||linearSearch1(arr,target,index+1);
    }
}
