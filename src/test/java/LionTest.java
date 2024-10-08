import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    String sex = "Самец";

    @Mock
    Feline feline;

    @Test
    public void getKittensExpectedKittensCount() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        verify(feline, times(1)).getKittens();
    }

    @Test
    public void getFoodPredator() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        verify(feline, times(1)).eatMeat();
    }

    @Test
    public void generateLionException () throws Exception {
        Assert.assertThrows(Exception.class, () -> new Lion(sex.toLowerCase(), feline));
    }
}
