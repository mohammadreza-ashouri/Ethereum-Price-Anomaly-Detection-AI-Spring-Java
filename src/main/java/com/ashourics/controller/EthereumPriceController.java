package ashourics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ashourics.model.EthereumPrice;
import ashourics.service.EthereumPriceFetchService;
import ashourics.service.AnomalyDetectionService;

@RestController
public class EthereumPriceController {

    private final EthereumPriceFetchService fetchService;
    private final AnomalyDetectionService detectionService;

    public EthereumPriceController(EthereumPriceFetchService fetchService, AnomalyDetectionService detectionService) {
        this.fetchService = fetchService;
        this.detectionService = detectionService;
    }

    @GetMapping("/price")
    public EthereumPrice getPrice() {
        return fetchService.fetchCurrentPrice();
    }

    @GetMapping("/isAnomaly")
    public boolean isAnomaly() {
        EthereumPrice price = fetchService.fetchCurrentPrice();
        return detectionService.isAnomaly(price);
    }
}
