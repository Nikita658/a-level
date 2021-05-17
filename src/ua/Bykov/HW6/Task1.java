package ua.Bykov.HW6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(12345, "Iphone", 5.23);
        Phone phone3 = new Phone(6456, 3.21);
        phone1.number = 432124;
        phone1.model = "Huawei";
        phone1.weight = 4.20;
        phone3.model = "Samsung";
        System.out.println("Phone1 number " + phone1.number);
        System.out.println("Phone1 model " + phone1.model);
        System.out.println("phone1 weight " + phone1.weight);
        System.out.println(phone2.fillingTheTelephone());
        System.out.println(phone3.fillingTheTelephone());
        phone1.receiveCall(" Bob");
        phone2.receiveCall(" Anna");
        phone3.receiveCall(" Mark");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}


