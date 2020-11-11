public class Person {
    private String firstName = "FirstName";
    private String lastName = "LastName";
    private Address address = new Address();
    private DateOfBirth DOB = new DateOfBirth();
    private long PhoneNumber = 0;
    private char Gender = 'F';
    public Person(){}   // Initialize basic Person
    public Person(String first_name,String last_name,Address address,long phone_number,char gender,DateOfBirth dob){    // Creates person with specified address and DoB entries
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        PhoneNumber = phone_number;
        Gender = gender;
        DOB = dob;
    }
    //  Creates a person with specified Address and ability to enter DoB
    public Person(String first_name,String last_name,Address address,long phone_number,char gender,int dob_d,int dob_m,int dob_y){
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        PhoneNumber = phone_number;
        Gender = gender;
        DOB = new DateOfBirth(dob_d,dob_m,dob_y);
    }
    //  This one is for creating Person by entering each value for Address and DoB individually
    public Person(String first_name,String last_name,String country,String county,String address_line1,String address_line2,String address_line3,long phone_number,char gender,int dob_d,int dob_m,int dob_y){
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = new Address(country,county,address_line1,address_line2,address_line3);
        PhoneNumber = phone_number;
        Gender = gender;
        DOB = new DateOfBirth(dob_d,dob_m,dob_y);
    }
    public void copy(Person p){ // Copies person information provided. Mostly used by Student and Lecturer
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.address = p.address;
        this.PhoneNumber = p.PhoneNumber;
        this.Gender = p.Gender;
        this.DOB = p.DOB;
    }
    //  Getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public DateOfBirth getDOB() {
        return DOB;
    }
    public void setDOB(DateOfBirth DOB) {
        this.DOB = DOB;
    }
    public long getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public char getGender() {
        return Gender;
    }
    public void setGender(char gender) {
        Gender = gender;
    }
    //  Print out person information utilizing Address and DoB string functions
    @Override
    public String toString(){
        if (this.PhoneNumber == 0)
            return firstName+" "+lastName+" "+Gender+"\nBorn: "+DOB.toString()+"\nAddress: "+address.toString();
        else
            return firstName+" "+lastName+" "+Gender+"\nBorn: "+DOB.toString()+"\nPhone: "+PhoneNumber+"\nAddress: "+address.toString();
    }
}
