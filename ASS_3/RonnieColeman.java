package ASS_3;

import java.util.ArrayList;
import java.util.List;

public class RonnieColeman {
    List<String> trainingList = new ArrayList<>();

    RonnieColeman() {
        trainingList.add("Incline Bench Press 250lbs 8/4");
        trainingList.add("Squats 300lbs 10/3");
        trainingList.add("Deadlift 500lbs 12/4");
    }
    public List<String> getTrainingList() {
        return trainingList;
    }
}

