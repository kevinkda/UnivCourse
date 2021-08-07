function insertData() {
    let f = document.getElementById("headPhoto").files[0];

    let fileParameters = {
        name: f.name,
        type: f.type,
        size: f.size,
        sizeKb: f.size / 1024,
        fileName: f.name.split("."),
        fileExtension: f.name.split(".")[f.name.split(".").length - 1],
        lastModified: f.lastModified,
        lastModifiedDate: f.lastModifiedDate,
        webkitRelativePath: f.webkitRelativePath
    };

    // document.getElementById("form-upfile").submit();

    let formData = new FormData();

    formData.append("headPhoto", f);
    formData.append("name", fileParameters.name);
    formData.append("type", fileParameters.type);
    formData.append("size", fileParameters.size);
    formData.append("sizeKb", fileParameters.sizeKb);
    formData.append("fileName", fileParameters.fileName);
    formData.append("fileExtension", fileParameters.fileExtension);
    formData.append("lastModified", fileParameters.lastModified);
    formData.append("lastModifiedDate", fileParameters.lastModifiedDate);
    formData.append("webkitRelativePath", fileParameters.webkitRelativePath);
    formData.append("fileParameters", fileParameters);
    // $.iBoxWait();

    $.ajax({
        url: "receivefile",
        type: "POST",
        async: false,
        dateType: "json",
        cache: false,
        contentType: false,
        processData: false,
        mimeType: "multipart/form-data",
        // data: {
        //     headPhoto: f,
        //     // headPhoto: new FormData($("#uploadForm")),
        //     fileParameters: fileParameters
        // }
        data: formData
    })

    // console.log(f);
    // console.log("name:" + f.name);
    // console.log("type:" + f.type);
    // console.log("size:" + f.size / 1024 + " kb");
    // let fileName = f.name.split(".");
    // let fileExtension = fileName[fileName.length - 1];
    // console.log("fileName:" + fileName);
    // console.log("fileExtension:" + fileExtension);
    // console.log("lastModified:" + f.lastModified);
    // console.log("lastModifiedDate:" + f.lastModifiedDate);
    // console.log("webkitRelativePath:" + f.webkitRelativePath);
    // console.log("__proto__:" + f.__proto__);
    // console.log(f.__proto__);
    // console.log(fileParameters);
}