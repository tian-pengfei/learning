package pattern.design.factory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;


public class CheesePizza extends Pizza{

    public static void main(String[] args) {
        Path first = Paths.get("user/bin");
                Comparator<String> comp =
                        (first,second)-> first.length() - second.length() ;

    }

}
