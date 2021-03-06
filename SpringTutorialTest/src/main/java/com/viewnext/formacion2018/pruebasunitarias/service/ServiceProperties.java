/*
 * Copyright 2012-2016 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viewnext.formacion2018.pruebasunitarias.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * SpringTutorialTest
 * com.viewnext.formacion2018.pruebasunitarias.service
 * 
 * ServiceProperties
 * Properties for the service.
 * 
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
@Component
@ConfigurationProperties
public class ServiceProperties {

  private String vehicleServiceRootUrl = "http://localhost:8080/vs";

  public String getVehicleServiceRootUrl() {
    return this.vehicleServiceRootUrl;
  }

  public void setVehicleServiceRootUrl(String vehicleServiceRootUrl) {
    this.vehicleServiceRootUrl = vehicleServiceRootUrl;
  }

}
