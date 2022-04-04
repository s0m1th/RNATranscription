import java.util.HashMap;
import java.util.stream.Collectors;

 public class RnaTranscription {
    HashMap<Character, String> dnaToRna = new HashMap<>(){{
        put('G', "C");
        put('C', "G");
        put('T', "A");
        put('A', "U");
    }};





    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(i -> dnaToRna.get((char) i))
                .collect(Collectors.joining());

    }

}