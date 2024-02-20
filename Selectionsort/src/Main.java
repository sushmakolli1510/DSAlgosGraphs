//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] A={3,1,90,20,45,25,34};
int n=A.length;
for(int i=0;i<n-1;i++){
    int minindex=i;
    for(int j=i+1;j<n;j++){
        if(A[j]<A[minindex]){
            minindex=j;
        }
    }
    int t=A[i];
    A[i]=A[minindex];
    A[minindex]=t;
        }
for(int i=0;i<n;i++){
    System.out.println(A[i]);
}
    }
}