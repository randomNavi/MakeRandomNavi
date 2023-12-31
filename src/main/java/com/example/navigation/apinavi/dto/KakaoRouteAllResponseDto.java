package com.example.navigation.apinavi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
// 경로에 관한 모든 응답
public class KakaoRouteAllResponseDto {
    private String trans_id;
    private List<Route> routes;

}
