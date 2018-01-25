package com.github.teocci.codesample.javafx.patterns.mixin;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2018-Jan-25
 */
public class Other
{
    private int value;

    public Other(int value) {
        this.value = value;
    }

    public void whatever()
    {
        System.out.println("Other value is: " + value);
    }
}
