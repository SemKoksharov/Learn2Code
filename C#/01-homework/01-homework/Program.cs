namespace _01_homework
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter an integer");
            int a  = int.Parse(Console.ReadLine());

            Console.WriteLine($"The numbet of digits = {a.ToString().Length}");
            
            Console.WriteLine("Enter an integer");
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine($"The numbet of digits = {b.ToString().Length}");

            Console.WriteLine($"Value of a = {a}, value of b = {b}");

            int temp = a;
            a = b;
            b = temp;

            Console.WriteLine($"New value of a = {a}, new value of b = {b}");
        }
    }
}
