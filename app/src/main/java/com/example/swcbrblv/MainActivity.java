package com.example.swcbrblv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Switch;


import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    Switch switch1;
    Switch switch2;
    CheckBox checkbox1;
    CheckBox checkbox2;
    RadioButton radiobutton1;
    RadioButton radiobutton2;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);
        checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        radiobutton1 = (RadioButton) findViewById(R.id.radioButton1);
        radiobutton2 = (RadioButton) findViewById(R.id.radioButton2);
        radiobutton2 = (RadioButton) findViewById(R.id.radioButton2);
        listview = (ListView) findViewById(R.id.listview1);

        final ArrayList<String> arrayList = new ArrayList<>();

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.clear();
                if (switch1.isChecked()){arrayList.add("Switch 1: Activado");}
                if (switch2.isChecked()){arrayList.add("Switch 2: Activado");}
                if (checkbox1.isChecked()){arrayList.add("CheckBox1: Seleccionado");}
                if (checkbox2.isChecked()){arrayList.add("CheckBox2: Seleccionado");}
                if (radiobutton1.isChecked()){arrayList.add("RadioButton 1: Seleccionado");}
                if (radiobutton2.isChecked()){arrayList.add("RadioButton 2: Seleccionado");}
                listview.setAdapter(adapter);
            }
        });

    }
}