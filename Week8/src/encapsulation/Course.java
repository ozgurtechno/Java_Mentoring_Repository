package encapsulation;

public class Course {

    private String name;
    private int minScore;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int minScore) {
        this.name = name;
        this.setMinScore(minScore);
    }

    // --------------------------------- Getter - Setter --------------------------------------------------------

    public void setMinScore(int minScore) {  // Kurallarimi kendim belirliyorum...
        if (minScore < 50){
            return;
        }
        this.minScore = minScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
