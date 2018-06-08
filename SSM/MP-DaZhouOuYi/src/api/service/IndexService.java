package api.service;

import java.util.List;

import api.entity.Banner;
import api.entity.Category;

public interface IndexService {

	List<Banner> bannerList();

	List<Category> getCategorys();


}
