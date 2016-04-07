package com.fenghua.legou.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * TGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_goods"
    ,catalog="db_legou"
)

public class Goods  implements java.io.Serializable {


    // Fields    

     private Integer goodsId;
     private Bigsort TBigsort;
     private Smallsort TSmallsort;
     private User TUser;
     private String description;
     private Integer stock;
     private String condition;
     private String goodsName;
     private Double secPrice;
     private String picture;
     private Double price;
     private Set<OrderGoods> TOrderGoodses = new HashSet<OrderGoods>(0);


    // Constructors

    /** default constructor */
    public Goods() {
    }

	/** minimal constructor */
    public Goods(Bigsort TBigsort, Smallsort TSmallsort, User TUser, String description, Integer stock, String condition, String goodsName, Double secPrice, String picture, Double price) {
        this.TBigsort = TBigsort;
        this.TSmallsort = TSmallsort;
        this.TUser = TUser;
        this.description = description;
        this.stock = stock;
        this.condition = condition;
        this.goodsName = goodsName;
        this.secPrice = secPrice;
        this.picture = picture;
        this.price = price;
    }
    
    /** full constructor */
    public Goods(Bigsort TBigsort, Smallsort TSmallsort, User TUser, String description, Integer stock, String condition, String goodsName, Double secPrice, String picture, Double price, Set<OrderGoods> TOrderGoodses) {
        this.TBigsort = TBigsort;
        this.TSmallsort = TSmallsort;
        this.TUser = TUser;
        this.description = description;
        this.stock = stock;
        this.condition = condition;
        this.goodsName = goodsName;
        this.secPrice = secPrice;
        this.picture = picture;
        this.price = price;
        this.TOrderGoodses = TOrderGoodses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="goodsID", unique=true, nullable=false)

    public Integer getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bigsortId", nullable=false)

    public Bigsort getTBigsort() {
        return this.TBigsort;
    }
    
    public void setTBigsort(Bigsort TBigsort) {
        this.TBigsort = TBigsort;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="smallsortId", nullable=false)

    public Smallsort getTSmallsort() {
        return this.TSmallsort;
    }
    
    public void setTSmallsort(Smallsort TSmallsort) {
        this.TSmallsort = TSmallsort;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="userId", nullable=false)

    public User getTUser() {
        return this.TUser;
    }
    
    public void setTUser(User TUser) {
        this.TUser = TUser;
    }
    
    @Column(name="description", nullable=false, length=200)

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="stock", nullable=false)

    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    @Column(name="condition", nullable=false, length=10)

    public String getCondition() {
        return this.condition;
    }
    
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    @Column(name="goodsName", nullable=false, length=100)

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
    @Column(name="secPrice", nullable=false, precision=11, scale=0)

    public Double getSecPrice() {
        return this.secPrice;
    }
    
    public void setSecPrice(Double secPrice) {
        this.secPrice = secPrice;
    }
    
    @Column(name="picture", nullable=false, length=50)

    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    @Column(name="price", nullable=false, precision=11, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="TGoods")

    public Set<OrderGoods> getTOrderGoodses() {
        return this.TOrderGoodses;
    }
    
    public void setTOrderGoodses(Set<OrderGoods> TOrderGoodses) {
        this.TOrderGoodses = TOrderGoodses;
    }
   








}