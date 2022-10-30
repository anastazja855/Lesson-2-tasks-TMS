package lesson13;

import java.util.ArrayList;
import java.util.stream.Stream;

//Post to github
interface Discountable {
    double calculate (double price, double discount);
}




class Phone {
    String brand;
    String model;
    double price;


    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    /*
    public double getNewPrice() {
        System.out.println("Choose the price change method:" +
                "Press:" +
                "1 - if you want REDUSE THE PRICE by indicating % of discount" +
                "2 - if you want REDUSE THE PRICE by specifying the amount of the discount" +
                "3 - if you want INCREASE THE PRICE by indicating % of discount" +
                "4 - if you want INCREASE THE PRICE by specifying the amount of the discount");
        Scanner scanner = new Scanner (System.in);
        int priceChangeMethod = scanner.nextInt();
        switch (priceChangeMethod) {
        case 1:
            Discountable discount1 = (double price, double discount) -> price -  price* ((100 - discount)/100);
            double newPrice = discount1.calculate(getPrice(),  20);

            default:
                throw new IllegalStateException("Unexpected value: " + priceChangeMethod);
        }
    }
    */

    public static void main(String[] args) {

        Phone phone1 = new Phone("Apple", "iPhone 14", 2352);
        Phone phone2 = new Phone("Xiaomi", "Redmi Note 11", 799);
        Phone phone3 = new Phone("Apple", "iPhone 12", 1799);
        Phone phone4 = new Phone("Samsung", "Galaxy A53", 1050);
        Phone phone5 = new Phone("Google", "Pixel 6 Pro", 2090);

        ArrayList <Phone> phones = new ArrayList<Phone>();
        phones.add (phone1);
        phones.add (phone2);
        phones.add (phone3);
        phones.add (phone4);
        phones.add (phone5);
        System.out.println(phone1.getPrice());

        Stream<ArrayList<Phone>> phonesStream =Stream.of(phones);
        phonesStream
                .map(p-> p.getPrice()) // помещаем в поток только названия телефонов
                .forEach(s->System.out.println(s));





        //System.out.println(phone1.getNewPrice());
        //double winterPrice = phone1.getNewPrice(10, (discount, currPrice) -> {
        //    return currPrice - discount * 5;
        //});

        //double summerPrice = phone2.getNewPrice(10, (discount, currPrice) -> {
        //    return currPrice * (1 - (discount/100));
        //});

        //System.out.println(winterPrice);
        //System.out.println(summerPrice);

    }

}