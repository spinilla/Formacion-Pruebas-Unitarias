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
 * 
 * SpringTutorialTest
 * com.viewnext.formacion2018.pruebasunitarias.service
 * 
 * VehicleDetailsService
 * A service to obtain {@link VehicleDetails} given a {@link VehicleIdentificationNumber}.
 * 
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public interface VehicleDetailsService {

  /**
   * Get vehicle details for a given {@link VehicleIdentificationNumber}.
   * 
   * @param vin
   *          the vehicle identification number
   * @return vehicle details
   * @throws VehicleIdentificationNumberNotFoundException
   *           if the VIN is not known
   */
  VehicleDetails getVehicleDetails(VehicleIdentificationNumber vin) throws VehicleIdentificationNumberNotFoundException;

}
