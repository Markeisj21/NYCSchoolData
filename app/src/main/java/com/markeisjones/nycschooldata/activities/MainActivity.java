package com.markeisjones.nycschooldata.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.markeisjones.nycschooldata.R;
import com.markeisjones.nycschooldata.model.SchoolSATScores;
import com.markeisjones.nycschooldata.adapters.RecylerViewAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL= "https://data.cityofnewyork.us/resource/734v-jeq5.json";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<SchoolSATScores> listSAT;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView_Main);
        jsonRequest();

    }

    private void jsonRequest() {
        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;

                for (int i = 0; i< response.length(); i++){
                    try{
                        jsonObject = response.getJSONObject(i);
                        SchoolSATScores schoolsatscores = new SchoolSATScores();
                        schoolsatscores.setDbn(jsonObject.getString("dbn"));
                        schoolsatscores.setNum_of_sat_test_takers(jsonObject.getInt("num_of_sat_test_takers"));
                        schoolsatscores.setSat_critical_reading_avg_score(jsonObject.getInt("sat_critical_reading_avg_score"));
                        schoolsatscores.setSat_math_avg_score(jsonObject.getInt("sat_math_avg_score"));
                        schoolsatscores.setSat_writing_avg_score(jsonObject.getInt("sat_writing_avg_score"));
                        schoolsatscores.setSchool_name(jsonObject.getString("school_name"));
                        listSAT.add(schoolsatscores);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }
                setuprecylerview(listSAT);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
            requestQueue = Volley.newRequestQueue(MainActivity.this);


    }

    private void setuprecylerview(List<SchoolSATScores> listSAT) {
        RecylerViewAdapter myadapter = new RecylerViewAdapter(this,listSAT);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);




    }

}
