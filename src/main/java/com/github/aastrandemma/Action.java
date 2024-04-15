package com.github.aastrandemma;

@FunctionalInterface
public interface Action {
    void execute(Product p);
}