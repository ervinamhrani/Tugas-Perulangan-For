import java.util.Scanner;
  
class Segitiga1 {
  public static void main(String args[]){
           
    Scanner input = new Scanner(System.in);
      
    System.out.println(" Tugas Perulangan For Segitiga 1 ");
    System.out.println("=================================");
    System.out.println();
    
    int tinggi,i,j;
 
    System.out.print("Masukkan Tinggi Segitiga: ");
    tinggi = input.nextInt();
    
    System.out.println();
   
    for(i=1; i<=tinggi; i++) {
      for(j=1; j<=i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}