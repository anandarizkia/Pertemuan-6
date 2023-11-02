/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_6;

/**
 *
 * @author LENOVO
 */
public class MainSetterGetter {
    public static void main(String[] args) {
        SetterGetter nasabah = new SetterGetter();
        nasabah.SetNomor_rekening("123456789");
        nasabah.SetPin("rahasia");
        
        System.out.println("\t Bank Ananda\n");
        
        System.out.println("Nomor Rekening : "+ nasabah.GetNomor_rekening());
        System.out.println("Pin            : "+ nasabah.GetPin());        
    }
}

