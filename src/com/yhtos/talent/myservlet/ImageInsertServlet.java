package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ImageInsertServlet", urlPatterns = "/ImageInsertServlet")
public class ImageInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int statusCode = 0;//状态码
        String savePath = "/home/eternal/user-star/k";
        File file = new File(savePath);
        Map map = new HashMap();
        if (!file.exists()) {
            file.mkdir();
        }
        String message = "";
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024 * 100);
            factory.setRepository(file);

            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            List<FileItem> list = upload.parseRequest(request);

            String fileName = "";

            for (FileItem item : list) {
                String name = item.getFieldName();
                String fileType = item.getContentType();
                //name = name.substring(name.lastIndexOf("\\") + 1);   //排除文件名中的地址符号\/
                String newName = System.currentTimeMillis() + "";
                fileName = savePath + "/l/" + "star_"  + name + "_" + newName + ".jpg";
                map.put(name,fileName);
                //System.out.println("filenameppp======" + fileName);
                item.write(new File(fileName));
            }
            message = "文件上传成功！";
            statusCode = 10;//状态码
        } catch (Exception e) {
            message = "文件上传失败！";
            statusCode = 4;
            e.printStackTrace();
        }
        ////////////////////路径存数据库
        UsersInfoDAOImpl ud = new UsersInfoDAOImpl();
        //int n = ud.imgSave(map,(String)request.getSession().getAttribute("username"));
        int n = ud.imgSave(map,"jian456456789");
        if (n > 0){
            statusCode = 101;
            System.out.println("照片插入成功");
        }

        ////////////////////
        JSONObject resJson = new JSONObject();
        resJson.put("username",request.getSession().getAttribute("username"));
        resJson.put("statu",statusCode);

        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
