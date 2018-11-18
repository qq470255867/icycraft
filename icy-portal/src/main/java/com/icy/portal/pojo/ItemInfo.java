package com.icy.portal.pojo;

import com.icy.pojo.TbItem;

public class ItemInfo extends TbItem {

	public String[] getimages() {
		String image = getImage();
		if (image != null) {
			String[] images = image.split(",");
			return images;
		}
		return null;
	}

}
