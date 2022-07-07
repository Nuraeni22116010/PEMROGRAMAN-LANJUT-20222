package nina;
// NURAENI
// 22116010

import java.util.Scanner;
import java.util.ArrayList;
public class datamahasiswa {

    public static void main(String[] args) {

        ArrayList<String> Nama = new ArrayList<>();
        ArrayList<String> Nim = new ArrayList<>();
        ArrayList<String> Alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int PILIHAN;

        do{

            System.out.println(" Program data Mahasiswa");
            System.out.println("=========================");
            System.out.println(" 1. Masukan Data ");
            System.out.println(" 2. Tampilkan Data ");
            System.out.println(" 3. Cari Data ");
            System.out.println(" 4. Hapus Data ");
            System.out.println(" 5. Keluar Data ");
            System.out.print(" Pilih Menu:");
            PILIHAN= input.nextInt();

            if(PILIHAN==1){
                System.out.print(" 1. Masukan Nama:");
                String nm = input.next();
                Nama.add(nm);

                System.out.print(" 2. Masukan Nim:");
                String nim = input.next();
                Nim.add(nim);

                System.out.print(" 3. Masukan Alamat:");
                String alt = input.next();
                Alamat.add(alt);
            } else if (PILIHAN==2) {

                System.out.println(" Data Mahasiswa");
                System.out.println("================");

                for (int i = 0; i < Nama.size(); i++) {
                    System.out.println(i+1+"."+Nama.get(i));
                }
                System.out.println(" Tekan 3 untuk Cari");
            } else if (PILIHAN==3) {
                System.out.print(" Masukan Data yang Ingin Di Cari:");
                int CARI = input.nextInt();
                if (CARI ==1) {
                    System.out.println("1. Nama :" + Nama.get(0));
                    System.out.println("2. Nim :" + Nim.get(0));
                    System.out.println("3. Alamat :" + Alamat.get(0));
                }

                if (CARI ==2) {
                    System.out.println("1. Nama :" + Nama.get(1));
                    System.out.println("2. Nim :" + Nim.get(1));
                    System.out.println("3. Alamat :" + Alamat.get(1));
                }
            }else if (PILIHAN==4) {

                    System.out.println(" Data Mahasiswa");
                    System.out.println("================");
                    for (int i = 0; i < Nama.size(); i++) {
                        System.out.println(i + 1 + "."+Nama.get(i));
                    }
                    System.out.println(" Masukan Nama Yang akan di hapus:");
                    String nm = input.next();
                    Nama.remove(nm);

                } else if (PILIHAN==5) {
                    System.out.println(" Program Selesai");
                }

        }while (PILIHAN !=5);

    }
}
