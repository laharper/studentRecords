import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestCases {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSetTestScoresAll90s() {
        Student st1 = new Student("Bob", "Smith", "bob@bob.com");
        int[] scoresForBob = {90, 90, 90};
        st1.setTestScores(scoresForBob);
        double actualAverage = st1.getAverageScore();
        final double expectedAverage = 90.0;
        assertEquals (expectedAverage, actualAverage, "Average should be " + expectedAverage);

    }

    @Test
    //Not set test scores, but try to get the average
    void testSetTestScoresAllZeroes() {
        Student st1 = new Student("Bob", "Smith", "bob@bob.com");
        int[] scoresForBob = {0,0,0};
        st1.setTestScores(scoresForBob);
        double actualAverage = st1.getAverageScore();
        final double expectedAverage = 0.0;
        assertEquals (expectedAverage, actualAverage, "Average should be " + expectedAverage);

    }
}