import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("/Users/dheerosaur/Downloads ");
        list.add("/Users/dheerosaur/Documents ");
        list.add("/Users/dheerosaur/Pictures ");
        Stream<String> stream = list.stream().map(s -> s.trim());
        stream.forEach(System.out::println);
    }
}