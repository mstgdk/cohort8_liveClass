package encapsulation;

public class Student {
   private String name;
   private final int age = 20;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

   /* public void setAge(int age) {
        this.age = age;
    }*/
}
