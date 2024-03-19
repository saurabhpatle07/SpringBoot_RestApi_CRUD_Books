package com.api.book.bootrestbook.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadHelper  {
    // public String upload_url
    // ="C:\\Users\\patle\\Desktop\\springbootproject\\bootrestbook\\src\\main\\resources\\static\\image";
    public String upload_url = new ClassPathResource("/static/image").getFile().getAbsolutePath();
    public UploadHelper() throws Exception
    {

    }
    public boolean isUploaded(MultipartFile multipartFile) {
        boolean f = true;

        try {
            // InputStream is = multipartFile.getInputStream();
            // byte b[] = new byte[is.available()];
            // is.read(b);

            // FileOutputStream fos = new
            // FileOutputStream(upload_url+File.separator+multipartFile.getOriginalFilename());
            // fos.write(b);
            // fos.flush();
            // fos.close();

            Files.copy(multipartFile.getInputStream(),
                    Paths.get(upload_url + File.separator + multipartFile.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }
}
