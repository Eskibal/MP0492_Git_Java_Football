package worldcup;

import java.util.Random;

/**
 *  Class to define the defender
 */
public class Defender extends Player {
	public Defender(String position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	boolean mark;


    public void steal(Ball ball){
    	String[] effects = { "with fault", "without fault" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];
        System.out.println("steals the ball " + effect);
    }

	/**
	 * @return the mark
	 */
	public boolean isMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(boolean mark) {
		this.mark = mark;
	}
}
