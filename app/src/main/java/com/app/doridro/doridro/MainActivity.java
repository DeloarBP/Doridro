package com.app.doridro.doridro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                Toast.makeText(this,"Hello Search",Toast.LENGTH_LONG).show();
                break;

            case R.id.login:
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                Toast.makeText(this,"Hello Login",Toast.LENGTH_LONG).show();
                break;

            case R.id.reg:
                Toast.makeText(this,"Hello Register",Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(),User_Registation.class);
                startActivity(intent1);
             break;

        }
        return super.onOptionsItemSelected(item);
    }
}
