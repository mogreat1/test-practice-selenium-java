package bootcamp.tasks;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamTask {

    private static final String data = """ 
                16,Fanchette,Williamson,fwilliamson0@github.com,F
                26,Aleksandr,Matts,amatts1@webs.com,M
                3,Maurie,Cordero,mcordero2@google.co.jp,M
                45,Donnajean,Crowson,dcrowson3@google.com.hk,F
                5,Ricardo,Gofton,rgofton4@nytimes.com,M
                65,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                37,Marjorie,Blumsom,mblumsom6@joomla.org,F
                18,Lester,Huyghe,lhuyghe7@jugem.jp,M
                39,Merrily,Stangoe,mstangoe8@tiny.cc,F
                10,Reider,Karel,rkarel9@github.io,M
                11,Dory,Jolliff,djolliffa@wufoo.com,F
                32,Homerus,Averay,haverayb@skyrock.com,M
                13,Alyda,Muglestone,amuglestonec@is.gd,F
                14,Pinchas,Louca,ploucad@google.es,M
                11,Cherin,Eltringham,celtringhame@parallels.com,F
                2,Mufi,Rothert,mrothertf@dropbox.com,F
                17,Jordana,Everex,jeverexg@ucla.edu,F
                18,Belle,Rother,brotherh@gov.uk,F
                19,Clevie,Sifflett,csiffletti@furl.net,M
                20,Gretchen,Abell,gabellj@1688.com,F
            """;

    public static void main(String[] args) throws IOException {


        // System.out.println(filterData(data));

    }

    private static boolean filterData(String data) throws IOException {
        List<Person> people = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(data, Person.class);

        return false;
    }

    private class Person {
        private int age;
        private String name;
        private String surname;
        private String email;
        private Gender gender;

        public Person(int age, String name, String surname, String email, Gender gender) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getEmail() {
            return email;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + age +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    private enum Gender {
        F,
        M
    }
}
