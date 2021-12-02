package edu.pnu.admin;

import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String fn, String ln, int jn) {
        firstName = fn;
        lastName = ln;
        jerseyNumber = jn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return jerseyNumber == player.jerseyNumber && firstName.equals(player.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, jerseyNumber);
    }

    @Override
    public String toString() {
        return "[" + lastName + ", " + firstName + " " + jerseyNumber + "]";
    }
}
