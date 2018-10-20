package com.sample;

import java.math.BigInteger;

public class EntityProductsEntity {
    private int id;
    private String productname;
    private String company;
    private Integer productcount;
    private BigInteger price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityProductsEntity that = (EntityProductsEntity) o;

        if (id != that.id) return false;
        if (productname != null ? !productname.equals(that.productname) : that.productname != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (productcount != null ? !productcount.equals(that.productcount) : that.productcount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productname != null ? productname.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (productcount != null ? productcount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
