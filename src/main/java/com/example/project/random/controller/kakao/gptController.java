package com.example.project.random.controller.kakao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gptController {

//    @Value("${kakao.api.key}") // application.properties 또는 application.yml에서 API 키를 설정합니다.
//    private String kakaoApiKey;

    @GetMapping("/recommendRoute")
    public String recommendRandomRoute(@RequestParam String startAddress, @RequestParam String endAddress) {
        // 출발지와 목적지 주소를 좌표로 변환
        String startCoord = getAddressToCoordinate(startAddress);
        String endCoord = getAddressToCoordinate(endAddress);

        if (startCoord == null || endCoord == null) {
            return "주소를 좌표로 변환하는 데 실패했습니다.";
        }

        // 카카오 지도 API를 사용하여 경로 추천 받기
        String routeJson = getRoute(startCoord, endCoord);

        // 경로 추천 결과를 클라이언트로 반환
        return routeJson;
    }

    private String getAddressToCoordinate(String address) {
        // 카카오 지도 API를 사용하여 주소를 좌표로 변환하는 코드를 작성하세요.
        // (앞서 언급한 getAddressToCoordinate 메서드를 참고하세요)
    }

    private String getRoute(String startCoord, String endCoord) {
        // 카카오 지도 API를 사용하여 경로를 추천하는 코드를 작성하세요.
        // (앞서 언급한 getRoute 메서드를 참고하세요)
    }
}


