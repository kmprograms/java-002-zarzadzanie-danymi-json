package pl.kmprograms.converters;

import pl.kmprograms.model.CarsStore;

public class CarsStoreJsonConverter extends JsonConverter<CarsStore> {
    public CarsStoreJsonConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
