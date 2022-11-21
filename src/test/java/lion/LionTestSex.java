package lion;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestSex {

    private final String sex;
    private final boolean hasMane;

    public LionTestSex(String sex, boolean hasMane) {
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

    @Test
            public void setSexOfLion() throws Exception {

        if (!sex.equals("Самец") && !sex.equals("Самка")) {
            try {
                Lion lion = new Lion(sex);
                lion.doesHaveMane();
            } catch (Exception e) {
                assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
            }
        } else {
            Lion lion = new Lion(sex);
            assertEquals(hasMane,lion.doesHaveMane());
        }
    }
}
