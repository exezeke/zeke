package com.example.zikseven67;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class bldgndfacilities extends AppCompatActivity {

    private CardView cardOrtiz;
    private CardView cardTagle;
    private CardView cardRosales;
    private CardView cardOdhertySantos;
    private CardView cardJaimeSin;
    private CardView cardReyesScience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildingandfacility);

        initViews();
        setupClickListeners();
    }

    private void initViews() {
        cardOrtiz = findViewById(R.id.card_ortiz);
        cardTagle = findViewById(R.id.card_tagle);
        cardRosales = findViewById(R.id.card_rosales);
        cardOdhertySantos = findViewById(R.id.card_odherty_santos);
        cardJaimeSin = findViewById(R.id.card_jaime_sin);
        cardReyesScience = findViewById(R.id.card_reyes_science);
    }

    private void setupClickListeners() {
        if (cardOrtiz != null) {
            cardOrtiz.setOnClickListener(v -> openBuildingDetail("MSGR. Justino Ortiz Building"));
        }
        if (cardTagle != null) {
            cardTagle.setOnClickListener(v -> openBuildingDetail("Cardinal Luis Tagle Building"));
        }
        if (cardRosales != null) {
            cardRosales.setOnClickListener(v -> openBuildingDetail("Cardinal Gaudencio Rosales Building"));
        }
        if (cardOdhertySantos != null) {
            cardOdhertySantos.setOnClickListener(v -> openBuildingDetail("Archbishop O'Doherty & Cardinal Santos Building"));
        }
        if (cardJaimeSin != null) {
            cardJaimeSin.setOnClickListener(v -> openBuildingDetail("Cardinal Jaime Sin Building"));
        }
        if (cardReyesScience != null) {
            cardReyesScience.setOnClickListener(v -> openBuildingDetail("Archbishop Gabriel Reyes Science & Technology Center"));
        }
    }

    private void openBuildingDetail(String buildingName) {
        Toast.makeText(this, "Opening: " + buildingName, Toast.LENGTH_SHORT).show();
    }
}
