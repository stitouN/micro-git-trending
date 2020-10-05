package com.gemography.microgittrending.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author N.STITOU (STITOU NAJLAA)
 * @Date de création 05/10/2020
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListRepoData {

    @JsonProperty("total_count")
    private Integer totalCount;

    @JsonProperty("incomplete_results")
    private Boolean incompleteResults;

    private List<RepoData> items;

    public ListRepoData(){

    }

    public ListRepoData(Integer totalCount,Boolean incompleteResults,List<RepoData> items){
        this.totalCount=totalCount;
        this.incompleteResults=incompleteResults;
        this.items=items;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<RepoData> getItems() {
        return items;
    }

    public void setItems(List<RepoData> items) {
        this.items = items;
    }
}
