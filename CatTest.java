import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {

@Test
    public void shouldGetSoundMeow(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

    Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void shouldGetPredatorFoodMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
