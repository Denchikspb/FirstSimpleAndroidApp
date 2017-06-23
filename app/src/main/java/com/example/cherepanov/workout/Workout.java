package com.example.cherepanov.workout;

/**
 * Created by cherepanov on 14.06.2017.
 */

public class Workout {
    private String name;
    private String description;


    public static final  Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Core Agony",
                    "bla\nasfaf\ndwedwe"),
            new Workout("The Wimp Special",
                    "5gggggfg\n1231s1s\nerg3g34g"),
            new Workout("Strenth and Lenth",
                    "d23d23d23d2\nopdsfdsopfd\ncnvmx,cnbmxc"),
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
