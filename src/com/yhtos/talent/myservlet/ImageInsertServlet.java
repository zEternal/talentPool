package com.yhtos.talent.myservlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ImageInsertServlet", urlPatterns = "/ImageInsertServlet")
public class ImageInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = "/home/eternal/user-star/k";
        File file = new File(savePath);

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

            //正则匹配，过滤路径取文件名
            //String regExp = ".+\\\\(.+)$";
            //Pattern p = Pattern.compile(regExp);

            String fileName = "";
            for (FileItem item : list) {
                String name = item.getFieldName();
                String fileType = item.getContentType();
                //name = name.substring(name.lastIndexOf("\\") + 1);   //排除文件名中的地址符号\/
                String newName = System.currentTimeMillis() + "";
                fileName = savePath + "/l/" + "star_"  + name + "_" + newName + ".jpg";
                System.out.println("filenameppp======" + fileName);
                item.write(new File(fileName));
            }
            message = "文件上传成功！";
        } catch (Exception e) {
            message = "文件上传失败！";
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
