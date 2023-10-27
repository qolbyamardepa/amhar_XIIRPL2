package tugas_satu;
import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celsius = input.nextDouble();

        double fahr = (celsius * 9/5) + 32;
        double kelv = celsius + 273.15;

        System.out.println("Hasil konversi suhu:");
        System.out.println(celsius+"\u00B0C = "+fahr+"\u00B0F");
        System.out.println(celsius+"\u00B0C = "+kelv+"\u00B0K");

        input.close();
    }
}