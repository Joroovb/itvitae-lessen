public class Contact {
    private String voorNaam;
    private String achterNaam;
    private String telefoonNummer;

    public Contact(String voorNaam, String achterNaam, String telefoonNummer) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.telefoonNummer = telefoonNummer;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void validateVoorNaam() {
        if (this.voorNaam.isBlank())
            throw new RuntimeException("Voornaam kan niet null of leeg zijn");
    }

    public void validateAchterNaam() {
        if (this.achterNaam.isBlank())
            throw new RuntimeException("Achternaam kan niet null of leeg zijn");
    }

    public void validateTelefoonNummer() {
        if (this.telefoonNummer.isBlank()) {
            throw new RuntimeException("Telefoonnummer kan niet null of leeg zijn");
        }

        if (this.telefoonNummer.length() != 10) {
            throw new RuntimeException("Telefoonnummer moet 10 getallen lang zijn");
        }
        if (!this.telefoonNummer.matches("\\d+")) {
            throw new RuntimeException("Telefoonnummer kan alleen getallen bevatten");
        }
        if (!this.telefoonNummer.startsWith("0")) {
            throw new RuntimeException("Telefoonnummer moet met 0 beginnen");
        }
    }
}

