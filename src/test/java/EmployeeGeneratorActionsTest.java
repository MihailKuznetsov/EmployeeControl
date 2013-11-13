import com.ztaticvienn.employeecontrol.Company;
import com.ztaticvienn.employeecontrol.EmployeeGenerator;
import com.ztaticvienn.employeecontrol.Gender;
import com.ztaticvienn.employeecontrol.WrongArgumentException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Michail
 * Date: 12.11.13
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeGeneratorActionsTest {
    private Company mycompany;
    private EmployeeGenerator empGen;
    @Before
    public void runBeforeEveryTest() {
        mycompany = new Company();
        empGen = new EmployeeGenerator();
    }
    @Test(expected = WrongArgumentException.class)
    public void shouldThrowExceptionWhenEmployeeAmountIsBelow1() throws WrongArgumentException {
        empGen.fillEmployeeList(-6,mycompany);

    }

    @Test
    public void shouldAddOneEmployee() throws WrongArgumentException{
        empGen.fillEmployeeList(1,mycompany);
        int counter=0;
        Iterator itr = mycompany.getIterator();
        while(itr.hasNext()){
            counter++;
            itr.next();
        }
        assertEquals(1,counter);

    }


    @After
    public void runAfterEveryTest(){
        mycompany = null;
        empGen = null;
    }
}

