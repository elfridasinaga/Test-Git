import java.util.Scanner;

public class no3{
	public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
         System.out.print("Input Number =");
         x = scan.nextInt();
        
         for (int i=1;i<=x;i++)
   {
    //Membuat spasi
    for(int j=x-1;j>=i;j--)
    { 
     System.out.print(" ");
    }
    //Membuat bintang
    for(int k=1;k<=i;k++)
    { 
     System.out.print("*");
    }
    for (int l=1;l<=i-1;l++)
    {
     System.out.print("*");
    }
    System.out.println();
   }
         
         
            System.exit(0);
        }   
    }
}