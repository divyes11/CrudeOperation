package com.rest.employee.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.rest.employee.entity.CountryInfo;
import com.rest.employee.external.service.Country;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class CountryInfoSerializer extends JsonSerializer<CountryInfo>{

    @Autowired
    CountryInfo countryInfo;


    @Override
    public void serialize(CountryInfo countryInf, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", countryInfo.getName());
        jsonGenerator.writeNumberField("cca2", countryInfo.getCca2());
        // ... serialize other fields ...
        jsonGenerator.writeEndObject();
    }
}
