import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        Address l_Address = new Address("Brazil","Cork","Oak street");
        DateOfBirth l_DOB = new DateOfBirth(12,6,1962);
        Person l_ID = new Person("Lecture","Lecturson",l_Address,25647559,'M',l_DOB);
        System.out.println(l_ID.toString());
        ArrayList<String> l_Subjects = new ArrayList<>(){{
            add("Maths");
            add("Graphics");
        }};
        Lecturer lect = new Lecturer(l_ID,"Engineering","DCU",l_Subjects);
        System.out.println("\n======================\n"+lect.toString());
        lect.addSubject("Physics");
        lect.setOffice("Engineering and Informatics");
        lect.setSchool("AIT");
        System.out.println("\n======================\n"+lect.toString());
    }
}
