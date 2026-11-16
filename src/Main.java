import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int age;
    static String email;
    static String address;
    static String phone;
    static double height;
    static double height_in_metres;
    static double weight;
    static int BMI;

//    Definieer hier de variabelen


    public static void main(String[] args) {
        printMenu();
        setName();
        setAge();
        setEmail();
        setAddress();
        setPhone();
        setHeight();
        setWeight();
        calculateBMI();

//        Roep hier de andere methodes aan

        printProfile();
        System.out.println("Afsluiten. Tot ziens!");
    }

    public static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de profiel app");
        System.out.println("Deze app zal het volgende uitvoeren:");
        System.out.println(" 1  - Vul naam in");
        System.out.println(" 2  - Vul leeftijd in");
        System.out.println(" 3  - Vul e-mail in");
        System.out.println(" 4  - Vul adres in");
        System.out.println(" 5  - Vul telefoonnummer in");
        System.out.println(" 6  - Vul lengte in (cm) ");
        System.out.println(" 7  - Vul gewicht in (kg)");

//        Vul hier het menu aan

    }

    public static void printProfile() {
        System.out.println();
        System.out.println("----- PROFIEL -----");
        System.out.println("Naam: " + name);
        System.out.println("Leeftijd: " + age);
        System.out.println("E-mail: " + email);
        System.out.println("Adres: " + address);
        System.out.println("Telefoonnummer: " + phone);
        System.out.println("Lengte: " + height + "cm");
        System.out.println("Gewicht: " + weight + "kg");
//        Roep de calculateBMI() methode aan.
        calculateBMI();
        System.out.println("-------------------");
    }

    public static void setName() {
        System.out.print("Voer je volledige naam in: ");
        name = scanner.nextLine().trim();
        System.out.println("Naam opgeslagen: " + name);
    }

    public static void setAge() {
        System.out.print("Voer je leefttijd in: ");
        age = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Leeftijd opgeslagen: " + age);
    }

    public static void setEmail() {
        System.out.print("Voer je e-mail adres in: ");
        email = scanner.nextLine().trim();
        System.out.println("E-mail opgeslagen: " + email);
    }

    public static void setAddress(){
        System.out.print("Voer je volledige adres in: ");
        address = scanner.nextLine().trim();
        System.out.println("Adres opgeslagen: " + address);
    }

    public static void setPhone(){
        System.out.print("Voer je telefoon nummer in: ");
        phone = scanner.nextLine().trim();
        System.out.println("Telefoonnummer opgeslagen: " + phone);
    }

    public static void setHeight(){
        System.out.print("Voer je lengte in: ");
        height = Double.parseDouble(scanner.nextLine().trim());
        System.out.println("Lengte opgeslagen: " + height);
    }

    public static void setWeight(){
        System.out.print("Voer je gewicht in: ");
        weight = Double.parseDouble(scanner.nextLine().trim());
        System.out.println("Gewicht opgeslagen :" + weight);
    }

    public static void calculateBMI() {
        height_in_metres = height /100;
        BMI = (int) (weight / (height_in_metres * height_in_metres));
        System.out.println("BMI: " + BMI);
    }
}


//        Schrijf hier de andere methodes






