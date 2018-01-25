package com.github.teocci.codesample.javafx.patterns.mixin;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2018-Jan-25
 */
public class Parent
{
    private int val;

    public Parent(int value) {
        this.val = value;
    }

    public int getValue() {
        return this.val;
    }

    public String toString() {
        return "" + this.val;
    }
}
