package nnt.exam.bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    private final SmallDog smallDog = new SmallDog();
    private final BigDog bigDog = new BigDog();

    @Test
    @DisplayName("Kiem tra makeSound")
    public void makeSoundTest() {
        Assertions.assertEquals("woof woof", smallDog.makeSound());
        Assertions.assertEquals("woof woof woof", bigDog.makeSound());
    }

}