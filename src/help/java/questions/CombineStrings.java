package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineStrings {

    public StringBuffer combineStrings(ArrayList<String> list) {
        StringBuffer combined = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            combined = combined.append(list.get(i));
        }
        return combined;
    }

    public StringBuffer streamCombineStrings(ArrayList<String> list) {
        StringBuffer combined = new StringBuffer();
        return  combined.append(list.stream().collect(Collectors.joining()));
    }

    @Test
    private void testStreamCombinedStrings() {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        StringBuffer string = new StringBuffer();
        string = string.append("onetwo");

        Assert.assertEquals(streamCombineStrings(list).toString(), string.toString());
    }

    @Test
    private void testCombinedString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        StringBuffer string = new StringBuffer();
        string = string.append("onetwo");

        Assert.assertEquals(combineStrings(list).toString(), string.toString());

    }
}
