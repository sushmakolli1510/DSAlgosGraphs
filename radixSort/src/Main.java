import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr={1,5,2,2,2,4,11,8,7};
        int l=arr.length;
        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        for(int place=1;max/place>0;place*=10){
            countingSort(arr,place);
        }


    }
    public static void countingSort(int[] arr,int place){
        int l=arr.length;

        int max=Arrays.stream(arr).max().getAsInt();

        int[] count=new int[10];
        int[] output=new int[l];
        for(int i:arr){
            count[(i/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=l-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }
       System.arraycopy(output,0,arr,0,l);
    }

}