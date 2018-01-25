package com.github.teocci.codesample.javafx.patterns.mixin;

import com.github.teocci.codesample.javafx.patterns.interfaces.MProvides;
import com.github.teocci.codesample.javafx.patterns.interfaces.MRequires;
import com.github.teocci.codesample.javafx.patterns.interfaces.OtherInterface;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2018-Jan-25
 */
public class ParentChild extends Parent implements OtherInterface, MRequires, MProvides
{
    private final OtherInterface child;

    private final MProvides mixin;

    public ParentChild(int value)
    {
        super(value);
        child = new OtherChild(value);
        mixin = new Mixin(this);
    }

    @Override
    public void whatever()
    {
        child.whatever();
    }

    @Override
    public void func()
    {
        mixin.func();
    }

    public void printValue()
    {
        System.out.println("Print value: " + getValue());
    }

    public static void main(String[] args)
    {
        ParentChild child = new ParentChild(10);
        child.func();
        child.whatever();
        child.printValue();
    }
}