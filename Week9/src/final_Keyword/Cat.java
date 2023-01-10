package final_Keyword;

public class Cat extends Animal{

    private String type;
    public String name;

    public Cat(String type) {
        this.type = type;
    }

    @Override
    public void tirmala() {
        System.out.println("Cat sinifinda farkli bir islem yapmam gerekiyor...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
