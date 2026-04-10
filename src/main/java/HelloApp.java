import java.awt.*;
public class HelloApp {
    public static void main(String[] args) {
        StringBuilder namesBuilder = new StringBuilder();

        if (args.length == 0) {
            namesBuilder.append("World");
        } else {
            for (String name : args) {

                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
        }

        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}