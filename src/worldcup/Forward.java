package worldcup;

import java.util.Random;

/**
 * Class to define the forward
 */
public class Forward extends Player {
	public Forward(String position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	boolean killer;

	public void drible() {
		System.out.println("dribbling");
	}

	/**
	 * @return the killer
	 */
	public boolean isKiller() {
		return killer;
	}

	/**
	 * @param killer the killer to set
	 */
	public void setKiller(boolean killer) {
		this.killer = killer;
	}

	public void kickBall(Ball ball) {
		String[] effects = { "with spin", "too high", "off target", "straight to the keeper", "into the top corner",
				"with great power", "weak shot", "curled beautifully" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];
		System.out.println("kicking " + effect);
	}

}
