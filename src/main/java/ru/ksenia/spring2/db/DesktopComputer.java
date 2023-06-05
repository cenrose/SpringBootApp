package ru.ksenia.spring2.db;

import jakarta.persistence.*;

@Entity
public class DesktopComputer extends Product {
    //свойства настольного компьютера
    private String formFactor;


    //геттеры, сеттеры и конструктор
    public DesktopComputer() {}
    public String getFormFactor() {return formFactor;}
    public void setFormFactor(String formFactor) {this.formFactor = formFactor;}
    public DesktopComputer(String formFactor) {this.formFactor = formFactor;}

}
