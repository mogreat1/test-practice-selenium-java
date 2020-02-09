package functions;

import org.testng.annotations.Test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    @Test
    public void isPhoneNumberValidTest(){
        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("03000000001"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
    }

    @Test
    public void isPhoneNumberValidPredicateTest(){
        System.out.println(isPhoneNumberValidPredicate.test("07000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("03000000001"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() ==11;

    @Test
    public void isPhoneNumberValidPredicateAndContainsNumber3Test(){
        System.out.println(isPhoneNumberValidPredicate
                .and(containsNumber3).test("07000000001"));
    }

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
