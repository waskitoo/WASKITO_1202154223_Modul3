package com.razerblade.waskito_1202154223_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Daftar extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter mAdapter;

    public static ArrayList<Item> itemm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        itemm = dataa();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new Adapter(itemm);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<Item> dataa(){
        ArrayList<Item> item = new ArrayList<>();
        item.add(new Item("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        item.add(new Item("Amidis","Ini adalah AMDK merk AMIDIS","AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.",R.drawable.amidis));
        item.add(new Item("Cleo","Ini adalah AMDK merk CLEO","Tahukah Sahabat Cleo, sekitar 70% tubuh manusia terdiri dari air. Bahkan otak dan sel darah kita 80 persennya air. Selain oksigen, air memiliki peranan yang sangat penting dalam kehidupan kita yaitu untuk menyebarkan nutrisi ke seluruh sel tubuh, menstabilkan suhu tubuh, sebagai pelumas sendi-sendi, membantu membersihkan tubuh dari endapan sisa zat-zat kimia yang tidak berguna.",R.drawable.cleo));
        item.add(new Item("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        item.add(new Item("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        item.add(new Item("Evian","Ini adalah AMDK merk EVIAN","",R.drawable.evian));
        item.add(new Item("Le Minerale","Ini adalah AMDK merk LE MINERALE","",R.drawable.leminerale));
        item.add(new Item("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        item.add(new Item("Pristine","Ini adalah AMDK merk PRISTINE","",R.drawable.pristine));
        item.add(new Item("Vit","Ini adalah AMDK merk VIT","",R.drawable.vit));
        return item;
    }
}
