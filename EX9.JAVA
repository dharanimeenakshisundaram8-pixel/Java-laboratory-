mport java.util.Scanner;

public class GenericMaximum
{
    public static <T extends Comparable<T>> T maximum(T a, T b, T c)
    {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Integer Maximum = " +
            maximum(25, 40, 15));

        System.out.println("Double Maximum = " +
            maximum(18.5, 25.7, 18.9));

        System.out.println("Float Maximum = " +
            maximum(10.5f, 8.25f, 12.75f));

        System.out.println("Character Maximum = " +
            maximum('P', 'Z', 'N'));

        System.out.println("String Maximum = " +
            maximum("Apple", "Mango", "Banana"));
    }
}
