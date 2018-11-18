package com.icy.service;

import org.springframework.web.multipart.MultipartFile;

import com.icy.common.pojo.PictureResult;

public interface PictureService {
	PictureResult uploadPicture(MultipartFile uploadfile) ;

}
