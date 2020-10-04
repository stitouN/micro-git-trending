package com.gemography.microgittrending.controller;

import com.gemography.microgittrending.data.RepoData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author N.STITOU (STITOU NAJLAA)
 * @Date de création 04/10/2020
 */

@RestController
public class RepositoriesController {

    @GetMapping(value = "/repositories/{langage}/total")
    public ResponseEntity<Integer> totalTrendRepoByLangage(@PathVariable String langage){
       return new ResponseEntity<Integer>(0, HttpStatus.OK);
    }

    @GetMapping(value="/repositories/{langage}/list")
    public ResponseEntity<List<RepoData>> listTrendRepoByLangage(@PathVariable String langage){
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.OK);
    }

}
