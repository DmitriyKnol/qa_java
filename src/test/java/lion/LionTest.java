package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline;
    private final String sex = "Самец";

    @Test
    public void getFoodLionIsPredator() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void getKittensLionIsGet() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,lion.getKittens());
    }
    @Test
    public void LionTestException() {
        Exception actualException = assertThrows(Exception.class, () ->
                new Lion("Найденыш", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", actualException.getMessage());
    }
}