package com.test.spring1.entity;

import javax.persistence.*;

@Entity
@Table(name = "country_language", schema = "world", catalog = "")
public class CountryLanguageEntity {
    @Basic
    @Column(name = "ID")
    private int id;
    @Id
    @Column(name = "CountryCode")
    private String countryCode;
    @Basic
    @Column(name = "Language")
    private String language;
    @Basic
    @Column(name = "IsOffical")
    private String isOffical;
    @Basic
    @Column(name = "Percentage")
    private double percentage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsOffical() {
        return isOffical;
    }

    public void setIsOffical(String isOffical) {
        this.isOffical = isOffical;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguageEntity that = (CountryLanguageEntity) o;

        if (id != that.id) return false;
        if (Double.compare(percentage, that.percentage) != 0) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (isOffical != null ? !isOffical.equals(that.isOffical) : that.isOffical != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (isOffical != null ? isOffical.hashCode() : 0);
        temp = Double.doubleToLongBits(percentage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
