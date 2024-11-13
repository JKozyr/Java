public class Cars {
    String Brand;
    String Model;
    int Year;
    String Colour;
    String Engine;
    int Car_mileage;

    Cars(String brand, String model, int year, String colour, String engine, int mileage) {
        Brand = brand;
        Model = model;
        Year = year;
        Colour = colour;
        Engine = engine;
        Car_mileage = mileage;
    }

    void ShowDetails(){
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Colour: " + Colour);
        System.out.println("Engine: " + Engine);
        System.out.println("Car mileage: " + Car_mileage + " Km");

    }


}
