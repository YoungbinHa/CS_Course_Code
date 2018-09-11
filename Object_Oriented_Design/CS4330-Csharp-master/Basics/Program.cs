using System;

namespace Basics
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            const uint sample1 = 0x3A;
            uint sample2 = 58;

            int heartRate = 85;
            double deposits = 135002796.0;
            const float acceleration = 9.800F;
            float mass = 14.6F;
            double distance = 129.763001;
            bool lost = true;
            bool expensive = true;
            int choice = 2;
            const char integral = '\u222B';
            const string greeting = "Hello";
            string name = "Karen";


            string result;

            if (sample1 == sample2)
                result = "The samples are equal";
            else
                result = "The sample are not equal";
            Console.WriteLine(result);



            if (heartRate >= 40 && heartRate <= 80)
                result = "Heart rate is normal";
            else
                result = "Heart rate is not normal";
            Console.WriteLine(result);



            if (deposits >= 100000000)
                result = "You are exceedingly wealthy";
            else
                result = "Sorry you are so poor";
            Console.WriteLine(result);

            float force = mass * acceleration;
            Console.WriteLine("force = {0}", force);
            Console.WriteLine("{0} is the distance", distance);



            if (lost == true && expensive == true)
                result = "You are exceedingly wealthy";
            else if (lost == true && expensive == false)
                result = "Sorry you are so poor";
            Console.WriteLine(result);

            switch (choice)
            {
                case 1:
                    Console.WriteLine("You chose 1");
                    break;
                case 2:
                    Console.WriteLine("You chose 2");
                    break;
                case 3:
                    Console.WriteLine("You chose 3");
                    break;
                default:
                    Console.WriteLine("You made an unknown choice");
                    break;
            }
            Console.WriteLine(result);
            Console.WriteLine("{0} is an integral", integral);

            for (int i = 5; i <= 10; i++)
            {
                Console.WriteLine("i = {0}", i);
            }
            int age = 0;
            while (age < 6){
                Console.WriteLine("age = {0}", age);
                age++;
            }
            Console.WriteLine(greeting+" "+name);;

        }
    }
}