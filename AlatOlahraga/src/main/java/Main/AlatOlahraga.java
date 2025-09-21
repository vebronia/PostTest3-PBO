///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//

package Main;

import Model.Properti;

public class AlatOlahraga extends Properti {
    private String jenisOlahraga;

    // Constructor memanggil super()
    public AlatOlahraga(String nama, double harga, int stok, String jenisOlahraga) {
        super(nama, harga, stok); // panggil constructor Properti
        this.jenisOlahraga = jenisOlahraga;
    }

    // Getter & Setter
    public String getJenisOlahraga() {
        return jenisOlahraga;
    }

    public void setJenisOlahraga(String jenisOlahraga) {
        this.jenisOlahraga = jenisOlahraga;
    }

    // Overriding method info()
    @Override
    public void info() {
        super.info(); // panggil info() dari Properti
        System.out.println("Jenis Olahraga: " + jenisOlahraga);
    }
}
