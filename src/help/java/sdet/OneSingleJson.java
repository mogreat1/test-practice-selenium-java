package sdet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class OneSingleJson {


    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/business?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from customerinfo where Location = 'Asia';");


        ArrayList<CustomerDetails> a = new ArrayList<CustomerDetails>();
        while (rs.next()) {
            CustomerDetails customerDetails = new CustomerDetails();
            customerDetails.setCourseName(rs.getString(1));
            customerDetails.setPurchasedDeta(rs.getString(2));
            customerDetails.setAmount(rs.getInt(3));
            customerDetails.setLocation(rs.getString(4));
            a.add(customerDetails);

            System.out.println(customerDetails.getCourseName());
            System.out.println(customerDetails.getPurchasedDeta());
            System.out.println(customerDetails.getAmount());
            System.out.println(customerDetails.getLocation());

        }
        //Create Object for JSON array
        JSONArray jsa = new JSONArray();

        for (int i = 0; i < a.size(); i++) {
            ObjectMapper oj = new ObjectMapper();
            oj.writeValue(new File("C:\\Users\\mosipa\\IdeaProjects\\PracticeSelenium\\customerInfo" + i + ".json"), a.get(i));

            //create JSON string from java object
            Gson gson = new Gson();
            String string = gson.toJson(a.get(i));
            jsa.add(string);
        }

        //Create one JSON from multiple simple ones
        JSONObject jo = new JSONObject();
        jo.put("data", jsa);

        String unescapedString = StringEscapeUtils.unescapeJava(jo.toJSONString());

        //Remove spectial characters
        String string = unescapedString.replace("\"{", "{");
        string = string.replace("}\"", "}");
        System.out.println(string);


        //Write Json in file
        try(FileWriter file = new FileWriter("C:\\Users\\mosipa\\IdeaProjects\\PracticeSelenium\\customerInfo.json")){
            file.write(string);
        }

        conn.close();
    }
}
