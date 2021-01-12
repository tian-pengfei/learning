package com.base;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

public class Datelnterval extends Pair<LocalDate>{

    @Override
    public void setSecond(LocalDate newValue) {
        if (second.compareTo(getFirst()) >= 0)
            super.setSecond(second);
    }

    public static void main(String[] args) {

    }
}
