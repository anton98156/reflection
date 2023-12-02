package com;

class Cat extends Animal {
    private String favoriteToy;

    public Cat(String name, int age, String favoriteToy) {
        super(name, age);        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}
