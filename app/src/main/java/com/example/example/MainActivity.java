package com.example.example;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.Arrays;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(ListView)findViewById(R.id.ttt);
String a[]={"5 semester","6 semester","7 semester","8 semester"};
ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,Arrays.asList(a));

     c.setAdapter(arrayAdapter);
     c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         Intent in=new Intent(MainActivity.this,MainActivity2.class);
         @Override

         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             if(position==0){
                 Toast.makeText(MainActivity.this,"semester 5 clicked",Toast.LENGTH_LONG).show();
                 String ab[]={"MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY","COMPUTER NETWORK AND SECURITY","DATABASE MANAGEMENT SYSTEM"
                         ,"AUTOMATA THEORY AND COMPUTABILITY","APPLICATION DEVELOPMENT USING PYTHON","UNIX PROGRAMMING","COMPUTER NETWORK LABORATORY",
                         "DBMS LABORATORY WITH MINI PROJECT","ENVIRONMENTAL STUDIES"};

                 in.putExtra("g",ab);
                 in.putExtra("key",5);

             }
             if(position==1){
                 Toast.makeText(MainActivity.this,"semester 6 clicked",Toast.LENGTH_LONG).show();
                 String ab[]={"SYSTEM SOFTWARE AND COMPILERS","COMPUTER GRAPHICS AND VISUALIZATION","WEB TECHNOLOGY AND ITS APPLICATIONS",
                         "(PE)DATA MINING AND DATA WAREHOUSING","(PE)OBJECT ORIENTED MODELING AND DESIGN","(PE)CLOUD COMPUTING AND IT'S APPLICATION",
                         "(PE)ADVANCED JAVA AND J2EE","(PE)SYSTEM MODELLING AND SIMULATION","(OPEN ELECTIVE)MOBILE APPLICATION DEVELOPMENT",
                         "(OPEN ELECTIVE)INTRODUCTION TO DATA STRUCTURE AND ALGORITHM","(OPEN ELECTIVE)PROGRAMMING IN JAVA","(OPEN ELECTIVE)INTRODUCTION TO OPERATING SYSTEM",
                         "SYSTEM SOFTWARE LABORATORY","COMPUTER GRAPHICS LABORATORY WITH MINI PROJECT","MOBILE APPLICATION DEVELOPMENT"


                 };

                 in.putExtra("g",ab);
                 in.putExtra("key",6);
             }
             if(position==2) {
                 Toast.makeText(MainActivity.this, "semester  7 clicked", Toast.LENGTH_LONG).show();
                 String ab[] = {"ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING", "BIG DATA AND ANALYTICS", "SOFTWARE ARCHITECTURE AND DESIGN PATTERNS", "HIGH PERFORMANCE COMPUTING",
                         "ADVANCED COMPUTER ARCHITECTURES", "USER INTERFACE DESIGN", "DIGITAL IMAGE PROCESSING", "NETWORK MANAGEMENT", "NATURAL LANGUAGE PROCESSING", "CRYPTOGRAPHY",
                         "ROBOTIC PROCESS AUTOMATION DESIGN & DEVELOPMENT", "INTRODUCTION TO BIG DATA ANALYTICS","PYTHON APPLICATION PROGRAMMING", "INTRODUCTION TO ARTIFICIAL INTELLIGENCE", "INTRODUCTION TO DOT NET FRAMEWORK FOR APPLICATION DEVELOPMENT",
                         "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING LABORATORY"};

                 in.putExtra("g", ab);
                 in.putExtra("key", 7);
             }
             if(position==3) {
                 Toast.makeText(MainActivity.this, "semester  8 clicked", Toast.LENGTH_LONG).show();
                 String ab[] = {"INTERNET OF THINGS","MOBILE COMPUTING","STORAGE AREA NETWORKS","NOSQL DATABASE","MULTICORE ARCHITECTURE AND PROGRAMMING",};

                 in.putExtra("g", ab);
                 in.putExtra("key", 8);
             }


                 startActivity(in);

         }
     });
    }
}