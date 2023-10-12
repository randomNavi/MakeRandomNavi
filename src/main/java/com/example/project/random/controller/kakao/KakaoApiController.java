package com.example.project.random.controller.kakao;


import com.example.project.random.dto.ApiKey;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/findRoute", method = RequestMethod.GET)
public class KakaoApiController {

    private final ApiKey apiKey;


    public ResponseEntity<String> findRoute(@RequestParam("startX") String startX,
                                            @RequestParam("startY") String startY,
                                            @RequestParam("endX") String endX,
                                            @RequestParam("endY") String endY,
                                            @RequestParam("passList") String passList) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "KakaoAK " + apiKey.getAPI_KEY());

        String url = apiKey.getAPI_URL() + "?startX=" + startX + "&startY=" + startY + "&endX=" + endX + "&endY=" + endY + "&passList=" + passList;

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }
}


