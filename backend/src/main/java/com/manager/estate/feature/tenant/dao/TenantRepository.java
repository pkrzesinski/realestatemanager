package com.manager.estate.feature.tenant.dao;
import com.manager.estate.feature.tenant.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}