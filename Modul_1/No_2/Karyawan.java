public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;
    void tampilkanNama(String namaKaryawan){
        nama = namaKaryawan;
    }
    void tampilkanJabatan(String jabatanKaryawan){
        jabatan = jabatanKaryawan;
    }
    void tampilkanAlamat(String alamatKaryawan){
        alamat = alamatKaryawan;
    }
    void tampilkanGaji(double gajiKaryawan){
        gaji = gajiKaryawan;
    }
    void Print(){
        System.out.println(
        "Nama Karyawan : "+nama+"\n"+
        "Jabatan : "+jabatan+"\n"+
        "Alamat : "+alamat+"\n"+
        "Gaji : "+gaji);
    }
}