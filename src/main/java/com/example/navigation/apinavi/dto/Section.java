package com.example.navigation.apinavi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Section {

    @JsonProperty("distance")
    private int distance;

    @JsonProperty("duration")
    private int duration;

    @JsonProperty("bound")
    private Bound bound;
}
