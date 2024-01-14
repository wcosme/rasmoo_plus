package com.client.ws.rasmoo.plus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionType extends JpaRepository<SubscriptionType, Long> {

}
