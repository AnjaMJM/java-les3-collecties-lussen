import java.util.*;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        Set<Integer> secretNumber = randomNumberGenerator();
        String stringNumber = setToStringConverter(secretNumber);
//        System.out.println(stringNumber);
        difficulty();
        feedback(stringNumber);


    }

    public static Set<Integer> randomNumberGenerator() {

        Random number = new Random();
        Set<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() < 4) {
            randomNumbers.add(number.nextInt(10));
        }

        return randomNumbers;
    }

    public static String setToStringConverter(Set<Integer> numbers) {

        StringBuilder alphabetic = new StringBuilder();
        for (Integer number : numbers) {
            alphabetic.append(number);
        }
        return alphabetic.toString();
    }

public static Integer turns;
public static void difficulty() {
      Scanner scanner = new Scanner(System.in);
    System.out.println("In hoeveel beurten kun jij de Mastermind verslaan?");

    turns=scanner.nextInt();

}

    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+ = juiste nummer op de juiste plek, \nO = juiste nummer verkeerde plek, \nX = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        for (int j = 0; j < turns; j++) {
            StringBuilder feedback = new StringBuilder();
            int turnsLeft = turns-j;

            String guess = scanner.nextLine();

            if (Objects.equals(guess, stringnumber)) {
                System.out.println("gefeliciteerd je hebt het goed in : " + (j+1) + " beurten");
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("0");
                    } else {
                        feedback.append("X");
                    }
                }
                System.out.println(feedback);
                System.out.println("Je hebt nog " + (turnsLeft-1) + " beurten over");
            }
        }
    }
}
