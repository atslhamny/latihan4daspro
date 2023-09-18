/**
 * luasdankeliling
 */
import java.util.Scanner;
public class luasdankeliling {

    public static void main(String[] args) {
        Lingkaran();
        Segitigasamakaki();
        Segitigasamasisi();
        Segitigasikusiku();
        PersegiPanjang();
       
    }
    static void Lingkaran(){
        Scanner input = new Scanner(System.in);

        int jarijari;
        double phi;
        int keliling;
        int luas;

        System.out.println("Masukkan Jari Jari");
        jarijari = input.nextInt();
        System.out.println("Masukkan nilai Phi");
        phi = input.nextDouble();

        luas = jarijari*jarijari*(int)phi;
        keliling = 2*(int)phi*jarijari;

        System.out.println("HASIL LUAS " + luas);
        System.out.println("HASIL KELILING " + keliling);

    }

    static void Segitigasamakaki(){
        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        int sisiKananKiri;
        int luas;
        int keliling;

        System.out.println("Masukkan alas");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi");
        tinggi = input.nextInt();

        luas = alas*tinggi/2;
        System.out.println("HASIL LUAS " + luas);

        System.out.println("Masukkan Sisi Kanan");
        sisiKananKiri = input.nextInt();
        System.out.println("Masukkan Sisi Kiri");
        sisiKananKiri = input.nextInt();

        keliling = sisiKananKiri + sisiKananKiri + alas;
        System.out.println("HASIL DARI KELILING" + keliling);
    }

    static void Segitigasamasisi(){
        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        int sisi;
        int luas;
        int keliling;

        System.out.println("Masukkan alas");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi");
        tinggi = input.nextInt();

        luas = alas*tinggi/2;
        System.out.println("HASIL LUAS " + luas);

        System.out.println("Masukkan Sisi Miring");
        sisi = input.nextInt();

        keliling = 3*sisi;
        System.out.println("HASIL DARI KELILING" + keliling);
    }

    static void Segitigasikusiku(){
        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        int sisiKananKiri;
        int luas;
        int keliling;

        System.out.println("Masukkan alas");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi");
        tinggi = input.nextInt();

        luas = alas*tinggi/2;
        System.out.println("HASIL LUAS " + luas);

        System.out.println("Masukkan Sisi Kanan");
        sisiKananKiri = input.nextInt();
        System.out.println("Masukkan Sisi Kiri");
        sisiKananKiri = input.nextInt();


        keliling = alas + sisiKananKiri + sisiKananKiri;
        System.out.println("HASIL DARI KELILING" + keliling);
    }

    static void PersegiPanjang(){
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;
        int keliling;

        System.out.println("Masukkan Panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar");
        lebar = input.nextInt();

        luas = panjang*lebar;
        keliling = 2*(panjang + lebar);
        System.out.println("HASIL LUAS " + luas);
        System.out.println("HASIL KELILING " + keliling);
    }
}