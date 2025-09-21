## PostTest3-PBO

# Post-Test3-PBO Perlengkapan Alat Olahraga
| Nama                   | NIM         | Kelas               |
|------------------------|-------------|---------------------|
| Vebronia Vitania Lusi  | 2409116112  | Sistem Informasi C  |

# **DESKRIPSI PROGRAM**

Program ini merupakan sistem sederhana berbasis Java untuk mengelola data perlengkapan olahraga dengan konsep OOP (Object Oriented Programming).
Fitur utama:
1. Menerapkan Encapsulation (atribut private, akses via getter & setter).
2. Menerapkan Inheritance (class Properti sebagai superclass, diturunkan ke AlatOlahraga & ServiceProperti).
3. Menerapkan Overriding (method info() ditimpa di subclass).
Pengguna dapat:
1. Menambahkan data properti olahraga.
2. Menampilkan data.
3. Mengupdate data.
4. Menghapus data.
5. Mencari data


# **STRUKTUR PACKAGES**

<img width="231" height="220" alt="Screenshot 2025-09-21 180455" src="https://github.com/user-attachments/assets/c8abd566-4642-43b5-9e04-51d4608f6c0a" />

## **Fungsi Package Model (Properti.java)**
- Merupakan **superclass** (parent class).
- Menyimpan atribut utama:
  - nama → Nama properti
  - harga → Harga properti
  - stok → Jumlah unit
- Menerapkan **encapsulation** ( private + getter & setter).
- Menyediakan method info() untuk menampilkan informasi properti.

## **Fungsi Package Main (AlatOlahraga.java & Main.java)**
- **AlatOlahraga.java**
  - Subclass dari Properti.
  - Menambahkan atribut: jenisOlahraga.
  - Menggunakan **overriding** method info().

- **Main.java**
  - Kelas utama (entry point program).
  - Membuat objek dari AlatOlahraga dan ServiceProperti.
  - Menampilkan hasil pemanggilan method info().

---

## **Fungsi Package Service (ServiceProperti.java)**
- Subclass dari Properti.
- Menambahkan atribut: jenisService.
- Menggunakan **overriding** method info().

# **CONTOH OUTPUT PROGRAM**

Ketika dijalankan, program akan menghasilkan:

<img width="596" height="312" alt="Screenshot 2025-09-21 181012" src="https://github.com/user-attachments/assets/644516ce-b3f7-4edf-8a29-64bba6bb24d6" />

Objek bola dibuat dari class AlatOlahraga.
- Karena AlatOlahraga adalah subclass dari Properti, maka atribut nama, harga, dan stok diwarisi dari superclass.
- Ditambah atribut baru jenisOlahraga → yang diisi "Basket".
- Method info() di-override → menampilkan data bawaan dari Properti + atribut tambahan Jenis Olahraga.

Objek service dibuat dari class ServiceProperti.
- Sama seperti sebelumnya, atribut nama, harga, stok berasal dari superclass Properti.
- Subclass menambahkan atribut jenisService → diisi "Raket Tenis".
- Method info() di-override → menampilkan semua data bawaan Properti + informasi tambahan Jenis Service.

# **KESIMPULAN**
Program ini berhasil mengimplementasikan:
- **Encapsulation** → atribut diakses dengan getter & setter.
- **Inheritance** → class Properti diwarisi oleh AlatOlahraga & ServiceProperti.
- **Overriding** → method info() ditimpa sesuai kebutuhan subclass.



