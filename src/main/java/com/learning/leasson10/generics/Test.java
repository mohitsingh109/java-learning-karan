package com.learning.leasson10.generics;

public class Test<R, J> { // Test<String, Integer>

    private R obj; //String
    private J obj1; //Integer

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
