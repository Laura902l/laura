import java.util.Objects;
import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("87759083478", "iPhone", 3.4);
        Phone phone2 = new Phone("87923456374", "NOKIA");
        Phone phone3 = new Phone();
        System.out.println("Phone 1: number = " + phone1.getNumber() + ", model = " + phone1.getModel() + ", weight = " + phone1.getWeight());
        System.out.println("Phone 2: number = " + phone2.getNumber() + ", model = " + phone2.getModel() + ", weight = " + phone2.getWeight());
        System.out.println("Phone 3: number = " + phone3.getNumber() + ", model = " + phone3.getModel() + ", weight = " + phone3.getWeight());
        phone1.receiveCall("Harry");
        String phone1Number = phone1.getNumber();

        phone2.receiveCall("John");
        String phone2Number = phone2.getNumber();

        phone3.receiveCall("Amina");
        String phone3Number = phone3.getNumber();
        phone1.receiveCall("Mary", "83284913");
        phone1.sendMessage("624728", "423901");


    }
}
