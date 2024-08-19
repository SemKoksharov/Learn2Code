using System.Globalization;

namespace DateAndTime
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime now = DateTime.Now;
            string dateString = now.ToString();

            Console.WriteLine($"It's {now.Date}, {now.Hour} : {now.Minute}");

            DateTime dt = new DateTime(2016, 2, 28);
            DateTime newDt = dt.AddDays(1);
            
            Console.WriteLine($"Date time: {dt}");
            Console.WriteLine($"New date time: {newDt}");

            TimeSpan ts = now - dt;
            //  ts = now.Subtract(dt);  // these expressions are the same

            Console.WriteLine($"Duration in days: {ts.Days}, total days: {ts.TotalDays}, Duration in hours: {ts.Hours}");
        }
    }
}