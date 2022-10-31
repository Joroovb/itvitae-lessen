public class Kroeg {

    public boolean checkLeeftijd(int leeftijd) {
        if (leeftijd < 0) {
          throw new IllegalArgumentException("Jij bestaat nog niet!");
        } else if(leeftijd < 18) {
            return false;
        } else {
            return true;
        }
    }
}
