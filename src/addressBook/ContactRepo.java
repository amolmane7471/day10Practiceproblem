package addressBook;
import java.util.ArrayList;
import java.util.List;

public class ContactRepo {
    private static ContactRepo instance;
    ContactRepo(){

    }
    public static ContactRepo getInstance(){
        if(instance == null){
            instance = new ContactRepo();
        }
        return instance;
    }

    List<NewContact> contactList = new ArrayList<NewContact>();

    void addContact(NewContact newContact){
        contactList.add(newContact);
    }
    List<NewContact> getContactList(){
       return contactList;
    }
    void printAllContact(List<NewContact> contactList){
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
    NewContact getContact(String name){
        for ( int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).name.equals(name) ){
                return contactList.get(i);
            }
        }
        return null;
    }
    boolean checkContact(String name){
        for (int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).name.equals(name)){
                return true;
            }
        }
        return false;
    }
}
