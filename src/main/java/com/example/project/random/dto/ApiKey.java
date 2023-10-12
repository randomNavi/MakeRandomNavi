package com.example.project.random.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;


@Getter

public class ApiKey {

        public String API_KEY;
        public String API_URL;

        public String GEOCODE_URL;
        public String GEOCODE_USER_INFO;

        public ApiKey(){
                this.API_KEY = "a661c6fde050056949aac19a24697830";
                this.API_URL = "https://dapi.kakao.com/v2/local/search/keyword.json";
                this.GEOCODE_URL = "https://apis-navi.kakaomobility.com/v1/waypoints/directions";
                this.GEOCODE_USER_INFO ="a661c6fde050056949aac19a24697830";
        }


}
