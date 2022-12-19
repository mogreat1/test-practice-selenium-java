package bootcamp.tasks;

public class CollectionsTask {

    public static void main(String[] args) {

        //Check if the following parenthesis are balanced. i.e
//        String brackets = "[{{[(){}]}}[]{}{{(())}}]";
//        String brackets = "[{{}}[]{}{{(())}}]";
//        String brackets = "[{}{}{{()}}]";
//        String brackets = "[{}{{}}]";
//        String brackets = "[{{}}]";
//        String brackets = "[{}]";
//        String brackets = "";

//        System.out.println(isBalanced("[{}{}{{()}}]"));
//        System.out.println(isBalanced("[{}{{}}]"));
//        System.out.println(isBalanced("[{{}}]"));
//        System.out.println(isBalanced("[{}]"));
//        System.out.println("Is balanced:" + isBalanced("[{[}]"));
        System.out.println("Is balanced:" + isBalanced2("({()})"));

    }

    private static boolean isBalanced2(String str) {
        while (true) {
            String strTemp = str
                    .replace("[]", "")
                    .replace("{}", "")
                    .replace("()", "");

            if(str.equals(strTemp)) {
                break;
            } else {
                str = strTemp;
            }
        }
        return str.isEmpty();
    }


    private static boolean isBalanced(String input) {
        boolean isBalanced = false;

        if (input.length() < 1) {
            isBalanced = false;
        } else if (input.length() % 2 != 0) {
            isBalanced = false;
        } else {
            int halfSize = input.length() / 2;

            String string1 = input.substring(0, halfSize);
            System.out.println(string1);

            StringBuilder string2 = new StringBuilder(input.substring(halfSize));
            string2.reverse();

            for (int i = 0; i < string2.length(); i++) {
                if (string2.charAt(i) == '}') {
                    string2.setCharAt(i, '{');
                } else if (string2.charAt(i) == ']') {
                    string2.setCharAt(i, '[');
                } else if (string2.charAt(i) == '{') {
                    string2.setCharAt(i, '}');
                } else if (string2.charAt(i) == '[') {
                    string2.setCharAt(i, ']');
                } else if (string2.charAt(i) == '(') {
                    string2.setCharAt(i, ')');
                } else if (string2.charAt(i) == ')') {
                    string2.setCharAt(i, '(');
                }
            }

            System.out.println(string2);

            if (string1.equals(string2.toString())) {
                isBalanced = true;
            }

        }

        return isBalanced;
    }
}
