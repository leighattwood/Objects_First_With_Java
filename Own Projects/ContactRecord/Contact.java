
public class Contact
{
    private String name;
    private String email;
    private String tel;
    private String address;
    
    public Contact(String name, String email, String tel, String address)
    {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getTel()
    {
        return tel;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public void setTel(String newTel)
    {
        tel = newTel;
    }
    
    public void setAddress(String newAdd)
    {
        address = newAdd;
    }
    
    public void printContact()
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Tel: " + tel);
        System.out.println("Address: " + address);
    }

}
