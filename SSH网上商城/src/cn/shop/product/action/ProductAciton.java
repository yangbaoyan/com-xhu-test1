package cn.shop.product.action;

import java.util.List;

import cn.shop.category.entity.Category;
import cn.shop.category.service.CategoryService;
import cn.shop.product.entity.Product;
import cn.shop.product.service.ProductService;
import cn.shop.util.PageBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class ProductAciton extends ActionSupport implements ModelDriven<Product>{
	//添加product驱动模型-----》驱动模型里属性的值在栈顶
    private Product product=new Product();
	@Override
	public Product getModel() {
		return product;
	}
    //注入productService 
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	//接收传过来的参数，因为它不属于product,不能用模型驱动
	private Integer cid;
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCid() {
		return cid;
	}
	//接收传过来的当前页数的参数，因为它不属于product,不能用模型驱动
	private Integer pageno;
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	//注入一级分类，因为一级分类已经在category里面查询出来了，存在session里面的
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
   //点击图片跳转到单个商品信息
	public String getProduct(){
		product=productService.getProduct(product.getPid());
		return "findByProduct";
	}
	//
	public String findByCid(){
		//List<Category> list=categoryService.findAll();
		//根据一级商品的id分页查找二级下的商品
		PageBean<Product> pageBean=productService.findProList(cid,pageno);
		System.out.println(cid);
		System.out.println(pageno);
		System.out.println(pageBean.getPagesize());
		System.out.println(pageBean.getTotalpage());
		System.out.println(pageBean.getPageno());
		//保存的值栈
		ActionContext.getContext().getValueStack().set("cidprolist", pageBean);
		return "findByCid";
	}
	
	
	
	
}
