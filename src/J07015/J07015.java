package J07015;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07015\\SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) sc.readObject();
        int a[]=new int[100000];
        for(Integer i:ds){
            if(isPrime(i)){
                a[i]++;
            }
        }
        for(int i=0;i<10000;i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
    private static boolean isPrime(Integer n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
