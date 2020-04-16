package org.grafana.api.templates.Dashboard.Panel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.grafana.api.templates.Dashboard.Panel.Pconfig.PconfigLayoutTpl;
import org.grafana.api.templates.Dashboard.Panel.Pconfig.PconfigSettingsTpl;

import java.util.ArrayList;
import java.util.List;

public class PconfigTpl {
    @SerializedName("fixScale")
    @Expose
    private String fixScale;
    @SerializedName("layout")
    @Expose
    private PconfigLayoutTpl layout;
    @SerializedName("loadFromCDN")
    @Expose
    private Boolean loadFromCDN;
    @SerializedName("settings")
    @Expose
    private PconfigSettingsTpl settings;
    @SerializedName("showAnnotations")
    @Expose
    private Boolean showAnnotations;
    @SerializedName("traces")
    @Expose
    private List<Object> traces = new ArrayList<Object>();

    public PconfigTpl(){
        this.fixScale = "";
        this.layout = new PconfigLayoutTpl();
        this.loadFromCDN = false;
        this.settings = new PconfigSettingsTpl();
        this.showAnnotations = true;

    }

    public String getFixScale() {
        return fixScale;
    }

    public void setFixScale(String fixScale) {
        this.fixScale = fixScale;
    }

    public PconfigLayoutTpl getLayout() {
        return layout;
    }

    public void setLayout(PconfigLayoutTpl layout) {
        this.layout = layout;
    }

    public Boolean getLoadFromCDN() {
        return loadFromCDN;
    }

    public void setLoadFromCDN(Boolean loadFromCDN) {
        this.loadFromCDN = loadFromCDN;
    }

    public PconfigSettingsTpl getSettings() {
        return settings;
    }

    public void setSettings(PconfigSettingsTpl settings) {
        this.settings = settings;
    }

    public Boolean getShowAnnotations() {
        return showAnnotations;
    }

    public void setShowAnnotations(Boolean showAnnotations) {
        this.showAnnotations = showAnnotations;
    }

    public List<Object> getTraces() {
        return traces;
    }

    public void setTraces(List<Object> traces) {
        this.traces = traces;
    }
}
