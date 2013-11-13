import com.ztaticvienn.employeecontrol.Company;
import com.ztaticvienn.employeecontrol.EmployeeGenerator;
import com.ztaticvienn.employeecontrol.Gender;
import com.ztaticvienn.employeecontrol.WrongArgumentException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Michail
 * Date: 12.11.13
 * Time: 1:38
 * To change this template use File | Settings | File Templates.
 */
public class CompanyEmployeeListActionsTest {
    private Company mycompany;

    @Before
    public void runBeforeEveryTest() {
        mycompany = new Company();

    }
    @Test(expected = WrongArgumentException.class)
    public void shouldThrowExceptionWhenAddHourlyWageEmpWithWrongYear() throws WrongArgumentException {
        mycompany.addHourlyWageEmployee(1, "John", "Smith", 545, 32, 23, Gender.MALE, 13.0);

    }

    @Test(expected = WrongArgumentException.class)
    public void shouldThrowExceptionWhenAddFixedSalaryEmpWithWrongMonth() throws WrongArgumentException {
        mycompany.addFixedSalaryEmployee(1, "John","Smith",1960,66,23, Gender.MALE,13.0);

    }

    @Test
    public void shouldAddOneFixedSalaryEmployee() throws WrongArgumentException{
        mycompany.addFixedSalaryEmployee(1,"John","Smith",1960,02,24,Gender.MALE,2500.0);
        int counter=0;
        Iterator itr = mycompany.getIterator();
        while(itr.hasNext()){
            counter++;
            itr.next();
        }
        assertEquals(1,counter);

    }

    @Test
    public void shouldNotAddEmployeeWithAlreadyExistingId() throws WrongArgumentException {
        mycompany.addFixedSalaryEmployee(1,"John","Smith",1960,02,24,Gender.MALE,2500.0);

        assertFalse(mycompany.addFixedSalaryEmployee(1, "John", "Doe", 1985, 10, 11, Gender.MALE, 2500.0));
    }

    @Test
    public void shouldRemoveEmployeeFromList() throws WrongArgumentException {
        mycompany.addFixedSalaryEmployee(1,"John","Smith",1960,02,24,Gender.MALE,2500.0);

        assertTrue(mycompany.deleteEmployee(1));
    }

    @Test
    public void shouldNotRemoveAnyEmployeeFromList() throws WrongArgumentException {
        mycompany.addFixedSalaryEmployee(1,"John","Smith",1960,02,24,Gender.MALE,2500.0);

        assertTrue(mycompany.deleteEmployee(1));
    }

    @After
    public void runAfterEveryTest() {
        mycompany = null;

    }
}
