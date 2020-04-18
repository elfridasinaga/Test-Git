import java.util.Scanner;

public class no5 {
  public static void main(String[] args) {
    int i, j, m, n;
    int matriks1[][] = new int[10][10];
    //int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan jumlah baris matriks: ");
    m = scan.nextInt();
   // System.out.print("Masukkan jumlah kolom matriks: ");
   // n = scan.nextInt();

    System.out.println("Masukkan elemen matriks pertama: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < m; j++) {
		  System.out.print("elemen ["+(i+1)+","+(j+1)+"]=");
		  matriks1[i][j] = scan.nextInt();
      }
    }

   // System.out.println("Masukkan elemen matriks kedua: ");
   // for (i = 0; i < m; i++) {
  //    for (j = 0; j < n; j++) {
   //     matriks2[i][j] = scan.nextInt();
  //    }
  //  }

    System.out.println("Matriks Ordo 3x3");
    for (i = 0; i < m; i++) {
      for (j = 0; j < m; j++) {
        //hasil[i][j] = matriks1[i][j] + matriks2[i][j];
        System.out.print(matriks1[i][j] + " ");
      }
      System.out.println(" ");
    }
	int dtr = ((matriks1[0][0]+matriks1[1][1]+matriks1[2][2]))+
	((matriks1[2][0]+matriks1[1][1]+matriks1[0][2]));
	System.out.println("Total : "+dtr);
  }
}