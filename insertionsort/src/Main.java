//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a={3,1,80,40,30,90};
        int l=a.length;

        for(int i=1;i<l;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        for(int i=0;i<l;i++) {
            System.out.println(a[i]);
        }

    }
}