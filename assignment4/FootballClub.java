import java.util.ArrayList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private ArrayList<Player> squad = new ArrayList<Player>();

    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for (int i=0; i<squad.size(); i++) {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public FootballClub(String fcName) {
        this.name = fcName;
    }

    public Player findPlayer(String fName, int jNum) {
        final Player foundPlayer = new Player(fName, "temp", jNum);
        for (Player fcPlayer : squad) {
            if (fcPlayer.equals(foundPlayer)) {
                return fcPlayer;
            }
        }
        return null;
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
    }

    public void removeAllPlayer() {
        squad.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return name.equals(that.name) && squad.equals(that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }
}
