/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

function footerFixedBottom() {
    let footer = document.createElement("footer");
// document.body.insertBefore(footer,document.body.firstElementChild);
    document.body.insertBefore(footer, document.body.lastElementChild);
    footer.innerHTML = "<div class=\"sub-foot\">\n" +
        "        <div style=\"text-align: center;\">\n" +
        "            <span style=\"font-size: smaller; color: #525D76; \">\n" +
        "                <em class=\"complete\" style=\"font-style: normal;text-align: left;line-height: 23px;\">Modification Date: March 03, 2020&nbsp;&nbsp;</em>\n" +
        "                <em style=\"line-height: 23px;\">Designed and developed by Kevin Tang. </em>\n" +
        "                <em style=\"line-height: 23px;\">Copyright © 2020 kevinkda.cn. All Rights Reserved.&nbsp;&nbsp;</em>\n" +
        "                <span style=\"line-height: 23px;\"><a href=\"http://www.beian.miit.gov.cn\" id=\"miit\"\n" +
        "                                                  style=\"font-style: normal;font-size: 11px\" target=\"_blank\">鄂ICP备20002718号</a></span>\n" +
        "            </span>\n" +
        "        </div>\n" +
        "    </div>";
    footer.className = "footer";
    footer.style.position = "fixed";
    footer.style.left = "0px";
    footer.style.bottom = "0px";
    footer.style.width = "100%";
    footer.style.height = "23px";
    footer.style.backgroundColor = "#f9f9f9";
// footer.style.backgroundColor = "#141c30";
    footer.style.zIndex = "9999";
}

// Designed and developed by Dandy Weng.

// Copyright © 2010-2020 dandyweng.com. All Rights Reserved.