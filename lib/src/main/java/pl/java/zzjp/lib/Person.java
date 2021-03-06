package pl.java.zzjp.lib;


import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter
    @Setter
    private String name;

    public void greet() {
        System.out.printf("Hey, %s", name);
    }
}
