using System;

class Program {
    static void Main() {
        string[] input = Console.ReadLine().Split();
        double a = double.Parse(input[0]);
        double b = double.Parse(input[1]);
        Console.WriteLine(a/b);
    }
}