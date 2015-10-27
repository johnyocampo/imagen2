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

import java.util.List;

public class Sitios_Activity extends AppCompatActivity {

    final String[] sitios_turisticos =new String[] {"Catedral","Parque de la Musica","Conservatorio","Parque Centenario","Jardin Botanico"};
    ListView lstsitios_turisticos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_);

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,sitios_turisticos);
        lstsitios_turisticos=(ListView) findViewById(R.id.Lista_sitios);
        lstsitios_turisticos.setAdapter(adaptador);
        registrar_click();

    }

    private void registrar_click() {

        lstsitios_turisticos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in1 = new Intent(getApplicationContext(),
                        Catedral_Activity.class);
                Intent in2 = new Intent(getApplicationContext(),
                        ParqueMusica_Activity.class);
                Intent in3 = new Intent(getApplicationContext(),
                        Conservatorio_Activity.class);
                Intent in4 = new Intent(getApplicationContext(),
                        Centenario_Activity.class);

                Intent in5 = new Intent(getApplicationContext(),
                        Jardin_Activity.class);


                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();


                if (itemSeleccionado.equals("Catedral")) {
                    startActivity(in1);
                } else if (itemSeleccionado.equals("Parque de la Musica")) {
                    startActivity(in2);
                } else if (itemSeleccionado.equals("Conservatorio")) {
                    startActivity(in3);
                }else if (itemSeleccionado.equals("Parque Centenario")) {
                    startActivity(in4);
                }else if (itemSeleccionado.equals("Jardin Botanico")) {
                    startActivity(in5);
                };



            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sitios_, menu);
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
