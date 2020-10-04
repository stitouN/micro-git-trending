package com.gemography.microgittrending.data;

/**
 * @author N.STITOU (STITOU NAJLAA)
 * @Date de création 05/10/2020
 */
public class RepoData {

    private Integer id;

    private String nodeId;

    private String name;

    private String fullName;

    public RepoData(Integer id,String nodeId,String name,String fullName){
        this.id=id;
        this.nodeId=nodeId;
        this.name=name;
        this.fullName=name;
    }
}
