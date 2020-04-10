
import org.junit.Rule;

import org.junit.Test;

public class TestMaskEmail {
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void shouldTakeUserInput() {
            systemInMock.provideLines("(404) 443-8211", "another line");
            InputOutput inputOutput = new InputOutput();
            assertEquals("(404) 443-8211", inputOutput.getInput());
          }

    @Test
    public void canMaskString(){
        String str = str.maskString()
    }
}