// See https://aka.ms/new-console-template for more information

using System.Text;

namespace _1_CSharpBasics
{
    internal class Program
    { // HELLO AND WELCOME. HERE I WILL LEARN C# BASICS
        static void Main(String[] args)
        {
            Console.WriteLine("Hello, World!");
            Console.Write("Press any key to continue......");
            Console.ReadKey();

            int x, y;
            x = 5;
            y = 2;

            float result = Convert.ToSingle(x) / y;
            Console.WriteLine("\n");
            Console.WriteLine("Division result: " + result);

            int timeInMinutes = 143;
            int hour;
            int minutes;

            hour = timeInMinutes / 60;
            minutes = timeInMinutes % 60;

            Console.WriteLine("total minutes: " + timeInMinutes);
            Console.WriteLine("hours: " + hour);
            Console.WriteLine("minutes: " + minutes);

            Console.Write("Press any key to continue......");
            Console.ReadKey();

            string name = "Petya";
            int age = 5;
            //                                               priority()
            string message = "Hi , tomorrow  you will be " + (age + 1) + " years old";
            Console.WriteLine(message);

            Console.WriteLine($"Name: {name} Age: {age}");


            Console.WriteLine("Press any key to continue......");
            Console.ReadKey();

            string input = "15";
            age = Convert.ToInt32(input);
            Console.WriteLine($"New age: {age}");

            Console.WriteLine("Press any key to stop app......");
            Console.ReadKey();
            int trigger = 1;
            bool boolTrigger = Convert.ToBoolean(trigger);

            Console.WriteLine("ti durak? = " + Convert.ToBoolean(boolTrigger));

            boolTrigger = false;
            int triggerBool = Convert.ToInt32(boolTrigger);

            Console.WriteLine("Converted bool to int  " + triggerBool);

            Console.WriteLine("Press any key to continue......");
            Console.ReadKey();
            //for windows to input/output Cyrillic alphabet
            // when working under Linux this problem does not exist
            // but considering that programs are mainly written for Windows, this may be useful
            Console.InputEncoding = Encoding.UTF8; // или UTF8
            Console.OutputEncoding = Encoding.UTF8;

            Console.WriteLine("Напиши своё имя, деревнщина");
            string name1 = Console.ReadLine();

            Console.WriteLine("Сколько тебе годиков?");
            int age1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine($"Hi, {name1}");

            Console.WriteLine("Press any key to continue......");
            Console.ReadKey();

            Console.WriteLine("decrement/increment");
            age1++;
            Console.WriteLine(age1);
            Console.WriteLine(age1++);
            Console.WriteLine(++age1);

            int a = 0;
            //                  /_______5_________////___1__///___6____/
            //                 / 1     2   1   1       "1"     3  * 2 =  516 
            Console.WriteLine((++a) + 2 + 1 + (a++) + "1" + (++a) * 2);
            //                        /DECREMENT has priority! /
            Console.WriteLine(" INCREMENT/DECREMENT has priority!");
        }
    }
}