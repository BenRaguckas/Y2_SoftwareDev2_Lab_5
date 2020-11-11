import java.util.ArrayList;

public class Lecturer extends Person {  // For the most part identical to Student
    private ArrayList<String> subjects;
    private String school;
    private String office;
    public Lecturer(){}
    public Lecturer(String office, String school, ArrayList<String> subjects){
        this.office = office;
        this.school = school;
        this.subjects = subjects;
    }
    public Lecturer(Person person, String office, String school, ArrayList<String> subjects){
        super.copy(person);
        this.office = office;
        this.school = school;
        this.subjects = subjects;
    }
    public void setPersonalDetails(Person person){
        super.copy(person);
    }
    public ArrayList<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
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
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    @Override
    public String toString() {
        String info = super.toString() + "\n=== Lecturer Info ===";
        if (school != null)
            info += "\nSchool: " + school;
        else
            info += "\nSchool is not assigned.";
        if (office == null)
            info += "\nOffice is not assigned.";
        else
            info += "\nOffice: " + office;
        if (subjects != null) {
            info += "\nSubjects: ";
            for (String subject : subjects)
                info += subject + "\n          ";
        }
        else {
            info += "There are no subjects assigned.\n";
        }
        return info;
    }
}
