import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cars Audi_A4 = new Cars("Audi","A4",2015,"Red","2.0 TID",101000);
        Cars Fiat_500 = new Cars("Fiat","500",2011,"Dark Blue","1.2 8V Lounge",120000);
        Cars Kia_Stinger = new Cars("Kia","Stinger",2020,"White","2.0 T-GDI GT Line", 68000);
        Cars Ford_Focus = new Cars("Ford","Focus",2015,"White", "1.5 TDCi", 1890056);
        Cars Honda_Civic = new Cars("Honda","Civic",2017,"Red","2.0 TID",82000);
        Cars Citroen_C3Picasso = new Cars("Citroen","C3 Picasso",2009,"Red","2.0 TID",161000);

        String[] cars = {"Audi A4", "Fiat 500", "Kia Stinger", "Ford Focus", "Honda Civic", "Citroen C3 Picasso"};



        boolean programIsRunning = true;
        while(programIsRunning == true) {
            System.out.println("Welcome to Car shop");
            System.out.println("This cars we have\n");
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
            System.out.println("Please enter your car you want details");
            switch (scanner.nextLine()) {
                case "Audi A4":
                    Audi_A4.ShowDetails();
                    break;
                case "Fiat 500":
                    Fiat_500.ShowDetails();
                    break;
                case "Kia Stinger":
                    Kia_Stinger.ShowDetails();
                    break;
                case "Ford Focus":
                    Ford_Focus.ShowDetails();
                    break;
                case "Honda Civic":
                    Honda_Civic.ShowDetails();
                    break;
                case "Citroen C3 Picasso":
                    Citroen_C3Picasso.ShowDetails();
                    break;

            };

            System.out.println("Do you want to continue? (y/n)");
            if(scanner.nextLine().equals("n") || scanner.nextLine().equals("N")|| scanner.nextLine().equals("no") || scanner.nextLine().equals("NO")|| scanner.nextLine().equals("No")|| scanner.nextLine().equals("nO")) {
                programIsRunning = false;
            };
        };
    }
}