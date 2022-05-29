package hu.progmatic;

public class Recipe {

    private String name;
    private String difficulty;
    public int preparationTime;
    private boolean vegan;

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", preparationTime=" + preparationTime +
                ", vegan=" + vegan +
                '}';
    }

    public Recipe(String name, String difficulty, int preparationTime, boolean vegan) {
        this.name = name;
        this.difficulty = difficulty;
        this.preparationTime = preparationTime;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }


}
