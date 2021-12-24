import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    Feline feline = new Feline();

    @Test (expected = Exception.class)
    public void shouldThrowExceptionMale() throws Exception {
        Lion lion = new Lion(feline, "");
        Boolean hasMane = lion.doesHaveMane();
    }

@Mock
Feline mockFeline;
@Test
public void shouldGetKittens() throws Exception {
    Lion lion = new Lion(mockFeline, "Самец");
    Mockito.when(lion.getKittens()).thenReturn(1);
    int kittens = lion.getKittens();
    Assert.assertEquals(1, kittens);

}
    @Test
    public void shouldGetPredatorFood() throws Exception {

        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}

