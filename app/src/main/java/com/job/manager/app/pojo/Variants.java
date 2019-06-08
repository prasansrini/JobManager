package com.job.manager.app.pojo;

import com.google.gson.annotations.SerializedName;

public class Variants {

    @SerializedName("variant_groups")
    private VariantGroups[] mVariantGroups;
    @SerializedName("exclude_list")
    private ExcludeList[][] mExcludeList;

    public VariantGroups[] getVariantGroups() {
        return mVariantGroups;
    }

    public void setVariantGroups(VariantGroups[] variantGroups) {
        this.mVariantGroups = variantGroups;
    }

    public ExcludeList[][] getExcludeList() {
        return mExcludeList;
    }

    public void setExcludeList(ExcludeList[][] excludeList) {
        this.mExcludeList = excludeList;
    }

    @Override
    public String toString() {
        return "ClassPojo [mVariantGroups = " + mVariantGroups + ", mExcludeList = " + mExcludeList
                + "]";
    }
}