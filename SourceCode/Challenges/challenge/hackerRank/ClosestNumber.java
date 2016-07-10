package challenge.hackerRank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClosestNumber 
{


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(new File("C:/Users/zsaiyed/Desktop/ClosestPairInput.txt")));
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, 0, N-1);
        
        /*for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        */
        
        int[] diffArr = new int[N];
        int min=Integer.MAX_VALUE;
        boolean[] minIndex = new boolean[N];
        
        for(int i=1; i<N; i++){
            diffArr[i] = Math.abs(arr[i] - arr[i-1]);
            if(diffArr[i] < min){
                min = diffArr[i];   
            }
        }
        
        for(int i=1; i<N; i++){
            if( diffArr[i] == min ){
                minIndex[i] = true;
                minIndex[i-1] = true;
            }
        }
        
        for(int i=1; i<N; i++){
            if(minIndex[i-1] && minIndex[i]){
                 System.out.print(arr[i-1] + " " + arr[i] + " ");
            }
        }
        
        
    }
    
    public static void sortArray(int[] arr, int lo, int hi){
        if( hi<=lo ) return;
        int j = partition(arr, lo, hi);
        sortArray(arr, lo, j-1);
        sortArray(arr, j+1, hi);
    }
    
    public static int partition(int[] arr, int lo, int hi){
        int lt= lo, gt= hi+1;
        int p = arr[lo];
        while(true){
            while(less(arr[++lt], p))
                if(lt==hi) break;
                
            while(less(p, arr[--gt]))
                if(gt==lo) break;
                
            if(lt>=gt) break;
            
            exch(arr, lt, gt);
        }
        exch(arr, lo, gt);
        
        return gt;
    }
    
    public static boolean less(int i, int j){
        return i < j;
    }
    
    public static void exch(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
