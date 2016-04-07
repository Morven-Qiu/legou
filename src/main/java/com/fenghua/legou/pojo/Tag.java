package com.fenghua.legou.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TTag entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_tag"
    ,catalog="db_legou"
)

public class Tag  implements java.io.Serializable {


    // Fields    

     private Integer tagId;
     private String tagName;
     private String url;


    // Constructors

    /** default constructor */
    public Tag() {
    }

	/** minimal constructor */
    public Tag(String tagName) {
        this.tagName = tagName;
    }
    
    /** full constructor */
    public Tag(String tagName, String url) {
        this.tagName = tagName;
        this.url = url;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="tagId", unique=true, nullable=false)

    public Integer getTagId() {
        return this.tagId;
    }
    
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
    
    @Column(name="tagName", nullable=false, length=200)

    public String getTagName() {
        return this.tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    
    @Column(name="url", length=200)

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
   








}