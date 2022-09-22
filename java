import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        long nr = Long.parseLong(n);
        String  s = Long.toString(nr, 9);
        System.out.println(s);
    }
}
