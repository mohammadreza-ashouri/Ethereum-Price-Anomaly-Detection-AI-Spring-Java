package com.ashourics.repository;

import com.ashourics.model.EthereumPrice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface EthereumPriceRepository extends MongoRepository<EthereumPrice, LocalDateTime> {
 
    
}
