import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test (expected = Exception.class)
    public void shouldThrowException() throws Exception {
        Lion lion = new Lion(mockedFeline, "");
        Boolean hasMane = lion.doesHaveMane();
    }

    @Mock
    Feline mockedFeline;

    @Test
    public void shouldGetKittens() throws Exception{
        Lion lion = new Lion(mockedFeline, "Самец");
        Mockito.when(mockedFeline.getKittens()).thenReturn(1);
        int kittens = lion.getKittens();
        Assert.assertEquals(1, kittens);
    }

}