package com.example.myscholarshipclient;

public class ScholarshipModel {
    String Continent,CountryName,Deadline,Image,Link,Organization,Program;
    public ScholarshipModel()
    {}

    public ScholarshipModel(String continent, String countryName, String deadline, String image, String link, String organization, String program) {
        Continent = continent;
        CountryName = countryName;
        Deadline = deadline;
        this.Image = image;
        Link = link;
        Organization = organization;
        Program = program;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        this.Continent = continent;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        this.CountryName = countryName;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        this.Deadline = deadline;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        this.Link = link;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        this.Organization = organization;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        this.Program = program;
    }
}
