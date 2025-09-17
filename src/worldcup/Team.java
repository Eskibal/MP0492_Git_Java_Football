package worldcup;

import java.util.ArrayList;

/**
 * Class to define the team
 */
public class Team {
    String name;
    Coach coach;
    ArrayList<Player> players;    
    
    public void play(){
            System.out.println("playing");
        }

    public Team(String name) {
		super();
		this.name = name;
	}

	public void attack(){
        System.out.println("attacking");
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the coach
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * @param coach the coach to set
	 */
	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
    
}
