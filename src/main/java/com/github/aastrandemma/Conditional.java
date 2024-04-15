package com.github.aastrandemma;

@FunctionalInterface
public interface Conditional {
    boolean test(Product p);
}