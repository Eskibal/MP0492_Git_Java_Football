package worldcup;

/**
 * Class to define the midfielder
 */
public class Midfielder extends Player {
	private boolean vision;

	/**
	 * @return the vision
	 */
	public boolean isVision() {
		return vision;
	}

	/**
	 * @param vision the vision to set
	 */
	public void setVision(boolean vision) {
		this.vision = vision;
	}

	public void organize() {
		System.out.println("organizing");
	}
}
