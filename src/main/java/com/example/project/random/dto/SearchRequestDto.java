package com.example.project.random.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {

    private String name1; //출발지 이름
    private String name2; // 목적지 이름
    private String waypoints; // 경유지


    private double x; // 위도
    private double y; // 경도




//    https://spatiumwdev.tistory.com/50
//    https://seongilman.tistory.com/137
//    https://sehajyang.github.io/2019/04/17/2019-04-17-kakao-api-geocode-parsing/


}
