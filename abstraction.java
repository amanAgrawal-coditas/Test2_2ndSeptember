package Test2_2ndSeptember;
abstract class Animal{
    abstract void display();
    abstract void characterisation();
    void properties()
    {
        System.out.println("This is a propery of a animal");
    }
}
        class mammal extends Animal
        {

            @Override
            void display()
            {
                super.properties();
                System.out.println("This is my mammal class");
            }

            @Override
            void characterisation()
            {
                System.out.println("Mammal is an Animal");
            }
        }
public class abstraction {
    public static void main(String[] args) {
        mammal mammal=new mammal();
        mammal.characterisation();
        mammal.display();
    }
}
