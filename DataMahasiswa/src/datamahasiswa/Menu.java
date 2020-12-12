/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class Menu {
    // atribut
    String select;
    
    
    //interface for selecting menu
    void menu(){
        
        DataMahasiswa a = new DataMahasiswa();
        
        OUTER:
        while (true) {
            System.out.println("*******************");
            System.out.println("Data Mahasiswa");
            System.out.println("*******************");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampil Data");
            System.out.println("Pilih no menu: ");
            Scanner sc = new Scanner(System.in);
            select = sc.nextLine();
            if (null != select) {
                //choose the menu
                switch (select) {
                    case "1":
                        a.adddata();
                        break;
                    case "2":
                        a.removedata();
                        break;
                    case "3":
                        a.searchdata();
                        break;
                    case "4":
                        a.showdata();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
