package com.sample;

public class EntityTovarEntity {
    private int id;
    private String nameTovar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityTovarEntity that = (EntityTovarEntity) o;

        if (id != that.id) return false;
        if (nameTovar != null ? !nameTovar.equals(that.nameTovar) : that.nameTovar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameTovar != null ? nameTovar.hashCode() : 0);
        return result;
    }
}
