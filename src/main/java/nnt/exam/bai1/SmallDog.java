package nnt.exam.bai1;

public class SmallDog implements IAnimal{

    private String name;
    private String color;
    private String size;

    public SmallDog(){
        super();
    }

    public SmallDog(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String makeSound() {
        return "woof woof";
    }
}
