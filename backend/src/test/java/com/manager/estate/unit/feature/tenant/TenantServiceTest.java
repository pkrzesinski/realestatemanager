package com.manager.estate.unit.feature.tenant;

import com.manager.estate.feature.tenant.dao.TenantRepository;
import com.manager.estate.feature.tenant.model.Tenant;
import com.manager.estate.feature.tenant.service.TenantService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TenantServiceTest {

    @Mock
    private TenantRepository tenantRepository;

    @InjectMocks
    private TenantService classUnderTest;

    @Test
    public void shouldGetList() {
        //Given
        List<Tenant> tenants = createdMockedList();
        when(tenantRepository.findAll()).thenReturn(tenants);
        //When
        final List<Tenant> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Tenant tenant = new Tenant();
        //When
        classUnderTest.save(tenant);
        //Then
        verify(tenantRepository).save(tenant);
    }

    @Test
    public void shouldDelete() {
        //Given
        final Long id = 5L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(tenantRepository).delete(id);
    }

    private List<Tenant> createdMockedList() {
        List<Tenant> mockedList = new ArrayList<>();
        mockedList.add(new Tenant());
        mockedList.add(new Tenant());
        return mockedList;
    }
}