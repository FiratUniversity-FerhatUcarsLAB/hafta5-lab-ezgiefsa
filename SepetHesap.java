/*
 * Ad Soyad: Ezgi Efsa Güleç
 * Ogrenci No: 250541023
 * Tarih: 12.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class eTicaretSepetHesaplayıcı {

	final static double VAT_RATE = 0.18;// KDV
	final static double SHIPPİNG_FEE = 29.99;// KARGO

	public static double satisToplam(double fiyat, double adet) {
		return fiyat * adet;
	}

	public static double araToplam(double Ürün1, double Ürün2, double Ürün3) {
		return Ürün1 + Ürün2 + Ürün3;
	}

	public static double indirimTutari(double araToplam, double indirim) {
		return araToplam * (indirim / 100);
	}

	public static double indirimliToplam(double araToplam, double indirimTutari) {
		return araToplam - indirimTutari;
	}

	public static double kdvTutari(double indirimliToplam) {
		return indirimliToplam * VAT_RATE;
	}

	public static double genelToplam(double indirimliToplam, double kdv) {
		return indirimliToplam + VAT_RATE ;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("1.Ürün fiyatı: ");
		double fiyat1 = input.nextDouble();
		System.out.print("1.Ürün adedi: ");
		int adet1 = input.nextInt();

		System.out.print("2.Ürün fiyatı: ");
		double fiyat2 = input.nextDouble();
		System.out.print("2.Ürünün adedi: ");
		int adet2 = input.nextInt();

		System.out.print("3.Ürün fiyatı: ");
		double fiyat3 = input.nextDouble();
		System.out.print("3.Ürün adedi: ");
		int adet3 = input.nextInt();

		System.out.print("İndirim yüzdesi: ");
		double indirimYuzde = input.nextDouble();

		double u1 = satisToplam(fiyat1, adet1);
		double u2 = satisToplam(fiyat2, adet2);
		double u3 = satisToplam(fiyat3, adet3);

		double ara = araToplam(u1, u2, u3);
		double indirim = indirimTutari(ara, indirimYuzde);
		double indirimli = indirimliToplam(ara, indirim);
		double kdv = kdvTutari(indirimli);
		double genel = genelToplam(indirimli, kdv);

		System.out.println("\n====SONUÇLAR====");
		System.out.println("1. Ürün Satış Fiyatı: " + u1);
		System.out.println("2. Ürün Satış Fiyatı: " + u2);
		System.out.println("3. Ürün Satış Fiyatı: " + u3);
		System.out.println("Ara Toplam: " + ara);
		System.out.println("İndirim Tutarı: " + indirim);
		System.out.println("İndirimli Toplam: " + indirimli);
		System.out.println("KDV Tutarı: " + kdv);
		System.out.println("Kargo Ücreti: " + SHIPPİNG_FEE);
		System.out.println("GENEL TOPLAM: " + genel);

		input.close();
	}
}
