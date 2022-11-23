package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;
    private final boolean hasMane;

    public LionSexTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters(name = "Sex = {0}, hasMane = {1}")
    public static Object[][] setSex() {
         return new Object[][]{
                 {"Самец", true},
                 {"Самка", false},
                 {"Найденыш", true}
        };
    }

    @Mock
    Feline feline;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
            public void setSexOfLion() throws Exception {

        if (!sex.equals("Самец") && !sex.equals("Самка")) {
            try {
                Lion lion = new Lion(sex, feline);
                lion.doesHaveMane();
            } catch (Exception e) {
                assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
            }
        } else {
            Lion lion = new Lion(sex, feline);
            assertEquals(hasMane,lion.doesHaveMane());
        }
    }
}
