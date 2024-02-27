bt_slide74_c2
using System;

namespace SumOfEvenNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int sumOfEvenNumbers = SumOfEven(numbers);
            Console.WriteLine("Tổng các số chẵn trong mảng là: " + sumOfEvenNumbers);
        }
        static int SumOfEven(int[] arr)
        {
            int sum = 0;
            foreach (int num in arr)
            {
                if (num % 2 == 0)
                {
                    sum += num;
                }
            }
            return sum;
        }
    }
}
