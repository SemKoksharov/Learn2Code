using System.Text;

namespace QueryingStrings
{
    // String querying lesson
    class  Program
    {
        static void Main(string[] args)
        {
            string nameConcat = string.Concat("Hi, ", "my name ", "is Sem");
            Console.WriteLine(nameConcat);

            nameConcat = string.Join(" ", "Hi,", "my name", "is Sem");
            Console.WriteLine(nameConcat);

            string newName = nameConcat.Insert(0, "Ciao, ");
            Console.WriteLine(newName);

            newName = nameConcat.Remove(0, 1);
            Console.WriteLine(newName);

            string replaced = newName.Replace('o', '0');
            Console.WriteLine(replaced);

            string data = "12;28;34;25;64";
            string[] splitData = data.Split(';');
            string first = splitData[0];

            Console.WriteLine(first);

            char[] chars = nameConcat.ToCharArray();
            Console.WriteLine(chars[5]);

            Console.WriteLine("Lower case");
            string lower = nameConcat.ToLower();
            Console.WriteLine(lower);

            Console.WriteLine("Upper case");
            string upper = nameConcat.ToUpper();
            Console.WriteLine(upper);

            Console.WriteLine("StringBuilder");
            Console.WriteLine("Press any key");
            Console.ReadKey();
            StringBuilder sb = new StringBuilder();
            sb.Append("My ");
            sb.Append("name ");
            sb.Append("is ");
            sb.Append("Sem");
            sb.AppendLine("!");
            sb.AppendLine("Hello!");

            string sbTostr = sb.ToString();
            Console.WriteLine(sbTostr);

        }
    }
}