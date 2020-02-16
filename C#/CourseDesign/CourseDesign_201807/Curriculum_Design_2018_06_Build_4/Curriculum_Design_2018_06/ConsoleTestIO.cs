using System;
using System.IO;
using System.Text;

namespace ConsoleTestIO
{
    class Program
    {
        public static void Read(string path)
        {
            FileStream fs = new FileStream(path, FileMode.Open);
            StreamReader sr = new StreamReader(fs, Encoding.Default);
            string strReadLine;

            while ((strReadLine = sr.ReadLine()) != null)
            {
                Console.WriteLine(strReadLine);
            }
        }

        static void Main(string[] args)
        {
            Read(@"D:\CSHARP\西游记期末考试题.exam");
            Console.ReadKey();
        }
    }
}