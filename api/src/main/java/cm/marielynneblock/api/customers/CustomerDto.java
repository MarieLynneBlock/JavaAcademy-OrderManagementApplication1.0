package cm.marielynneblock.api.customers;

public class CustomerDto {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    public CustomerDto(){
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public CustomerDto withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDto withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDto withAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerDto withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDto withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
