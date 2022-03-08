public class Orthopedic extends Surgeon{
    public void hipSurgery(){
        System.out.println("Hip surgery has been done.");
    }

    public void kneeSurgery(){
        System.out.println("Knee surgery has been done.");
    }

    @Override
    public void PerformOperation() {
        System.out.println("Orthopedic way of cutting.");
        //super.PerformOperation();
    }

    public Orthopedic(){
        super(); //call the Default Constructor
        System.out.println("Orthopedic Constructor.");
    }
}
