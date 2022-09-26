package test;

import java.util.Scanner;

public class GhepChuCai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = {"","A", "B", "C", "D", "E", "F", "G", "H"};
        String input = in.nextLine();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(input)) {
                n = i;
                break;
            }
        }
        int[] array = new int[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = i;
        }
        GhepChuCai gcc = new GhepChuCai();
        gcc.sinhHoanVi(arr, array, n);

    }

    public void result(String[] arr, int[] array, int n) {
        boolean check = true;
        for (int j = 1; j <= n; j++) {

            if((arr[array[j]].equals("A") || arr[array[j]].equals("E")) && (j>1 && j<n)){
                if((arr[array[j-1]].equals("A")
                        ||arr[array[j-1]].equals("E")) ||
                        (arr[array[j+1]].equals("A")||arr[array[j+1]].equals("E"))){
                    check = true;
                } else {
                    check = false;
                }
            }
        }
        if(check==true){
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[array[j]]);
            }
            System.out.println();
        }

    }

    public void sinhHoanVi(String[] arr, int[] array, int n) {
        int i;
        do {
            result(arr, array, n);
            i = n - 1;
            while (i > 0 && array[i] > array[i+1]) --i;
            if (i > 0) {
                int k = n;
                while (array[k] < array[i]) --k;
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;

                k = n;
                for (int j = i + 1; j < k ; j++, k--) {
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        } while (i != 0);
    }
}
