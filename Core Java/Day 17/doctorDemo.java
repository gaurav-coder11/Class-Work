/*
Create a program in java to implement multilevel inheritance and hierarchical inheritance.

   Take classes like: Doctor, Surgeon and Nurse
*/
class Doctor {
    public void treatment() {
        System.out.println("This is Doctor");
    }
}

class Surgeon extends Doctor {
    @Override
    public void treatment() {
        super.treatment(); // Invoke the treatment method of the superclass (Doctor)
        System.out.println("Doctor is a Surgeon");
    }
}

class Nurse extends Surgeon {
    @Override
    public void treatment() {
        super.treatment(); // Invoke the treatment method of the superclass (Surgeon)
        System.out.println("Doctor is a Nurse");
    }
}

public class DoctorDemo {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.treatment(); // Call the treatment method of the Nurse class
    }
}
