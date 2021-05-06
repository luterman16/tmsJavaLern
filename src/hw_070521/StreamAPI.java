package hw_070521;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        Collections.addAll(text, "Masha", "ABBA", "Gektor", "ANNA");

        List<String> text2 = text.stream()
                .filter((s1-> s1.equals(new StringBuilder(s1).reverse().toString())))
                .collect(Collectors.toList());
    }

}
