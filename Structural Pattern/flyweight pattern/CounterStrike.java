import java.util.*;

interface Player {
	public void assignWeapon(String weapon);
	public void mission();
}

class Terrorist implements Player {
	
	private final String TASK;
	private String weapon;
	public Terrorist() {
		TASK = "PLANT A BOMB";
	}
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}
	public void mission() {
		System.out.println("Terrorist has weapon "
				+ weapon + " Task is " + TASK);
	}
}

class CounterTerrorist implements Player {
	
	private final String TASK;
	private String weapon;
	public CounterTerrorist() {
		TASK = "TO DIFFUSE BOMB";
	}
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}
	public void mission() {
		System.out.println("Counter Terrorist has weapon "
				+ weapon + " Task is " + TASK);
	}
}

class PlayerFactory {

	private static HashMap<String, Player> hm = new HashMap<String, Player>();
	public static Player getPlayer(String type) {
		Player p = null;
		if (hm.containsKey(type))
			p = hm.get(type);
		else {
			switch (type) {
				case "Terrorist":
					System.out.println("Terrorist Created");
					p = new Terrorist();
					break;
				case "CounterTerrorist":
					System.out.println("Counter Terrorist Created");
					p = new CounterTerrorist();
					break;
				default:
					System.out.println("Error");
			}
			hm.put(type, p);
		}
		return p;
	}
}

public class CounterStrike {
	private static String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static String[] weapons = { "AK-47", "Maverick", "Knife", "Desert Eagle" };
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			Player p = PlayerFactory.getPlayer(getRandPlayerType());
			p.assignWeapon(getRandWeapon());
			p.mission();
		}
	}
	public static String getRandPlayerType() {
		Random r = new Random();
		int randInt = r.nextInt(playerType.length);
		return playerType[randInt];
	}
	public static String getRandWeapon() {
		Random r = new Random();
		int randInt = r.nextInt(weapons.length);
		return weapons[randInt];
	}
}
