package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(walking(34,28));
        System.out.println(walking(45,18));
        System.out.println(walking(60,-45));
        System.out.println(walking(45,-50));
        System.out.println(WalkWithRandomAge(23));
        System.out.println(WalkWithRandomAge(20));
        System.out.println(WalkWithRandomAge(-5));

    }

    public static String walking(int age, int temperature) {
        if (
                (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
                        || (age < 20 && temperature >= 0 && temperature <= 28)
                        || (age > 45 && temperature >= -10 && temperature <= 25)
        )
        {
            return "Возраст : "+ age + "температура:" + temperature+ "Результат:Можно идти гулять!";

        }
        else {
            return  " Возраст:"+ age + "температура:"+ temperature + "Результат: Оставайся дома!";
        }
    }


    public static String WalkWithRandomAge(int temp) {
        int age = generateRandomAge();
        if (
                (age >= 20 && age <= 40 && temp >= -20 && temp <= 30)
                        || (age < 20 && temp >= 0 && temp <= 28)
                        || (age > 45 && temp >= -10 && temp <= 25)
        ) {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Можно идти гулять";
        } else {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Оставайтесь дома";
        }


    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100);

    }


}
