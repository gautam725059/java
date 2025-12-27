public class butterfly{
    public static void butterfly(int n)
    { // 1st hlaf
       for(int i=1;i<=n;i++)
       {//ststrt i
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         } //space 2*(n-1)
         for(int j=1; j<=2*(n-i);j++)
         {
            System.out.print(" ");
         }// start i
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println(" ");
       }
       //2nd half
       for(int i=n;i>=1;i--)
       {
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         } //space 2*(n-1)
         for(int j=1; j<=2*(n-i);j++)
         {
            System.out.print(" ");
         }// start i
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println(" ");
       }
    }
    public static void main(String[] args) {
        butterfly(10);
    }
    

}