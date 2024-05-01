package com.learning.leasson10.generics;

public class Test<R, J> {

    private R obj;
    private J obj1;

    public Test(R obj, J obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public R getObj() {
        return obj;
    }

    public J getObj1() {
        return obj1;
    }
}
