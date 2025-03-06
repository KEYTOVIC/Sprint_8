import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testTooShortName() {
        Account account = new Account("Ти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testTooLongName() {
        Account account = new Account("Тимоти Шаламе и его семья");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNoSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testSpaceAtStart() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testSpaceAtEnd() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testMultipleSpaces() {
        Account account = new Account("Тимоти   Шаламе");
        assertFalse(account.checkNameToEmboss());
    }
}

