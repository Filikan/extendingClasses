public class Doctor extends Human{
    public String Degree;
    public String title;

    public void Examination(){
        System.out.println("");
    }

    public void Diagnosis(){
        System.out.println("It is diagnosed.");
    }

    public void writePrescription(){
        System.out.println("Prescription was written.");
    }

    public Doctor(){
        super("Doctor","Civan");
        System.out.println("Doctor Constructor.");
    }
}
