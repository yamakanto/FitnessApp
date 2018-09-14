import com.example.fitnessapp.AddExerciseActivity;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String name;
    public final List<Exercise> exercises = new ArrayList<>();

    public enum ExerciseType {
        Reps, Time, RepsAndWeights, NotSelected
    }

    private AddExerciseActivity.ExerciseType type;

    public Exercise(String name, AddExerciseActivity.ExerciseType type) {
        this.name = name;
        this.type = type;
    }


    public AddExerciseActivity.ExerciseType getExerciseType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
