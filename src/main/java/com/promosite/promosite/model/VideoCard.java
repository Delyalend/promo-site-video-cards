package com.promosite.promosite.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "video_card")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cost;

    @Column
    private String description;

    //interface
    @Column
    private String inf;

    @Column
    private String videoChipset;

    @Column(name = "frequency_gpu")
    private Float frequencyGPU;

    @Column
    private Float technicalProcess;

    @Column
    private Float amountVideoMemory;

    @Column
    private String typeVideoMemory;

    @Column
    private Float frequencyVideoMemory;

    @Column
    private Integer videoMemoryBitRate;

    @Column
    private String technologySupport;

    @Column
    private int dviConnectors;

    @Column
    private int hdmiConnectors;

    @Column
    private String hdmiConnectorVersion;

    @Column
    private String additionalPowerConnectors;

    @Column(name = "recommended_psu_power")
    private Float recommendedPSUPower;

    @Column
    private int guarantee;

    @Column
    private String manufacturer;

    @Lob
    @Column(name="previewImage")
    private String previewImage;

    @Lob
    @Column(name="mainImage")
    private String mainImage;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    public String getVideoChipset() {
        return videoChipset;
    }

    public void setVideoChipset(String videoChipset) {
        this.videoChipset = videoChipset;
    }

    public Float getFrequencyGPU() {
        return frequencyGPU;
    }

    public void setFrequencyGPU(Float frequencyGPU) {
        this.frequencyGPU = frequencyGPU;
    }

    public Float getTechnicalProcess() {
        return technicalProcess;
    }

    public void setTechnicalProcess(Float technicalProcess) {
        this.technicalProcess = technicalProcess;
    }

    public Float getAmountVideoMemory() {
        return amountVideoMemory;
    }

    public void setAmountVideoMemory(Float amountVideoMemory) {
        this.amountVideoMemory = amountVideoMemory;
    }

    public String getTypeVideoMemory() {
        return typeVideoMemory;
    }

    public void setTypeVideoMemory(String typeVideoMemory) {
        this.typeVideoMemory = typeVideoMemory;
    }

    public Float getFrequencyVideoMemory() {
        return frequencyVideoMemory;
    }

    public void setFrequencyVideoMemory(Float frequencyVideoMemory) {
        this.frequencyVideoMemory = frequencyVideoMemory;
    }

    public Integer getVideoMemoryBitRate() {
        return videoMemoryBitRate;
    }

    public void setVideoMemoryBitRate(Integer videoMemoryBitRate) {
        this.videoMemoryBitRate = videoMemoryBitRate;
    }

    public String getTechnologySupport() {
        return technologySupport;
    }

    public void setTechnologySupport(String technologySupport) {
        this.technologySupport = technologySupport;
    }

    public int getDviConnectors() {
        return dviConnectors;
    }

    public void setDviConnectors(int dviConnectors) {
        this.dviConnectors = dviConnectors;
    }

    public int getHdmiConnectors() {
        return hdmiConnectors;
    }

    public void setHdmiConnectors(int hdmiConnectors) {
        this.hdmiConnectors = hdmiConnectors;
    }

    public String getHdmiConnectorVersion() {
        return hdmiConnectorVersion;
    }

    public void setHdmiConnectorVersion(String hdmiConnectorVersion) {
        this.hdmiConnectorVersion = hdmiConnectorVersion;
    }

    public String getAdditionalPowerConnectors() {
        return additionalPowerConnectors;
    }

    public void setAdditionalPowerConnectors(String additionalPowerConnectors) {
        this.additionalPowerConnectors = additionalPowerConnectors;
    }

    public Float getRecommendedPSUPower() {
        return recommendedPSUPower;
    }

    public void setRecommendedPSUPower(Float recommendedPSUPower) {
        this.recommendedPSUPower = recommendedPSUPower;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }
}
