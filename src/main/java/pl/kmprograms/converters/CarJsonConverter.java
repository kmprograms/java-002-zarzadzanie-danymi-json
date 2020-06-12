package pl.kmprograms.converters;

import pl.kmprograms.model.Car;

public class CarJsonConverter extends JsonConverter<Car> {
    public CarJsonConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
