/* Notes: Keyword super can be used to call a superclass's constructor and methods.
Superclass method can be called in a subclass using the keyword super.
 */

public class Customer
{
    private String name;
    private String address;

    public Customer(String n, String a)
    {
        name = n;
        address = a;
    }

    public String toString()
    {
        return "Name: " + name + "\nAddress: " + address;
    }

    public static void main(String[] args)
    {
        Customer c = new Customer("Fran Santiago", "123 Main St., Anytown, USA");
        System.out.println(c);

        // Uncomment these to test OnlineCustomer
        // OnlineCustomer c2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
        // System.out.println(c2);
    }
}

// Complete the OnlineCustomer class to inherit from Customer
// It should have an email attribute,
// a constructor with 3 arguments (name, address, email) that uses the super constructor,
// and an overriden toString() method that calls the super toString() method
//  and then prints "\nEmail:" and the email variable.
class OnlineCustomer extends Customer
{
    private String emailAddress;

    public OnlineCustomer(String n, String a, String email) {
        super(n, a);
        emailAddress = email;
    }

    public String toString() {
        return super.toString() + "\nEmail: " + emailAddress;
    }
}

