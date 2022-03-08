public class VanCat extends Cat{

    int Age=10;

    @Override
    public void doMiew() {
        super.doMiew();
        System.out.println("I am the boss");
        this.Age = 10;
        this.FetchTheStick();
    }

    public void FetchTheStick(){
        System.out.println("Woff woff bringing the stick.");
    }
}
