package com.manager.estate.feature.tenant.service;

import com.manager.estate.feature.tenant.dao.TenantRepository;
import com.manager.estate.feature.tenant.model.Tenant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

    public List<Tenant> getList() {
        return tenantRepository.findAll();
    }

    public Tenant save(final Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    public void delete(final Long id) {
        tenantRepository.delete(id);
    }


}
