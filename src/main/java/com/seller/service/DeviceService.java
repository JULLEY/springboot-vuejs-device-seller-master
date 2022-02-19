package com.seller.service;

import com.seller.model.Device;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
