import java.util.Arrays;
import java.util.Scanner;

public class SortingSearchingAssignment
{
    static public void sortingPrices(int p[])
    {
        int i, j, temp;
        for(i = 0; i<p.length-1;i++)
        {
            for(j=0; j<p.length-1;j++)
            {
                if(p[j]>p[j+1])
                {
                    temp = p[j];
                    p[j]=p[j+1];
                    p[j+1]= temp;
                }
            }
        }
    }

    static public int searchingPrice(int p[],int PriceToSearch)
    {
        int start = 0;
        int end = p.length-1;

        while(start<=end)
        {
            int mid = (start + end)/2;

            if(p[mid] == PriceToSearch)
            {
                return mid;
            }
            else if(PriceToSearch<p[mid])
            {
                end = mid -1;
            }
            else if(PriceToSearch>p[mid])
            {
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int p[] = {14999, 8999, 12999, 19999, 9999, 17999, 7999};
        Scanner sp = new Scanner(System.in);

        System.out.println("\nOriginal Prices: "+ Arrays.toString(p));

        sortingPrices(p);
        System.out.println("\nSorted Prices: "+Arrays.toString(p));

        System.out.println("Enter a price to be searched: ");
        int PriceToSearch = sp.nextInt();
        int response = searchingPrice(p,PriceToSearch);
        System.out.println("Price found at index: "+response);

   }
}
