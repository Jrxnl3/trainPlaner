package de.jinx.trainplaner.obj;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private static List<Exercise> allExercises;
    private List<TrainingSchedule> allSchedules;

    final String excDir = System.getProperty("user.dir");
    final String cfgDir = excDir + "/configs";

    final String cfgFile = cfgDir + "/cfg.json";
    final String exercisesFile = cfgDir + "/excrcises.json";
    final String schedules = cfgDir + "/schedules.json";


    public Model() {
        allExercises = new ArrayList<>();
        allSchedules = new ArrayList<>();


        File cfgFolder = new File(cfgDir);
        if (!cfgFolder.exists())
            cfgFolder.mkdir();

        createFile(cfgFile);
        createFile(exercisesFile);
        createFile(schedules);

        loadExercises();
    }

    public void createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveExercises() {
        try {
            FileWriter file = new FileWriter(exercisesFile);
            file.write(new Gson().toJson(allExercises));
            file.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public void loadExercises(){
            Gson gson = new Gson();
            try {
                Reader reader = Files.newBufferedReader(Path.of(exercisesFile));
                allExercises = gson.fromJson(reader,new TypeToken<List<Exercise>>() {}.getType());

            }catch (Exception e){
                e.printStackTrace();
            }
    }

    public void addExercise(Exercise e) {
        allExercises.add(e);
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return  str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static List<Exercise> getAllExercises() {
        return allExercises;
    }

    public static int highestID(){
        int id = 0;
        for (Exercise e: allExercises) {
            if(e.getId() >= id){
                id = e.getId();
            }
        }
        return id + 1;
    }
}
