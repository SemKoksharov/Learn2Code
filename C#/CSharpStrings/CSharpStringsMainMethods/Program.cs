namespace CSharpStrings
{
    class MainMethods
    {
        static void Main(string[] args)
        {
            string myString = "abracadabra";

            Console.WriteLine($"Original string: {myString}");

            bool containsA = myString.Contains("a");
            bool containsE = myString.Contains("e");


            Console.WriteLine("Contains 'a'?");
            Console.WriteLine(containsA);

            Console.WriteLine("Contains 'e'?");
            Console.WriteLine(containsE);

            bool endsWithAbra = myString.EndsWith("abra");
            Console.WriteLine("EndsWith 'abra'?");
            Console.WriteLine(endsWithAbra);

            bool startsWithAbra = myString.StartsWith("abra");
            Console.WriteLine("StartsWith 'abra'?");
            Console.WriteLine(startsWithAbra);

            int indexOfA = myString.IndexOf('a', 1); // starts searching from index 1 ('n')
            Console.WriteLine($"Index of character 'a' is ${indexOfA}");

            int lastIndexOfR = myString.LastIndexOf('r');
            Console.WriteLine($"Index of last occurrence of character 'r' is ${lastIndexOfR}");

            int length = myString.Length;
            Console.WriteLine($"Length of the string {myString} is {length} characters");

            string substringFrom5 = myString.Substring(5); // from index 5(char number 6)
            string substringFromTo = myString.Substring(0, 3); // from ind 0 , length 3 characters

            Console.WriteLine($"Substring from 5 character: {substringFrom5}");
            Console.WriteLine($"Substring from 0 to 3 character: {substringFromTo}");

            Console.WriteLine("\nEmpty Strings:");
            Console.WriteLine("Press any key");
            Console.ReadKey();

            string emptyAlt = string.Empty; // same as "" 
            string empty = "";
            string whiteSpaced = " ";
            string notEmpty = " b";
            string nullString = null;

            Console.WriteLine("IsNullOrEmpty");
            Console.WriteLine("\n");

            Console.WriteLine("IsNullOrEmpty empty null str");
            bool isNullOrEmpty = string.IsNullOrEmpty(nullString);
            Console.WriteLine(isNullOrEmpty);

            Console.WriteLine("IsNullOrEmpty whiteSpaced str");
            isNullOrEmpty = string.IsNullOrEmpty(whiteSpaced);
            Console.WriteLine(isNullOrEmpty);

            Console.WriteLine("IsNullOrEmpty not empty str");
            isNullOrEmpty = string.IsNullOrEmpty(notEmpty);
            Console.WriteLine(isNullOrEmpty);

            Console.WriteLine("IsNullOrEmpty empty str");
            isNullOrEmpty = string.IsNullOrEmpty(empty);
            Console.WriteLine(isNullOrEmpty);

            Console.WriteLine("IsNullOrWhiteSpaced");
            Console.WriteLine("\n");
            Console.WriteLine("IsNullOrEmpty empty null str");
            bool nullOrWhiteSpace = string.IsNullOrWhiteSpace(nullString);
            Console.WriteLine(nullOrWhiteSpace);


            Console.WriteLine("IsNullOrEmpty whiteSpaced str");
            nullOrWhiteSpace = string.IsNullOrWhiteSpace(whiteSpaced);
            Console.WriteLine(nullOrWhiteSpace);

            Console.WriteLine("IsNullOrEmpty not empty str");
            nullOrWhiteSpace = string.IsNullOrWhiteSpace(notEmpty);
            Console.WriteLine(nullOrWhiteSpace);

            Console.WriteLine("IsNullOrEmpty empty str");
            nullOrWhiteSpace = string.IsNullOrWhiteSpace(empty);
            Console.WriteLine(nullOrWhiteSpace);
        }
    }
}