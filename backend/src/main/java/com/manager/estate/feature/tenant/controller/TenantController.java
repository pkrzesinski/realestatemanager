package com.manager.estate.feature.tenant.controller;


import com.manager.estate.feature.tenant.model.Tenant;
import com.manager.estate.feature.tenant.service.TenantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/tenant")
@RequiredArgsConstructor
public class TenantController {

    private final TenantService tenantService;

    @GetMapping
    public List<Tenant> getList() {
        return tenantService.getList();
    }

    @PostMapping
    public Tenant save(@RequestBody Tenant tenant) {
        return tenantService.save(tenant);
    }

    @PutMapping
    public Tenant upadate(@RequestBody Tenant tenant) {
        return tenantService.save(tenant);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        tenantService.delete(id);
    }
}
