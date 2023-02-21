package at.greil.sydney.medium;

public class AtoiStringIntegerConverter {

    public int myAtoi(String s) {
        if(s.length() == 0) {
            return 0;
        }
        s = s.trim();
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar) && firstChar != '+' && firstChar != '-') {
            return 0;
        }

        if (s.indexOf('.') != -1) {
            s = s.substring(0, s.indexOf("."));
        }

        if (s.length() >=2 && !Character.isDigit(s.charAt(1))) {
            return 0;
        }

        String value = s.replaceAll("[^0-9]", "");

        if(value.length() == 0) {
            return 0;
        }

        try {
            Integer result = Integer.valueOf(value);
            return (s.indexOf('-') == -1) ? result : result * -1;
        } catch (NumberFormatException ex) {
            return (s.indexOf('-') == -1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}
