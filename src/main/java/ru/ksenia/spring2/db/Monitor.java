package ru.ksenia.spring2.db;

import jakarta.persistence.Entity;

@Entity
public class Monitor extends Product{
    //свойства монитора
    private int diagonal;


    //геттеры, сеттеры и конструктор
    public Monitor() {}
    public int getDiagonal() {return diagonal;}
    public void setDiagonal(int diagonal) {this.diagonal = diagonal;}
    public Monitor(int diagonal) {this.diagonal = diagonal;}

}
