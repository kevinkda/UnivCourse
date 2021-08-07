//图片类型验证
function verificationPicFile(file) {
    console.log(111)
    let fileTypes = [".jpg", ".png"];
    let filePath = file.value;
    //当括号里面的值为0、空字符、false 、null 、undefined的时候就相当于false
    if (filePath) {
        console.log(222)
        let isNext = false;
        let fileEnd = filePath.substring(filePath.indexOf("."));
        for (let i = 0; i < fileTypes.length; i++) {
            if (fileTypes[i] == fileEnd) {
                isNext = true;
                break;
            }
        }
        if (!isNext) {
            console.log(444)
            alert('不接受此文件类型');
            file.value = "";
            return false;
        }
    } else {
        return false;
    }
}

//图片大小验证
function verificationPicFile(file) {
    console.log(555)
    let fileSize = 0;
    let fileMaxSize = 1024;//1M
    let filePath = file.value;
    if (filePath) {
        fileSize = file.files[0].size;
        let size = fileSize / 1024;
        if (size > fileMaxSize) {
            alert("文件大小不能大于1M！");
            file.value = "";
            return false;
        } else if (size <= 0) {
            alert("文件大小不能为0M！");
            file.value = "";
            return false;
        }
    } else {
        return false;
    }
}

//图片尺寸验证
function verificationPicFile(file) {
    console.log(666)
    let filePath = file.value;
    if (filePath) {
        //读取图片数据
        let filePic = file.files[0];
        let reader = new FileReader();
        reader.onload = function (e) {
            let data = e.target.result;
            //加载图片获取图片真实宽度和高度
            let image = new Image();
            image.onload = function () {
                let width = image.width;
                let height = image.height;
                if (width == 720 | height == 1280) {
                    alert("文件尺寸符合！");
                } else {
                    alert("文件尺寸应为：720*1280！");
                    file.value = "";
                    return false;
                }
            };
            image.src = data;
        };
        reader.readAsDataURL(filePic);
    } else {
        return false;
    }
}