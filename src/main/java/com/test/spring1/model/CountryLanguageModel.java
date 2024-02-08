package com.test.spring1.model;

import lombok.Data;

@Data
public class CountryLanguageModel {

    int id;
    String countryCode;
    String language;
    String isOffical;
    double percentage;

    }
