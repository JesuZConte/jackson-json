package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();
            // read JSON file and map/convert to Java POJO:
            // data/sample-lie.json

            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            // print first name and last name

            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());

            Address tempAddress = student.getAddress();

            System.out.println("Country: " + tempAddress.getCountry());
            System.out.println("City: " + tempAddress.getCity());

            for (String tempLang: student.getLanguages() ) {
                System.out.println(tempLang);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
