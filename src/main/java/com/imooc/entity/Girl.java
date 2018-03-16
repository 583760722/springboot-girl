package com.imooc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/12
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Entity(name = "girl")
public class Girl implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;
    private Double money;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
