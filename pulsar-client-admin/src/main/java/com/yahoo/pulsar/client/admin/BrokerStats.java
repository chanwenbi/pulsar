/**
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.pulsar.client.admin;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import com.yahoo.pulsar.common.stats.AllocatorStats;

/**
 * Admin interface for brokers management.
 */
public interface BrokerStats {

    /**
     * Returns Monitoring metrics
     * 
     * @return
     * @throws PulsarAdminException
     */

    JsonArray getMetrics() throws PulsarAdminException;

    /**
     * Requests JSON string server mbean dump
     * <p>
     * Notes: since we don't plan to introspect the response we avoid converting the response into POJO.
     * 
     * @return
     * @throws PulsarAdminException
     */
    JsonArray getMBeans() throws PulsarAdminException;

    /**
     * Returns JSON string destination stats
     * <p>
     * Notes: since we don't plan to introspect the response we avoid converting the response into POJO.
     * 
     * @return
     * @throws PulsarAdminException
     */
    JsonObject getDestinations() throws PulsarAdminException;

    JsonObject getPendingBookieOpsStats() throws PulsarAdminException;

    AllocatorStats getAllocatorStats(String allocatorName) throws PulsarAdminException;
}
