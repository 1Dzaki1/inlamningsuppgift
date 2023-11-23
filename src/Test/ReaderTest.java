package Test;

import Projekt.Reader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {
    @Test
    public void testGetAntalTecken() {
        Reader data = new Reader();
        data.avlasare("Hej");
        data.avlasare("Hej igen");

        assertEquals(11, data.getAntalTecken());
    }

    @Test
    public void testGetAntalRader() {
        Reader data = new Reader();
        data.avlasare("Test");
        data.avlasare("Av antal rader.");

        assertEquals(2, data.getAntalRader());
    }

    @Test
    public void testGetInputText() {
        Reader data = new Reader();
        data.avlasare("Testar");
        data.avlasare("Input text");

        assertEquals("Testar\nInput text\n", data.getInputText());
    }

}




