
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//counting sort
public class Main {


    public static void main(String[] args) {

        int[] arr={1,5,2,2,2,4,11,8,7};
        int l=arr.length;
        countingSort(arr);


    }
    public static void countingSort(int[] arr){
        int l=arr.length;
        int min=Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();
        int range=max-min+1;
        int[] count=new int[range];
        int[] output=new int[l];
        for(int i:arr){
            count[i-min]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=l-1;i>=0;i--){
            output[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }
        for(int i:output) {
            System.out.print(i + " ");
        }
    }
}