package Project;

public class Dog {
    String dogName;
    String breed;
    int age;

    public Dog(String dogName, String breed){
        this.dogName = dogName;
        this.breed = breed;
        age = 1;
    }

    public Dog(String dogName, String breed, int age){
        this.dogName = dogName;
        this.breed = breed;
        this.age = age;
    }

    public void eat(){
        System.out.println(dogName + " is eating now...");
    }

    public void bark(){
        switch(breed){
            case "bulldog":
                if(age < 5)
                    System.out.println("blaff blaff");
                else
                    System.out.println("BLAFF BLAFF");
                break;
            case "retriever":
                if(age < 5)
                    System.out.println("wowff wowff");
                else
                    System.out.println("WOWFF WOWFF");
                break;
            case "poodle":
                if(age < 5)
                    System.out.println("huuh huuh");
                else
                    System.out.println("HUUH HUUH");
                break;
            case "chihuahua":
                if(age < 5)
                    System.out.println("yaff yaff");
                else
                    System.out.println("YAFF YAFF");
                break;
        }
    }
}

