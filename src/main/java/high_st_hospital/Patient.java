package high_st_hospital;

public class Patient {

	private int health;
	private int bloods;

	public void improveHealth(int care) {
		health = +care;
	}

	public int getHealth() {
		return health;
	}

	public int getBloods() {

		return bloods;
	}

	public void giveBloods(int bloodDraw) {

		bloods = -bloodDraw;
	}

}
