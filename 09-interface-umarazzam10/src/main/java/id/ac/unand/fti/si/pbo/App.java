package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {

        // Membuat objek
        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        MemberSilver member6 = new MemberSilver();
        MemberGold member7 = new MemberGold();
        MemberPlatinum member8 = new MemberPlatinum();

        //menghitung total bayar member
        int totalBayarReguler = member1.hitungTotalBayar(1000000);
        int totalBayarSilver = member2.hitungTotalBayar(3500000);
        int totalBayarGold = member3.hitungTotalBayar(7000000);
        int totalBayarPlatinum = member4.hitungTotalBayar(1500000);

        //menghitung ongkir member
        int ongkirPlatinum = member8.hitungOngkir(20.5);
        int ongkirGold = member7.hitungOngkir(15.3);
        int ongkirSilver = member6.hitungOngkir(10.0);

        //menghitung cicilan member
        int cicilanPlatinum = member8.hitungCicilanPerBulan(totalBayarPlatinum, 5);
        int cicilanGold = member8.hitungCicilanPerBulan(totalBayarGold, 7);

        //cek saldo member
        int Saldo = member8.cekSaldo();

        //menampilkan data struk member
        System.out.println("________________________________________");
        System.out.println("Total bayar member reguler: " + totalBayarReguler);
        System.out.println("________________________________________");
        System.out.println("Total bayar member silver: " + totalBayarSilver);
        System.out.println("Harga Ongkir: " + ongkirSilver);
        System.out.println("________________________________________");
        System.out.println("Total bayar member gold: " + totalBayarGold);
        System.out.println("Cicilan per bulan: " + cicilanGold);
        System.out.println("Harga Ongkir: " + ongkirGold);
        System.out.println("________________________________________");
        System.out.println("Total bayar member platinum: " + totalBayarPlatinum);
        System.out.println("Cicilan per bulan: " + cicilanPlatinum);
        System.out.println("Harga Ongkir: " + ongkirPlatinum);
        System.out.println("Saldo : " + Saldo);
        System.out.println("________________________________________");
    }
}
