namespace CastAndMath
{ /*
   * TypeCast_Math_Arrays_DateTime lessons
   * 
   *    multi line comment
   *    we can write here many words
   *
   */
    class Program
    {
        static void Main(string[] args)
        {
            
            byte b = 3; // 0000 0011 <- bin. representation - 8 bit / 1 byte
            int i = b; // 0000 0000 0000 0000 0000 0000 0000 0011 <- bin. representation - 32 bit / 4 byte
            long j = i; // 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0011  <- bin. representation - 64 bit / 8 byte
            float f = i; //  0100 0000 0100 0000 0000 0000 0000 0000  <- bin. representation - 32 bit / 4 byte

            // b = i;  
            b = (byte)i; // if int in range of byte we can cast it
            Console.WriteLine($"i as byte = {b}");

            // i  = f
            i = (int)f;
            Console.WriteLine($"i as float = {i}");
            
            f = 3.1f;
            i = (int)f;
            Console.WriteLine($"f as int = {i}");
            
            string str1 = "1";
            i = int.Parse(str1);
            Console.WriteLine($"Parsed i = {i}");

            int x = 5;
            int res = x / 2;
            Console.WriteLine($"Result = {res}");

            double res2 = Convert.ToDouble(x) / 2; 
            double res3 = (double)x / 2;  // alternative  
            Console.WriteLine($"Result 2 =  {res2}");
            Console.WriteLine($"Result 3 =  {res3}");


            double powRes = Math.Pow(2, 3); // 6.0
            double squareRoot =  Math.Sqrt(9); // 3
            double squareRoot2 = Math.Sqrt(8); // 2, and something....

            Console.WriteLine($"2^3 = {powRes} ");
            Console.WriteLine($"Square root of 9  = {squareRoot}");    
            Console.WriteLine($"Square root of 8  = {squareRoot2}");

            double d1 = 1.7;
            double d2 = 1.4;
            double d3 = 1.5;
            double d4 = 2.5;
            
            int round = Convert.ToInt32(Math.Round(d1));
            int round2 = Convert.ToInt32(Math.Round(d2));
            int round3 = Convert.ToInt32(Math.Round(d3));
            int round4 = Convert.ToInt32(Math.Round(d4));
            int round5 = Convert.ToInt32(Math.Round(d4, MidpointRounding.AwayFromZero));
            int round6 = Convert.ToInt32(Math.Round(d4, MidpointRounding.ToEven));

            Console.WriteLine($"{d1} rounded = {round}");
            Console.WriteLine($"{d2} rounded = {round2}");
            Console.WriteLine($"{d3} rounded = {round3}");
            Console.WriteLine($"{d4} rounded (normal) = {round4}");
            Console.WriteLine($"{d4} rounded (MidpointRounding.AwayFromZero) = {round5}");
            Console.WriteLine($"{d4} rounded (MidpointRounding.ToEven) = {round6}");
        }
    }
}