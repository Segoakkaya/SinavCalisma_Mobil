package com.example.sinavcalisma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityDetailsActivity extends AppCompatActivity {


    //region
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_geri, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(CityDetailsActivity.this,MainActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
    //endregion
    TextView tv_Sehir;
    ListView liste_havadurumu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);
        tv_Sehir = findViewById(R.id.tv_Sehir);
        liste_havadurumu=findViewById(R.id.liste_havadurumu);
        String cityName = getIntent().getStringExtra("CITY_NAME");
        tv_Sehir.setText(cityName);
        ArrayList<Havadurumu> havadurumus = new ArrayList<>();
        havadurumus.add(new Havadurumu("14-15C" , "Pazartesi"));
        havadurumus.add(new Havadurumu("10-12C","Salı"));
        havadurumus.add(new Havadurumu("14-15C","Carsamba"));
        HavaDurumuAdapter havaDrum = new HavaDurumuAdapter(CityDetailsActivity.this, havadurumus);
        havaDrum.notifyDataSetChanged();
        liste_havadurumu.setAdapter(havaDrum);
    }
}