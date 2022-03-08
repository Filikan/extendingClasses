public class Main {

    public static void main(String[] args) {
        Orthopedic or1=new Orthopedic();
        Surgeon s1 = new Surgeon();
        or1.hipSurgery();
        Human h1 = new Orthopedic();
        Object obj = new Orthopedic();
        MicroSurgeon ms = new MicroSurgeon();

        Orthopedic orth = (Orthopedic) obj;
        orth.kneeSurgery();

        s1.PerformOperation();
        orth.PerformOperation();
        ms.PerformOperation();
    }
}
