package com.ashourics.service;

import com.ashourics.model.EthereumPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class EthereumPriceFetchService {
  
    private final RestTemplate restTemplate;

    public EthereumPriceFetchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    
    public EthereumPrice fetchCurrentPrice() {
        String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=ethereum&vs_currencies=usd";
        
    
        Map<String, Map<String, Double>> response = restTemplate.getForObject(apiUrl, new ParameterizedTypeReference<Map<String, Map<String, Double>>>() {});
        
        double price = response.get("ethereum").get("usd");
        
        EthereumPrice ethereumPrice = new EthereumPrice();
        ethereumPrice.setPrice(price);
        ethereumPrice.setTimestamp(LocalDateTime.now());
    
        return ethereumPrice;
    }
    
        String apiUrl = "https://api.example.com/ethereumprice"; 
        String response = restTemplate.getForObject(apiUrl, String.class);

        double price = Double.parseDouble(response); // replace with actual parsing logic

        EthereumPrice ethereumPrice = new EthereumPrice();
        ethereumPrice.setPrice(price);
        ethereumPrice.setTimestamp(LocalDateTime.now());

        return ethereumPrice;
    }
}
