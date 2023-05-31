package com.ashourics.service;

import org.springframework.stereotype.Service;
import com.ashourics.model.EthereumPrice;

@Service
public class AnomalyDetectionService {
  
    // Placeholder method for anomaly detection.
    public boolean isAnomaly(EthereumPrice price) {
        // TODO: Implement a real anomaly detection algorithm.
        // This might involve feeding the price data into a machine learning model,
        // calculating statistical measures like the z-score, etc.
        
        // For now, just return false for every price.
        return false;
    }

}
