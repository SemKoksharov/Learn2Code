
namespace KeyboardInput 
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hi, what is your name?");
            string name = Console.ReadLine();
            
            Console.WriteLine("Enter your age");
            string inputAge = Console.ReadLine();
            int age = int.Parse(inputAge);

            Console.WriteLine($"Hi, {name}, You are {age} years old");
            Console.WriteLine("Press any key to clear the console");
           
            Console.ReadKey();
            Console.Clear();
            
            Console.BackgroundColor = ConsoleColor.DarkCyan;
            Console.ForegroundColor = ConsoleColor.Black;
    
            Console.Write("New style ");
            Console.Write("New style\n");
            Console.Write("Bye! ");
            
            Console.WriteLine("Press any key to exit");
            Console.ReadKey();

        }
    }
}

