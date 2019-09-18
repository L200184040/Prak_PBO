public class Dosen {
    String nama;
    int Nik;
    String lulusan;
    String tgLahir;
    void tampilkanNama(String namaDosen){
        nama = namaDosen;
    }
    void tampilkanTglahir(String tanggalLahir){
        tgLahir = tanggalLahir;
    }
    void tampilkanNik(int nikDosen){
        Nik = nikDosen;
    }
    void Print(){
        System.out.println(
        "Nama Dosen : "+nama+"\n"+
        "NIK : "+Nik+"\n"+
        "Pendidikan : "+lulusan+"\n"+
        "Tanggal Lahir : "+tgLahir);
    }
}