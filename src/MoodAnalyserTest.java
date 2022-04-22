import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy",mood);
    }
    
    @Test
    public void givenNullMood_ShouldReturnWarning() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            String mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("NULL",mood);
        }
        catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }
}
