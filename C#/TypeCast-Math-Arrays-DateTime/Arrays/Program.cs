namespace Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a1;
            a1 = new int [10];

            int[] a2 = new int[5];
            int[] a3 = new int[5] { 1, 3, -2, 5, 10 }; //old syntax
            int[] a4 = { 1, 3, 2, 4, 5 }; // modern syntax

            int index4 = a4[4];
            Console.WriteLine($"Element 5 (index4) = {index4}");
            a4[4] = 6;

            int index4New = a4[4];
            Console.WriteLine($"Element 5 (index4) new = {index4New}");

            string str1 = "abcdefgh";
            char first = str1[0];
            char last = str1[str1.Length-1];

            Console.WriteLine($"First = {first}, last = {last}");

            // str1[0] = 'z'; ww can't do this !!! 
        }
    }
}