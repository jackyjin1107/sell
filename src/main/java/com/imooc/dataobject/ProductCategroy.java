package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@DynamicUpdate
@Data
public class ProductCategroy {
    @Id
    @GeneratedValue
//    /** 类目id. */
    private Integer categroyId;
//    /** 类目名字. */
    private String  categroyName;
//    /** 类目编号. */
    private Integer categroyType;

    private Date  create_time;

    private Date  update_time;

//    public  ProductCategroy(){
//
//    }

    public ProductCategroy(String categroyName, Integer categroyType) {
        this.categroyName = categroyName;
        this.categroyType = categroyType;
    }

    //    public Date getCreate_time() {
//        return create_time;
//    }
//
//    public void setCreate_time(Date create_time) {
//        this.create_time = create_time;
//    }
//
//    public Date getUpdate_time() {
//        return update_time;
//    }
//
//    public void setUpdate_time(Date update_time) {
//        this.update_time = update_time;
//    }

//    @Override
//    public String toString() {
//        return "ProductCategroy{" +
//                "categroyId=" + categroyId +
//                ", categroyName='" + categroyName + '\'' +
//                ", categroyType=" + categroyType +
//                '}';
//    }

//    public Integer getCategroyId() {
//        return categroyId;
//    }
//
//    public void setCategroyId(Integer categroyId) {
//        this.categroyId = categroyId;
//    }
//
//    public String getCategroyName() {
//        return categroyName;
//    }
//
//    public void setCategroyName(String categroyName) {
//        this.categroyName = categroyName;
//    }
//
//    public Integer getCategroyType() {
//        return categroyType;
//    }
//
//    public void setCategroyType(Integer categroyType) {
//        this.categroyType = categroyType;
//    }
}
