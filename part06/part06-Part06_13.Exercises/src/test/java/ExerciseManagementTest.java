import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    // Own test unit
    @Test
    public void givenExercise_whenDeletingExistingExercise_thenItIsRemovedFromTheList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.add("Another exercise");

        assertTrue(management.exerciseList().contains("New exercise"));
        int sizeBeforeDeletion = management.exerciseList().size();

        management.remove("New exercise");

        assertEquals(sizeBeforeDeletion - 1, management.exerciseList().size());
        assertFalse(management.exerciseList().contains("New exercise"));
    }
}
