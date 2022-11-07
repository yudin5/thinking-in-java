package ch_19_enums;

public class ShrubberyDrive {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println("s = " + s);
            System.out.println(s.ordinal());
            System.out.println(s.getDeclaringClass().getSimpleName());
        }
    }
}
