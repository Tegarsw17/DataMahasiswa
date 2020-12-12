/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class DataMahasiswa {
    
    private final ArrayList<String> nim = new ArrayList();
    private final ArrayList<String> name = new ArrayList();
    private final ArrayList<String> lahir = new ArrayList();
    private final ArrayList<Integer> gender = new ArrayList();
    
    
    Scanner input = new Scanner(System.in);
    
    void adddata(){
        System.out.println("*******************");
        System.out.println("Tambah Data");
        System.out.println("*******************");
        System.out.print("NIM : ");
        String Nim = input.next();
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Tanggal Lahir (DD/MM/YYYY) : ");
        String tgllahir = input.next();
        System.out.println("0. Laki-laki");
        System.out.println("1. Perempuan");
        System.out.print("Pilih Jenis Kelamin : ");
        int kelamin = input.nextInt();
        name.add(nama);
        nim.add(Nim);
        lahir.add(tgllahir);
        gender.add(kelamin);
    }
    
    void removedata(){
        System.out.println("*******************");
        System.out.println("Hapus Data");
        System.out.println("*******************");
        System.out.print("NIM : ");
        String nomer = input.next();
        int index = Collections.binarySearch(nim, nomer);
        name.remove(index);
        nim.remove(index);
        lahir.remove(index);
        gender.remove(index);
    }
    
    void searchdata(){
        System.out.println("*******************");
        System.out.println("Mencari Data");
        System.out.println("*******************");
        System.out.println("1. Mencari data berdasarkan jenis kelamin");
        System.out.println("2. Mencari data berdasarkan nim");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("*************************************");
            System.out.println("Mencari  Berdasarkan  Jenis Kelamin");
            System.out.println("*************************************");
            System.out.println("0. Laki-laki");
            System.out.println("1. Perempuan");
            System.out.print("Pilih jenis kelamin : ");
            int gend = input.nextInt();

            for (int i = 0; i < name.size(); i++) {
                if (gender.get(i) == 0) {
                    System.out.println("Nama : " + name.get(i));
                    System.out.println("NIM : " + nim.get(i));
                    System.out.println("Tanggal Lahir : " + lahir.get(i));
                    String gen = gender.get(i) == 0 ? "Laki-laki" : "Perempuan";
                    System.out.println("Jenis Kelamin : " + gen);
                    System.out.println("\n");
                } else if (gender.get(i) == 1) {
                    System.out.println("Nama : " + name.get(i));
                    System.out.println("NIM : " + nim.get(i));
                    System.out.println("Tanggal Lahir : " + lahir.get(i));
                    String gen = gender.get(i) == 0 ? "Laki-laki" : "Perempuan";
                    System.out.println("Jenis Kelamin : " + gen);
                    System.out.println("\n");
                }
            }
        } else if (pilihan == 2) {
            System.out.println("******************************");
            System.out.println("Mencari Berdasarkan NIM");
            System.out.println("******************************");
            System.out.print("Masukkan NIM : ");
            String nomer = input.next();

            int index = Collections.binarySearch(nim, nomer);
            String cariNama = name.get(index);
            String cariNIM = nim.get(index);
            String caritanggal = lahir.get(index);
            int cariGender = gender.get(index);

            System.out.println("NIM : " + cariNIM);
            System.out.println("Nama : " + cariNama);
            System.out.println("Tanggal Lahir : " + caritanggal);
            System.out.println("Jenis Kelamin : " + cariGender);
        }
    }
    
    void showdata(){
        System.out.println("*******************");
        System.out.println("Tampilan Data");
        System.out.println("*******************");
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Nama : " + name.get(i));
            System.out.println("NIM : " + nim.get(i));
            System.out.println("Tanggal Lahir : " + lahir.get(i));
            String gen = gender.get(i) == 0 ? "Laki-laki" : "Perempuan";
            System.out.println("Jenis Kelamin : " + gen);
            System.out.println("****************");
        }
        System.out.println("******************");
        System.out.println("Menampilkan Total Mahasiswa : " + name.size());
        System.out.println("\n");
        
    }
}
