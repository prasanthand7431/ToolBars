package com.vrikshatech.www.toolbars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.tool1);
        toolbar.setTitle("Welcome");
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Hello");
        //toolbar.setLogo(R.mipmap.logo);
        //toolbar.setNavigationIcon(R.mipmap.back);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        if (id==R.id.del){

            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
            return true;

        }
        if (id==R.id.ser){

            Toast.makeText(this, "search clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.loc){

            Toast.makeText(this, "location clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id==R.id.settings1){

            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;

        }
        if (id==R.id.home1){

            Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.contact1){

            Toast.makeText(this, "contactus clicked", Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
