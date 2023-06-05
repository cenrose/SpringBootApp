package ru.ksenia.spring2.db;

import jakarta.persistence.Entity;

@Entity
public class HardDisk extends Product{
    //свойства жесткого диска
    private int capacity;


    //геттеры, сеттеры и конструктор
    public HardDisk() {}
    public HardDisk(int capacity) {this.capacity = capacity;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
}
