using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            double b;
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine(string.Format("{0:0.000}", a / b) + " km/l");
        }
    }
}
