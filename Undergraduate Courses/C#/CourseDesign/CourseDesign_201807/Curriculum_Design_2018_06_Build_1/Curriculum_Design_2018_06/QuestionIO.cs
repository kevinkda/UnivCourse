using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Curriculum_Design_2018_06
{
    class QuestionIO
    {
        public Question getQuestion(string path)
        {
            FileStream fs = new FileStream(path, FileMode.Open);
            StreamReader sr = new StreamReader(fs, Encoding.Default);

            string sReadLine;
            Question q = null;
            while ((sReadLine = sr.ReadLine()) != null)
            {
                string sFirst = sReadLine.Substring(0, 1);
                string sSecond = sReadLine.Substring(1, 1);
                if (sFirst == "#" && sSecond != "#")
                {
                    q = new Question();
                    q.Title = sReadLine;
                    Console.WriteLine("题目标题：" + sReadLine);
                }
                else if (sFirst == "A" && sSecond == " ")
                {
                    q = new Question();
                    q.Option_A = sReadLine;
                    Console.WriteLine("题目标题：" + sReadLine);
                }
                else if (sFirst == "B" && sSecond == " ")
                {
                    q = new Question();
                    q.Option_B = sReadLine;
                    Console.WriteLine("题目标题：" + sReadLine);
                }
                else if (sFirst == "C" && sSecond == " ")
                {
                    q = new Question();
                    q.Option_C = sReadLine;
                    Console.WriteLine("题目标题：" + sReadLine);
                }
                else if (sFirst == "D" && sSecond == " ")
                {
                    q = new Question();
                    q.Option_D = sReadLine;
                    Console.WriteLine("题目标题：" + sReadLine);
                }
                else if (sFirst == "#" && sSecond == "#") 
                {
                    q = new Question();
                    q.Answer = sReadLine;
                    Console.WriteLine("标答：" + sReadLine);
                }
            }
        }
    }
}
