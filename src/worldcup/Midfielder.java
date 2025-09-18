package worldcup;

/**
 * Class to define the midfielder
 */
public class Midfielder extends Player {
	public Midfielder(String position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

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
