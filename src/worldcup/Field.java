package worldcup;

/**
 * Class to define the player
 */
public class Field {
	int size;

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public Field(int size) {
		super();
		this.size = size;
	}
	
	public void light() {
		System.out.println(" switching the lights");
	}
	
}
