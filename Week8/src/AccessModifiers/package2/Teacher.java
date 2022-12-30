package AccessModifiers.package2;

import AccessModifiers.package1.Human;

public class Teacher extends Human {


    public Teacher(String name, int age, String memories, String nickName) {
        super(name, age, memories, nickName);
    }

    Human human = new Human("George", 42, "Happy Moments", "GREGOR");
    Teacher teacher = new Teacher("Ali",44, "golf","nickname");

    void anyMethod(){
        System.out.println("public = " + human.name);
        System.out.println("protected = " + human.memories);
        System.out.println("default = " + human.nickName);
        System.out.println("private = " + human.age);

        System.out.println("public = " + teacher.name);
        System.out.println("protected = " + teacher.memories);
        System.out.println("default = " + teacher.nickName);
        System.out.println("private = " + teacher.age);
    }

    public static void main(String[] args) {

        Human human = new Human("George", 42, "Happy Moments", "GREGOR");
        Teacher teacher = new Teacher("Ali",44, "golf","nickname");

        System.out.println("public = " + human.name);
        System.out.println("protected = " + human.memories);
        System.out.println("default = " + human.nickName);
        System.out.println("private = " + human.age);

        System.out.println("public = " + teacher.name);
        System.out.println("protected = " + teacher.memories);
        System.out.println("default = " + teacher.nickName);
        System.out.println("private = " + teacher.age);
    }
}
