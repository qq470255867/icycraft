package com.icy.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.common.pojo.EUTreeNode;
import com.icy.common.pojo.TaotaoResult;
import com.icy.mapper.TbContentCategoryMapper;
import com.icy.pojo.TbContentCategory;
import com.icy.pojo.TbContentCategoryExample;
import com.icy.pojo.TbContentCategoryExample.Criteria;
@Service
public class ContentCatgoryServiceImpl implements ContentCatgoryService {
	
	@Autowired 
	TbContentCategoryMapper contentCategoryMapper;
	

	@Override
	
	public List<EUTreeNode> getContentCatgory(long parentId) {
		// 鏍规嵁parentId鏌ヨ鑺傜偣鍒楄〃
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//鎵ц鏌ヨ
		List<TbContentCategory> list =contentCategoryMapper.selectByExample(example);
		List< EUTreeNode> resultlist= new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			//鍒涘缓涓�涓妭鐐�
			EUTreeNode node = new EUTreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			
			resultlist.add(node);
			
		}
		return resultlist;
	}


	@Override
	public TaotaoResult insertContentCatgory(long parentId, String name) {
		// 娣诲姞鑺傜偣
		TbContentCategoryExample example = new TbContentCategoryExample();
		//鍒涘缓涓�涓猵ojo
		TbContentCategory contentCategory = new TbContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		contentCategory.setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		
		contentCategoryMapper.insert(contentCategory);
		//鏌ョ湅鐖惰妭鐐圭殑isparent鏄惁涓簍rue锛屼笉涓簍ure鍒欐敼涓簍rue
		TbContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		if (!parentCat.getIsParent()) {
			parentCat.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(parentCat);
			
		}
		return TaotaoResult.ok(contentCategory);
	}

}
