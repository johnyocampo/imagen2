package com.ocampojohny.imagen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu_Activity extends AppCompatActivity {

    final String[] lugares = new String[] {"Hoteles", "Bares", "Sitios", "Informacion demografica", "Acerca de"};
    ListView lstlugares;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);


        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, lugares);

        lstlugares=(ListView) findViewById(R.id.Lista_menu);
        lstlugares.setAdapter(adaptador);
        registrar_click();



    }


    public void registrar_click(){

        lstlugares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent in1 = new Intent(getApplicationContext(),
                        Hoteles_Activity.class);
                Intent in2 = new Intent(getApplicationContext(),
                        Bares_Activity.class);
                Intent in3 = new Intent(getApplicationContext(),
                        Sitios_Activity.class);
                Intent in4 = new Intent(getApplicationContext(),
                        Demografia_Activity.class);
                Intent in5 = new Intent(getApplicationContext(),
                        acercade_activity.class);


                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();


                if (itemSeleccionado.equals("Hoteles")) {
                    startActivity(in1);
                } else if (itemSeleccionado.equals("Bares")) {
                    startActivity(in2);
                } else if (itemSeleccionado.equals("Sitios")) {
                    startActivity(in3);
                } else if (itemSeleccionado.equals("Informacion demografica")) {
                    startActivity(in4);
                } else if (itemSeleccionado.equals("Acerca de")) {
                    startActivity(in5);
                }

                //Toast.makeText(getApplicationContext(), "Haz hecho click en " + itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
