package edu.pnu.admin;

import edu.pnu.collection.*;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;
    private GenericList<Player> squad = new GenericList<Player>();

    public FootballClub(String fcName) {
        name = fcName;
    }

    public void addPlayer(Player fcPlayer) {
        squad.add(fcPlayer);
    }

    public void removeAllPlayer() {
        squad.reset();
    }

    public Player findPlayer(String firstName, int jerseyNumber) {
        final Player fcPlayer = new Player(firstName, "undefined", jerseyNumber);
        for (int i=0; i<squad.currentSize(); i++) {
            if (fcPlayer.equals(squad.get(i))) {
                return squad.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.currentSize() + "\n";
        for (int i=0; i<squad.currentSize(); i++) {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }
}
