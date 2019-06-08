package com.job.manager.app.pojo;

import com.google.gson.annotations.SerializedName;

public class ExcludeList {
    @SerializedName("group_id")
    private String mGroupId;
    @SerializedName("variation_id")
    private String mVariationId;

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        this.mGroupId = groupId;
    }

    public String getVariationId() {
        return mVariationId;
    }

    public void setVariationId(String variationId) {
        this.mVariationId = variationId;
    }

    @Override
    public String toString() {
        return "ClassPojo [mGroupId = " + mGroupId + ", mVariationId = " + mVariationId + "]";
    }
}