package com.mushtu.deeds.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by mushtu on 8/6/16.
 */
@Entity
public class Sin {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private Double weight;


    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 415676246)
    public Sin(Long id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    @Generated(hash = 541749881)
    public Sin() {
    }

}
