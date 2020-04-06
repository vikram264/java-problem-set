package com.examples.io.generics.boundedtypeparameters.wildcards;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Upper bounded and unbounded wildcard collections are immutable.
 *
 * For example, you cannot do:
 *
 * List<? extends Number> myList = new ArrayList<Integer>();
 * myList.add(new Integer(3)); //will not compile
 * This fails to compile because java does not know what type of List
 * List<? extends Number> is at compilation time.
 *
 * So the example above, at compile time, myList could be List<Double>or List<Integer> or a List of any subclass of Number.
 * And since you cannot add a Double to a List<Integer> or vise-versa, the compilation fails.
 */
public class WildCardExtendsUpperBound {


   /* public static double sum(Collection<Number> nums) {
        double res = 0;
        for(Number number:nums) {
            res = res + number.doubleValue();
        }
        return res;
    }*/
    public static double sum(Collection<? extends Number> nums) {

        double res = 0;
        for(Number number:nums) {
            res = res + number.doubleValue();
        }
        return res;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(WildCardExtendsUpperBound.sum(list));

        List<Double> doubles = Arrays.asList(1.12,2.2,3.3);
        System.out.println(WildCardExtendsUpperBound.sum(doubles));


        List<Number> numbers = Arrays.asList(1000,2.17,300000000);
        System.out.println(WildCardExtendsUpperBound.sum(numbers));

        // Important
        //Object[] objs = {new Object(),new Object()};
       // WildCardsTest.sum(objs);
       // List<? extends Number> numbers2 = new ArrayList<>();
       // numbers2.add(10); // Compile Error
    }
}
