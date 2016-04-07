package com.fenghua.legou.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * TOrderGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order_goods"
    ,catalog="db_legou"
)

public class OrderGoods  implements java.io.Serializable {


    // Fields    

     private Integer contentId;
     private Goods TGoods;
     private Order TOrder;
     private String goodsName;
     private Double goodsPrice;
     private Integer goodsNum;
     private Integer goodsCost;


    // Constructors

    /** default constructor */
    public OrderGoods() {
    }

    
    /** full constructor */
    public OrderGoods(Goods TGoods, Order TOrder, String goodsName, Double goodsPrice, Integer goodsNum, Integer goodsCost) {
        this.TGoods = TGoods;
        this.TOrder = TOrder;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsCost = goodsCost;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="contentId", unique=true, nullable=false)

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="goodsId", nullable=false)

    public Goods getTGoods() {
        return this.TGoods;
    }
    
    public void setTGoods(Goods TGoods) {
        this.TGoods = TGoods;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="orderId", nullable=false)

    public Order getTOrder() {
        return this.TOrder;
    }
    
    public void setTOrder(Order TOrder) {
        this.TOrder = TOrder;
    }
    
    @Column(name="goodsName", nullable=false, length=200)

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
    @Column(name="goodsPrice", nullable=false, precision=22, scale=0)

    public Double getGoodsPrice() {
        return this.goodsPrice;
    }
    
    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    
    @Column(name="goodsNum", nullable=false)

    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
    
    @Column(name="goodsCost", nullable=false)

    public Integer getGoodsCost() {
        return this.goodsCost;
    }
    
    public void setGoodsCost(Integer goodsCost) {
        this.goodsCost = goodsCost;
    }
   








}