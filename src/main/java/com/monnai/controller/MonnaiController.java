package com.monnai.controller;

import com.monnai.dto.MonnaiRequest;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/monnai")
@RestController
public class MonnaiController {

    @PostMapping("/consulta")
    public ResponseEntity<Map> consultaMonnai(@RequestBody MonnaiRequest request){
        String jsonString = "{\n" +
                "  \"enrichment\": {\n" +
                "    \"persons\": [\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2007-07-01T00:00:00Z\",\n" +
                "            \"value\": \"Rae S Johnston\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"genders\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2007-07-01T00:00:00Z\",\n" +
                "            \"value\": \"FEMALE\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"dateOfBirths\": [\n" +
                "          {\n" +
                "            \"dateRange\": {\n" +
                "              \"start\": \"1964-10-01\",\n" +
                "              \"end\": \"1964-10-31\"\n" +
                "            }\n" +
                "          }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "          {\n" +
                "            \"validSince\": \"1995-06-01T00:00:00Z\",\n" +
                "            \"addressLine1\": \"47 North Street, Madrid, New York\",\n" +
                "            \"city\": \"Madrid\",\n" +
                "            \"country\": \"US\",\n" +
                "            \"state\": \"NY\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"validSince\": \"2020-10-06T00:00:00Z\",\n" +
                "            \"lastSeen\": \"2020-10-06T00:00:00Z\",\n" +
                "            \"addressLine1\": \"Eora, Australia, Mexico\",\n" +
                "            \"city\": \"Australia\",\n" +
                "            \"country\": \"MX\"\n" +
                "          }\n" +
                "    \n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2011-02-11T00:00:00Z\",\n" +
                "            \"lastSeen\": \"2024-09-06T00:00:00Z\",\n" +
                "            \"value\": \"Adam Sank\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"genders\": [\n" +
                "          {\n" +
                "            \"value\": \"MALE\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "         \n" +
                "          {\n" +
                "            \"validSince\": \"2015-10-03T00:00:00Z\",\n" +
                "            \"addressLine1\": \"New York, Texas\",\n" +
                "            \"city\": \"New York\",\n" +
                "            \"country\": \"US\",\n" +
                "            \"state\": \"TX\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2009-09-26T00:00:00Z\",\n" +
                "            \"value\": \"Adam J Sank\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"genders\": [\n" +
                "          {\n" +
                "            \"value\": \"MALE\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2009-09-26T00:00:00Z\",\n" +
                "            \"addressLine1\": \"Ann Arbor, Michigan\",\n" +
                "            \"city\": \"Ann Arbor\",\n" +
                "            \"country\": \"US\",\n" +
                "            \"state\": \"MI\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2009-01-13T00:00:00Z\",\n" +
                "            \"value\": \"Katherine Trumbly\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"genders\": [\n" +
                "          {\n" +
                "            \"value\": \"FEMALE\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2009-01-13T00:00:00Z\",\n" +
                "            \"addressLine1\": \"1811 Blue Jay Drive, Roseville, California\",\n" +
                "            \"city\": \"Roseville\",\n" +
                "            \"country\": \"US\",\n" +
                "            \"state\": \"CA\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2020-10-06T00:00:00Z\",\n" +
                "            \"value\": \"Michelle R\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2020-10-06T00:00:00Z\",\n" +
                "            \"lastSeen\": \"2020-10-06T00:00:00Z\",\n" +
                "            \"addressLine1\": \"Melbourne, State of Victoria\",\n" +
                "            \"city\": \"Melbourne\",\n" +
                "            \"country\": \"AU\",\n" +
                "            \"state\": \"VIC\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"names\": [\n" +
                "          {\n" +
                "            \"validSince\": \"2018-01-16T00:00:00Z\",\n" +
                "            \"value\": \"Tháng Tám\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"genders\": [\n" +
                "          {\n" +
                "            \"value\": \"FEMALE\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ],\n" +
                "    \"nameFeatures\": {\n" +
                "      \"nameUniqueness\": {\n" +
                "        \"numberOfNamesConsidered\": 8,\n" +
                "        \"numberOfUniqueIdentities\": 5,\n" +
                "        \"nameConsistencyScore\": 0.39,\n" +
                "        \"namesConsidered\": [\n" +
                "          \"identity.enrichment.persons[*].names[*].value\"\n" +
                "        ],\n" +
                "        \"resolvedNames\": [\n" +
                "          \"ADAM SANK\"\n" +
                "        ]\n" +
                "      },\n" +
                "      \"nameMatch\": {\n" +
                "        \"matchScore\": 0.45,\n" +
                "        \"percentageOfMatchedNames\": 0,\n" +
                "        \"numOfMatchedNames\": 0,\n" +
                "        \"namesConsidered\": [\n" +
                "          \"identity.enrichment.persons[*].names[*].value\"\n" +
                "        ],\n" +
                "        \"baseName\": \"inputFullName\"\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}\n";
        JSONObject jsonObject = new JSONObject(jsonString);
        Map<String, Object> map = jsonObject.toMap();
        return ResponseEntity.ok(map);
    }

}
