package org.mrt3216.scoutingapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    private Button mViewTeams;
    private FloatingActionButton mNewTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mViewTeams = (Button) findViewById(R.id.view_teams);
        mNewTeam = (FloatingActionButton) findViewById(R.id.new_team);
    }

    //mViewTeams.OnClickListener(new View.OnClickListener);
}
