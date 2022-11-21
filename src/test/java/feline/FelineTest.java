package feline;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyIsCat() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensIsOne() {

        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensParameters() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void eatMeatIsPredator() throws Exception {
       assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
