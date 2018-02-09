package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WaitingRoomTest {

	WaitingRoom underTest = new WaitingRoom();
	Patient testPatient1 = new Patient();

	@Test
	public void shouldTakeNewPatients() {
		underTest.checkIn(testPatient1);
		assertThat(underTest.numberOfPatients(), is(1));
	}

	// @Test
	// public void shouldHaveTwoPatients() {
	// Patient testPatient2 = new Patient();
	// underTest.checkIn(testPatient1);
	// underTest.checkIn(testPatient2);
	// assertThat(underTest.numberOfPatients(), is(2));
	// }
	//
	// @Test
	// public void shouldTransferToAnotherRoom() {
	// Patient testPatient2 = new Patient();
	// HospitalRoom transferTo = new ErBay();
	// underTest.checkIn(testPatient1);
	// underTest.checkIn(testPatient2);
	// underTest.transfer(testPatient1, transferTo);
	// assertThat(underTest.numberOfPatients(), is(1));
	// assertThat(transferTo.numberOfPatients(), is(1));
	// }
}
