import Exceptions.InvalidInputException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidInputException {
        Iris iris = new Iris();
        iris.start();;
        iris.add();
        iris.exit();
    }
}
