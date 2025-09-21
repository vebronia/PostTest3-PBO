/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Properti;

public class ServiceProperti extends Properti {
    private String jenisService;

    public ServiceProperti(String nama, double harga, int stok, String jenisService) {
        super(nama, harga, stok);
        this.jenisService = jenisService;
    }

    public String getJenisService() {
        return jenisService;
    }

    public void setJenisService(String jenisService) {
        this.jenisService = jenisService;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Service: " + jenisService);
    }
}
