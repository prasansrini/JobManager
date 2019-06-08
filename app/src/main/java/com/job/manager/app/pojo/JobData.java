package com.job.manager.app.pojo;

import com.google.gson.annotations.SerializedName;

public class JobData {
    @SerializedName("variants")
    private Variants variants;

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "ClassPojo [variants = " + variants + "]";
    }
}
