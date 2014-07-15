import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<Contact> addressBook;
    
    public AddressBook()
    {
        addressBook = new ArrayList<Contact>();
    }
    
    public void addContact(String name, String email, String tel, String address)
    {
        addressBook.add(new Contact(name, email, tel, address));
    }
    
    public void removeContact(int indexNum)
    {
        addressBook.remove(indexNum);
    }
    
    public void amendName(int indexNum, String newName)
    {
        addressBook.get(indexNum).setName(newName);
    }
    
    public void amendEmail(int indexNum, String newEmail)
    {
        addressBook.get(indexNum).setEmail(newEmail);
    }
    
    public void amendTel(int indexNum, String newTel)
    {
        addressBook.get(indexNum).setTel(newTel);
    }
    
    public void amendAddress(int indexNum, String newAddress)
    {
        addressBook.get(indexNum).setAddress(newAddress);
    }
    
    public void printAddressBook()
    {
        for(Contact contact : addressBook)
        {
            contact.printContact();
            System.out.println();
        }
    }


}
