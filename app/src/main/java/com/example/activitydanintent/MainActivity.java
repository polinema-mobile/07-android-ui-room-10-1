package com.example.activitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePickerDialog picker;
    EditText edtTanggalLahir;
    Button btnGet;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 findviewbyid btnGet = ...
        edtTanggalLahir=(EditText) findViewById(R.id.edtTanggalLahir);
        edtTanggalLahir.setInputType(InputType.TYPE_NULL);
        edtTanggalLahir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                edtTanggalLahir.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        //2 click listener untuk button get
        // 3 di dalam click listener ambil value nya edit text
        // 4 buat intent
        // 5 isi variabel intent (bundle)
        // 6 send intent ke detail activity
    }
}