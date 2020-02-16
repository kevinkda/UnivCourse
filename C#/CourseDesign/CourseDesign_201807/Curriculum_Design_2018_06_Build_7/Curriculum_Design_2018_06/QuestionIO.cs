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
        public List<Question> GetQuestion(string path)
        {
            List<Question> qList = new List<Question>();

            FileStream fs = new FileStream(path, FileMode.Open);
            StreamReader sr = new StreamReader(fs, Encoding.Default);

            string sReadLine;
            Question q = null;
            while ((sReadLine = sr.ReadLine()) != null)
            {
                if (sReadLine.Trim()==" ")
                {
                    //  忽略空白行
                    continue;
                }
                string sFirst = sReadLine.Substring(0, 1);
                string sSecond = sReadLine.Substring(1, 1);
                if (sFirst == "#" && sSecond != "#")
                {
                    q = new Question();
                    q.Title = sReadLine.Substring(3);
                    Console.WriteLine("题目标题：" + sReadLine.Substring(3));
                }
                else if (sFirst == "A" && sSecond == " ")
                {
                    //  q = new Question();
                    q.Option_A = sReadLine;
                    Console.WriteLine("选项A：" + sReadLine);
                }
                else if (sFirst == "B" && sSecond == " ")
                {
                    //  q = new Question();
                    q.Option_B = sReadLine;
                    Console.WriteLine("选项B：" + sReadLine);
                }
                else if (sFirst == "C" && sSecond == " ")
                {
                    //  q = new Question();
                    q.Option_C = sReadLine;
                    Console.WriteLine("选项C：" + sReadLine);
                }
                else if (sFirst == "D" && sSecond == " ")
                {
                    //  q = new Question();
                    q.Option_D = sReadLine;
                    Console.WriteLine("选项D：" + sReadLine);
                }
                else if (sFirst == "#" && sSecond == "#") 
                {
                    //  q = new Question();
                    q.Answer = sReadLine.Substring(2);
                    Console.WriteLine("标答：" + sReadLine.Substring(2));
                    qList.Add(q);
                }
            }
            //  关闭文件
            sr.Close();
            fs.Close();
            return qList;
        }
    }
}
