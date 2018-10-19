package com.sample;


public class Products {

  private long id;
  private String productname;
  private String company;
  private long productcount;
  private String price;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getProductcount() {
    return productcount;
  }

  public void setProductcount(long productcount) {
    this.productcount = productcount;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

}
