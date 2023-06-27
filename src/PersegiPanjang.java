import java.util.Scanner;

public class PersegiPanjang {
        public static void main(String args[]){
           
    Scanner input = new Scanner(System.in);
      
    System.out.println(" Tugas Perulangan For Persegi Panjang ");
    System.out.println("======================================");
    System.out.println();
    
    int tinggi,lebar,i,j;
 
    System.out.print("Masukkan Panjang Persegi Panjang : ");
    tinggi = input.nextInt();
   
    System.out.print("Masukkan Lebar Persegi Panjang : ");
    lebar = input.nextInt();
    
    System.out.println();
   
    for(i=1; i<=tinggi; i++) {
      for(j=1; j<=lebar; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
