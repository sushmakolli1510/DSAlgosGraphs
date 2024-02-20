//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] arr={45,1,35,10,26};
int l=arr.length;
int start=0;
int end=l-1;
quickSort(arr,start,end);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int[] arr,int start,int end) {
        int pivot, i, j, temp;
        if (start < end) {

            pivot = start;
            i = start;
            j = end;
            while (i < j) {
                while (arr[i] <= arr[pivot] && i < end) {
                    i++;
                }
                while (arr[j] > arr[pivot] && j >= 0) {
                    j--;
                }
                if (i < j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }
    }
}