package org.example;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.String;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        String name;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nama anda: ");
        name = userInput.nextLine();

        String gender;

        System.out.print("Masukan Jenis Kelamin (L/P): ");
        gender = userInput.nextLine();

        if ( gender.equals( "L" ) ){
            gender = "Laki - Laki";

        } else if ( gender.equals( "P" )) {
            gender = "perempuan";

        }

        System.out.print("Masukan Tanggal lahir (yyyy-mm-dd): ");
        int tahun = userInput.nextInt();
        int bulan = userInput.nextInt();
        int hari = userInput.nextInt();
        LocalDate lahir = LocalDate.of(tahun, bulan, hari);

        LocalDate tanggalSkrng = LocalDate.now();
        Period periode = Period.between(lahir, tanggalSkrng);

        int Years = periode.getYears();
        int Months = periode.getMonths();

        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + Years + " tahun " + Months + " bulan ");

    }
}