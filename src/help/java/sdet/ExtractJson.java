package sdet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExtractJson {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CustomerDetailsAppium c = objectMapper.readValue(new File("C:\\Users\\mosipa\\IdeaProjects\\PracticeSelenium\\customerInfo.json"), CustomerDetailsAppium.class);
        System.out.println(c.getCourseName());
    }
}
