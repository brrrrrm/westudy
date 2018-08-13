package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StudyInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int no;
    private String city;
    private String county;
    private String name;
    private String information;
    
    @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
    private Date createdDate;
    
    private int maxPeople;
    private String category;
    
    private String picture;
    private List<HashTag> tags;
    
    
    @Override
    public String toString() {
        return "StudyInfo [no=" + no + ", city=" + city + ", county=" + county + ", name=" + name + ", information="
                + information + ", createdDate=" + createdDate + ", maxPeople=" + maxPeople + ", category=" + category
                + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

	public List<HashTag> getTags() {
		return tags;
	}

	public void setTags(List<HashTag> tags) {
		this.tags = tags;
	}

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
