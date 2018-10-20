package com.sample;

public class EntityPotrebitelEntity {
    private int idPotrebitel;
    private String namePotrebitel;
    private String values;

    public int getIdPotrebitel() {
        return idPotrebitel;
    }

    public void setIdPotrebitel(int idPotrebitel) {
        this.idPotrebitel = idPotrebitel;
    }

    public String getNamePotrebitel() {
        return namePotrebitel;
    }

    public void setNamePotrebitel(String namePotrebitel) {
        this.namePotrebitel = namePotrebitel;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityPotrebitelEntity that = (EntityPotrebitelEntity) o;

        if (idPotrebitel != that.idPotrebitel) return false;
        if (namePotrebitel != null ? !namePotrebitel.equals(that.namePotrebitel) : that.namePotrebitel != null)
            return false;
        if (values != null ? !values.equals(that.values) : that.values != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPotrebitel;
        result = 31 * result + (namePotrebitel != null ? namePotrebitel.hashCode() : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        return result;
    }

}
