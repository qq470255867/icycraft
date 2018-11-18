package com.icy.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.icy.common.pojo.PictureResult;
import com.icy.common.utils.FtpUtil;
import com.icy.common.utils.IDUtils;
/**
 * �ϴ�ͼƬ�������ʵ����
 * <p>Title: PictureService</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	������
 * @date	2015��8��15������2:59:38
 * @version 1.0
 */
@Service
public class PictureServiceImpl implements PictureService {

	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	@Value("${FILI_UPLOAD_PATH}")
	private String FILI_UPLOAD_PATH;
	@Value("${FTP_SERVER_IP}")
	private String FTP_SERVER_IP;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;

	@Override
	public PictureResult uploadPicture(MultipartFile uploadFile) {

		// �ϴ��ļ�����ʵ��
		String path = savePicture(uploadFile);
		// ����
		PictureResult result = new PictureResult(0, IMAGE_BASE_URL + path);
		return result;
	}

	private String savePicture(MultipartFile uploadFile) {
		String result = null;
		try {
			// �ϴ��ļ�����ʵ��
			// �ж��ļ��Ƿ�Ϊ��
			if (uploadFile.isEmpty())
				return null;
			// �ϴ��ļ�������Ϊ��λ�ֿ���ţ��������ͼƬ�Ĳ�ѯ�ٶ�
			String filePath = "/" + new SimpleDateFormat("yyyy").format(new Date()) + "/"
					+ new SimpleDateFormat("MM").format(new Date()) + "/"
					+ new SimpleDateFormat("dd").format(new Date());

			// ȡԭʼ�ļ���
			String originalFilename = uploadFile.getOriginalFilename();
			// ���ļ���
			String newFileName = IDUtils.genImageName() + originalFilename.substring(originalFilename.lastIndexOf("."));
			// ת���ļ����ϴ���ftp������
			FileInputStream fis = (FileInputStream) uploadFile.getInputStream();
			//FileOutputStream fos = new FileOutputStream("d:\\files\\"+newFileName);
			FileOutputStream fos = new FileOutputStream("/root/www/images"+newFileName);
	        int n = 0;
	        
	        File myPath = new File( filePath );  
	        if ( !myPath.exists()){//����Ŀ¼�����ڣ��򴴽�֮  
	            myPath.mkdir();  
	            
	        }  
	        while ((n = fis.read()) != -1) {
                fos.write(n);
            }

            fis.close();
            fos.close();

			
			result = filePath + "/" + newFileName;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}