package com.examples.io.generics.implementingAGenericType;

import java.util.Comparator;
//Passing a Parameter to Generic
public class ReverseCompartor<T>  implements Comparator<T> {

    private Comparator<T> delegatorCompartor;

    public ReverseCompartor(Comparator<T> delegatorCompartor) {
        this.delegatorCompartor = delegatorCompartor;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * delegatorCompartor.compare(left,right);
    }
}
