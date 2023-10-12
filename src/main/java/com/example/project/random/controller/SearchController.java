package com.example.project.random.controller;

import com.example.project.random.dto.SearchRequestDto;
import com.example.project.random.service.SearchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/navi")
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/random")
    public SearchRequestDto startSearch(@PathVariable String name1, String name2) {
      return SearchService.startSearch(name1, name2);
    }



}
