package api.dao.image;

import java.util.List;

import api.entity.Image;

public interface ImageMapper {

	List<Image> getProductImgsByPropertyByProductId(Integer id);


}
