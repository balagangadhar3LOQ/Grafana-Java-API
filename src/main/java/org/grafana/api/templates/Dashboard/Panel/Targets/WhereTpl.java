package org.grafana.api.templates.Dashboard.Panel.Targets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WhereTpl {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("params")
    @Expose
    private List<String> params = new ArrayList<String>();
    @SerializedName("type")
    @Expose
    private String type;

    public WhereTpl(){
        this.name = "$__timeFilter";
        this.params = new ArrayList<String>();
        this.type = "macro";
    }
}
