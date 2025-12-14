package Sorting;

import java.util.Arrays;

public class SelectionSort
{
    static void selection_sort(int a[])
    {
        int i,j,min,min_position;
        for(i=0;i<a.length-1;i++)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            //build ref
            min=a[i];
            min_position=i;
            for(j=i+1;j<a.length;j++)//Loop will search for minimum.
            {
                if(a[j]<min)
                {
                    min=a[j];
                    min_position=j;
                }
            }
            //swap
            a[min_position]=a[i];
            a[i]=min;
        }

    }
    public static void main(String[] args)
    {
         int a[]={44,22,99,88,33,66,55,11,77};
        //int a[]={11,22,33,44,55,66,77,88,99};
        System.out.println("\nStart before sorting:"+ Arrays.toString(a));
        //sorting call
        selection_sort(a);
        System.out.println("\nAfter sorting:"+Arrays.toString(a));

    }

}
