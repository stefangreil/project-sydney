package at.greil.sydney.medium;

public class ReverseInteger {


    public int reverse(int x) {

        String s = Integer.toString(x);

        if (x < 0) {
            s = s.substring(1);
        }

        char[] chars = s.toCharArray();

        s = "";

        for (char element : chars) {
            s = element + s;
        }

        if (x < 0) {
            s = "-"+s;
        }

        try{
            return Integer.parseInt(s);
        } catch(NumberFormatException ex){
            return 0;
        }
    }
}
