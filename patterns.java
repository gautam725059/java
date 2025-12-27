public class patterns{
    public static void hollo_rectangele(int totrow, int totcal)
    {
        // outer loop
        for(int i=1;i<=totrow;i++)
        {
            // inner loop
            for(int j=1; j<=totcal;j++)
            {
                if(i==1 || i==totrow || j==1 ||j==totcal)
                {
                    System.out.print("*");
                }else
                System.out.print(" ");
            }
           System.out.println ();
        }

    }
    public static void main (String[]args)
    {
        hollo_rectangele(5,5);
    }
}