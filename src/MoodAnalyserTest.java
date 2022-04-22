import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnWarning(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy",mood);
    }
}
