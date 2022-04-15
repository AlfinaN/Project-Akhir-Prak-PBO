/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class DaftarKata extends javax.swing.JFrame {
    

    public String insert(String data)
    { 
         return data;
    }
    
    public final void show_data() {
        
        try{
            DefaultTableModel dataModel = (DefaultTableModel) tabelDaftarkata.getModel();
            DaftarKata in= new DaftarKata();
            tabelDaftarkata.setAutoCreateColumnsFromModel(true);
            
            dataModel.addRow(new Object[]{ 1,"abstrak class",in.insert("kelas murni (tanpa objek) dan tidak boleh memiliki objek (tidak boleh ada instansiasi) serta method-method yang abstract harus disempurnakan oleh kelas turunannya melalui override")});
            dataModel.addRow(new Object[]{ 2,"AI",in.insert("Artificial Intelligence yaitu Ilmu yang mengembangkan komputer supaya dapat bekerja dan berpikir serta mengambil keputusan seperti layaknya manusia")});
            dataModel.addRow(new Object[]{ 3,"algoritma",in.insert("merupakan sebuah kumpulan perintah atau langkah-langkah yang di gunakan oleh programer untuk menjalankan sebuah perintah")});
            dataModel.addRow(new Object[]{ 4,"ALU",in.insert("Arithmetic and Logical Unit yaitu bagian dari CPU yang berguna untuk memproses data secara logika dan juga data-data yang memerlukan perhitungan")});
            dataModel.addRow(new Object[]{ 5,"API",in.insert("API atau Application Programming Interface adalah sebuah sistem atau protokol dan tool yang membanungun aplikasi perangkat lunak yang berjalan di balik layar")});
            dataModel.addRow(new Object[]{ 6,"argumen",in.insert("sebutan untuk nilai inputan fungsi pada saat suatu fungsi dipanggil")});
            dataModel.addRow(new Object[]{ 7,"array",in.insert("sebuah variabel yang bisa menyimpan banyak data dalam satu variabel")});
            dataModel.addRow(new Object[]{ 8,"array multidimensi",in.insert("sebuah variabel yang menyimpan sekumpulan data yang memiliki tipe sama dan elemen yang akan diakses melalui banyak indeks atau subskrip")});
            dataModel.addRow(new Object[]{ 9,"ascending",in.insert("urutan data yang tersusun dari yang terendah sampai tertinggi")});
            dataModel.addRow(new Object[]{ 10,"atribut",in.insert("data yang terdapat dalam sebuah class")});
            dataModel.addRow(new Object[]{ 11,"Back-End Developer",in.insert("programer yang bertanggung jawab untuk mengurus sisi bagian belakang atau “sisi server” karena berjalan di server situs web dan bukan di komputer pengguna")});
            dataModel.addRow(new Object[]{ 12,"bahasa pemrograman",in.insert("Instruksi standar untuk memerintah komputer")});
            dataModel.addRow(new Object[]{ 13,"bahasa program",in.insert("Sekumpulan instruksi yang diberikan kepada komputer untuk dapat melaksanakan tugas-tugas tertentu dalam menyelesaikan suatu permasalahan")});
            dataModel.addRow(new Object[]{ 14,"behaviour",in.insert("hal-hal yang bisa dilakukan oleh objek dari suatu class")});
            dataModel.addRow(new Object[]{ 15,"binary tree",in.insert("sebuah pohon struktur data dimana setiap simpulnya memiliki maksimal dua anak")});
            dataModel.addRow(new Object[]{ 16,"bit",in.insert("ukuran terkecil dari informasi")});
            dataModel.addRow(new Object[]{ 17,"boolean",in.insert("suatu data yang memiliki dua nilai yaitu True dan False, namun bila di terjemahkan ke dalam bentuk integer (pemograman) memiliki nilai 1 untuk true 0 untuk false")});
            dataModel.addRow(new Object[]{ 18,"break",in.insert("perintah untuk menghentikan jalannya program")});
            dataModel.addRow(new Object[]{ 19,"browser",in.insert("software untuk membuka halaman website")});
            dataModel.addRow(new Object[]{ 20,"bubble sort",in.insert("metode pengurutan algoritma dengan cara melakukan penukaran data secara terus menerus sampai bisa dipastikan dalam suatu iterasi tertentu tidak ada lagi perubahan/penukaran. Algoritma ini menggunakan perbandingan dalam operasi antar elemennya")});
            dataModel.addRow(new Object[]{ 21,"char",in.insert("tipe data karakter tunggal yang biasa didefinisikan dengan tanda petik (‘) di awal dan di akhir karakternya")});
            dataModel.addRow(new Object[]{ 22,"class",in.insert("Cetak biru atau blueprint dari object yang digunakan hanya untuk membuat kerangka dasar")});
            dataModel.addRow(new Object[]{ 23,"client",in.insert("komputer yang bertugas menerima data dan informasi yang telah diolah oleh server")});
            dataModel.addRow(new Object[]{ 24,"coding",in.insert("penulisan program ")});
            dataModel.addRow(new Object[]{ 25,"compare",in.insert("Membandingkan dan Memilih")});
            dataModel.addRow(new Object[]{ 26,"compute",in.insert("Melakukan perhitungan aritmetik")});
            dataModel.addRow(new Object[]{ 27,"connect",in.insert("menghubungkan komputer ke jaringan")});
            dataModel.addRow(new Object[]{ 28,"data",in.insert("kumpulan fakta yang mewakili suatu objek")});
            dataModel.addRow(new Object[]{ 29,"database",in.insert("sekumpulan data atau informasi elekstronik yang sudah disusun sedemikan rupa di dalam web server dengan ketentuan atau aturan tertentu yang saling berelasi")});
            dataModel.addRow(new Object[]{ 30,"delete",in.insert("menghapus data")});
            dataModel.addRow(new Object[]{ 31,"descending",in.insert("urutan data dari nilai tertinggi hingga terendah")});
            dataModel.addRow(new Object[]{ 32,"display",in.insert("hasil keluaran dari komputer")});
            dataModel.addRow(new Object[]{ 33,"domain",in.insert("alamat di internet atau sebagai penunjuk negara situs web yang digunakan")});
            dataModel.addRow(new Object[]{ 34,"double",in.insert("tipe double memiliki tingkat ketelitian secara ganda atau double precision dengan menggunakan ruang penyimpanan 64-bit dalam menyimpan nilainya")});
            dataModel.addRow(new Object[]{ 35,"encode",in.insert("mempersiapkan suatu program ke dalam bahasa mesin agar segera diproses oleh komputer")});
            dataModel.addRow(new Object[]{ 36,"enkapsulasi",in.insert("konsep tentang pengikatan data atau metode berbeda yang disatukan atau “dikapsulkan” menjadi satu unit data")});
            dataModel.addRow(new Object[]{ 37,"error",in.insert("menunjukkan bahwa terdapat suatu kesalahan dalam kode program")});
            dataModel.addRow(new Object[]{ 38,"field",in.insert("kumpulan karakter yang membentuk suatu arti")});
            dataModel.addRow(new Object[]{ 39,"FIFO",in.insert("merupakan singkatan dari First In First Out, artinya adalah data yang pertama kali dimasukkan atau disimpan, maka data tersebut adalah yang pertama kali akan diakses atau dikeluarkan")});
            dataModel.addRow(new Object[]{ 40,"float",in.insert("digunakan untuk menandai nilai yang presisi seperti ketelitian tunggal (single precision) dengan menggunakan penyimpanan 32-bit")});
            dataModel.addRow(new Object[]{ 41,"flowchart",in.insert("Flowchart atau bagan alur adalah diagram yang menampilkan langkah-langkah dan keputusan untuk melakukan sebuah proses dari suatu program")});
            dataModel.addRow(new Object[]{ 42,"Front-End Developer",in.insert("programer yang bertanggung jawab untuk mengurus sisi bagian depan untuk menyesuaikan tampilan, nuansa, perilaku situs web, hingga antar muka pengguna yang meliputi mepilihan warna, font, hinggan bentuk dropdown")});
            dataModel.addRow(new Object[]{ 43,"Full Stack Developer",in.insert("bekerja di zona abu-abu dimana dapat bekerja lintas-fungsional pada dua teknologi yang berbeda, yaitu front-end dan back-end, dan Full-Stack Developer menawarkan sebuah paket yang lengkap")});
            dataModel.addRow(new Object[]{ 44,"graph",in.insert("kumpulan dari simpul dan busur yang saling terhubung")});
            dataModel.addRow(new Object[]{ 45,"gui",in.insert("tampilan antarmuka grafis yang memiliki elemen window, icon, dan menu. Windows memiliki sejumlah bagian, dari desktop hingga taskbar")});
            dataModel.addRow(new Object[]{ 46,"hash table",in.insert("struktur data yang digunakan dalam penyimpanan data sementara dan dapat mempercepat pencarian data yang tersimpan")});
            dataModel.addRow(new Object[]{ 47,"heaps",in.insert("sebuah binary tree yang memiliki karateristik: binary tree pada heap adalah tree yang complete, diimplementasikan sebagai sebuah array daripada menggunakan reference untuk menghubungkan tiap node, dan node pada sebuah heap memenuhi kondisi/syarat heap")});
            dataModel.addRow(new Object[]{ 48,"homepage",in.insert("halaman utama dari suatu website")});
            dataModel.addRow(new Object[]{ 49,"HTML",in.insert("HTML adalah singkatan dari Hypertext Markup Language, yaitu bahasa markup standar untuk membuat dan menyusun halaman dan aplikasi web")});
            dataModel.addRow(new Object[]{ 50,"infix",in.insert("cara penulisan ungkapan dengan meletakkan operator di antara dua operand disertai tanda kurung")});
            dataModel.addRow(new Object[]{ 51,"inheritence",in.insert("kemampuan untuk membentuk class baru yang memiliki fungsi turunan atau mirip dengan fungsi yang ada sebelumnya")});
            dataModel.addRow(new Object[]{ 52,"input",in.insert("Membaca data")});
            dataModel.addRow(new Object[]{ 53,"insert",in.insert("memasukkan data ")});
            dataModel.addRow(new Object[]{ 54,"insertion sort",in.insert("sebuah algoritma pengurutan yang membandingkan dua elemen data pertama, mengurutkannya, kemudian mengecek elemen data berikutnya satu persatu dan membandingkannya dengan elemen data yang telah diurutkan. Karena algoritma ini bekerja dengan membandingkan elemen-elemen data yang akan diurutkan, algoritma ini termasuk pula dalam comparison-based sort")});
            dataModel.addRow(new Object[]{ 55,"instance",in.insert("pembentukan dari class menjadi object dikenal")});
            dataModel.addRow(new Object[]{ 56,"integer",in.insert("tipe data numerik yang biasa digunakan apabila bertemu dengan bilangan bulat")});
            dataModel.addRow(new Object[]{ 57,"IP",in.insert("Internet Protocol yaitu protokol yang beroperasi dalam bagian yang berbeda")});
            dataModel.addRow(new Object[]{ 58,"ISP",in.insert("Internet Server Provider yaitu perusahaan yang menjual koneksi internet kepada pelanggan")});
            dataModel.addRow(new Object[]{ 59,"iterasi",in.insert("suatu urutan atau lebih dari langkah algoritmik dilakukan di loop program")});
            dataModel.addRow(new Object[]{ 60,"JavaScript",in.insert("suatu bahasa pemrograman yang bersifat Client Side Programming Language yang dapat berjalan pada semua web browser")});
            dataModel.addRow(new Object[]{ 61,"jQuery",in.insert("kumpulan fungsi-fungsi JavaScript yang memudahkan penulisan kode JavaScript atau sebuah library JavaScript")});
            dataModel.addRow(new Object[]{ 62,"LED",in.insert("lampu kecil yang digunakan untuk penanda atau pointer")});
            dataModel.addRow(new Object[]{ 63,"LIFO",in.insert("merupakan singkatan dari Last In First Out, artinya adalah data yang terakhir kali dimasukkan atau disimpan, maka data tersebut adalah yang pertama kali akan diakses atau dikeluarkan")});
            dataModel.addRow(new Object[]{ 64,"linked list",in.insert("salah satu bentuk struktur data, berisi kumpulan data (node) yang tersusun secara sekuensial, saling sambung-menyambung, dinamis dan tidak terbatas")});
            dataModel.addRow(new Object[]{ 65,"long",in.insert("digunakan saat nilainya berada di luar kapasitas rentang tipe int karena tipe long punya range sangat tinggi dibanding tipe data lainnya")});
            dataModel.addRow(new Object[]{ 66,"loop",in.insert("Melakukan pengulangan")});
            dataModel.addRow(new Object[]{ 67,"merge sort",in.insert("mengurutkan data dengan cara menggabungkan hingga data terurut")});
            dataModel.addRow(new Object[]{ 68,"method",in.insert("fungsi yang berisi tindakan yang bisa dilakukan di dalam class")});
            dataModel.addRow(new Object[]{ 69,"objek",in.insert("hasil cetak dari class")});
            dataModel.addRow(new Object[]{ 70,"oop",in.insert("OOP (Object Oriented Programming) adalah suatu metode pemrograman yang berorientasi kepada objek")});
            dataModel.addRow(new Object[]{ 71,"operator",in.insert("suatu simbol yang digunakan untuk memberikan perintah kepada komputer untuk melakukan aksi terhadap satu atau lebih operand. Operand sendiri adalah sesuatu yang dioperasikan oleh operator")});
            dataModel.addRow(new Object[]{ 72,"output",in.insert("Menampilkan data")});
            dataModel.addRow(new Object[]{ 73,"overloading",in.insert("membuat beberapa method dengan nama yang sama, tapi dibedakan dari jumlah dan/atau tipe parameter")});
            dataModel.addRow(new Object[]{ 74,"package",in.insert("direktori untuk menyimpan file bytecode (file berekstensi .class)")});
            dataModel.addRow(new Object[]{ 75,"parameter",in.insert("sebutan untuk nilai inputan fungsi pada saat suatu fungsi itu di definisikan")});
            dataModel.addRow(new Object[]{ 76,"peek",in.insert("berfungsi untuk melihat data yang ada pada tumpukan")});
            dataModel.addRow(new Object[]{ 77,"polimorfisme",in.insert("konsep di mana suatu objek yang berbeda-beda dapat diakses melalui interface yang sama atau istilah lain penerapan method yang sama tetapi menghasilkan perilaku yang berbeda")});
            dataModel.addRow(new Object[]{ 78,"pop",in.insert("berfungsi untuk mengeluarkan atau menghapus nilai terakhir (yang berada pada posisi paling atas) dari stack")});
            dataModel.addRow(new Object[]{ 79,"postfix",in.insert("cara penulisan ungkapan dengan meletakkan operator setelah operand tanpa menuliskan tanda kurung")});
            dataModel.addRow(new Object[]{ 80,"pseudocode",in.insert("code yang menggambarkan algoritma yang ditulis dengan lebih sederhana dan lebih bebas karena tidak terikat pada bahasa pemrograman tertentu")});
            dataModel.addRow(new Object[]{ 81,"push",in.insert("berfungsi untuk memasukkan sebuah nilai atau data ke dalam stack dan queue")});
            dataModel.addRow(new Object[]{ 82,"queues",in.insert("merupakan struktur data linear dimana penambahan komponen dilakukan disatu ujung, sementara pengurangan dilakukan diujung lain")});
            dataModel.addRow(new Object[]{ 83,"quick sort",in.insert("mengurutkan data dengan membagi data menjadi partisi-partisi dan menggunakan pivot")});
            dataModel.addRow(new Object[]{ 84,"RAM",in.insert("suatu perangkat keras komputer yang berbentuk modul memory yang berfungsi untuk menyimpan data sementara")});
            dataModel.addRow(new Object[]{ 85,"rekursi ",in.insert("method yang memanggil dirinya sendiri")});
            dataModel.addRow(new Object[]{ 86,"remove",in.insert("menghapus data yang sudah ada pada array atau list")});
            dataModel.addRow(new Object[]{ 87,"return",in.insert("kata kunci untuk pengembalian nilai pada suatu fungsi")});
            dataModel.addRow(new Object[]{ 88,"selection sort",in.insert("merupakan salah satu algoritma pengurutan yang sederhana. Ide dasarnya adalah melakukan beberapa kali pass untuk melakukan penyeleksian elemen struktur data. Untuk sorting ascending (menaik), elemen yang paling kecil di antara elemen-elemen yang belum urut, disimpan indeksnya, kemudian dilakukan pertukaran nilai elemen dengan indeks yang disimpan tersebut dengan elemen yang paling depan yang belum urut")});
            dataModel.addRow(new Object[]{ 89,"sequence",in.insert("merupakan urutan pengerjaan dari perintah/statement pertama sampai dengan perintah/statement terakhir")});
            dataModel.addRow(new Object[]{ 90,"shell sort",in.insert("mengurutkan data dengan membandingkan suatu data dengan data lain yang memiliki jarak tertentu")});
            dataModel.addRow(new Object[]{ 91,"sorting object",in.insert("mengurutkan suatu object menjadi data yang urut")});
            dataModel.addRow(new Object[]{ 92,"stacks",in.insert("tumpukan dapat diartikan sebagai suatu kumpulan data yang seolah-olah terlihat seperti ada data yang diletakkan di atas data yang lain")});
            dataModel.addRow(new Object[]{ 93,"store",in.insert("Memberikan nilai ke suatu identifier")});
            dataModel.addRow(new Object[]{ 94,"string",in.insert("tipe data yang menampung kumpulan karakter yang harus berada di dalam tanda kutip dua ( ” )")});
            dataModel.addRow(new Object[]{ 95,"subclass",in.insert("class yang diwarisi sifat-sifat dari superclass")});
            dataModel.addRow(new Object[]{ 96,"superclass",in.insert("class yang mewariskan atribut dan methodnya ke subclass")});
            dataModel.addRow(new Object[]{ 97,"teknik informatika",in.insert("Salah satu jurusan pendidikan tingkat perguruan tinggi yang mempelajari serta menerapkan prinsip-prinsip ilmu komputer dan analisis matematis dalam perancangan, pengujian, pengembangan, dan evaluasi sistem operasi, perangkat lunak (software), dan kinerja komputer")});
            dataModel.addRow(new Object[]{ 98,"update",in.insert("memperbarui data yang sudah ada")});
            dataModel.addRow(new Object[]{ 99,"URL ",in.insert("Uniform Resource Locator yaitu cara penanaman alamat file di internet")});
            dataModel.addRow(new Object[]{ 100,"website",in.insert("kumpulan halaman pada satu domain di internet yang dapat diakses menggunakan browser")});
        
        }
        catch(Exception e)
        {
            System.out.println("Error" + e.getMessage());
        }
    }
    /**
     * Creates new form DaftaKata
     */
    public DaftarKata() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btExit = new javax.swing.JButton();
        btShow = new javax.swing.JButton();
        btBahasa = new javax.swing.JButton();
        btInformasi = new javax.swing.JButton();
        btCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarkata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btExit.setContentAreaFilled(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 90, 40));

        btShow.setContentAreaFilled(false);
        btShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowActionPerformed(evt);
            }
        });
        getContentPane().add(btShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 160, 40));

        btBahasa.setContentAreaFilled(false);
        btBahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBahasaActionPerformed(evt);
            }
        });
        getContentPane().add(btBahasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 40));

        btInformasi.setContentAreaFilled(false);
        btInformasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformasiActionPerformed(evt);
            }
        });
        getContentPane().add(btInformasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 40));

        btCari.setContentAreaFilled(false);
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        getContentPane().add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 40));

        tabelDaftarkata.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelDaftarkata.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        tabelDaftarkata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kata", "Makna"
            }
        ));
        tabelDaftarkata.setGridColor(new java.awt.Color(204, 204, 204));
        tabelDaftarkata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDaftarkataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDaftarkata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 760, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Daftar IDN.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        new menuCari().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCariActionPerformed

    private void btInformasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformasiActionPerformed
        // TODO add your handling code here:
        new Informasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_btInformasiActionPerformed

    private void tabelDaftarkataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDaftarkataMouseClicked
        
    }//GEN-LAST:event_tabelDaftarkataMouseClicked

    private void btShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowActionPerformed
        // TODO add your handling code here:
        show_data();
    }//GEN-LAST:event_btShowActionPerformed

    private void btBahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBahasaActionPerformed
        // TODO add your handling code here:
        new Bahasa().setVisible(true);
        dispose();
    }//GEN-LAST:event_btBahasaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBahasa;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btInformasi;
    private javax.swing.JButton btShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDaftarkata;
    // End of variables declaration//GEN-END:variables
}
