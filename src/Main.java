public class Main {
    public static void main(String[] args) {
        System.out.println("************** Завдання 1 **************");
        Cat c = new Cat();
        c.voice();
        Dog d = new Dog();
        d.voice();
        Cow cw = new Cow();
        cw.voice();

        System.out.println("************** Завдання 2 **************");

        overloaded c1 = new overloaded();
        double A, B;

        c1.SetComplex(2.0, 3.0);

        System.out.println("A=" + c1.GetA() +" B=" + c1.GetB());

        overloaded c2 = c1.Mult();

        A = c2.GetA();
        B = c2.GetB();

        System.out.println("A=" + A +" B=" + B);

        c2 = c1.Mult(4);
        A = c2.GetA();
        B = c2.GetB();

        System.out.println("A=" + A +" B=" + B);

        c2 = c1.Mult(1, 3);
        A = c2.GetA();
        B = c2.GetB();

        System.out.println("A=" + A +" B=" + B);

        System.out.println("************** Завдання 3 **************");
        Frog f = new Frog();
        f.eat();
        f.sleap();
        f.swim();
        f.walk();
    }
}
