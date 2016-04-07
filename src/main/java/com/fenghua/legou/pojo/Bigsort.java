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
 * TBigsort entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_bigsort"
    ,catalog="db_legou"
)

public class Bigsort  implements java.io.Serializable {


    // Fields    

     private Integer bigsortId;
     private String bigsortName;
     private Set<Goods> TGoodses = new HashSet<Goods>(0);


    // Constructors

    /** default constructor */
    public Bigsort() {
    }

	/** minimal constructor */
    public Bigsort(String bigsortName) {
        this.bigsortName = bigsortName;
    }
    
    /** full constructor */
    public Bigsort(String bigsortName, Set<Goods> TGoodses) {
        this.bigsortName = bigsortName;
        this.TGoodses = TGoodses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="bigsortId", unique=true, nullable=false)

    public Integer getBigsortId() {
        return this.bigsortId;
    }
    
    public void setBigsortId(Integer bigsortId) {
        this.bigsortId = bigsortId;
    }
    
    @Column(name="bigsortName", nullable=false, length=200)

    public String getBigsortName() {
        return this.bigsortName;
    }
    
    public void setBigsortName(String bigsortName) {
        this.bigsortName = bigsortName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="TBigsort")

    public Set<Goods> getTGoodses() {
        return this.TGoodses;
    }
    
    public void setTGoodses(Set<Goods> TGoodses) {
        this.TGoodses = TGoodses;
    }
   








}