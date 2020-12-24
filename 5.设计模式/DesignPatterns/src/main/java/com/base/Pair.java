package com.base;


import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.Serializable;

public class Pair<T extends Comparable& Serializable>
{
    private T first;
    private T second;
    public Pair() { first = null ; second = null ; }
    public Pair(T first, T second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

    public static void main(String[] args) {
        Pair<String> strPair=new Pair<>();
        strPair.setFirst("str1");
       String str= strPair.getFirst();
    }

}