package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.base;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

/**
 * @author Kevin KDA on 2020/10/8 16:50
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.base
 * @classname BaseController
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class BaseController {
    //2,3
    public List<String> getDelData(String ids) {
        List<String> list = new ArrayList<String>();
        StringBuffer buff = new StringBuffer(ids);
        buff.delete(ids.length() - 1, ids.length());
        //System.out.println(buff.toString());
        String temp[] = ids.split(",");
        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i]);
        }
        return list;
    }

    //封装的目的是为了能够拿到前端的所有数据
    public Map<String, Object> getParamData(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        //最后组装成的map
        Map<String, Object> mapAll = new HashMap<String, Object>();
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            //String 类型的key
            String key = it.next();
            String[] value = map.get(key);
            // System.out.println(value[0]);
            Object value1 = value[0];
            mapAll.put(key, value1);
        }
        return mapAll;
    }


    //组成分页的map
    public Map<String, Object> getPageData(Map<String, Object> map, int totalCount) {
        int pageIndex = 0;
        int pageSize = 0;
        int totalPage = 0;
        int start = 0;
        if (map.get("pageIndex") != null && !map.get("pageIndex").toString().equals("") && map.get("pageSize") != null && !map.get("pageSize").toString().equals("")) {
            //证明我是要分页的
            //我需要得到总的数量
            //得到当前页是多少
            pageIndex = Integer.parseInt(map.get("pageIndex").toString());
            //得到每页最大条数是多少
            pageSize = Integer.parseInt(map.get("pageSize").toString());
            //总的页数
            totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
            //得到索引号
            start = (pageIndex - 1) * pageSize;
            map.put("pageIndex", pageIndex);
            map.put("pageSize", pageSize);
            map.put("totalPage", totalPage);
            map.put("start", start);
            map.put("totalCount", totalCount);
        }
        return map;

    }


    public String upload(@RequestParam("attr") MultipartFile file) throws Exception {
        //System.out.println("insertPerson");
        //接受文件，并且需要上传到对应的页面
        //得到文件的名字
        String fileName = file.getOriginalFilename();
        // System.out.println(fileName);
        //System.out.println(fileName.lastIndexOf("."));
        //.jpg
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //将原来的文件的名字改成新的名字
        String newFileName = "/img/" + UUID.randomUUID().toString() + suffixName;
        //System.out.println("newFileName"+newFileName);
        // String filePath = ClassUtils.getDefaultClassLoader().getResource("static").getPath() + newFileName;
        String filePath = "D:" + newFileName;
        System.out.println(filePath);
        FileOutputStream out = new FileOutputStream(filePath);
        //文件输入流
        InputStream in = file.getInputStream();
        IOUtils.copy(in, out);
        in.close();
        ;
        out.close();
        return newFileName;
    }

}
