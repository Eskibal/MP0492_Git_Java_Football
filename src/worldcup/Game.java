package worldcup;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Class to define the game
 */
public class Game {

	Field field;
	Date date;
	Ball ball;
	ArrayList<Team> teams;

	/**
	 * @return the field
	 */
	public Field getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(Field field) {
		this.field = field;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the teams
	 */
	public ArrayList<Team> getTeams() {
		return teams;
	}

	/**
	 * @param teams the teams to set
	 */
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	public static void main(String[] args) {

		System.out.println("starting application");
		// create game
		Game game = new Game();
		game.setField(new Field(100));
		game.setDate(new Date());
		game.setBall(new Ball());

		// create players team A
		ArrayList<Player> listA = new ArrayList<Player>();
		listA.add(new Goalkeeper());
		// create 4 defender players for teamA
		listA.add(new Defender());
		listA.add(new Defender());
		listA.add(new Defender());
		listA.add(new Defender());
		// create 4 midfielder players for teamA
		listA.add(new Midfielder());
		listA.add(new Midfielder());
		listA.add(new Midfielder());
		listA.add(new Midfielder());
		// create 2 forward players for teamA
		listA.add(new Forward());
		listA.add(new Forward());

		// create players team B
		ArrayList<Player> listB = new ArrayList<Player>();
		listB.add(new Goalkeeper());
		// create 4 defender players for teamA
		listB.add(new Defender());
		listB.add(new Defender());
		listB.add(new Defender());
		listB.add(new Defender());
		// create 4 midfielder players for teamA
		listB.add(new Midfielder());
		listB.add(new Midfielder());
		listB.add(new Midfielder());
		listB.add(new Midfielder());
		// create 2 forward players for teamA
		listB.add(new Forward());
		listB.add(new Forward());

		// create teams
		Team teamA = new Team("NewTeam");
		teamA.setPlayers(listA);
		teamA.setCoach(new Coach());
		Team teamB = new Team("Maped");
		teamB.setPlayers(listB);
		teamB.setCoach(new Coach());

		// add teams to game
		ArrayList<Team> teams = new ArrayList<Team>();
		teams.add(teamA);
		teams.add(teamB);
		game.setTeams(teams);

		// start game
		game.start();
	}

	public void start() {
		System.out.println("starting match actions...");

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println("\n--- Action " + (i + 1) + " ---");

			// select random team
			int teamIndex = rand.nextInt(teams.size());
			Team selectedTeam = teams.get(teamIndex);
			System.out.println("Team: " + selectedTeam.getName());

			// select random player
			ArrayList<Player> players = selectedTeam.getPlayers();
			int playerIndex = rand.nextInt(players.size());
			Player selectedPlayer = players.get(playerIndex);
			System.out.println("Player type: " + selectedPlayer.getClass().getSimpleName());

			// common actions
			selectedPlayer.run();
			selectedPlayer.passBall();

			// specific actions
			if (selectedPlayer instanceof Forward) {
				((Forward) selectedPlayer).drible();
				((Forward) selectedPlayer).kick(this.getBall());
			} else if (selectedPlayer instanceof Midfielder) {
				((Midfielder) selectedPlayer).organize();
			} else if (selectedPlayer instanceof Defender) {
				((Defender) selectedPlayer).steal(this.getBall());
			} else if (selectedPlayer instanceof Goalkeeper) {
				((Goalkeeper) selectedPlayer).block(this.getBall());
			}
		}
	}

}
