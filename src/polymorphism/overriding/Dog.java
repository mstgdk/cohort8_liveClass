package polymorphism.overriding;


public class Dog extends Animal {
    //overrridng içiçn inheritance şarttır.
    //method bodyt değiştirilir


    @Override
    public void breath() {
        System.out.println("Dog breath metot çalıştı");
    }
}
