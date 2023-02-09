package labtest2;

public class DUPLICATION {
	public static void main(String[] args) 
    {
        String[] iarr = {"Suzuki","Triumph","Yamaha","Kawasaki","Honda","Ducati","Triumph","Honda"};
 
        for (int n=0;n<iarr.length-1;n++)
        {
            for (int k=n+1;k<iarr.length;k++)
            {
                if((iarr[n].equals(iarr[k]))&&(n!=k))
                {
                   System.out.println("Duplicate Value is : "+iarr[k]);
                }
            }
        }
    }    
}
