package pegawai;
import java.util.Scanner;

public class Pegawai {
    String nama;
    String alamat;
    int departemen;
    int pengalaman;
    int skill;
    int totalgaji;

    public Pegawai(String nama, String alamat,int departemen, int pengalaman, int skill) {
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.departemen = departemen;
        this.totalgaji = totalgaji();
    }

    public int totalgaji() {
        int totalgaji = 0;
        switch (departemen) {
            case 1:
                totalgaji = 8000000;
            break;
            case 2:
                totalgaji = 5000000;
            break;
            case 3:
                totalgaji = 4000000;
            break;
            default:
                System.out.println("DEPARTEMEN TIDAK DITEMUKAN");
            break;
        }

        switch (pengalaman) {
            case 1:
                totalgaji += 500000;
                break;
            case 2:
                totalgaji += 1000000;
                break;
            case 3:
                totalgaji += 2000000;
                break;
            default:
                System.out.println("PENGALAMAN TIDAK DITEMUKAN");
            break;
        }

        switch (skill) {
            case 1:
                totalgaji += 1000000;
                break;
            case 2:
                totalgaji += 2000000;
                break;
            case 3:
                totalgaji += 2500000;
                break;
            default:
                System.out.println("SKILL TIDAK DITEMUKAN");
                break;
        }

        return totalgaji;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama   = ");
        String nama = sc.nextLine();
        System.out.print("Alamat = ");
        String alamat = sc.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println("Departemen : ");
        System.out.println("1.IT");
        System.out.println("2.HRD");
        System.out.println("3.FINANCE");
        System.out.println("Masukkan pilihan anda [1.2.3] = ");
        int departemen = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("Pengalaman : ");
        System.out.println("1.Pemula");
        System.out.println("2.Menengah");
        System.out.println("3.Expert");
        System.out.println("Masukkan pilihan anda [1.2.3] = ");
        int pengalaman = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("Skill : ");
        System.out.println("1.Web");
        System.out.println("2.Mobile");
        System.out.println("3.Dekstop");
        System.out.println("Masukkan pilihan anda [1.2.3] = ");
        int skill = sc.nextInt();
        System.out.println("----------------------------------------------");

        Pegawai gaji = new Pegawai(nama, alamat, pengalaman, skill, departemen);
        System.out.println("Selamat gaji pegawai dengan nama ("+nama+") = "+gaji.totalgaji());
    }
}