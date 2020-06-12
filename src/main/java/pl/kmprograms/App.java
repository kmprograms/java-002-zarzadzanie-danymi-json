package pl.kmprograms;

import pl.kmprograms.converters.CarJsonConverter;
import pl.kmprograms.converters.CarsStoreJsonConverter;
import pl.kmprograms.model.Car;
import pl.kmprograms.model.CarsStore;
import pl.kmprograms.model.Color;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // --------------------------------------------------------------------
        // car data
        Car car = Car.builder()
                .model("BMW")
                .speed(200)
                .price(new BigDecimal("120000"))
                .color(Color.BLACK)
                .components(new HashSet<>(Arrays.asList("C1", "C2", "C3")))
                .build();

        // --------------------------------------------------------------------
        // car json conversion
        final String carJsonFilename = "car.json";
        CarJsonConverter carJsonConverter = new CarJsonConverter(carJsonFilename);
        carJsonConverter.toJson(car);
        carJsonConverter.fromJson().ifPresent(System.out::println);

        // --------------------------------------------------------------------
        // cars store data
        CarsStore carsStore = new CarsStore(new HashSet<>(Arrays.asList(
                Car.builder()
                        .model("AUDI")
                        .speed(220)
                        .price(new BigDecimal("120000"))
                        .color(Color.BLACK)
                        .components(new HashSet<>(Arrays.asList("C1", "C2", "C3")))
                        .build(),
                Car.builder()
                        .model("BMW")
                        .speed(200)
                        .price(new BigDecimal("110000"))
                        .color(Color.GREY)
                        .components(new HashSet<>(Arrays.asList("C4", "C5", "C6")))
                        .build(),
                Car.builder()
                        .model("MAZDA")
                        .speed(180)
                        .price(new BigDecimal("100000"))
                        .color(Color.WHITE)
                        .components(new HashSet<>(Arrays.asList("C7", "C8", "C9")))
                        .build()
        )));

        // --------------------------------------------------------------------
        // car store json conversion
        final String carsStoreJsonFilename = "cars_store.json";
        CarsStoreJsonConverter carsStoreJsonConverter = new CarsStoreJsonConverter(carsStoreJsonFilename);
        carsStoreJsonConverter.toJson(carsStore);
        carsStoreJsonConverter.fromJson().ifPresent(System.out::println);
    }
}
