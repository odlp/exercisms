import java.util.Random;

public class Robot {

    private String name;

    public Robot() {
        this.name = generateName();
    }

    public String getName() {
        return this.name;
    }

    public void reset() {
        this.name = generateName();
    }

    private String generateName() {
        return randomLetter() + randomLetter() + randomNumber() + randomNumber() + randomNumber();
    }

    private String randomNumber() {
        return String.valueOf(calcRandomInt(9));
    }

    private String randomLetter() {
        char randomChar = (char) (calcRandomInt(26) + 'a');
        return String.valueOf(randomChar);
    }

    private int calcRandomInt(int upto) {
        return new Random().nextInt(upto);
    }
}