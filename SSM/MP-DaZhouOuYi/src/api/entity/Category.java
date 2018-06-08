package api.entity;

import java.util.Date;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.type
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.product_type_img
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String productTypeImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.type_extend
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String typeExtend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.type
     *
     * @return the value of category.type
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.type
     *
     * @param type the value for category.type
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.delete_time
     *
     * @return the value of category.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.delete_time
     *
     * @param deleteTime the value for category.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.update_time
     *
     * @return the value of category.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.update_time
     *
     * @param updateTime the value for category.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_time
     *
     * @return the value of category.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_time
     *
     * @param createTime the value for category.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.product_type_img
     *
     * @return the value of category.product_type_img
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getProductTypeImg() {
        return productTypeImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.product_type_img
     *
     * @param productTypeImg the value for category.product_type_img
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setProductTypeImg(String productTypeImg) {
        this.productTypeImg = productTypeImg == null ? null : productTypeImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.type_extend
     *
     * @return the value of category.type_extend
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getTypeExtend() {
        return typeExtend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.type_extend
     *
     * @param typeExtend the value for category.type_extend
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setTypeExtend(String typeExtend) {
        this.typeExtend = typeExtend == null ? null : typeExtend.trim();
    }
}