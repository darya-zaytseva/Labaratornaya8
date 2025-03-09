import java.util.Scanner;
public class Main {
    static class Person {
        String Familia;
        String Name;
        String Date;

        public Person(String Familia, String Name, String Date) {
            this.Familia = Familia;
            this.Name = Name;
            this.Date = Date;
        }
        public void Display(){
            System.out.println("Фамилия: "+this.Familia+" Имя: "+this.Name+" Год рождения: "+this.Date);
        }
        public String getFamilia() {
            return Familia;
        }
    }
    static class Avto {
        String Marka;
        String Year;
        String V_dvigatel;

        public Avto(String Marka, String Year, String V_dvigatel) {
            this.Marka = Marka;
            this.Year = Year;
            this.V_dvigatel = V_dvigatel;
        }
        public void Display(){
            System.out.println("Марка: "+this.Marka+" Год выпуска: "+this.Year+" Объём двигателя: "+this.V_dvigatel);
        }
        public String getMarka() {
            return Marka;
        }
    }
    static class Book {
        String Namebook;
        String Avtor;
        String God;

        public Book(String Namebook, String Avtor, String God) {
            this.Namebook = Namebook;
            this.Avtor = Avtor;
            this.God = God;
        }
        public void Display(){
            System.out.println("Название книги: "+this.Namebook+" Автор: "+this.Avtor+" Год выпуска: "+this.God);
        }
        public String getNamebook() {
            return Namebook;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("Кологривый", "Тимофей", "1999");
        Avto avto = new Avto("Dodge Challenger", "2008", "6,2");
        Book book = new Book("Автомобили", "Томас Харрис", "2025");
        person.Display();
        avto.Display();
        book.Display();
        System.out.println(person.getFamilia()+" читает книгу "+book.getNamebook()+" про машину "+avto.getMarka()+".");
    }
}