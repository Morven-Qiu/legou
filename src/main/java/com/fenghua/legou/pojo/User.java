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
 * TUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_user"
    ,catalog="db_legou"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private String email;
     private String identityId;
     private String telephone;
     private Timestamp birthday;
     private String address;
     private String sex;
     private String trueName;
     private Integer status;
     private Set<Goods> TGoodses = new HashSet<Goods>(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String username, String password, String email, String identityId, String telephone, Timestamp birthday, String sex, String trueName, Integer status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.identityId = identityId;
        this.telephone = telephone;
        this.birthday = birthday;
        this.sex = sex;
        this.trueName = trueName;
        this.status = status;
    }
    
    /** full constructor */
    public User(String username, String password, String email, String identityId, String telephone, Timestamp birthday, String address, String sex, String trueName, Integer status, Set<Goods> TGoodses) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.identityId = identityId;
        this.telephone = telephone;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
        this.trueName = trueName;
        this.status = status;
        this.TGoodses = TGoodses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="username", nullable=false, length=20)

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="password", nullable=false, length=20)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="email", nullable=false, length=20)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="identityID", nullable=false, length=18)

    public String getIdentityId() {
        return this.identityId;
    }
    
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    @Column(name="telephone", nullable=false, length=11)

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="birthday", nullable=false, length=19)

    public Timestamp getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="address", length=200)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="sex", nullable=false, length=2)

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="trueName", nullable=false)

    public String getTrueName() {
        return this.trueName;
    }
    
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="TUser")

    public Set<Goods> getTGoodses() {
        return this.TGoodses;
    }
    
    public void setTGoodses(Set<Goods> TGoodses) {
        this.TGoodses = TGoodses;
    }
   








}