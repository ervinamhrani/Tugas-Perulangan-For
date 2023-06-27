import java.util.Scanner;
   
class Segitiga2 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println(" Tugas Perulangan For Segitiga 2 ");
    System.out.println("=================================");
    System.out.println();
     
    int tinggi,i,j;
  
    System.out.print("Masukkan Tinggi Segitiga: ");
    tinggi = input.nextInt();
     
    System.out.println();
    
    for(i = 0; i < tinggi; i++) {
      for(j = tinggi; j > i; j--) {
        System.out.print(" *");
      }
      System.out.println();
    }  
  }
}