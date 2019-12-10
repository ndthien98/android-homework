package io.github.ndthien98.networking;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
//        GetTask getTask = new GetTask();
//        getTask.execute();
        String json = "\"name\":\"thien\"";
        try {
            JSONObject jsonObject = new JSONObject(json);

        } catch (Exception e) {

        }
    }
}

class GetTask extends AsyncTask<Void, Void, Boolean> {

    @Override
    protected Boolean doInBackground(Void... voids) {
        try {
            URL url = new URL("http://httpbin.org/get");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int resCOde = connection.getResponseCode();
            Log.d("TAG", "doInBackground: " + resCOde);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = buffer.readLine()) != null) {
                builder.append(line);
            }
            buffer.close();
            Log.d("TAG", "doInBackground: \n" + builder.toString());
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}