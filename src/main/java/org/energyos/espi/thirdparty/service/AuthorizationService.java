package org.energyos.espi.thirdparty.service;

import org.energyos.espi.thirdparty.domain.Authorization;

import java.util.List;

public interface AuthorizationService {
    List<Authorization> findAllByRetailCustomerId(Long retailCustomerId);
}
