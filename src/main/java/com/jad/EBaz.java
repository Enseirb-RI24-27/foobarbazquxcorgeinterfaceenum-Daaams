package com.jad;

public enum EBaz implements IBaz {
    BAZ1("Baz1"),
    BAZ2("Baz2"),
    BAZ3("Baz3");

    public String getName() {
        return this.name;
    }

    private String name;

    EBaz(String baz) {
        this.name = baz;
    }

    @Override
    public void doSomethingLikeABaz() {

    }
}
