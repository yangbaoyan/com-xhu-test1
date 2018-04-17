package cn.shop.util;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private Integer pageno;//当前页数
    private Integer pagesize;//每页显示的商品数
    private Integer totalpage;//总的商品页数
    private Integer totalsize;//总的商品条数
    List<T> list=new ArrayList<T>();
	/**
	 * @return the pageno
	 */
	public Integer getPageno() {
		return pageno;
	}
	/**
	 * @param pageno the pageno to set
	 */
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	/**
	 * @return the pagesize
	 */
	public Integer getPagesize() {
		return pagesize;
	}
	/**
	 * @param pagesize the pagesize to set
	 */
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	/**
	 * @return the totalpage
	 */
	public Integer getTotalpage() {
		return totalpage;
	}
	/**
	 * @param totalpage the totalpage to set
	 */
	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}
	/**
	 * @return the totalsize
	 */
	public Integer getTotalsize() {
		return totalsize;
	}
	/**
	 * @param totalsize the totalsize to set
	 */
	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
	}
	/**
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
    
}
