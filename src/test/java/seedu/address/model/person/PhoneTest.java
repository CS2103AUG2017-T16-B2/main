package seedu.address.model.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhoneTest {

    @Test
    public void isValidPhone() {
        // invalid phone numbers
        assertFalse(Phone.isValidPhone("")); // empty string
        assertFalse(Phone.isValidPhone(" ")); // spaces only
        assertFalse(Phone.isValidPhone("91")); // less than 3 numbers
        assertFalse(Phone.isValidPhone("phone")); // non-numeric
        assertFalse(Phone.isValidPhone("9011p041")); // alphabets within digits
        assertFalse(Phone.isValidPhone("HIP: 9011041")); // Incorrect phone type
        assertFalse(Phone.isValidPhone("HOP: 9011041 Oll: 9893898 Hm: 971897")); // Multiple incorrect phone type

        // valid phone numbers
        assertTrue(Phone.isValidPhone("911")); // exactly 3 numbers
        assertTrue(Phone.isValidPhone("93121534"));
        assertTrue(Phone.isValidPhone("124293842033123")); // long phone numbers
        assertTrue(Phone.isValidPhone("93121234 15341234")); // spaces within digits
        assertTrue(Phone.isValidPhone("HP: 928782711")); // hand phone number
        assertTrue(Phone.isValidPhone("O: 9134343431")); // office number
        assertTrue(Phone.isValidPhone("H: 911")); // house number
        assertTrue(Phone.isValidPhone("O: 911 H: 972727 HP: 9234817")); // office number
    }
}
