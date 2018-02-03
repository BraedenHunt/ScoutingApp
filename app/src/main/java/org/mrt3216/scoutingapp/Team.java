package org.mrt3216.scoutingapp;

import java.util.ArrayList;

/**
 * Created by Braeden on 2/2/2018.
 */

public class Team {
    private String name;
    private int teamNumber;

    private boolean climbs;
    private boolean parks;
    private int scaleBoxes;
    private int switchBoxes;

    private boolean crossesLine;
    private int autoBoxes;

    private ArrayList<Match> matches = new ArrayList<Match>();


    public Team(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Team(String name, int teamNumber) {
        this.name = name;
        this.teamNumber = teamNumber;
    }

}
