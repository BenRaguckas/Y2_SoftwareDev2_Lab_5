import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        DateOfBirth date = new DateOfBirth(16,8,40,true);
        Address address = new Address("Roman Empire","Central Rome","Some alley");
        Person Stan = new Person("Stan   ","Idle",address,0,'M',date);
        Scanner sc = new Scanner(System.in);
        System.out.println("Does stan want babies ? (true/false)");
        boolean Stan_wantsBabies = sc.nextBoolean();
        boolean Stan_oppressed = false;
        boolean Stan_sad = false;
        System.out.println("Francis:  Why are you always on about women, Stan?");
        if (Stan.getGender()=='M') {
            System.out.println(Stan.getFirstName()+":  (pause) I want to be one.");
            System.out.println("Reg:      What?");
            System.out.println(Stan.getFirstName()+":  I want to be a woman.  From now on I want you all to call me Loretta.");
            Stan.setFirstName("Loretta");
            System.out.println("Reg:      What!?");
        }
        if (Stan.getGender() =='M') {
            System.out.println(Stan.getFirstName() + ":  It's my right as a man.");
            System.out.println("Judith:   Why do you want to be Loretta, Stan?");
        }
        if (Stan_wantsBabies) {
            System.out.println(Stan.getFirstName() + ":  I want to have babies.");
            System.out.println("Reg:      You want to have babies?!?!?!");
            if (Stan.getGender() =='M') {
                System.out.println(Stan.getFirstName() + ":  It's every man's right to have babies if he wants them.");
                System.out.println("Reg:      But you can't have babies.");
                Stan_oppressed=true;
            }
            if (Stan_oppressed) {
                System.out.println(Stan.getFirstName() + ":  Don't you oppress me !");
                if (Stan.getGender()=='M'){
                    System.out.println("Reg:      I'm not oppressing you, Stan -- you haven't got a womb.  Where's the\n" +
                            "          fetus going to gestate?  You going to keep it in a box?");
                    Stan_sad=true;
                }
            }
            if(Stan_sad)
                System.out.println(Stan.getFirstName() + ":  *starts crying*");
            System.out.println("Judith:   Here!  I've got an idea.  Suppose you agree that he can't actually\n" +
                    "          have babies, not having a womb, which is nobody's fault, not even the\n" +
                    "          Romans', but that he can have the *right* to have babies.\n" +
                    "Francis:  Good idea, Judith.  We shall fight the oppressors for your right to\n" +
                    "          have babies, brother.  Sister, sorry.\n" +
                    "Reg:      (pissed)  What's the *point*?\n" +
                    "Francis:  What?\n" +
                    "Reg:      What's the point of fighting for his right to have babies, when he\n" +
                    "          can't have babies?\n" +
                    "Francis:  It is symbolic of our struggle against oppression.\n" +
                    "Reg:      It's symbolic of his struggle against reality.");
        }
        else{
            System.out.println(Stan.getFirstName() + ":  I simply do!");
        }

    }
}
