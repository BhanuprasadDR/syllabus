package com.example.example;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
ListView c;
TextView t;
String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c=(ListView)findViewById(R.id.fith);
        t=(TextView)findViewById(R.id.textView3);
        Intent i=getIntent();
        String a[]=i.getStringArrayExtra("g");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, Arrays.asList(a));
        int d=i.getIntExtra("key",0);
        String h=i.getStringExtra("k1");
        if(d==5){
            t.setText("5th SEMESTER SUBJECTS ");
        }
        else if(d==6){
            t.setText("6th SEMESTER SUBJECTS ");
        }

        c.setAdapter(arrayAdapter);

        c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if(d==5){

                    if (position == 0) {

                        link = "https://drive.google.com/file/d/17VwOiHoyMlRBJNaZWHqXZF_o74FEfpfR/view?usp=drivesdk";
                    } else if (position == 1) {
                        link = "https://drive.google.com/file/d/178R5YsslmUKXMrKQfBeUAhGktn7KupR_/view?usp=drivesdk";
                    } else if (position == 2) {
                        link = "https://drive.google.com/file/d/17FZ7UOEx13kV9353JyjxR7IJXnWnF62E/view?usp=drivesdk";
                    } else if (position == 3) {
                        link = "https://drive.google.com/file/d/16vc-J32WaZ0dXywrdHYc3b6IliDxuQV0/view?usp=drivesdk";
                    } else if (position == 4) {
                        link = "https://drive.google.com/file/d/16vOrEMNDouErxl2BNVk3fOXnDmi2J-Sv/view?usp=drivesdk";
                    } else if (position == 5) {
                        link = "https://drive.google.com/file/d/186LbUhDDMV7ETOOcFi8LXD7TAKBSvaYV/view?usp=drivesdk";
                    } else if (position == 6) {
                        link = "https://drive.google.com/file/d/176T1HkVaZoCr-J-6bz8YBEPVZm2QeQla/view?usp=drivesdk";
                    } else if (position == 7) {
                        link = "https://drive.google.com/file/d/17JKJhs7CEf61bj7zof-plmNwqUSZf7aX/view?usp=drivesdk";
                    } else if (position == 8) {
                        link = "https://drive.google.com/file/d/17NsW7v3Tc8YECGFC3cDG2mte9MpIInFe/view?usp=drivesdk";
                    }
                }
              else if(d==6){

                  if (position == 0) {
                      link = "https://drive.google.com/file/d/17nwmxi5jM1sbAhEd10Mo7lB0K3sp5IgO/view?usp=drivesdk";
                  } else if (position == 1) {
                      link = "https://drive.google.com/file/d/172wwi-OUzCR5_rWOXBKx2FR4a3GJcQRg/view?usp=drivesdk";
                  } else if (position == 2) {
                      link = "https://drive.google.com/file/d/188RvHakHH5FI7c3516wB1_tzrBTrQi4q/view?usp=drivesdk";
                  } else if (position == 3) {
                      link = "https://drive.google.com/file/d/17Jsonq8MCCRWJgRDDEBdnYg2X56uTxwR/view?usp=drivesdk";
                  } else if (position == 4) {
                      link = "https://drive.google.com/file/d/17hdpRQ8IBZLI8JnDJKXFh-FsefJbfvJT/view?usp=drivesdk";
                  } else if (position == 5) {
                      link = "https://drive.google.com/file/d/13-zJfIzaRKEftdc0jHmVGu_AboUQRPRH/view?usp=drivesdk";
                  } else if (position == 6) {
                      link = "https://drive.google.com/file/d/16v7pu-UXKrlCQoPm6CUZG6cEhqlskJJl/view?usp=drivesdk";
                  } else if (position == 7) {
                      link = "https://drive.google.com/file/d/17tYQqE5Y95N5Sei_xJEEaBNEptcDwk9_/view?usp=drivesdk";
                  } else if (position == 8) {
                      link = "https://drive.google.com/file/d/17UYRiymxslY8Sdnke9mU7mDUVDoDk6MI/view?usp=drivesdk";

                  }
                  else if (position == 9) {
                      link = "https://drive.google.com/file/d/17Ql0aACYCdoxk5-hCADLydSRwul4HjPC/view?usp=drivesdk";
                  } else if (position == 10) {
                      link = "https://drive.google.com/file/d/17hpAjK1Rp0BwNnzt1CWMGK5j3HJxuins/view?usp=drivesdk";
                  } else if (position == 11) {
                      link = "https://drive.google.com/file/d/17nWP8hu-LugoytB_Agw0hDJQgL_lDUsK/view?usp=drivesdk";
                  } else if (position == 12) {
                      link = "https://drive.google.com/file/d/17-4n9xbOEE1eZWdR6duvZbUj3-CmJIh6/view?usp=drivesdk";
                  } else if (position == 13) {
                      link = "https://drive.google.com/file/d/17nI_YeLLuJjrQbMlCsx7iD-1Kc0evpM4/view?usp=drivesdk";
                  }

                  }
              else if(d==7){
                  if (position == 0) {
                      link = "https://drive.google.com/file/d/1krtHgVHun7Ffyur36ghtrjpZiX0g3aI9/view?usp=drive_link";
                  }
                  else if (position == 1) {
                      link = "https://drive.google.com/file/d/1JwRTqUM1S4o0GNLqP5nfYtDTJVoFOMWl/view?usp=drive_link";
                  }
                  else if (position == 2) {
                      link = "https://drive.google.com/file/d/13L0X5TpYx-2Bupt_QEe6NfzvXrAX7H5-/view?usp=drive_link";
                  }
                  else if (position == 3) {
                      link = "https://drive.google.com/file/d/19LTa1OnRkXe7wkhbSg__B7C3pRxmGHaX/view?usp=drive_link";
                  }
                  else if (position == 4) {
                      link = "https://drive.google.com/file/d/1AOOQcSw01_LELQH2-GbBmedEeRuE3Bi8/view?usp=drive_link";
                  }
                  else if (position == 5) {
                      link = "https://drive.google.com/file/d/14ufe8UYH6hLxTCeL72QqCYOugsWn5ckY/view?usp=drive_link";
                  }
                  else if (position == 6) {
                      link = "https://drive.google.com/file/d/1Nvfammutu3gWwmPGKm7POq11T5jlAiRq/view?usp=drive_link";
                  }
                  else if (position == 7) {
                      link = "https://drive.google.com/file/d/1p-hg_lsYYSrPDwR7HdJ-wNWyFDA2M7fF/view?usp=drive_link";
                  }
                  else if (position == 8) {
                      link = "https://drive.google.com/file/d/1cv1EgbYFFqwAMh4nnTjR7Rw-Qjfqz6jm/view?usp=drive_link";
                  }
                  else if (position == 9) {
                      link = "https://drive.google.com/file/d/11JXLPKPTIA5qd9YAVVMC3jbolqXpVllG/view?usp=drive_link";
                  }
                  else if (position == 10) {
                      link = "https://drive.google.com/file/d/1lHW0JkVIIReBDTULuFhSMOPnxexiB987/view?usp=drive_link";
                  }
                  else if (position == 11) {
                      link = "https://drive.google.com/file/d/1T7pMjT2GpJFuyrYfOpHtdu7Q7w0RrLMK/view?usp=drive_link";
                  }
                  else if (position == 12) {
                      link = "https://drive.google.com/file/d/126ZuemGAs-wscYoLOlan-uMjqVKhTQJx/view?usp=drive_link";
                  }
                  else if (position == 13) {
                      link = "https://drive.google.com/file/d/1rCHmh_DzhxWMsAjM5JxW9kMSnrgX2Kvc/view?usp=drive_link";
                  }
                  else{
                      link="https://drive.google.com/file/d/14u-t7RA9MqGiIJFDeGxIYRIQuwCUAmt7/view?usp=drive_link";
                  }



              }
              else if(d==8){
                  if(position==0){
                      link="https://drive.google.com/file/d/14m4CHFkxTgMda0TwC_XomNHQTJyUZ9d5/view?usp=drive_link";
                  }
                  else if(position==1){
                      link="https://drive.google.com/file/d/13o6z_7Qqo29KqM5SynZFf1PMWEuK0AO_/view?usp=drive_link";
                  }
                  else if(position==2){
                      link="https://drive.google.com/file/d/1cpsKlTlzn3Rg6sGwu-L5QvX4jFaD3uiZ/view?usp=drive_link";
                  }
                  else if(position==3){
                      link="https://drive.google.com/file/d/1UsgkbasTqFDE9SzmJuDwv9r9EvO8rAJ9/view?usp=drive_link";
                  }
                  else {
                      link="https://drive.google.com/file/d/1qDdQuQxcCssNX3yApq9a44E9ORc2XYcb/view?usp=drive_link";
                  }
              }

                Toast.makeText(MainActivity2.this,"clicked",Toast.LENGTH_LONG).show();


                    Intent in=new Intent(MainActivity2.this,FifthSyllabus.class);
                    in.putExtra("j",link);
                    startActivity(in);
            }
        });

    }
}