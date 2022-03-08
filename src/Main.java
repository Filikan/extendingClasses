public class Main {
    static void CallCatMiew(Cat c){
        c.doMiew();
    }

    static void CallVanCatMiew(VanCat c){
        c.doMiew();
    }

    static void CallAnkaraCatMiew(AnkaraCat c){
        c.doMiew();
    }

    static void  TheMiew(Cat c){
        c.doMiew();
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        VanCat c2 = new VanCat();
        //Polymorphic access
        Cat c3 = new VanCat();
        Cat c4 = new AnkaraCat();


        c1.doMiew();
        c2.doMiew();
        c2.FetchTheStick();
        System.out.println("Polymoprhic access");
        c3.doMiew();
        c4.doMiew();

        CallCatMiew(c1);
        CallVanCatMiew(c2);
        CallAnkaraCatMiew(new AnkaraCat());

        System.out.println("Polymoorphic access");
        TheMiew(c1);
        TheMiew(c2);
        TheMiew(c3);
        TheMiew(c4);
        TheMiew(new AnkaraCat());

        TheMiew(new VanCat());


    }
}
