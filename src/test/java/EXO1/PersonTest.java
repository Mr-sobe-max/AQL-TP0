package EXO1;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.example.com.EXO1.Person;

class PersonTest {
    @Test
    void getFullNameShouldReturnFirstNameAndLastName() {
        Person person = new Person("John", "Doe", 25);
        assertEquals("John Doe", person.getFullName());
    }

    @Test
    void getFullNameShouldHandleEmptyFirstName() {
        Person person = new Person("", "Doe", 25);
        assertEquals(" Doe", person.getFullName());
    }

    @Test
    void getFullNameShouldHandleEmptyLastName() {
        Person person = new Person("John", "", 25);
        assertEquals("John ", person.getFullName());
    }

    @Test
    void getFullNameShouldThrowNullPointerExceptionForNullFirstName() {
        Person person = new Person(null, "Doe", 25);
        assertThrows(NullPointerException.class, person::getFullName);
    }

    @Test
    void getFullNameShouldThrowNullPointerExceptionForNullLastName() {
        Person person = new Person("John", null, 25);
        assertThrows(NullPointerException.class, person::getFullName);
    }

    @Test
    void isAdultShouldReturnTrueForAgeGreaterOrEqualTo18() {
        Person person = new Person("John", "Doe", 18);
        assertTrue(person.isAdult());
        person = new Person("John", "Doe", 25);
        assertTrue(person.isAdult());
    }

    @Test
    void isAdultShouldReturnFalseForAgeLessThan18() {
        Person person = new Person("John", "Doe", 17);
        assertFalse(person.isAdult());
        person = new Person("John", "Doe", 0);
        assertFalse(person.isAdult());
    }

    @Test
    void isAdultShouldHandleNegativeAge() {
        Person person = new Person("John", "Doe", -1);
        assertFalse(person.isAdult());
    }
}

