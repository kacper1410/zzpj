package pl.java.zzjp.app;

import pl.java.zzjp.lib.Person;

public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setName("Adam");
        person.greet();
    }
}
