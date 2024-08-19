using System.Globalization;

namespace StringComparison
{
    // String comparison lesson
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = "abcde";
            string str2 = "abcde";

            bool areEqual = str1 == str2;

            Console.WriteLine($"str1 and str2 are equals = {areEqual}");

            string str3 = "Straße"; // Contains German character ß
            string str4 = "Strasse"; //Equivalent with double s (ss)
           
            CultureInfo germanianCulture = new CultureInfo("de-DE");
            CompareInfo compareInfo = germanianCulture.CompareInfo;
            
            bool areEqualsInvariant = string.Equals(str3, str4, System.StringComparison.InvariantCulture);
            bool areEqualsOrdinal = string.Equals(str3, str4, System.StringComparison.Ordinal);
            bool areEqualscurrentCulture = string.Equals(str3, str4, System.StringComparison.CurrentCulture);
            bool areEqualsGerman = compareInfo.Compare(str1, str2, CompareOptions.IgnoreCase) == 0;
           // Why so?
            Console.WriteLine($"Are equals ordinal  = {areEqualsOrdinal}");
            Console.WriteLine($"Are equals invariant  = {areEqualsInvariant}");
            Console.WriteLine($"Are equals CurrentCulture  = {areEqualscurrentCulture}");
            Console.WriteLine($"Are equals German  = {areEqualsGerman}");
        }
    }
}