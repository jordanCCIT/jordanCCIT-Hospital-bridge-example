package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WaitingRoomTest {
    WaitingRoom underTest = new WaitingRoom();
    Patient testPatient1 = new Patient("111-11-1111");

    @Test
    public void shouldTakeNewPatient(){
        underTest.checkIn(testPatient1);
        assertEquals(underTest.numberOfPatients(),1);
    }

    @Test
    public void shouldHaveTwoPatients(){
        Patient testPatient2 = new Patient("111-11-1112");
        underTest.checkIn(testPatient1);
        underTest.checkIn(testPatient2);
        assertEquals(underTest.numberOfPatients(),2);
    }

    @Test
    public void shouldTransferToAnotherRoom(){
        Patient testPatient3 = new Patient("111-111-1113");
        ErBay transferTo = new ErBay();
        underTest.checkIn(testPatient1);
        underTest.checkIn(testPatient3);
        underTest.transfer(testPatient3,transferTo);
        assertEquals(underTest.numberOfPatients(),1);
        assertEquals(transferTo.numberOfPatients(),1);
    }

    @Test
    public void shouldHaveTwoPatientsTransferToErbay(){
        Patient testPatient4 = new Patient("111-111-1114");
        ErBay transferTo = new ErBay();
        underTest.checkIn(testPatient1);
        underTest.checkIn(testPatient4);
        underTest.transfer(testPatient1,transferTo);
        underTest.transfer(testPatient4,transferTo);
        assertEquals(underTest.numberOfPatients(),0);
        assertEquals(transferTo.numberOfPatients(),2);
    }
}
