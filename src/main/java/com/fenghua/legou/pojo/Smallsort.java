package com.fenghua.legou.pojo;

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
 * TSmallsort entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_smallsort"
    ,catalog="db_legou"
)

public class Smallsort  implements java.io.Serializable {


    // Fields    

     private Integer smallsortId;
     private String smallsortName;
     private Set<Goods> TGoodses = new HashSet<Goods>(0);


    // Constructors

    /** default constructor */
    public Smallsort() {
    }

	/** minimal constructor */
    public Smallsort(String smallsortName) {
        this.smallsortName = smallsortName;
    }
    
    /** full constructor */
    public Smallsort(String smallsortName, Set<Goods> TGoodses) {
        this.smallsortName = smallsortName;
        this.TGoodses = TGoodses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="smallsortId", unique=true, nullable=false)

    public Integer getSmallsortId() {
        return this.smallsortId;
    }
    
    public void setSmallsortId(Integer smallsortId) {
        this.smallsortId = smallsortId;
    }
    
    @Column(name="smallsortName", nullable=false, length=200)

    public String getSmallsortName() {
        return this.smallsortName;
    }
    
    public void setSmallsortName(String smallsortName) {
        this.smallsortName = smallsortName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="TSmallsort")

    public Set<Goods> getTGoodses() {
        return this.TGoodses;
    }
    
    public void setTGoodses(Set<Goods> TGoodses) {
        this.TGoodses = TGoodses;
    }
   








}