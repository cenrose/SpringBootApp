package ru.ksenia.spring2.db;

import jakarta.persistence.Entity;

@Entity
public class Laptop extends Product{
    //свойства ноутбука
    private int screenSize;

    //геттеры, сеттеры и конструктор
    public Laptop() {}
    public int getScreenSize() {return screenSize;}
    public void setScreenSize(int screenSize) {this.screenSize = screenSize;}
    public Laptop(int screenSize) {this.screenSize = screenSize;}
}
