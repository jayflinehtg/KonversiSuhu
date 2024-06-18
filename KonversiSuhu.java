import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

        System.out.println("Halo, pilih konversi suhu yang kamu mau");
        System.out.println("1.\u00B0C ke \u00B0F \n2.\u00B0F ke \u00B0C \n3.\u00B0C ke K \n4.\u00B0F ke K \n5. K ke \u00B0C \n6. K ke \u00B0F");
        System.out.print("Kamu memilih: ");
        int pilihanKonversi = inputanUser.nextInt();
        
        if (pilihanKonversi==1){
            System.out.println("Masukkan suhu dalam satuan \u00B0C");
            double celcius = inputanUser.nextFloat();
            double farenheit = (celcius * 1.8) + 32;
            System.out.println("Suhu tersebut setara dengan " + farenheit + " \u00B0F");
        } else if (pilihanKonversi==2) {
            System.out.println("Masukkan suhu dalam satuan \u00B0F");
            double farenheit = inputanUser.nextFloat();
            double celcius = (farenheit - 32) * 5/9;
            System.out.println("Suhu tersebut setara dengan " + celcius + " \u00B0C");
        } else if (pilihanKonversi==3) {
            System.out.println("Masukkan suhu dalam satuan \u00B0C");
            double celcius = inputanUser.nextFloat();
            double kelvin = (celcius + 273.15);
            System.out.println("Suhu tersebut setara dengan " + kelvin + "K");
        } else if (pilihanKonversi==4) {
            System.out.println("Masukkan suhu dalam satuan \u00B0F");
            double farenheit = inputanUser.nextFloat();
            double kelvin = (farenheit + 459.67) * 5/9;
            System.out.println("Suhu tersebut setara dengan " + kelvin + "K");
        } else if (pilihanKonversi==5) {
            System.out.println("Masukkan suhu dalam satuan K");
            double kelvin = inputanUser.nextFloat();
            double celcius = (kelvin - 273.15);
            System.out.println("Suhu tersebut setara dengan " + celcius + " \u00B0C");
        } else if (pilihanKonversi==6) {
            System.out.println("Masukkan suhu dalam satuan K");
            double kelvin = inputanUser.nextFloat();
            double farenheit = (kelvin - 273.15) * 1.8 + 32;
            System.out.println("Suhu tersebut setara dengan " + farenheit + " \u00B0F");
        } else {
            System.out.println("Kamu salah memasukkan kode konversi.");
        }
    }
}
