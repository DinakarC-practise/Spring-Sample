import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMaskNum {
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
    public void canConstructStringBuilder() {

        StringBuilder builder = new StringBuilder();
        assertThat(builder.capacity(), is(16));
        assertThat(builder.toString().length(), is(0));

        // capacity is space allocated in memory, not the string length
        // StringBuilder will automatically resize
        StringBuilder sblen = new StringBuilder(512);
        assertThat(sblen.capacity(), is(512));
        assertThat(sblen.toString().length(), is(0));

        StringBuilder sb = new StringBuilder("hello");
        assertThat(sb.toString().length(), is(5));
    }

    @Test
    public void appendToStringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("> ");
        builder.append(1);
        builder.append(" + ");
        builder.append(2);
        char[] ca = {' ', '=', ' ', '3'};
        builder.append(ca);

        assertThat(builder.toString(), is("> 1 + 2 = 3"));
    }

}
