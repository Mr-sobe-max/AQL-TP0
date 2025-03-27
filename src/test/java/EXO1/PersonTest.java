package EXO1;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO1.Person;

public class PersonTest {

    @Test
    public void testGetFullName() {
        Person person = new Person("Alice", "Dupont", 25);
        assertEquals("Alice Dupont", person.getFullName(), "Alice Dupont");
    }

    @Test
    public void testIsAdult_WhenAgeIs18OrMore() {
        Person person = new Person("Bob", "Martin", 18);
        assertTrue("Une personne de 18 ans doit être considérée comme adulte", person.isAdult());
    }

    @Test
    public void testIsAdult_WhenAgeIsLessThan18() {
        Person person = new Person("Charlie", "Durand", 17);
        assertFalse(person.isAdult(), "Une personne de 17 ans ne doit pas être considérée comme adulte");
    }
}

