package org.grafana.api.templates.Dashboard.Panel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GridPosTpl {
    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("x")
    @Expose
    private Integer x;
    @SerializedName("y")
    @Expose
    private Integer y;

    public GridPosTpl(){
        this.h = 9;
        this.w = 12;
        this.x = 0;
        this.y = 0;
    }

}
