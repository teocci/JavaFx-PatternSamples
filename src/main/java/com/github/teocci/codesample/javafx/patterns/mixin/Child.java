package com.github.teocci.codesample.javafx.patterns.mixin;

import com.github.teocci.codesample.javafx.patterns.interfaces.MProvides;
import com.github.teocci.codesample.javafx.patterns.interfaces.MRequires;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2018-Jan-25
 */
public class Child extends Parent implements MRequires, MProvides
{
    private final MProvides mixin;

    public Child(int value)
    {
        super(value);
        this.mixin = new Mixin(this);
    }

    @Override
    public void func() { mixin.func(); }

    public static void main(String[] args)
    {
        Child child = new Child(10);
        child.func();
    }
}
