public class Person2023 {
    public static void main (String[] args){
        PersonInfo person1 = new PersonInfo();
        person1.name = "Will";
        person1.surname = "Smith";
        person1.city = "New York";
        person1.number = 2936729462846l;
        PersonInfo person2 = new PersonInfo();
        person2.name = "Jackie";
        person2.surname = "Chan";
        person2.city = "Changhai";
        person2.number = 12312412412l;
        PersonInfo person3 = new PersonInfo();
        person3.name = "Sherlock";
        person3.surname = "Holmes";
        person3.city = "London";
        person3.number = 37742123513l;
        System.out.println("Зателефонувати громадянину " + person1.name + " " + person1.surname +
                " з міста " + person1.city + "  можно за номером " + person1.number);
        System.out.println("Зателефонувати громадянину " + person2.name + " " + person2.surname +
                " з міста " + person2.city + "  можно за номером " + person2.number);
        System.out.println("Зателефонувати громадянину " + person3.name + " " + person3.surname +
                " з міста " + person3.city + "  можно за номером " + person3.number);

    }
}

