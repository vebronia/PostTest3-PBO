/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author tania
 */

import Service.ServiceProperti; // dari package Service
// AlatOlahraga tidak perlu import karena sama-sama di package Main

public class Main {
    public static void main(String[] args) {
        // Buat objek AlatOlahraga
        AlatOlahraga bola = new AlatOlahraga("Bola Basket", 150000, 10, "Basket");
        bola.info();

        System.out.println("----------------");

        // Buat objek ServiceProperti
        ServiceProperti service = new ServiceProperti("Service Raket", 50000, 5, "Raket Tenis");
        service.info();
    }
}
