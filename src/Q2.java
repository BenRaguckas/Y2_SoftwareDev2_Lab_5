import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Address s_Address = new Address("United States","Washington","Seattle");
        DateOfBirth s_DOB = new DateOfBirth(27,11,1942);
        Person s_ID = new Person("Jimi","Hendrix",s_Address,18091970,'M',s_DOB);
        System.out.println("\nThis person will become a student.\n"+s_ID.toString());
        ArrayList<String> s_Subjects = new ArrayList<>(){{
                add("Rock");
                add("Blues");
                add("Metal");
        }};
        Student jimi = new Student(s_ID,1,"Garfield High School",s_Subjects);
        System.out.println("\n____________________\n"+jimi.toString());
        jimi.removeSubject("Metal");
        jimi.addSubject("R&B");
        System.out.println("\n____________________\n"+jimi.toString());
        jimi.setYear(2);
        jimi.addSubject("Psychedelic rock");
        System.out.println("\n____________________\n"+jimi.toString());
        Address s_Address2 = new Address("United Kingdom","London","Kensington");
        DateOfBirth s_DOB2 = new DateOfBirth(1,9,1970);
        Person s_ID2 = new Person("Johnny Allen","Hendrix",s_Address2,18091970,'M',s_DOB2);
        jimi.setPersonalDetails(s_ID2);
        System.out.println("\n____________________\n"+jimi.toString());
    }
}
