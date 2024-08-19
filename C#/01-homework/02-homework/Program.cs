namespace _02_homework
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter length of side A of the triangle");
            double a = double.Parse(Console.ReadLine());
           
            Console.WriteLine("Enter length of side B of the triangle");
            double b = double.Parse(Console.ReadLine());
           
            Console.WriteLine("Enter length of side C of the triangle");
            double c = double.Parse(Console.ReadLine());

            double semiPerimeter = (a + b + c) / 2;
            
            Console.WriteLine($"Semi-perimeter = {semiPerimeter}");
            double square = Math.Sqrt(semiPerimeter * ((semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)));
            
            Console.WriteLine($"Square of the triangle = {square}");
        }
    }
}