package com.example.zikseven67;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    private View viewBuildings;
    private View viewRoomSearch;
    private View viewClassSchedules;
    private View viewAnnouncements;
    private View viewStockInventory;
    private View viewEmergencyExits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        initViews();
        setupClickListeners();
    }

    private void initViews() {
        viewBuildings = findViewById(R.id.title_building);
        viewRoomSearch = findViewById(R.id.title_room);
        viewClassSchedules = findViewById(R.id.title_schedule);
        viewAnnouncements = findViewById(R.id.title_announcement);
        viewStockInventory = findViewById(R.id.title_stock);
        viewEmergencyExits = findViewById(R.id.title_emergency);
    }

    private void setupClickListeners() {
        if (viewBuildings != null) {
            View parent = (View) viewBuildings.getParent().getParent();
            parent.setOnClickListener(v -> {
                Intent intent = new Intent(dashboard.this, bldgndfacilities.class);
                startActivity(intent);
            });
        }

        if (viewRoomSearch != null) {
            View parent = (View) viewRoomSearch.getParent().getParent();
            parent.setOnClickListener(v -> 
                Toast.makeText(this, "Room Search Clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (viewClassSchedules != null) {
            View parent = (View) viewClassSchedules.getParent().getParent();
            parent.setOnClickListener(v -> 
                Toast.makeText(this, "Class Schedules Clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (viewAnnouncements != null) {
            View parent = (View) viewAnnouncements.getParent().getParent();
            parent.setOnClickListener(v -> 
                Toast.makeText(this, "Announcements Clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (viewStockInventory != null) {
            View parent = (View) viewStockInventory.getParent().getParent();
            parent.setOnClickListener(v -> 
                Toast.makeText(this, "Stock/Inventory Clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (viewEmergencyExits != null) {
            View parent = (View) viewEmergencyExits.getParent().getParent();
            parent.setOnClickListener(v -> 
                Toast.makeText(this, "Emergency Exits Clicked", Toast.LENGTH_SHORT).show()
            );
        }
    }
}
