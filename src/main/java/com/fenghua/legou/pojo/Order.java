package com.fenghua.legou.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * TOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order"
    ,catalog="db_legou"
)

public class Order  implements java.io.Serializable {


    // Fields    

     private Integer orderId;
     private String buyerName;
     private String sellerName;
     private String cneeName;
     private String cneeAddress;
     private String telephone;
     private Timestamp ordertime;
     private Double cost;
     private String delivery;
     private Integer state;
     private Set<OrderGoods> TOrderGoodses = new HashSet<OrderGoods>(0);


    // Constructors

    /** default constructor */
    public Order() {
    }

	/** minimal constructor */
    public Order(String buyerName, String sellerName, String cneeName, String cneeAddress, String telephone, Timestamp ordertime, Double cost, String delivery, Integer state) {
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.cneeName = cneeName;
        this.cneeAddress = cneeAddress;
        this.telephone = telephone;
        this.ordertime = ordertime;
        this.cost = cost;
        this.delivery = delivery;
        this.state = state;
    }
    
    /** full constructor */
    public Order(String buyerName, String sellerName, String cneeName, String cneeAddress, String telephone, Timestamp ordertime, Double cost, String delivery, Integer state, Set<OrderGoods> TOrderGoodses) {
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.cneeName = cneeName;
        this.cneeAddress = cneeAddress;
        this.telephone = telephone;
        this.ordertime = ordertime;
        this.cost = cost;
        this.delivery = delivery;
        this.state = state;
        this.TOrderGoodses = TOrderGoodses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="orderId", unique=true, nullable=false)

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
    @Column(name="buyerName", nullable=false, length=20)

    public String getBuyerName() {
        return this.buyerName;
    }
    
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
    
    @Column(name="sellerName", nullable=false, length=20)

    public String getSellerName() {
        return this.sellerName;
    }
    
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    @Column(name="cneeName", nullable=false, length=20)

    public String getCneeName() {
        return this.cneeName;
    }
    
    public void setCneeName(String cneeName) {
        this.cneeName = cneeName;
    }
    
    @Column(name="cneeAddress", nullable=false, length=200)

    public String getCneeAddress() {
        return this.cneeAddress;
    }
    
    public void setCneeAddress(String cneeAddress) {
        this.cneeAddress = cneeAddress;
    }
    
    @Column(name="telephone", nullable=false, length=200)

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="ordertime", nullable=false, length=19)

    public Timestamp getOrdertime() {
        return this.ordertime;
    }
    
    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }
    
    @Column(name="cost", nullable=false, precision=22, scale=0)

    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    @Column(name="delivery", nullable=false, length=10)

    public String getDelivery() {
        return this.delivery;
    }
    
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
    
    @Column(name="state", nullable=false)

    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="TOrder")

    public Set<OrderGoods> getTOrderGoodses() {
        return this.TOrderGoodses;
    }
    
    public void setTOrderGoodses(Set<OrderGoods> TOrderGoodses) {
        this.TOrderGoodses = TOrderGoodses;
    }
   








}