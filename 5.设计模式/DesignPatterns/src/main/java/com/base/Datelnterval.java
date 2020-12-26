package com.base;

import java.time.LocalDate;
import java.util.List;

public class Datelnterval extends Pair<LocalDate>{

    @Override
    public void setSecond(LocalDate newValue) {
        if (second.compareTo(getFirst()) >= 0)
            super.setSecond(second);
    }

    public static void main(String[] args) {
        Pair<String>[] table = new Pair<String>[10];
        List
    }
    }
}
