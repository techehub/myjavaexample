package p2;

public class Address extends Object{

    String houseno;
    String street;
    String district;
    String state;
    String country;


    public Address(String houseno, String street, String district, String state) {
        this.houseno = houseno;
        this.street = street;
        this.district = district;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseno='" + houseno + '\'' +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    String getFullAddress ()
    {
        return houseno + ", " + street + ", " + district +" ,"  + state;
    }
}
