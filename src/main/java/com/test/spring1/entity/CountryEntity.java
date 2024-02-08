package com.test.spring1.entity;

import javax.persistence.*;

@Entity
@Table(name = "contry", schema = "world", catalog = "")
public class CountryEntity {
    @Basic
    @Column(name = "ID")
    private int id;
    @Id
    @Column(name = "Code")
    private String code;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Continent")
    private String continent;
    @Basic
    @Column(name = "Region")
    private String region;
    @Basic
    @Column(name = "SurfaceArea")
    private double surfaceArea;
    @Basic
    @Column(name = "IndepYear")
    private short indepYear;
    @Basic
    @Column(name = "Population")
    private int population;
    @Basic
    @Column(name = "LifeExpectancy")
    private double lifeExpectancy;
    @Basic
    @Column(name = "GNP")
    private double gnp;
    @Basic
    @Column(name = "GNPOld")
    private double gnpOld;
    @Basic
    @Column(name = "LocalName")
    private String localName;
    @Basic
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Basic
    @Column(name = "HeadOfState")
    private String headOfState;
    @Basic
    @Column(name = "Capital")
    private int capital;
    @Basic
    @Column(name = "Code2")
    private String code2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public double getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(double gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (id != that.id) return false;
        if (Double.compare(surfaceArea, that.surfaceArea) != 0) return false;
        if (indepYear != that.indepYear) return false;
        if (population != that.population) return false;
        if (Double.compare(lifeExpectancy, that.lifeExpectancy) != 0) return false;
        if (Double.compare(gnp, that.gnp) != 0) return false;
        if (Double.compare(gnpOld, that.gnpOld) != 0) return false;
        if (capital != that.capital) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (continent != null ? !continent.equals(that.continent) : that.continent != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (localName != null ? !localName.equals(that.localName) : that.localName != null) return false;
        if (governmentForm != null ? !governmentForm.equals(that.governmentForm) : that.governmentForm != null)
            return false;
        if (headOfState != null ? !headOfState.equals(that.headOfState) : that.headOfState != null) return false;
        if (code2 != null ? !code2.equals(that.code2) : that.code2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) indepYear;
        result = 31 * result + population;
        temp = Double.doubleToLongBits(lifeExpectancy);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gnp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gnpOld);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (localName != null ? localName.hashCode() : 0);
        result = 31 * result + (governmentForm != null ? governmentForm.hashCode() : 0);
        result = 31 * result + (headOfState != null ? headOfState.hashCode() : 0);
        result = 31 * result + capital;
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        return result;
    }
}
