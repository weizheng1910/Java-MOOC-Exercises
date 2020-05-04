
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> list;

    public ExerciseManagement() {
        this.list = new ArrayList<Exercise>();
    }

    public ArrayList exerciseList() {
        return this.list;
    }

    public void add(String name) {
        this.list.add(new Exercise(name));
    }

    public void markAsCompleted(String exercise) {
        Exercise target = new Exercise(exercise);
        for (Exercise eachExercise : list) {
            if (target.equals(eachExercise)) {
                eachExercise.markCompleted();
            }
        }

    }

    public boolean isCompleted(String exercise) {
        Exercise target = new Exercise(exercise);
        for (Exercise eachExercise : list) {
            if (target.equals(eachExercise)) {
                return eachExercise.isCompleted();
            }
        }

        return false;
    }

}
