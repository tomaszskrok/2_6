import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ilosc = 0;
    int suma = 0;

    while (ilosc < 5) {
      System.out.print("Podaj liczbe: ");
      int liczba = input.nextInt();

      if (liczba % 3 == 0) { 
        suma = suma + liczba; 
        ilosc++;
      }
    }

    System.out.println("Suma podzielnych przez 3 liczb wynosi: " + suma);
  }
}