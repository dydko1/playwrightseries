package com.dydko.api.get;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

import java.io.IOException;


public class GetApiCall {

    @Test
    public void getApiCall() throws IOException {
        Playwright playwright = Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext requestContext = request.newContext();
        APIResponse apiResponse = requestContext.get("https://gorest.co.in/public/v2/users");

        int statusCode = apiResponse.status();
        System.out.println("Status Code: " + statusCode);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(apiResponse.body());
        System.out.println(jsonNode.toPrettyString());
        System.out.println("url: " + apiResponse.url());
        System.out.println("=============================");
        System.out.println(apiResponse.headers());
    }
}
