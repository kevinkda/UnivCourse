count = 1;
function add(){
    //通过创造节点来将得出的元素刷入到div里面去
    //先创造p元素节点信息在创造text最后将text放入p里面，在将p放入到divall里面
    let nodeP=document.createElement("p");//创造p标签
    let nodeText=document.createElement("input");
    nodeText.setAttribute("type","text");
    nodeP.innerHTML = ' 账号:';
    nodeP.appendChild(nodeText);//将文本框放入p标签里面去

    //创造p元素节点信息再创造两个radio最后将其放入p里面
    let nodeP2=document.createElement("p");//创造p标签
    let node2Text=document.createElement("input");
    let node2Text2=document.createElement("input");
    let node2Span=document.createElement("span");
    let node2Span2=document.createElement("span");
    node2Text.setAttribute("type","radio");
    node2Text.setAttribute("checked","checked");
    node2Text2.setAttribute("type","radio");
    node2Text.setAttribute("name","sex"+count);
    node2Text2.setAttribute("name","sex"+count);
    nodeP2.innerHTML = ' 性别:';
    node2Span.innerText = '男';
    node2Span2.innerText = '女';
    nodeP2.appendChild(node2Text);//将文本框放入p标签里面去
    nodeP2.appendChild(node2Span);//将文本框放入p标签里面去
    nodeP2.appendChild(node2Text2);//将文本框放入p标签里面去
    nodeP2.appendChild(node2Span2);//将文本框放入p标签里面去
    count++;

    //开始创造一个提交的按钮
    let nodeSubmitButton=document.createElement("input");//创造input标签
    nodeSubmitButton.setAttribute("type","button");//指定了类型是一个button
    nodeSubmitButton.setAttribute("value","提交");
    //写事件的
    nodeSubmitButton.onclick=function(){
        let sex = '';
        if(node2Text.checked === true){
            sex = '男';
        }else {
            sex = '女';
        }
        alert('您提交了一个名为：'+nodeText.value+'，性别为'+sex+'的信息。');
        //提交之后删掉这一个div，以免重复上传
        // document.getElementById("all").removeChild(nodeP);
        // document.getElementById("all").removeChild(nodeP2);
        // document.getElementById("all").removeChild(nodeDelButton);
        // document.getElementById("all").removeChild(nodeSubmitButton);
    }

    //开始创造一个删除的按钮
    let nodeDelButton=document.createElement("input");//创造input标签
    nodeDelButton.setAttribute("type","button");//指定了类型是一个button
    nodeDelButton.setAttribute("value","删除");
    //写事件的
    nodeDelButton.onclick=function(){
        document.getElementById("all").removeChild(nodeP);
        document.getElementById("all").removeChild(nodeP2);
        document.getElementById("all").removeChild(nodeDelButton);
        document.getElementById("all").removeChild(nodeSubmitButton);
    }
    //p标签加入删除按钮



    //在将p放入div
    document.getElementById("all").appendChild(nodeP);
    document.getElementById("all").appendChild(nodeP2);
    document.getElementById("all").appendChild(nodeDelButton);
    document.getElementById("all").appendChild(nodeSubmitButton);
    //匿名函数

}