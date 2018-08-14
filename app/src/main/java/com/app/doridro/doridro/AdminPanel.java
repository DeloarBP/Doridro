package com.app.doridro.doridro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AdminPanel extends AppCompatActivity {
    private String catagory, releseYear;
    private String[] catagoryes, releseYears;
    private Button userListBtn, pendingCommentBtn, saveAdminBtn;
    Spinner catagorySP, releseYearSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        userListBtn = findViewById(R.id.userListBtn);
        pendingCommentBtn = findViewById(R.id.pendingApprovalBtn);
        saveAdminBtn = findViewById(R.id.saveAdminBtn);

        Spinner catagorySP = findViewById(R.id.catagorySP);
        Spinner releseYearSP = findViewById(R.id.releseYearSP);
        catagoryes = getResources().getStringArray(R.array.catagorys_string);
        releseYears = getResources().getStringArray(R.array.relese_years_string);

        userListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUser = new Intent(AdminPanel.this,UserList.class);
                startActivity(intentUser);

            }
        });
        pendingCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentComment = new Intent(AdminPanel.this,PendingCommentList.class);
                startActivity(intentComment);

            }
        });
        saveAdminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSaveAdmin = new Intent(AdminPanel.this,AdminPanel.class);
                startActivity(intentSaveAdmin);

            }
        });
        ArrayAdapter<String> adapterCatagory = new ArrayAdapter<>(AdminPanel.this, android.R.layout.simple_list_item_1, catagoryes);
        catagorySP.setAdapter(adapterCatagory);

        catagorySP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                catagory = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapterReleseYear = new ArrayAdapter<>(AdminPanel.this, android.R.layout.simple_list_item_1, releseYears);
        catagorySP.setAdapter(adapterReleseYear);
        releseYearSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                releseYear = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
