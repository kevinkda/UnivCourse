using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.IO;
using System.Drawing;

namespace WebApplication20191121
{
    /// <summary>
    /// UpFile 的摘要说明
    /// </summary>
    public class UpFile : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";
            HttpPostedFile file = context.Request.Files["file"];
            if (file == null)
            {
                context.Response.Write("请选择要上传的文件");
            }
            else
            {
                string filename = Path.GetFileName(file.FileName);
                string Extension = Path.GetExtension(filename);
                if (Extension == ".jpg" || Extension == ".gif" || Extension == ".png")
                {
                    //file.SaveAs(context.Request.MapPath("/Image/" + filename));


                    string dir = "/Image/" + DateTime.Now.Year + "/" + DateTime.Now.Month + "/" + DateTime.Now.Day + "/";
                    Directory.CreateDirectory(Path.GetDirectoryName(context.Request.MapPath(dir)));
                    string guid = Guid.NewGuid().ToString();
                    string fileNewName = dir + guid + Extension;
                    //file.SaveAs(context.Request.MapPath(fileNewName));
                    //context.Response.Write("上传成功");

                    /// GDI+
                    using (Image img = Image.FromStream(file.InputStream))
                    {
                        using (Bitmap map = new Bitmap(img.Width, img.Height))
                        {
                            using (Graphics g = Graphics.FromImage(map))
                            {
                                g.DrawImage(img, new Rectangle(0, 0, map.Width, map.Height));
                                g.DrawString("湖北工业大学", new Font("微软雅黑", 36.0f, FontStyle.Italic), Brushes.Green, new PointF(map.Width * 0.5f, map.Height * 0.8f));
                                map.Save(context.Request.MapPath(fileNewName));
                                context.Response.Write("上传成功");
                            }
                        }
                    }
                }
                else
                {
                    context.Response.Write("请选择图片类型上传");
                }
            }
        }

        public bool IsReusable
        {
            get
            {
                return false;
            }
        }
    }
}