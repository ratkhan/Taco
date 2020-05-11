package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data //lombok annotation that generates all required getters and seters, as well as equals, hasCode(), toString()
@RequiredArgsConstructor //lombok annotation that generates constructor with final fiels as parameters
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


}
