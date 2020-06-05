package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Saldo Anda : ");
        int saldo = input.nextInt();

        short batasTransaksi = 5;

        while ( batasTransaksi > 0 ) {
            int saldoSekarang = saldo;

            System.out.print("MENU\n"
                    + "1. Penarikan Tunai\n"
                    + "2. Menabung\n"
                    + "Pilih [1/2] : ");

            String menu = input.next();

            if (menu.equalsIgnoreCase("1")) {

                System.out.print("Anda Akan melakukan Penarikan Tunai\n" 
                + "Saldo anda adalah RP." + saldoSekarang + "\nMasukkan Jumlah Penarikan : ");

                int penarikan = input.nextInt();

                if (saldo - penarikan < 5000) {

                    System.out.println("Sisa saldo harus minimal Rp.5000");
                    
                } else if( penarikan < 2000) {

                    System.out.println("Penarikan harus minimal Rp.2000");

                } else {
                    saldo = saldo - penarikan;
                    System.out.println("Saldo awal anda adalah Rp." + saldoSekarang + ". Anda melakukan penarikan sebesar Rp." + penarikan);
                }

                System.out.println("Sisa saldo anda adalah Rp." + saldo + ". Sisa Transaksi anda masih " + (batasTransaksi -1 ) + "kali.");

                
            } else if(menu.equalsIgnoreCase("2")) {
                
                System.out.print("Anda Akan melakukan Penabungan\n" + "Saldo anda adalah Rp." + saldoSekarang + "\nMasukkan Jumlah tabungan : ");

                int penambahan = input.nextInt();

                if (penambahan < 2000) {

                    System.out.println("Penabungan harus minimal Rp.2000");
                    
                }else {
                    saldo = saldo + penambahan;
                    System.out.println("Saldo awal anda adalah Rp." + saldoSekarang + ". Anda melakukan penabungan sebesar Rp." + penambahan);
                }

                System.out.println("Jumlah saldo anda adalah Rp." + saldo + ". Sisa Transaksi anda masih " + (batasTransaksi - 1) + " kali.");

            } else {
                System.out.println("Maaf, Menu transaksi yang anda pilih tidak ada!.");
            }


            // step

            System.out.print("Apakah anda ingin melakukan transaksi lagi? [y/n] : ");
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("y")) {

                System.out.println("Sisa transaksi anda masih " + (batasTransaksi - 1));
                batasTransaksi--;
                
            }else if(pilihan.equalsIgnoreCase("n")) {

                System.out.println("Termi kasih sudah melakukan transaksi");
                batasTransaksi = 0;

            }else {
                System.out.println("Pilihan tidak ada");
                batasTransaksi = 0;
            }

            

        }

    }
}