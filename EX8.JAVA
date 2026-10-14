import java.util.Random;

class NumberGenerator extends Thread
{
    static int number;

    public void run()
    {
        Random r = new Random();

        for (int i = 1; i <= 5; i++)
        {
            number = r.nextInt(10) + 1;
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0)
                new SquareThread(number).start();
            else
                new CubeThread(number).start();

            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.print(e);
            }
        }
    }
}

class SquareThread extends Thread
{
    int n;

    SquareThread(int n)
    {
        this.n = n;
    }

    public void run()
    {
        System.out.println("Square: " + (n * n));
    }
}

class CubeThread extends Thread
{
    int n;

    CubeThread(int n)
    {
        this.n = n;
    }

    public void run()
    {
        System.out.println("Cube: " + (n * n * n));
    }
}

public class Num
{
    public static void main(String args[])
    {
        NumberGenerator t = new NumberGenerator();
        t.start();
    }
}
