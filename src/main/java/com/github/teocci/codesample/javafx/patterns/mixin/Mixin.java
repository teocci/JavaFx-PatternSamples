package com.github.teocci.codesample.javafx.patterns.mixin;

import com.github.teocci.codesample.javafx.patterns.interfaces.MProvides;
import com.github.teocci.codesample.javafx.patterns.interfaces.MRequires;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2018-Jan-25
 */
public class Mixin implements MProvides
{
    private final MRequires parent;

    public Mixin(MRequires parent)
    {
        this.parent = parent;
    }

    public void func()
    {
        System.out.println("Value is: " + parent.getValue());
    }
}
