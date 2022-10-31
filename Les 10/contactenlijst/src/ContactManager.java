import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

    public void addContact(String voorNaam, String achterNaam, String telefoonNummer) {
        Contact contact = new Contact(voorNaam, achterNaam, telefoonNummer);
        validateContact(contact);
        checkIfContactAlreadyExist(contact);
        contactList.put(generateKey(contact), contact);
    }

    public Collection<Contact> getAllContacts() {
        return contactList.values();
    }

    private void checkIfContactAlreadyExist(Contact contact) {
        if (contactList.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact Already Exists");
    }

    private void validateContact(Contact contact) {
        contact.validateVoorNaam();
        contact.validateAchterNaam();
        contact.validateTelefoonNummer();
    }

    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getVoorNaam(), contact.getAchterNaam());
    }
}

