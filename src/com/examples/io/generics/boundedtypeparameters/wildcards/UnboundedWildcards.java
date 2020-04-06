package com.examples.io.generics.boundedtypeparameters.wildcards;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An unbounded wildcard is a wildcard with no upper or lower bound, that can represent any type.
 * <p>
 * It's also important to know that the wildcard type is not synonymous to object.
 * This is because a wildcard can be any type whereas an object type is specifically an
 * object (and cannot be a subclass of an object). Let's demonstrate this with an example:
 * <p>
 * Again, the reason the second line does not compile is that a list of objects is required,
 * not a list of strings. The first line compiles because a list of any unknown type is acceptable.
 */
public class UnboundedWildcards {

        static void createList(List<?> list) {

            System.out.println(list.size());
        }
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("gghghg","sdsfdf");
        createList(strings);
    }


}
