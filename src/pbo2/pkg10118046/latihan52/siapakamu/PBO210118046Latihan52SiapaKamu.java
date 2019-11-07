/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan52.siapakamu;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menampilkan profil
 */
public class PBO210118046Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        mahasiswa.setNama("Nindi");
        mahasiswa.setKelas("PBO2");
        mahasiswa.setNim("10110268");
        mahasiswa.setUmur(17);
        
        System.out.println("NIP DOSEN: " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("\nNIM MAHASISWA: " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        
    }

}
