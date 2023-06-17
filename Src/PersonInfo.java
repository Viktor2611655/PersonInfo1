public class PersonInfo {
    String name;
    String surname;
    String city;
    long number;


    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", citi='" + city + '\'' +
                ", number=" + number +
                '}';
    }

}
