var footer = document.createElement("footer");
// document.body.insertBefore(footer,document.body.firstElementChild);
document.body.insertBefore(footer, document.body.lastElementChild);
footer.innerHTML = "<div class=\"sub-foot\">\n" +
    "        <div style=\"text-align: center;\">\n" +
    "            <span style=\"font-size: smaller; color: #525D76; \">\n" +
    "                <em>Copyright © 2020, Kevin KDA. All Rights Reserved.</em>\n" +
    "            </span>\n" +
    "        </div>\n" +
    "    </div>";
// footer.className="footer";
footer.style.position = "fixed";
footer.style.left = "0px";
footer.style.bottom = "0px";
footer.style.width = "100%";
footer.style.height = "23px";
footer.style.backgroundColor = "#f9f9f9";
footer.style.zIndex = "9999";