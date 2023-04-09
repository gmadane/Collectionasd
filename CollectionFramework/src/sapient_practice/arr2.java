package sapient_practice;

import java.util.Arrays;
import java.util.Iterator;

public class arr2 {

	public static void main(String[] args) {

		int ar[]= {10,11,81,69,1,32,65,41};
        int val=Arrays.stream(ar).max().getAsInt();
        System.out.println(val);
    int temp;
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=i+1;j<ar.length;j++)
        	{
        		if(ar[i]>ar[j])
        		{
        			temp=ar[i];
        			ar[i]=ar[j];
        			ar[j]=temp;
        		}
        	}
        }
        System.out.println(ar[ar.length-2]);
}

}
