package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertion_sort(int a[]) {
        int i, j, new_element;
        for (i = 0; i < a.length - 1; i++)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            j = i + 1;
            new_element = a[j];
            while (j > 0 && a[j - 1] > new_element) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = new_element;
        }

    }

    public static void main(String[] args)
    {
        int a[]={1,3,5,7,2};
        //int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:"+ Arrays.toString(a));
        //sorting call
        insertion_sort(a);
        System.out.println("\nAfter sorting:"+Arrays.toString(a));

    }
}