package com.sample;

import java.sql.Date;

public class EntityProviderFirmaEntity {
    private int idProviderFirma;
    private String nameProviderFirma;
    private Integer volume;
    private Date data;

    public int getIdProviderFirma() {
        return idProviderFirma;
    }

    public void setIdProviderFirma(int idProviderFirma) {
        this.idProviderFirma = idProviderFirma;
    }

    public String getNameProviderFirma() {
        return nameProviderFirma;
    }

    public void setNameProviderFirma(String nameProviderFirma) {
        this.nameProviderFirma = nameProviderFirma;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityProviderFirmaEntity that = (EntityProviderFirmaEntity) o;

        if (idProviderFirma != that.idProviderFirma) return false;
        if (nameProviderFirma != null ? !nameProviderFirma.equals(that.nameProviderFirma) : that.nameProviderFirma != null)
            return false;
        if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProviderFirma;
        result = 31 * result + (nameProviderFirma != null ? nameProviderFirma.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
