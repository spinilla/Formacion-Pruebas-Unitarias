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

import com.viewnext.formacion2018.pruebasunitarias.domain.VehicleIdentificationNumber;

/**
 * SpringTutorialTest
 * com.viewnext.formacion2018.pruebasunitarias.service
 * 
 * VehicleIdentificationNumberNotFoundException
 * Exception thrown when a {@link VehicleIdentificationNumber} is not found.
 * 
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public class VehicleIdentificationNumberNotFoundException extends RuntimeException {

  private VehicleIdentificationNumber vehicleIdentificationNumber;

  public VehicleIdentificationNumberNotFoundException(VehicleIdentificationNumber vin) {
    this(vin, null);
  }

  public VehicleIdentificationNumberNotFoundException(VehicleIdentificationNumber vin, Throwable cause) {
    super("Unable to find VehicleIdentificationNumber " + vin, cause);
    this.vehicleIdentificationNumber = vin;
  }

  public VehicleIdentificationNumber getVehicleIdentificationNumber() {
    return this.vehicleIdentificationNumber;
  }
}
