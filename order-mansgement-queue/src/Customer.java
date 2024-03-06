public class Customer {
    private  String email;
    private  String name;
    private  String address;
    private  String city;
    private  String province;
    private  String country;
    private  String postalCode;
    private  String contact;


    //default constructor
    public Customer() {
    }

    //Initialize properties - parameterized constructor
    public Customer(String email, String name, String address, String city, String province, String country, String postalCode, String contact) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
        this.contact = contact;
    }

    //getter method to get email
    public String getEmail() {
        return this.email;
    }

    public void displayInfo() {
        System.out.println("Email: " + this.email);
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("Province: " + this.province);
        System.out.println("Country: " + this.country);
        System.out.println("Postal Code: " + this.postalCode);
        System.out.println("Contact: " + this.contact);
    }
}
