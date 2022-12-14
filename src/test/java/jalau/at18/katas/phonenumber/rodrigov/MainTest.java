package jalau.at18.katas.phonenumber.rodrigov;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldReturnPhoneNumberRefactored() {
        String input = "1234567890";
        String expectedResult = "(123) 456-7890";

        Main main = new Main();
        assertEquals(expectedResult, main.phoneNumber(input));
    }
}
