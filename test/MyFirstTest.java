import org.junit.Assert;
import org.junit.Test;

//Static import
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyFirstTest {


    @Test
        public void firstTest() {

        BankAccount test1 = new BankAccount(100);
        test1.deposit(100);
        test1.withdraw(100);

        //Below is depreciated
        //Assert.assertEquals(100,test1.getBalance());
        }

}
