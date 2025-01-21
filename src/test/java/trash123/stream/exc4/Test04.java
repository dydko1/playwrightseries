package trash123.stream.exc4;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04 {

    @Test
    public void generateNumber() {
        Stream<Double> generateNumber = Stream
                .generate(Math::random)
                .limit(2);

        generateNumber.forEach(System.out::println);
    }

    @Test
    public void streamIterate() {
        Stream<Integer> numbers = Stream
                .iterate(10,n->n+20)
                        .limit(2);

        numbers.forEach(System.out::println);
    }


    @Test
    public void streamOFString() {
        Stream<String> splitStream = Pattern
                .compile("#")
                .splitAsStream("Miro#tubył#Ala");

        splitStream.forEach(System.out::println);
    }

    @Test
    public void smallCapital(){

        List<String> list=Stream.of("DDDS","DSFDS","dsfdsf","DDD","ddFFF")
                .map(String::toLowerCase)
                .toList();
        System.out.println(list);
    }

    @Test
    public void compare2List(){
        List<String> list= new ArrayList<>();
        list.add("aa");
        list.add("bb");
        List<String> list2=new ArrayList<>();
        list2.add("aa");
        list2.add("bb");

        list.removeAll(list2);
        System.out.println(list.size());

    }


}