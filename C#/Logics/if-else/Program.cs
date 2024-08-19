namespace MyNamespace
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("What's your age?");
            int age = int.Parse(Console.ReadLine());
            
            Console.WriteLine("What's your weight in kg?");
            double weight = double.Parse(Console.ReadLine());
            
            Console.WriteLine("What's your height in meters?");
            double height = double.Parse(Console.ReadLine());

            double bodyMassIndex = weight / (height * height);

            bool isTooLow = bodyMassIndex <= 18.5;
            bool isNormal = bodyMassIndex > 18.5 && bodyMassIndex < 25;
            bool isAbobeNormal = bodyMassIndex >= 25 && bodyMassIndex <=30;
            
            bool isToFat = bodyMassIndex > 30;

            bool isFat = isAbobeNormal || isToFat;

            if (isFat)
            {
                Console.WriteLine("You'd better lose some weigth");
            }
            else
            {
                Console.WriteLine("Oh, you're in a good shape!");
            }

            if (!isFat) // if(isFat == false)
            {
                Console.WriteLine("You're definiely not fat!");
            }

            if (isTooLow)
            {
                Console.WriteLine("Not enough weigth.");
            }
            else if (isNormal)
            {
                Console.WriteLine("You're OK!");
            }
            else if (isAbobeNormal)
            {
                Console.WriteLine("Be careful!");   
            }
            else
            {
                Console.WriteLine("You need to lose some weight");
            }
        }
    }
}
