package org.grafana.api.templates.Dashboard.Panel.Pconfig.Layout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LegendTpl {
    @SerializedName("orientation")
    @Expose
    private String orientation;

    public LegendTpl(){
        this.orientation = "h";
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
