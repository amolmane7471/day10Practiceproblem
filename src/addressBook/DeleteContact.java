package addressBook;
public class DeleteContact {
    ContactRepo contactRepo = ContactRepo.getInstance();
    public void removeContact(NewContact contactName){
        contactRepo.contactList.remove(contactName);
        System.out.println("Contact Deleted Successfully!");
    }
}
