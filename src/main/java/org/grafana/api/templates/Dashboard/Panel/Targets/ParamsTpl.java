package org.grafana.api.templates.Dashboard.Panel.Targets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ParamsTpl {
    @SerializedName("params")
    @Expose
    private List<String> params = new ArrayList<String>();
    @SerializedName("type")
    @Expose
    private String type;

    public ParamsTpl(){
        this.params = new ArrayList<String>();
        this.params.add("value");
        this.type = "column";
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
