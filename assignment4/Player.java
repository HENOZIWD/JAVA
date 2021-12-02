import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String fName, String lName, int jNum) {
        firstName = fName;
        lastName = lName;
        jerseyNumber = jNum;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + " " + jerseyNumber + "]";
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
}