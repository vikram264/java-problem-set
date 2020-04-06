package com.examples.io.generics.boundedtypeparameters.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//https://www.codejava.net/java-core/collections/generics-with-extends-and-super-wildcards-and-the-get-and-put-principle


/**
 * if we want to restrict the elements being added in the method is of type Integer,
 * whereas we also want to accept a collection of super types of
 * Integer, since adding integers to a collection of numbers is perfectly legal?
 * In this case, the super wildcard is the solution. Let’s update signature of the append() method like this:
 */


/**
 * Here are other noteworthy points with regard to a type declared with a wildcard <? super T>:
 * - It can accept any type that is super type of T.
 * - We can add elements to the collection. However the type is restricted to only T.
 *  It cannot be passed to a method having a parameter declared with the extends wildcard.
 *  The following code snippet illustrates this point:
 */
public class WildCardsSuperLowerBound {

     static void appendProblem(Collection<Integer> nums, int n) {
        for(int i=0;i<=n;i++)  {
            nums.add(i);

        }
    }

    static void append(Collection<? super Integer> nums, int n) {
        for(int i=0;i<=n;i++)  {
            nums.add(i);

        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(100.1);
        numbers.add(11);
        numbers.add(11111111111L);

        WildCardsSuperLowerBound.append(numbers,2);


        List<Double> doubles = new ArrayList<>();
        doubles.add(1.3);
       // WildCardsSuperLowerBound.append(doubles); Compile Error as Double is not a Parent of Integer


        List<Object> object = new ArrayList<>();
        object.add(1);
        object.add(1000);
        object.add("one thousand");
        System.out.println("###########################");
        WildCardsSuperLowerBound.append(object,2);


        List<? super Integer> integers = new ArrayList<Integer>();

        List<Object> objects = new ArrayList<Object>();
        objects.add("Hello");
        integers = object;
        //WildCardExtendsUpperBound.sum(integers);

    }
}
