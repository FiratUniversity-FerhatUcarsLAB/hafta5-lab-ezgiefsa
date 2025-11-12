/*
 * Ad Soyad: Ezgi Efsa Güleç
 * Ogrenci No: 250541023
 * Tarih: 12.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;
public class fizikFormülHesaplama {


    //sabit
    final static double gravity = 9.8; 

    // 1. hız
    public static double calculateVelocity(double s, double t) {
        return s / t;
    }

    // 2. ivme
    public static double calculateAcceleration(double deltaV, double t) {
        return deltaV / t;
    }

    // 3. kuvvet
    public static double calculateForce(double m, double a) {
        return m * a;
    }

    // 4. iş
    public static double calculateWork(double F, double d) {
        return F * d;
    }

    // 5. güç
    public static double calculatePower(double W, double t) {
        return W / t;
    }

    // 6. kinetik enerji
    public static double calculateKineticEnergy(double m, double v) {
        return 0.5 * m * v*v ;
    }

    // 7. potansiyel enerji
    public static double calculatePotentialEnergy(double m, double h) {
        return m * gravity * h;
    }

    // 8. momentum
    public static double calculateMomentum(double m, double v) {
        return m * v;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kütle (kg): ");
        double m = input.nextDouble();

        System.out.print("Hız (m/s): ");
        double v = input.nextDouble();

        System.out.print("Yol (m): ");
        double s = input.nextDouble();

        System.out.print("Süre (saniye): ");
        double t = input.nextDouble();

        System.out.print("Yükseklik (m): ");
        double h = input.nextDouble();

        System.out.print("Hız değişimi (Δv): ");
        double deltaV = input.nextDouble();

        System.out.print("Kuvvet (N): ");
        double F = input.nextDouble();

        
        
        // hesaplamalar
        double velocity = calculateVelocity(s, t);
        double acceleration = calculateAcceleration(deltaV, t);
        double force = calculateForce(m, acceleration);
        double work = calculateWork(F, s);
        double power = calculatePower(work, t);
        double kineticEnergy = calculateKineticEnergy(m, v);
        double potentialEnergy = calculatePotentialEnergy(m, h);
        double momentum = calculateMomentum(m, v);

        
        
        // sonuçlar
        System.out.printf("\n---- SONUÇLAR ----\n");
        System.out.printf("Hız: %.2f m/s\n", velocity);
        System.out.printf("İvme: %.2f m/s²\n", acceleration);
        System.out.printf("Kuvvet: %.2f N\n", force);
        System.out.printf("İş: %.2f J\n", work);
        System.out.printf("Güç: %.2f W\n", power);
        System.out.printf("Kinetik Enerji: %.2f J\n", kineticEnergy);
        System.out.printf("Potansiyel Enerji: %.2f J\n", potentialEnergy);
        System.out.printf("Momentum: %.2f kg·m/s\n", momentum);

        input.close();
    }
}

