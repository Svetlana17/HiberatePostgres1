package com.sample;


public class ProviderFirma {

  private long idProviderFirma;
  private String nameProviderFirma;
  private long volume;
  private java.sql.Date data;
  private String nameTovar;
  private String nameCompany;


  public long getIdProviderFirma() {
    return idProviderFirma;
  }

  public void setIdProviderFirma(long idProviderFirma) {
    this.idProviderFirma = idProviderFirma;
  }


  public String getNameProviderFirma() {
    return nameProviderFirma;
  }

  public void setNameProviderFirma(String nameProviderFirma) {
    this.nameProviderFirma = nameProviderFirma;
  }


  public long getVolume() {
    return volume;
  }

  public void setVolume(long volume) {
    this.volume = volume;
  }


  public java.sql.Date getData() {
    return data;
  }

  public void setData(java.sql.Date data) {
    this.data = data;
  }


  public String getNameTovar() {
    return nameTovar;
  }

  public void setNameTovar(String nameTovar) {
    this.nameTovar = nameTovar;
  }


  public String getNameCompany() {
    return nameCompany;
  }

  public void setNameCompany(String nameCompany) {
    this.nameCompany = nameCompany;
  }

}
