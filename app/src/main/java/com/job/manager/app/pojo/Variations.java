package com.job.manager.app.pojo;

import com.google.gson.annotations.SerializedName;

public class Variations {
    @SerializedName("default")
    private String mDefault;
    @SerializedName("name")
    private String name;
    @SerializedName("logo")
    private String logo;
    @SerializedName("id")
    private String id;

    public String getDefault() {
        return mDefault;
    }

    public void setDefault(String defaultvalue) {
        this.mDefault = defaultvalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassPojo [default = " + mDefault + ", name = " + name + ", logo = " + logo
                + ", id = " + id + "]";
    }
}
