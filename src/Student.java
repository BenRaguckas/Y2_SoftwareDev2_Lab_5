import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> subjects; // Student variables
    private int year;
    private String school;
    public Student(){}
    public Student(int year, String school, ArrayList<String> subjects){    // Create student with specified information
        this.year = year;
        this.school = school;
        this.subjects = subjects;
    }
    public Student(Person person, int year, String school, ArrayList<String> subjects){ // Create student with specified person and student information
        super.copy(person);
        this.year = year;
        this.school = school;
        this.subjects = subjects;
    }
    public void setPersonalDetails(Person person){  // Sets full person details for student.
        super.copy(person);
    }
    //  Basic setters and getters
    public String getPersonalDetails(){
        return super.toString();
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public ArrayList<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
    //  Add and remove subjects. Returns boolean depending on success
    public boolean addSubject(String subject){
        if(subjects.contains(subject))
            return false;
        else {
            subjects.add(subject);
            return true;
        }
    }
    public boolean removeSubject(String subject){
        if(subjects.contains(subject)) {
            subjects.remove(subjects.indexOf(subject));
            return true;
        }
        else {
            return false;
        }
    }
    //  Print function utilizing person print and attaching student details.
    @Override
    public String toString() {
        String info = super.toString() + "\n=== Student info ===";
        if (school != null)
            info += "\nSchool: " + school;
        else
            info += "\nSchool is not assigned.";
        if (year == 0)
            info += "\nThe year is not assigned.";
        else {
            info += "\nYear " + year;
            if (subjects != null) {
                info += " subjects: ";
                for (String subject : subjects)
                    info += subject + "\n                 ";
            } else {
                info += "There are no subjects assigned.\n";
            }
        }
        return info;
    }
}
