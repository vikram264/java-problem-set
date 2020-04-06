package com.examples.io.arrays;

public class MergeSortTest
{

    public static void main (String[] args)
    {
     
    MergeSortTest mst = new MergeSortTest();
    int a [] = {5,2,1,17,9,4};
    int n = a.length;

mst.mergeSort(a,n);
    }
    
    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
     
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
     
        merge(a, l, r, mid, n - mid);
    }
    public  void merge(
        int[] a, int[] l, int[] r, int left, int right) {
        
          int i = 0, j = 0, k = 0;

              while (i < left && j < right) {
                  if (l[i] <= r[j]) {
                      a[k++] = l[i++];
                  } else {
                      a[k++] = r[j++];
                  }
              }
              while (i < left) {
                  a[k++] = l[i++];
              }
              while (j < right) {
                  a[k++] = r[j++];
              }
        printArray(a);



      }

      public  void printArray(int array[]) {
        for(int i = 0;i<array.length;i++) {
            System.out.println(array[i]);
        }
      }

}
