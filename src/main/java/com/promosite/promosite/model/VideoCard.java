package com.promosite.promosite.model;

import javax.persistence.*;

@Entity(name = "video_card")
public class VideoCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    //interface
    @Column
    private String inf;

    @Column
    private String videoChipset;

    @Column
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
    private  String maxResolution;

    @Column
    private String technologySupport;

    @Column
    private int DVIConnectors;

    @Column
    private int HDMIConnectors;

    @Column
    private String HDMIConnectorVersion;

    @Column
    private String additionalPowerConnectors;

    @Column
    private Float recommendedPSUPower;

    @Column
    private int guarantee;

    @Column
    private String manufacturer;

    @Lob
    @Column(name="miniImage")
    private byte[] miniImage;

    @Lob
    @Column(name="fullImage")
    private byte[] fullImage;


}
