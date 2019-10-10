/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan23.nilaiterbesar;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : program ini berisi tentang Nilai terbesar dan terkecil
 */
public class IF110118030Latihan23NilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
		System.out.print("Masukkan Nama Petugas : ");
		Scanner scanner = new Scanner(System.in);
		String petugas = scanner.next();
		System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
		int banyakMahasiswa = scanner.nextInt();
		int[] nilaiMahasiswa = new int[banyakMahasiswa];
		System.out.print("Masukkan Nilai Mahasiswa Ke-" + 1 + " = " );
		nilaiMahasiswa[0] = scanner.nextInt();
		int nilaiTerbesar = nilaiMahasiswa[0], nilaiTerkecil = nilaiMahasiswa[0];
		for( int i = 1; i < banyakMahasiswa; i++){
			System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = " );
			nilaiMahasiswa[i] =  scanner.nextInt();
			if(nilaiMahasiswa[i] > nilaiTerbesar)
				nilaiTerbesar = nilaiMahasiswa[i];
			if(nilaiMahasiswa[i] < nilaiTerkecil)
				nilaiTerkecil = nilaiMahasiswa[i];
		}
                
                
                System.out.println("");
		System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
		System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
                System.out.println("Petugas : "+petugas);
    }
    
}
