public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    void tampilkanNama(String namaMhs){
        nama = namaMhs;
    }
    void tampilkanNim(String nimMhs){
        nim = nimMhs;
    }
    void tampilkanAlamat(String alamatMhs){
        alamat = alamatMhs;
    }
    void tampilkanSemester(int smtMhs){
        semester = smtMhs;
    }
    void Print(){
        System.out.println(
        "Nama Mahasiswa : "+nama+"\n"+
        "NIM : "+nim+"\n"+
        "Alamat : "+alamat+"\n"+
        "Semester : "+semester);
    }
}