package final_Keyword;

public class Cat extends Animal{

    private String type;
    public String name;

    public Cat(String type, String name) {
        this.type = type;
        this.name = name;
    }

    //    @Override
//    public void tirmala() {
//        System.out.println("Parent class daki kullanimdan farkli, baska bir islem yapiyorum...");
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
