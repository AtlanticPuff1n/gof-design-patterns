package com.patterns.design.gof.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{
    private List<Box> productList = new ArrayList<>();

    public CompositeBox(Box... boxes){
        productList.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return productList.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }
}
