import java.util.Scanner;

public class DSA06023 {
    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n;i++){
            a[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0;i<n-1;i++){

            for (int j =i+1;j<n;j++){
                if(a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for (int k = 0;k<n;k++){

                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
