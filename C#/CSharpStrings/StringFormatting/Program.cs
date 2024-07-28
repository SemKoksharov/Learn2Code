namespace StringFormatting
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = "Sem";
            int age = 31;

            string standatrConcat = "My name is " + name + " and I'm " + age;
            Console.WriteLine(standatrConcat);

            string placeholders = string.Format("My name is {0} and I'm {1}", name, age);
            Console.WriteLine(placeholders);

            string interpolation = $"My name is {name} and I'm {age}";
            Console.WriteLine(interpolation);

            string strNew = "My name is \nSem";
            string tabulated = "\tI'm 31";
            Console.WriteLine(string.Concat(strNew, tabulated));

            string envNewLine = string.Concat($"{name}{Environment.NewLine}I'm {age}"); // work correctly in all OS
            Console.WriteLine(envNewLine);

            string str = "I'm a \"Good\" programmer";
            string path = "C:\\Downloads\\maledetta_merda\\";
            Console.WriteLine(str);
            Console.WriteLine(path);

            string verbatimString = @"C:\WindowsIsShit\useLinux\where\paths\withoutBackslashes\";
            Console.WriteLine(verbatimString);

            int answer = 42;
            string res = string.Format("{0:d}", answer);
            string res2 = string.Format("{0:d4}", answer);
            Console.WriteLine(res);
            Console.WriteLine(res2);

            res = string.Format("{0:f}", answer);
            res2 = string.Format("{0:f4}", answer);
            Console.WriteLine(res);
            Console.WriteLine(res2);
            
            double answer1 = 42.79;
            res = string.Format("{0:f}", answer1);
            res2 = string.Format("{0:f1}", answer1);
            Console.WriteLine(res);
            Console.WriteLine(res2);

            double money = 32.8;
            res = string.Format("{0:C}", money);
            res2 = string.Format("{0:C2}", money);
            Console.WriteLine(res);
            Console.WriteLine(res2);

            Console.WriteLine(money.ToString("C2"));

            string newRes = $"{money:C2}";
            Console.WriteLine($"New Result = {newRes}");
        }
    }
}