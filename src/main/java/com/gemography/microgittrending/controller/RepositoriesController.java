package com.gemography.microgittrending.controller;

import com.gemography.microgittrending.data.ListRepoData;
import com.gemography.microgittrending.data.RepoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.URIParameter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author N.STITOU (STITOU NAJLAA)
 * @Date de création 04/10/2020
 */

@RestController
@RequestMapping("/api")
public class RepositoriesController {

    public static final String QUERY = "query";
    public static final  String DATE_FORMAT="yyyy-MM-dd";
    @Autowired
    private RestTemplate gitRepoRestTemplate;

    @Value("${spring.gitEndpoint.url}")
    private String endPoint;

    @GetMapping(value = "/repositories/{langage}/total")
    public ResponseEntity<Integer> totalTrendRepoByLangage(@PathVariable String langage){
       ResponseEntity<ListRepoData> result=gitRepoRestTemplate.getForEntity(endPoint, ListRepoData.class,buildQueryParam(langage));
       if(result==null)
           return new ResponseEntity<>(0,HttpStatus.NOT_FOUND);
       return new ResponseEntity<Integer>(result.getBody().getTotalCount(), HttpStatus.OK);
    }

    @GetMapping(value="/repositories/{langage}/list")
    public ResponseEntity<List<RepoData>> listTrendRepoByLangage(@PathVariable String langage){
        ResponseEntity<ListRepoData> result=gitRepoRestTemplate.getForEntity(endPoint, ListRepoData.class,buildQueryParam(langage));
        if(result==null)
            return new ResponseEntity<List<RepoData>>(new ArrayList<>(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(result.getBody().getItems(), HttpStatus.OK);
    }

    private Map<String,String> buildQueryParam(String langage){
        Map<String, String> uriParams = new HashMap<>();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(DATE_FORMAT);

        //building the query
        StringBuilder query=new StringBuilder();
        query.append("created:>");
        query.append(LocalDate.now().minusDays(30)
                .format(formatter));
        query.append("+");
        query.append("language:"+langage);
        uriParams.put(QUERY,query.toString() );
        return uriParams;
    }

}
