using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Web;
using DotNet.Utilities;

namespace WebApplication20191128
{
    /// <summary>
    /// Thum 的摘要说明
    /// </summary>
    public class Thum : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";

            string ImgPath = context.Request.MapPath("/Image/img.jpg");
            //using (Bitmap map = new Bitmap(140, 140))
            //{
            //    using (Graphics g = Graphics.FromImage(map))
            //    {
            //        using (Image img=Image.FromFile(ImgPath))
            //        {
            //            g.DrawImage(img, new Rectangle(0, 0, map.Width, map.Height));
            //            string newFileName = Guid.NewGuid().ToString();
            //            map.Save(context.Request.MapPath("/Image/"+newFileName+".jpg"),System.Drawing.Imaging.ImageFormat.Jpeg);

            //        }
            //    }
            //}
            string newFileName=Guid.NewGuid().ToString();
            string newPath=context.Request.MapPath("/Image/"+newFileName+".jpg");
            ImageClass.MakeThumbnail(ImgPath, newPath, 140, 140, "w");
            //ImageClass.MakeThumbnail(ImgPath, newPath, 140, 140, "CUT");
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