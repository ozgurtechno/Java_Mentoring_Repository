package AccessModifiers.package2;

import AccessModifiers.package1.Human;

public class DiffPackage {

    Human human = new Human("George", 42, "Happy Moments", "GREGOR");
    Teacher teacher = new Teacher("Ali",44, "golf","nickname");

    void anyMethod(){
        System.out.println("public = " + human.name);
//        System.out.println("protected = " + human.memories);
//        System.out.println("default = " + human.nickName);
//        System.out.println("private = " + human.age);

        System.out.println("public = " + teacher.name);
//        System.out.println("protected = " + teacher.memories);
//        System.out.println("default = " + teacher.nickName);
//        System.out.println("private = " + teacher.age);
    }

    public static void main(String[] args) {

        Human resident1 = new Human("George", 42, "Happy Moments", "GREGOR");
        Teacher teacher = new Teacher("Ali",44, "golf","nickname");

        System.out.println("public = " + resident1.name);
//        System.out.println("protected = " + resident1.memories);
//        System.out.println("default = " + resident1.nickName);
//        System.out.println("private = " + resident1.age);

        System.out.println("public = " + teacher.name);
//        System.out.println("protected = " + teacher.memories);
//        System.out.println("default = " + teacher.nickName);
//        System.out.println("private = " + teacher.age);
    }
}
