public class Main {



    public static void main(String[] args) {

        Author victorPelevin = new Author("Виктор", "Пелевин");
        Book transhumanism = new Book("Трансгуманизм", victorPelevin, 2021);
        System.out.println(transhumanism.getTitle() + " " + transhumanism.getYear() + " " + transhumanism.getAuthor().getName() + " " + transhumanism.getAuthor().getSurname());

        Author ivanEfremov = new Author("Иван", "Ефремов");
        Book hourOfTheBull = new Book("Час быка", ivanEfremov ,1970);

        hourOfTheBull.setYear(1971);
        System.out.println(hourOfTheBull.getTitle() + " " + hourOfTheBull.getYear() + " " + hourOfTheBull.getAuthor().getName() + " " + hourOfTheBull.getAuthor().getSurname());

    }
}
