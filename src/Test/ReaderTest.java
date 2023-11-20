package Test;

import Projekt.Reader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {
    @Test
    public void testAvlasare(){
        Reader data = new Reader();
        data.avlasare("Hej");
        data.avlasare("Hej igen");

        assertEquals(11, data.getAntalTecken());
        assertEquals(2, data.getAntalRader());
        assertEquals("Hej\nHej igen\n", data.getInputText());
    }
}

