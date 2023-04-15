# TP2DPBO2023
## janji
> Saya Anandita Kusumah M dengan nim 2101114 mengerjakan Tugas Praktikum 2 DPBO dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahan-Nya   maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
## Desain
  <img width="550" src="https://user-images.githubusercontent.com/100897554/232205804-30586d68-0848-42c4-831e-fa5f1fea830e.png">
  
## Penjelasan 
- Pada Tugas praktikum 2 ini saya membuat program penyimpan data transaksi/data pengeluaran.
- Dimana terdiri dari 2 tabel yaitu data akun dan data pengeluaran/transaksi
- Dalam tabel data akun terdapat id, email, password, nama lengkap, nohp, foto profil.
- Dalam tabel data transaksi terdapat no transaksi,id akun, tanggal transaksi, produk, harga transaksi, foto produk.

## ALUR
- Masuk ke page Log In
  - Belum memiliki akun
     - Mengklik button 'Register'.
     - Masuk ke page register.
     - Mengisi field sesuai form yang tersedia .
     - Klik button 'sign up'
     - Pindah ke page login, masuk ke langkah sudah memiliki akun.
  - Sudah Memiliki akun
     - Mengisi field (emali dan password).
     - Klik button 'log in'.
     - Validasi akun.
     - Masuk ke page home LIST Data Transaksi.
-  Masuk ke page home LIST Data Transaksi, user dapat melakukan :
  - User dapat melakukan logout dengan mengklik button 'logout'.
  - User dapat Pindah ke page Data diri dengan mengklik button 'Data Diri'.
  - Crud Data Transaksi:
      - Create
         - klik button 'Add Transaksi'
         - Mengisi data Transaksi.
         - Klik button 'Add'.
           - jika data sesuai maka akan 
             - Menjalankan query insert data into database.
             dan 
             - menampilkan text message "Data berhasil ditambahkan"
           - jika data tidak sesuai maka akan 
             - menampilkan text message "Data tidak lengkap"
         - selesai
      - Update
         - Pilih data yang ingin di-update, lalu klik button 'edit'.
         - lalu akan pindah ke page update transaksi
         - Ubah data.
         - Klik button 'update'.
          - jika data sesuai maka akan 
             - Menjalankan query update transaksi.
             dan 
             - menampilkan text message "Data berhasil di update"
           - jika data tidak sesuai maka akan 
             - menampilkan text message "Data tidak lengkap"
         - selesai

       - Delete
          - Pilih data yang ingin dihapus, lalu klik button 'delete'.
          - menampilkan notifikasi "Hapus data?"
              - jika yes
                 -  Menjalankan query delete transaksi
                 dan
                 - menampilkan text message "Data Transaksi Telah Dihapus"
              - jika no
                 - kembali ke page home data transaksi
   - jika pada home user mengklik 'Data Diri' maka user dapat melakukan :
       - Update Data Diri
         - Klik button 'update'.
          - jika data sesuai maka akan 
             - Menjalankan query update transaksi.
             dan 
             - menampilkan text message "Data berhasil di update"
           - jika data tidak sesuai maka akan 
             - menampilkan text message "Data tidak lengkap"
         - selesai
       

## DOKUMENTASI 
- ## Register

<img width="550" src="https://user-images.githubusercontent.com/100897554/232195473-2a1d9052-935a-42d5-81cf-1f730bdb0c8d.gif">

- ## Login

<img width="550" src="https://user-images.githubusercontent.com/100897554/232195479-5381ab32-0363-42c5-88dd-077b3b40a868.gif">

- Home akun 1

<img width="550" src="https://user-images.githubusercontent.com/100897554/232195494-83f0df67-4346-4ef3-9d3d-42db38268916.gif">

- Home akun 2
<img width="550" src="https://user-images.githubusercontent.com/100897554/232196125-9ca322e7-690f-4164-8a58-904872580899.gif">
