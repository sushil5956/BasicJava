package org.Study;

import java.io.*;

public class Person implements Serializable {

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int age;


    public static void main(String[] args) {
        serializePerson();
    }

    private static void serializePerson() {

        Person objPerson = new Person();
        objPerson.setAge(30);
        objPerson.setName("Sushil");
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Study\\Sushil\\Java\\BasicJava\\inputFiles\\SerialTest.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            objOut.writeObject(objPerson);
            objOut.flush();
            objOut.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
