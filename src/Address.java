public class Address {
    private static String Address_Line1 = "Address_Line1";  // Address should always contain at least 1 Address line with line2 and 3 optional
    private static String Address_Line2 = null;
    private static String Address_Line3 = null;
    private static String County = "County";    // Address should always contain County
    private static String Country = "Country";  // Address should always contain Country
    public Address(){}  // Initialize basic address
    public Address(String country,String county,String address_line1){  // Initialize address with 1 Address line
        Country = country;
        County = county;
        Address_Line1 = address_line1;
    }
    public Address(String country,String county,String address_line1,String address_line2){ // Initialize address with 2 Address lines
        Country = country;
        County = county;
        Address_Line1 = address_line1;
        Address_Line2 = address_line2;
    }
    public Address(String country,String county,String address_line1,String address_line2,String address_line3){    // Initialize address with 3 Address lines
        Country = country;
        County = county;
        Address_Line1 = address_line1;
        Address_Line2 = address_line2;
        Address_Line3 = address_line3;
    }
    public static void setAddress_Line1(String address){
        Address_Line1 = address;
    }
    public static boolean setAddress_Line2(String address){ // Checks if Address_Line 1 Exists before setting Address line 2
        if(Address_Line1 != null){
            Address_Line2 = address;
            return true;
        }
        else
            return false;
    }
    public static boolean setAddress_Line3(String address){ // Checks if Address_Line 2 Exists before setting Address line 3
        if(Address_Line2 != null){
            Address_Line3 = address;
            return true;
        }
        else
            return false;
    }
    public static String getAddress_Line1() {
        return Address_Line1;
    }   // Return variables
    public static String getAddress_Line2() {
        return Address_Line2;
    }
    public static String getAddress_Line3() {
        return Address_Line3;
    }
    public static String getCounty() {
        return County;
    }
    public static String getCountry() {
        return Country;
    }
    public static void setCounty(String county) {
        County = county;
    }   // Set country and county
    public static void setCountry(String country) {
        Country = country;
    }
    @Override
    public String toString(){   // Print address lined up. Also check for each address line and if to print it.
        if (this.Address_Line2 == null)
            return Address_Line1+"\n         "+County+"\n         "+Country;
        else if (this.Address_Line3 == null)
            return Address_Line1+"\n         "+Address_Line2+"\n         "+County+"\n         "+Country;
        else
            return Address_Line1+"\n         "+Address_Line2+"\n         "+Address_Line3+"\n County"+County+"\n         "+Country;
    }
}