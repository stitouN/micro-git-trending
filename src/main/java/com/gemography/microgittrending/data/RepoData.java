package com.gemography.microgittrending.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author N.STITOU (STITOU NAJLAA)
 * @Date de création 05/10/2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepoData {

    private Integer id;

    @JsonProperty("node_id")
    private String nodeId;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    public RepoData(){

    }

    public RepoData(Integer id,String nodeId,String name,String fullName){
        this.id=id;
        this.nodeId=nodeId;
        this.name=name;
        this.fullName=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
}
