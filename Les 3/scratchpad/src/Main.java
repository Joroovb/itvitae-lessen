public class Main {


    public static void main(String[] args) {
        Persoon p = new Persoon();
        p.setEmailAdres("joris.vanbreugel@code-cafe.nl");
        System.out.println(p.getEmailAdres("Hacker"));
    }
}

class Persoon { // encapsulation
    private String emailAdres; // private fields

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    //    public String getEmailAdres(String wachtwoord) { // public methods
//        if (wachtwoord.equals("wachtwoord")) {
//            return this.emailAdres;
//        }
//        System.out.println("Ongeldig wachtwoord!");
//        return null;
//    }
//
//    public void setEmailAdres(String emailAdres) {
//        if (!emailAdres.contains("@")) {
//            System.out.println("Ongeldig emailadres");
//            return;
//        }
//
//        this.emailAdres = emailAdres;
//    }
}

