import java.util.Scanner;

public class Ekspedisi {
    /**
     * @param args
     */
    public static void main (String[] args) {

        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        String username = "admin"; // Set the username
        String password = "password"; // Set the password
        boolean loggedIn = false;

        //Deklarasi Variabel
        int pilihanMenu;

        //Variabel Menu Data Pengirim Barang (Case 1 dan Case 3)
        String namaPengirim, alamatPengirim, kotaPengirim, provinsiPengirim, noTelpPengirim;
        int kodePosPengirim;

         //Variabel Menu Data Penerima Barang (Case 2 dan Case 3)
         String namaPenerima, alamatPenerima, kotaPenerima, provinsiPenerima, noTelpPenerima;
         int kodePosPenerima;

        //Variabel Menu Jenis Pengiriman Barang (Case 3)
        String jenisPengiriman[] = {"Via Darat", "Via Laut", "Via Udara"}; 
        String jenis2 = ""; 
        int beratBarang;


        System.out.println("Selamat Datang  di Ekspedisi Pengiriman Barang (PUCAT)\n");
        
        // Add a login loop
        while (!loggedIn) {
            System.out.print("Username: ");
            String enteredUsername = input.nextLine();
            System.out.print("Password: ");
            String enteredPassword = input.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                System.out.println("Login berhasil!");
                loggedIn = true;
            } else {
                System.out.println("Login gagal. Silahkan coba lagi.");
            }
        }

        do {
            //Pilihan menu yang akan dipilih
            System.out.println("--------------------------------------------------");
            System.out.println("(1) Data Pengirim Barang");
            System.out.println("(2) Data Penerima Barang");
            System.out.println("(3) Menu Jenis Pengiriman Barang");
            System.out.println("(4) Exit");

        
            //Masukkan pilihan menu yang tersedia
            System.out.println("\nSilahkan pilih salah satu dari menu di atas");
            pilihanMenu = Integer.parseInt(input.nextLine());

        
            switch (pilihanMenu) {
                case 1:
                    //Menu Pengiriman Barang
                    System.out.println("\nSELAMAT DATANG DI DATA PENGIRIM BARANG");
                    System.out.println("--------------------------------------------------------------\n\n");

                    System.out.print("Masukkan Nama Pengirim    : ");
                    namaPengirim = input.nextLine();
                    System.out.print("Masukkan Alamat Pengirim  : ");
                    alamatPengirim = input.nextLine();
                    System.out.print("Masukkan Kode Pos         : ");
                    kodePosPengirim = Integer.parseInt(input.nextLine());
                    System.out.print("Masukkan Kota             : ");
                    kotaPengirim = input.nextLine();
                    System.out.print("Masukkan Provinsi         : ");
                    provinsiPengirim = input.nextLine();
                    System.out.print("Masukkan Nomor Telepon    : ");
                    noTelpPengirim = input.nextLine();

                    System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                    //List Data Pengirim
                    System.out.println("#Hasil Data Pengirim");
                    System.out.println("Nama Pengirim   : " + namaPengirim);
                    System.out.println("Alamat Pengirim : " + alamatPengirim);
                    System.out.println("Kode Pos        : " + kodePosPengirim);
                    System.out.println("Kota            : " + kotaPengirim);
                    System.out.println("Provinsi        : " + provinsiPengirim);
                    System.out.println("Nomor Telepon   : " + noTelpPengirim);
                    break;
                case 2:
                    //Menu DataPengiriman Barang
                    System.out.println("\nSELAMAT DATANG DI DATA PENERIMA BARANG");
                    System.out.println("--------------------------------------------------------------\n\n");

                    System.out.print("Masukkan Nama Penerima    : ");
                    namaPenerima = input.nextLine();
                    System.out.print("Masukkan Alamat Penerima  : ");
                    alamatPenerima = input.nextLine();
                    System.out.print("Masukkan Kode Pos         : ");
                    kodePosPenerima = Integer.parseInt(input.nextLine());
                    System.out.print("Masukkan Kota/Kabupaten   : ");
                    kotaPenerima = input.nextLine();
                    System.out.print("Masukkan Provinsi         : ");
                    provinsiPenerima = input.nextLine();
                    System.out.print("Masukkan Nomor Telepon    : ");
                    noTelpPenerima = input.nextLine();

                    System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                    //List Data Pengirim
                    System.out.println("#Hasil Data Penerima");
                    System.out.println("Nama Penerima   : " + namaPenerima);
                    System.out.println("Alamat Penerima : " + alamatPenerima);
                    System.out.println("Kode Pos        : " + kodePosPenerima);
                    System.out.println("Kota            : " + kotaPenerima);
                    System.out.println("Provinsi        : " + provinsiPenerima);
                    System.out.println("Nomor Telepon   : " + noTelpPenerima);
                    break;
                case 3:
                    //Menu Jenis Pengiriman Barang
                    System.out.println("\nSELAMAT DATANG DI MENU JENIS PENGIRIMAN BARANG");
                    System.out.println("--------------------------------------------------------------\n\n");
                    
                    System.out.print("Masukkan Nama Pengirim    : ");
                    namaPengirim = input.nextLine();
                    System.out.print("Masukkan Kota             : ");
                    kotaPengirim = input.nextLine();
                    System.out.print("Masukkan Provinsi         : ");
                    provinsiPengirim = input.nextLine();
                    System.out.print("Masukkan Nama Penerima    : ");
                    namaPenerima = input.nextLine();
                    System.out.print("Masukkan Kota/Kabupaten   : ");
                    kotaPenerima = input.nextLine();
                    System.out.print("Masukkan Provinsi         : ");
                    provinsiPenerima = input.nextLine();
                    System.out.print("Masukkan Berat Barang     : ");
                    beratBarang = Integer.parseInt(input.nextLine());

                    System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                    //List Jenis Pengiriman Barang
                    System.out.println("#List Jenis Pengiriman Barang");
                    System.out.println("Nama Pengirim      : " + namaPengirim);
                    System.out.println("Kota Pengirim      : " + kotaPengirim);
                    System.out.println("Provinsi Pengirim  : " + provinsiPengirim);
                    System.out.println("Nama Penerima      : " + namaPenerima);
                    System.out.println("Kota Penerima      : " + kotaPenerima);
                    System.out.println("Provinsi Penerima  : " + provinsiPenerima);

                    if (kotaPengirim.equalsIgnoreCase(kotaPenerima) && provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                        if(beratBarang >= 40) {
                            jenis2 = "jenis Full Truck Load / FTL";
                        } else {
                            jenis2 = "jenis Less Than Load / LTL";
                        }
                        System.out.println("Pengiriman barang Anda akan dikirim dengan " + jenisPengiriman[0]+jenis2);
                    } else if (provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                        if(beratBarang >= 1000 ) {
                            jenis2 = "jenis Full Truck Load / FTL";
                        } else {
                            jenis2 = "jenis Less Than Load / LTL";
                        } 
                        System.out.println("Pengiriman barang Anda akan dikirim dengan " + jenisPengiriman[1]+jenis2);
                    } else {
                        System.out.println("Pengiriman barang Anda akan dikirim dengan " + jenisPengiriman[2]);
                    }

                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                System.out.println("Input yang Anda masukkan salah");
                System.out.println("Silahkan isi input sesuai pilihan menu yang tersedia");    
            }
        } while (pilihanMenu != 4);
        
        input.close();
        
    }
}