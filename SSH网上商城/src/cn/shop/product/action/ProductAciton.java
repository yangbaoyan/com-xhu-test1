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
	//���product����ģ��-----������ģ�������Ե�ֵ��ջ��
    private Product product=new Product();
	@Override
	public Product getModel() {
		return product;
	}
    //ע��productService 
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	//���մ������Ĳ�������Ϊ��������product,������ģ������
	private Integer cid;
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCid() {
		return cid;
	}
	//���մ������ĵ�ǰҳ���Ĳ�������Ϊ��������product,������ģ������
	private Integer pageno;
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	//ע��һ�����࣬��Ϊһ�������Ѿ���category�����ѯ�����ˣ�����session�����
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
   //���ͼƬ��ת��������Ʒ��Ϣ
	public String getProduct(){
		product=productService.getProduct(product.getPid());
		return "findByProduct";
	}
	//
	public String findByCid(){
		//List<Category> list=categoryService.findAll();
		//����һ����Ʒ��id��ҳ���Ҷ����µ���Ʒ
		PageBean<Product> pageBean=productService.findProList(cid,pageno);
		System.out.println(cid);
		System.out.println(pageno);
		System.out.println(pageBean.getPagesize());
		System.out.println(pageBean.getTotalpage());
		System.out.println(pageBean.getPageno());
		//�����ֵջ
		ActionContext.getContext().getValueStack().set("cidprolist", pageBean);
		return "findByCid";
	}
	
	
	
	
}
