package com.example.identifikasijeniskulit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnProses;
    TextView tvOutput;
    CheckBox chkGejala1, chkGejala2, chkGejala3, chkGejala4, chkGejala5, chkGejala6;
    AutoCompleteTextView txtNilaiGejala1, txtNilaiGejala2, txtNilaiGejala3, txtNilaiGejala4, txtNilaiGejala5, txtNilaiGejala6;

    String[] nilaiKeyakinanGejala1 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaiKeyakinanGejala2 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaiKeyakinanGejala3 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaiKeyakinanGejala4 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaiKeyakinanGejala5 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaiKeyakinanGejala6 = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProses   = (Button)findViewById(R.id.button);
        tvOutput    = (TextView)findViewById(R.id.textView);

        chkGejala1  = (CheckBox)findViewById(R.id.checkBox);
        chkGejala2  = (CheckBox)findViewById(R.id.checkBox2);
        chkGejala3  = (CheckBox)findViewById(R.id.checkBox3);
        chkGejala4  = (CheckBox)findViewById(R.id.checkBox4);
        chkGejala5  = (CheckBox)findViewById(R.id.checkBox5);
        chkGejala6  = (CheckBox)findViewById(R.id.checkBox6);

        txtNilaiGejala1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        txtNilaiGejala2 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        txtNilaiGejala3 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        txtNilaiGejala4 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        txtNilaiGejala5 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        txtNilaiGejala6 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView6);

        final ArrayAdapter<String> adapterGejala1 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala1);
        txtNilaiGejala1.setThreshold(1);
        txtNilaiGejala1.setAdapter(adapterGejala1);

        final ArrayAdapter<String> adapterGejala2 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala2);
        txtNilaiGejala2.setThreshold(1);
        txtNilaiGejala2.setAdapter(adapterGejala2);

        final ArrayAdapter<String> adapterGejala3 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala3);
        txtNilaiGejala3.setThreshold(1);
        txtNilaiGejala3.setAdapter(adapterGejala3);

        final ArrayAdapter<String> adapterGejala4 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala4);
        txtNilaiGejala4.setThreshold(1);
        txtNilaiGejala4.setAdapter(adapterGejala4);

        final ArrayAdapter<String> adapterGejala5 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala5);
        txtNilaiGejala5.setThreshold(1);
        txtNilaiGejala5.setAdapter(adapterGejala5);

        final ArrayAdapter<String> adapterGejala6 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala6);
        txtNilaiGejala6.setThreshold(1);
        txtNilaiGejala6.setAdapter(adapterGejala6);

        txtNilaiGejala1.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 1").
                                                           setAdapter(adapterGejala1, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala1.setText(nilaiKeyakinanGejala1[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala2.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 2").
                                                           setAdapter(adapterGejala2, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala2.setText(nilaiKeyakinanGejala2[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala3.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 3").
                                                           setAdapter(adapterGejala3, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala3.setText(nilaiKeyakinanGejala3[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 4").
                                                           setAdapter(adapterGejala4, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala4.setText(nilaiKeyakinanGejala4[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala5.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 5").
                                                           setAdapter(adapterGejala5, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala5.setText(nilaiKeyakinanGejala5[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala6.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(MainActivity.this).setTitle("Pilihlah Nilai Gejala 6").
                                                           setAdapter(adapterGejala6, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala6.setText(nilaiKeyakinanGejala6[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );


        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Jenis Kulit Anda :";

                // AND && dan OR ||
                if (chkGejala1.isChecked() && chkGejala2.isChecked() && chkGejala3.isChecked() && chkGejala4.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala1 = 0.2;
                    double nilaiGejala2 = 0.4;
                    double nilaiGejala3 = 0.6;
                    double nilaiGejala4 = 0.4;

                    // Nilai Inputan dari PASIEN / USER
                    double doubleGejala1 = Double.parseDouble(txtNilaiGejala1.getText().toString());
                    double doubleGejala2 = Double.parseDouble(txtNilaiGejala2.getText().toString());
                    double doubleGejala3 = Double.parseDouble(txtNilaiGejala3.getText().toString());
                    double doubleGejala4 = Double.parseDouble(txtNilaiGejala4.getText().toString());

                    double hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1;
                    double hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2;
                    double hasilHitunganGejala3 = nilaiGejala3 * doubleGejala3;
                    double hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4;

                    double Combine_CF1_CF2  = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1);
                    double Combine_CFold_CF3  = Combine_CF1_CF2 + hasilHitunganGejala3 * (1 - Combine_CF1_CF2);
                    double Combine_CFold_CF4  = Combine_CFold_CF3 + hasilHitunganGejala4 * (1 - Combine_CFold_CF3);

                    String hasilHitungGejalaPenyakitA = String.valueOf((Combine_CFold_CF4 * 100));

                    NamaPenyakit += "\nBruCellosis"+"\n"+hasilHitungGejalaPenyakitA+" %";



                }

                if (chkGejala4.isChecked() && chkGejala5.isChecked() && chkGejala6.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala4 = 0.4;
                    double nilaiGejala5 = 0.2;
                    double nilaiGejala6 = 0.8;

                    // Nilai Inputan dari PASIEN / USER
                    double doubleGejala4 = Double.parseDouble(txtNilaiGejala4.getText().toString());
                    double doubleGejala5 = Double.parseDouble(txtNilaiGejala5.getText().toString());
                    double doubleGejala6 = Double.parseDouble(txtNilaiGejala6.getText().toString());

                    double hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4;
                    double hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5;
                    double hasilHitunganGejala6 = nilaiGejala6 * doubleGejala6;

                    double Combine_CF1_CF2_1  = hasilHitunganGejala4 + hasilHitunganGejala5 * (1 - hasilHitunganGejala4);
                    double Combine_CFold_CF3  = Combine_CF1_CF2_1 + hasilHitunganGejala6 * (1 - Combine_CF1_CF2_1);


                    String hasilHitungGejalaPenyakitB = String.valueOf((Combine_CFold_CF3 * 100));

                    NamaPenyakit += "\nInFection Bovine"+"\n"+hasilHitungGejalaPenyakitB+" %";

                }

                if (chkGejala1.isChecked() && chkGejala3.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala1 = 0.2;
                    double nilaiGejala3 = 0.6;

                    // Nilai Inputan dari PASIEN / USER
                    double doubleGejala1 = Double.parseDouble(txtNilaiGejala1.getText().toString());
                    double doubleGejala3 = Double.parseDouble(txtNilaiGejala3.getText().toString());

                    double hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1;
                    double hasilHitunganGejala3 = nilaiGejala3 * doubleGejala3;

                    double Combine_CF1_CF2_2  = hasilHitunganGejala1 + hasilHitunganGejala3 * (1 - hasilHitunganGejala1);


                    String hasilHitungGejalaPenyakitC = String.valueOf((Combine_CF1_CF2_2 * 100));

                    NamaPenyakit += "\nInfluenza"+"\n"+hasilHitungGejalaPenyakitC+" %";

                }

                // Output Semua hasil
                tvOutput.setText(""+NamaPenyakit);
            }
        });
    }
}
