package api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import api.dao.banner.BannerMapper;
import api.dao.category.CategoryMapper;
import api.entity.Banner;
import api.entity.Category;
import api.service.IndexService;
@Service
public class IndexServiceImpl implements IndexService {
     @Resource
     private BannerMapper bannerMapper;
     @Resource
     private CategoryMapper categoryMapper;
     
	@Override
	public List<Banner> bannerList() {
		List<Banner>list=bannerMapper.getBannerList();
		return list;
	}
	
	@Override
	public List<Category> getCategorys() {
		List<Category>list=categoryMapper.getCategoryList();
		return list;
	}
	
	

      
}
