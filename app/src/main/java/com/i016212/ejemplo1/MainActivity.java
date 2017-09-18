
package com.i016212.ejemplo1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time time = new time();
        time.execute();



    }

   public void  hilo()
   {
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

   }

   public void ejecutr()

   {
       time time = new time();
       time.execute();
   }

   public class time extends AsyncTask<Void,Integer,Boolean>

   {

       @Override
       protected Boolean doInBackground(Void... voids) {
           for (int i = 1; 1 < 3; i++)

           {
               hilo();
           }

       }


       @Override
       protected void onPostExecute(Boolean aBoolean) {
           ejecutr();
           Toast.makeText(MainActivity.this, "cada dos segundos",Toast.LENGTH_SHORT).show();
       }
   }
}



