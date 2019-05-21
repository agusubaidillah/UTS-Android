/*tanggal pengerjaan : 19 Mei 2019
  nim : 10116038
  nama : Agus Ubaidillah
  kelas : IF-1/ AKB-1
*/

package com.example.agus.daftarteman;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datateman extends AppCompatActivity {

    private TextView nim, getnama, kelas, telepon, email, sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datateman);
        getSupportActionBar().setTitle("Data Teman");
        nim = findViewById(R.id.nim);
        getnama = findViewById(R.id.getnama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        sosmed = findViewById(R.id.sosmed);
        showdata();


    }

    @SuppressLint("SetTextI18n")
    private void showdata() {
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama) {
            case "Ricky Fahmi Nugraha":
                nim.setText("NIM: 10116150");
                getnama.setText("Nama: Ricky Fahmi Nugraha");
                kelas.setText("Kelas: IF-4");
                telepon.setText("Telepon : 085435677898");
                email.setText("Email : kismoy4@gmail.com");
                sosmed.setText("Sosmed : Ricky Fahmi Nugraha");
                break;

            case "Renaldi Ferdiansyah":
                nim.setText("NIM: 10116032");
                getnama.setText("Nama: Renaldi Ferdiansyah");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08726578272");
                email.setText("Email : renaldiferdiansyah0598@gmail.com");
                sosmed.setText("Sosmed : Renaldi Ferdiansyah");
                break;

            case "Ridwan Hidayat":
                nim.setText("NIM: 10116030");
                getnama.setText("Nama: Ridwan Hidayat");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 085123423560");
                email.setText("Email : ridwanbdg@gmail.com");
                sosmed.setText("Sosmed : Donikurangbelajar");
                break;

            case "Faizal Nur Muchammad":
                nim.setText("NIM: 10116011");
                getnama.setText("Nama: Faizal Nur Muchammad");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 081455787098");
                email.setText("Email : faizalnur444@gmail.com");
                sosmed.setText("Sosmed : Faizal Nur Muchammad");
                break;


        }
    }
}