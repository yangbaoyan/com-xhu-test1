package api.entity;

import java.util.Date;

public class Image {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.url
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.product_property_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    private Integer productPropertyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.id
     *
     * @return the value of image.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.id
     *
     * @param id the value for image.id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.url
     *
     * @return the value of image.url
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.url
     *
     * @param url the value for image.url
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.delete_time
     *
     * @return the value of image.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.delete_time
     *
     * @param deleteTime the value for image.delete_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.update_time
     *
     * @return the value of image.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.update_time
     *
     * @param updateTime the value for image.update_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.create_time
     *
     * @return the value of image.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.create_time
     *
     * @param createTime the value for image.create_time
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.product_property_id
     *
     * @return the value of image.product_property_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public Integer getProductPropertyId() {
        return productPropertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.product_property_id
     *
     * @param productPropertyId the value for image.product_property_id
     *
     * @mbg.generated Fri Jun 08 17:30:40 CST 2018
     */
    public void setProductPropertyId(Integer productPropertyId) {
        this.productPropertyId = productPropertyId;
    }
}