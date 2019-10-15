package de.telran;

import java.io.*;
import java.net.URL;

public class IODemo {




    private void copyBuf(InputStream is, OutputStream os) throws IOException{
        if (is != null && os != null){
            byte[] b = new byte[1024];
            int c = 0;

            while ((c = is.read(b)) > 0){
                os.write(b, 0, c);
            }
        }
    }

    public void copyURLToFile(String urlName, String target) throws IOException{
        InputStream urlIS = null;
        OutputStream fileOS = null;
        URL url = new URL(urlName);
        File fTarget = new File(target);
        if (!fTarget.exists()){
            fTarget.createNewFile();
        }
        urlIS = url.openStream();
        fileOS = new FileOutputStream(fTarget);

        copyBuf(urlIS, fileOS);
        if (urlIS != null){
            urlIS.close();
        }
        if (fileOS != null){
            fileOS.close();
        }
    }

}
