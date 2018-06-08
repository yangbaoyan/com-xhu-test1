package api.entity;

import java.util.Date;

public class ProductProperty {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.name
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.detail
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.product_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_property.product_action
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String productAction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.id
     *
     * @return the value of product_property.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.id
     *
     * @param id the value for product_property.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.name
     *
     * @return the value of product_property.name
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.name
     *
     * @param name the value for product_property.name
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.detail
     *
     * @return the value of product_property.detail
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.detail
     *
     * @param detail the value for product_property.detail
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.product_id
     *
     * @return the value of product_property.product_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.product_id
     *
     * @param productId the value for product_property.product_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.delete_time
     *
     * @return the value of product_property.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.delete_time
     *
     * @param deleteTime the value for product_property.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.update_time
     *
     * @return the value of product_property.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.update_time
     *
     * @param updateTime the value for product_property.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.create_time
     *
     * @return the value of product_property.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.create_time
     *
     * @param createTime the value for product_property.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_property.product_action
     *
     * @return the value of product_property.product_action
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getProductAction() {
        return productAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_property.product_action
     *
     * @param productAction the value for product_property.product_action
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setProductAction(String productAction) {
        this.productAction = productAction == null ? null : productAction.trim();
    }
}