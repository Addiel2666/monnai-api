package com.monnai.controller;

import com.monnai.dto.MonnaiRequest;
import org.json.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RequestMapping("/monnai")
@RestController
public class MonnaiController {

    @PostMapping("/consulta")
    public ResponseEntity<Map> consultaMonnai(@RequestBody MonnaiRequest request) throws IOException {
        ClassPathResource resource = new ClassPathResource("monnai.json");

        String jsonString = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        JSONObject jsonObject = new JSONObject(jsonString);
        Map<String, Object> map = jsonObject.toMap();
        return ResponseEntity.ok(map);
    }

}
