package com.job.manager.app.pojo;

import com.google.gson.annotations.SerializedName;

public class VariantGroups {
    @SerializedName("group_id")
    private String mGroupId;
    @SerializedName("variations")
    private Variations[] mVariations;
    @SerializedName("name")
    private String mName;

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        this.mGroupId = groupId;
    }

    public Variations[] getVariations() {
        return mVariations;
    }

    public void setVariations(Variations[] variations) {
        this.mVariations = variations;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [mGroupId = " + mGroupId + ", mVariations = " + mVariations + ", mName = "
                + mName + "]";
    }
}
