package com.semrush.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    public String firstName;
    public String email;
    public String phone;

    public static TestData generate() {
        Faker faker = new Faker(new Locale("en"));
        TestData testData = new TestData();
        testData.firstName = faker.name().firstName();
        testData.email = faker.internet().emailAddress();
        testData.phone = faker.phoneNumber().subscriberNumber(11);

        return testData;
    }
}
