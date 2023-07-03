package Tasks.school;

public class Address {

    public String address;
    public String city;
    public int zipCode;


    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
