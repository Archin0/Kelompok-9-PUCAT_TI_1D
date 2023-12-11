import java.util.Scanner;

public class Ekspedisi {
    /**
     * @param args
     */
    public static void main (String[] args) {

        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        String username = "admin"; // Set the username
        String password = "pass"; // Set the password
        boolean loggedIn = false;

        //Deklarasi Variabel
        int pilihanMenu;

        String[][] dataPengirim = new String[10][6]; // A 2D array to store data of up to 10 senders with 6 fields
        String[][] dataPenerima = new String[10][6]; // A 2D array to store data of up to 10 recipients with 6 fields

        //Variabel Menu Data Pengirim Barang (Case 1 dan Case 3)
        String namaPengirim, kotaPengirim, provinsiPengirim;

         //Variabel Menu Data Penerima Barang (Case 2 dan Case 3)
         String namaPenerima, kotaPenerima, provinsiPenerima;
        //Variabel Menu Jenis Pengiriman Barang (Case 3)
        String jenisPengiriman[] = {"Via Darat ", "Via Laut ", "Via Udara "}; 
        String jenis2 = ""; 
        int beratBarang;


        System.out.println("\n===============PUCAT EXPRESS================");
        System.out.println("= Silahkan Verifikasi Anda terlebih dahulu =");
        System.out.println("============================================");
        
        // Add a login loop
        while (!loggedIn) {
            System.out.print("=\tUsername: ");
            String enteredUsername = input.nextLine();
            System.out.print("=\tPassword: ");
            String enteredPassword = input.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                System.out.println("\n=   Berhasil login! Selamat Datang " + enteredUsername + "   =");
                System.out.println("============================================\n");
                loggedIn = true;
            } else {
                System.out.println("\n=     Login gagal. Silahkan coba lagi.     =");
                System.out.println("============================================\n");
            }
        }

        do {
            //Pilihan menu yang akan dipilih
            System.out.println("=================== MENU ===================");
            System.out.println("=      (1) Input Data Pengirim Barang      =");
            System.out.println("=      (2) Input Data Penerima Barang      =");
            System.out.println("=        (3) Menu Pengiriman Barang        =");
            System.out.println("=    (4) Tampilkan Data Pengirim Barang    =");
            System.out.println("=    (5) Tampilkan Data Penerima Barang    =");
            System.out.println("=          (6) Cari Data Pengirim          =");
            System.out.println("=          (7) Cari Data Penerima          =");
            System.out.println("=                 (8) Exit                 =");
            System.out.println("============================================");

            // Validasi input untuk pilihan menu
            do {
                System.out.print("= > Pilih Menu (1/2/3/4/5/6/7/8) : ");
                while (!input.hasNextInt()) {
                    System.out.println("=   Input yang Anda masukkan bukan angka.   =");
                    System.out.println("=   Silahkan isi kembali dengan angka       =");
                    System.out.print("\n= > Pilih Menu (1/2/3/4/5/6/7/8) : ");
                    input.next(); 
                }
                pilihanMenu = input.nextInt();
                input.nextLine();
            } while (pilihanMenu < 1 || pilihanMenu > 8);
        
            switch (pilihanMenu) {
                case 1:
                    //Menu Pengiriman Barang
                    System.out.println("============ Input Data Pengirim ===========");

                    // Input the number of senders
                    System.out.print("= > Masukkan jumlah pengirim : ");
                    int jlhPengirim = input.nextInt();
                    input.nextLine(); // Consume the newline character

                    for (int j = 0; j < jlhPengirim; j++) {
                        for (int i = 0; i < dataPengirim.length; i++) {
                            if (dataPengirim[i][0] == null) {
                                System.out.print("= - > Masukkan Nama Pengirim "+(i+1)+"  : ");
                                dataPengirim[i][0] = input.nextLine();
                                System.out.print("= - > Masukkan Alamat Pengirim  : ");
                                dataPengirim[i][1] = input.nextLine();
                                System.out.print("= - > Masukkan Kode Pos         : ");
                                dataPengirim[i][2] = input.nextLine();
                                System.out.print("= - > Masukkan Kota             : ");
                                dataPengirim[i][3] = input.nextLine();
                                System.out.print("= - > Masukkan Provinsi         : ");
                                dataPengirim[i][4] = input.nextLine();
                                System.out.print("= - > Masukkan Nomor Telepon    : ");
                                dataPengirim[i][5] = input.nextLine();
                                System.out.println();
                                break;
                            }
                        }
                    }
                    System.out.println("=         DATA BERHASIL DITAMBAHKAN        =");
                    System.out.println("============================================");
                    System.out.println("=\t\t\t\t\t   =");
                    break;

                case 2:
                    //Menu DataPengiriman Barang
                    System.out.println("============ Input Data Penerima ===========");
                    // System.out.print("Berapa jumlah data penerima yang ingin diisi : ");
                    // int jlhInputTerima = Integer.parseInt(input.nextLine());

                    // Input the number of recipients
                    System.out.print("= > Masukkan jumlah penerima : ");
                    int jlhPenerima = input.nextInt();
                    input.nextLine(); // Consume the newline character

                    for (int j = 0; j < jlhPenerima; j++) {
                        for (int i = 0; i < dataPenerima.length; i++) {
                            if (dataPenerima[i][0] == null) {
                                System.out.print("= - > Masukkan Nama Penerima    : ");
                                dataPenerima[i][0] = input.nextLine();
                                System.out.print("= - > Masukkan Alamat Penerima  : ");
                                dataPenerima[i][1] = input.nextLine();
                                System.out.print("= - > Masukkan Kode Pos         : ");
                                dataPenerima[i][2] = input.nextLine();
                                System.out.print("= - > Masukkan Kota/Kabupaten   : ");
                                dataPenerima[i][3] = input.nextLine();
                                System.out.print("= - > Masukkan Provinsi         : ");
                                dataPenerima[i][4] = input.nextLine();
                                System.out.print("= - > Masukkan Nomor Telepon    : ");
                                dataPenerima[i][5] = input.nextLine();
                                System.out.println();
                                break;
                            }
                        }
                    }
                    System.out.println("=         DATA BERHASIL DITAMBAHKAN        =");
                    System.out.println("============================================");
                    System.out.println("=\t\t\t\t\t   =");
                    break;
                    
                case 3:
                    //Menu Jenis Pengiriman Barang
                    System.out.println("============ Jenis Pengiriman ===========");
                    
                    System.out.print("= > Masukkan Nama Pengirim    : ");
                    namaPengirim = input.nextLine();
                    System.out.print("= > Masukkan Kota             : ");
                    kotaPengirim = input.nextLine();
                    System.out.print("= > Masukkan Provinsi         : ");
                    provinsiPengirim = input.nextLine();
                    System.out.print("= > Masukkan Nama Penerima    : ");
                    namaPenerima = input.nextLine();
                    System.out.print("= > Masukkan Kota/Kabupaten   : ");
                    kotaPenerima = input.nextLine();
                    System.out.print("= > Masukkan Provinsi         : ");
                    provinsiPenerima = input.nextLine();
                    System.out.print("= > Masukkan Berat Barang     : ");
                    beratBarang = Integer.parseInt(input.nextLine());

                    System.out.println("=         DATA BERHASIL DITAMBAHKAN        =\n");
                    //List Jenis Pengiriman Barang
                    System.out.println("====== #List Jenis Pengiriman Barang# ======");
                    System.out.println("> Nama Pengirim      : " + namaPengirim);
                    System.out.println("> Kota Pengirim      : " + kotaPengirim);
                    System.out.println("> Provinsi Pengirim  : " + provinsiPengirim);
                    System.out.println("> Nama Penerima      : " + namaPenerima);
                    System.out.println("> Kota Penerima      : " + kotaPenerima);
                    System.out.println("> Provinsi Penerima  : " + provinsiPenerima);

                    if (kotaPengirim.equalsIgnoreCase(kotaPenerima) && provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                        if(beratBarang >= 40) {
                            jenis2 = "jenis Full Truck Load / FTL";
                        } else {
                            jenis2 = "jenis Less Than Load / LTL";
                        }
                        System.out.println("> Pengiriman barang Anda akan dikirim dengan");
                        System.out.println("  " + jenisPengiriman[0]+jenis2);
                    } else if (provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                        if(beratBarang >= 1000 ) {
                            jenis2 = "jenis Full Truck Load / FTL";
                        } else {
                            jenis2 = "jenis Less Than Load / LTL";
                        } 
                        System.out.println("> Pengiriman barang Anda akan dikirim dengan");
                        System.out.println("  " + jenisPengiriman[1]+jenis2);
                    } else {
                        System.out.println("> Pengiriman barang Anda akan dikirim dengan");
                        System.out.println("  " + jenisPengiriman[2]);
                    }
                    System.out.println("============================================");

                    break;
                case 4:
                    // Display sender data
                    System.out.println("=============== Data Pengirim ==============");
                    for (int i = 0; i < dataPengirim.length; i++) {
                        if (dataPengirim[i][0] != null) {
                            System.out.println("> Nama Pengirim   : " + dataPengirim[i][0]);
                            System.out.println("> Alamat Pengirim : " + dataPengirim[i][1]);
                            System.out.println("> Kode Pos        : " + dataPengirim[i][2]);
                            System.out.println("> Kota            : " + dataPengirim[i][3]);
                            System.out.println("> Provinsi        : " + dataPengirim[i][4]);
                            System.out.println("> Nomor Telepon   : " + dataPengirim[i][5]);
                            System.out.println("");
                        }
                    }
                    System.out.println("============================================");
                    break;

                case 5:
                    // Display recipient data
                    System.out.println("=============== Data Penerima ==============");
                    for (int i = 0; i < dataPenerima.length; i++) {
                        if (dataPenerima[i][0] != null) {
                            System.out.println("> Nama Penerima   : " + dataPenerima[i][0]);
                            System.out.println("> Alamat Penerima : " + dataPenerima[i][1]);
                            System.out.println("> Kode Pos        : " + dataPenerima[i][2]);
                            System.out.println("> Kota/Kabupaten  : " + dataPenerima[i][3]);
                            System.out.println("> Provinsi        : " + dataPenerima[i][4]);
                            System.out.println("> Nomor Telepon   : " + dataPenerima[i][5]);
                            System.out.println("");
                      }
                    }
                    System.out.println("============================================");
                    break;

                case 6:
                    // Search for sender data
                    System.out.println("============ Cari Data Pengirim ============");
                    System.out.print("= > Masukkan nama yang ingin dicari: ");
                    String searchNameSender = input.nextLine();
                    boolean foundSender = false;

                    for (int i = 0; i < dataPengirim.length; i++) {
                        if (dataPengirim[i][0] != null && dataPengirim[i][0].equalsIgnoreCase(searchNameSender)) {
                            System.out.println("\n---------- Data Pengirim Ditemukan --------");
                            System.out.println("> Nama Pengirim   : " + dataPengirim[i][0]);
                            System.out.println("> Alamat Pengirim : " + dataPengirim[i][1]);
                            System.out.println("> Kode Pos        : " + dataPengirim[i][2]);
                            System.out.println("> Kota            : " + dataPengirim[i][3]);
                            System.out.println("> Provinsi        : " + dataPengirim[i][4]);
                            System.out.println("> Nomor Telepon   : " + dataPengirim[i][5]);
                            System.out.println("============================================");
                            foundSender = true;
                            break;
                        }
                    }

                    if (!foundSender) {
                        System.out.println("\n------ Data Pengirim Tidak Ditemukan. ------");
                        System.out.println("============================================");
                    }
                    break;

                case 7:
                    // Search for recipient data
                    System.out.println("============ Cari Data Penerima ============");
                    System.out.print("= > Masukkan nama yang ingin dicari: ");
                    String searchNameRecipient = input.nextLine();
                    boolean foundRecipient = false;

                    for (int i = 0; i < dataPenerima.length; i++) {
                        if (dataPenerima[i][0] != null && dataPenerima[i][0].equalsIgnoreCase(searchNameRecipient)) {
                            System.out.println("\n---------- Data Penerima Ditemukan --------");
                            System.out.println("Nama Penerima   : " + dataPenerima[i][0]);
                            System.out.println("Alamat Penerima : " + dataPenerima[i][1]);
                            System.out.println("Kode Pos        : " + dataPenerima[i][2]);
                            System.out.println("Kota/Kabupaten  : " + dataPenerima[i][3]);
                            System.out.println("Provinsi        : " + dataPenerima[i][4]);
                            System.out.println("Nomor Telepon   : " + dataPenerima[i][5]);
                            System.out.println("============================================");
                            foundRecipient = true;
                            break;
                        }
                    }

                    if (!foundRecipient) {
                        System.out.println("\n------ Data Penerima Tidak Ditemukan. ------");
                        System.out.println("============================================");
                    }
                    break;

                case 8:
                    System.out.println("================== Keluar ==================");
                    System.out.println("");
                    System.out.println("=    Terima Kasih atas kunjungan Anda.     =");
                    System.out.println("");
                    System.out.println("============================================");
                    break;
                    
                    default:
                    System.out.println("> Input yang Anda masukkan salah");
                    System.out.println("> Silahkan isi input sesuai pilihan menu yang tersedia");
                }
        } while (pilihanMenu != 8);

        input.close();
    }
}