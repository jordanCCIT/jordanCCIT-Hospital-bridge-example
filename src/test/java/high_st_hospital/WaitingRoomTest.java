package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WaitingRoomTest {

	WaitingRoom underTest = new WaitingRoom();
	Patient testPatient1 = new Patient("111-11-1111");

	@Test
	public void shouldTakeNewPatients() {
		underTest.checkIn(testPatient1);
		assertThat(underTest.numberOfPatients(), is(1));
	}

	@Test
	public void shouldHaveTwoPatients() {
		Patient testPatient2 = new Patient("111-11-1112");
		underTest.checkIn(testPatient1);
		underTest.checkIn(testPatient2);
		assertThat(underTest.numberOfPatients(), is(2));
	}

	@Test
	public void shouldTransferToAnotherRoom() {
		Patient testPatient2 = new Patient();
		ErBay transferTo = new ErBay();
		underTest.checkIn(testPatient1);
		underTest.checkIn(testPatient2);
		underTest.transfer(testPatient1, transferTo);
		assertThat(underTest.numberOfPatients(), is(1));
		assertThat(transferTo.numberOfPatients(), is(1));
	}

	@Test
	public void shouldHave2PatientsTransferToERBay() {
		Patient testPatient2 = new Patient();
		ErBay transferTo = new ErBay();
		underTest.checkIn(testPatient1);
		underTest.checkIn(testPatient2);
		underTest.transfer(testPatient1, transferTo);
		underTest.transfer(testPatient2, transferTo);
		assertThat(underTest.numberOfPatients(), is(0));
		assertThat(transferTo.numberOfPatients(), is(2));
	}
}
