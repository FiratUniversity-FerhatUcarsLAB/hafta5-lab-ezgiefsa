/*
 * Ad Soyad: Ezgi Efsa Güleç
 * Ogrenci No: 250541023
 * Tarih: 12.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */


import java.util.Scanner;

public class geometrikŞekilHesaplayıcı {
	// kare
	public static double kareninAlani(double kenar) {
		return kenar * kenar;
	}

	public static double kareninCevresi(double kenar) {
		return 4 * kenar;
	}

	// dikdörtgen
	public static double dikdörtgeninAlani(double uzunk, double kısak) {
		return uzunk * kısak;
	}

	public static double dikdörtgeninCevresi(double yukseklik, double genislik) {
		return 2 * (yukseklik + genislik);
	}

	// daire
	public static double daireninAlani(double yaricap) {
		return 2 * Math.PI * yaricap;
	}

	public static double daireninCevresi(double yaricap) {
		return Math.PI * yaricap * yaricap;
	}

	// üçgen
	public static double ücgeninAlani(double yükseklik, double taban) {
		return yükseklik * taban / 2;
	}

	public static double ücgeninCevresi(double kenara, double kenarb, double kenarc) {
		return kenara + kenarb + kenarc;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// kare
		System.out.print("Karenin kenarı:");
		double kareKenar = input.nextDouble();
		System.out.printf("Karenin Alanı: %.2f\n", kareninAlani(kareKenar));
		System.out.printf("Karenin çevresi: %.2f\n\n", kareninCevresi(kareKenar));

		// dikdörtgen
		System.out.print("Dikdörtgenin genislik:");
		double genislik = input.nextDouble();
		System.out.print("Dikdörtgenin yükseklik:");
		double yukseklik = input.nextDouble();
		System.out.printf("Dikdörtgenin Alanı: %.2f\n", dikdörtgeninAlani(yukseklik, genislik));
		System.out.printf("Dikdörtgenin Çevresi: %.2f\n\n", dikdörtgeninCevresi(yukseklik, genislik));

		// üçgen
		System.out.print("Üçgenin tabanı: ");
		double taban = input.nextDouble();
		System.out.print("Üçgenin yüksekliği: ");
		double yukseklik = input.nextDouble();
		System.out.print("Kenar a: ");
		double a = input.nextDouble();
		System.out.print("Kenar b: ");
		double b = input.nextDouble();
		System.out.print("Kenar c: ");
		double c = input.nextDouble();
		System.out.printf("Üçgenin Alanı: %.2f\n ", ücgeninAlani(taban, yukseklik));
		System.out.printf("Üçgenin Çevresi: %.2f\n\n ", ücgeninCevresi(a, b, c));

		// daire
		System.out.print("Dairenin yarıçapı: ");
		double yaricap = input.nextDouble();
		System.out.printf("Dairenin alanı: %.2f\n", daireninAlani(yaricap));
		System.out.printf("Dairenin çevresi: %.2f\n\n", daireninCevresi(yaricap));

		input.close();

	}
}
