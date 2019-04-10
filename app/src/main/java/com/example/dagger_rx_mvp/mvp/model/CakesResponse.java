
package com.example.dagger_rx_mvp.mvp.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CakesResponse {

    @Expose
    private List<Cake> cakes;
    @Expose
    private String product;
    @Expose
    private String releaseDate;
    @Expose
    private List<StaffContact> staffContacts;
    @Expose
    private Double version;

    public List<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<StaffContact> getStaffContacts() {
        return staffContacts;
    }

    public void setStaffContacts(List<StaffContact> staffContacts) {
        this.staffContacts = staffContacts;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

}
