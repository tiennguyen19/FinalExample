package nnt.exam.bai1;

public class BigDog extends SmallDog {

    public BigDog() {
    }

    public BigDog(String name, String color, String size) {
        super(name, color, size);
    }

    @Override
    public String makeSound() {
        return "woof woof woof";
    }
}
