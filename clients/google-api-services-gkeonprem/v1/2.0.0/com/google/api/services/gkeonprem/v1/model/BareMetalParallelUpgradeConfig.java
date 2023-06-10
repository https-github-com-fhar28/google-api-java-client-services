/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.gkeonprem.v1.model;

/**
 * BareMetalParallelUpgradeConfig defines the parallel upgrade settings for worker node pools.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Anthos On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BareMetalParallelUpgradeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The maximum number of nodes that can be upgraded at once. Defaults to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer concurrentNodes;

  /**
   * The minimum number of nodes that should be healthy and available during an upgrade. If set to
   * the default value of 0, it is possible that none of the nodes will be available during an
   * upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minimumAvailableNodes;

  /**
   * Required. The maximum number of nodes that can be upgraded at once. Defaults to 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConcurrentNodes() {
    return concurrentNodes;
  }

  /**
   * Required. The maximum number of nodes that can be upgraded at once. Defaults to 1.
   * @param concurrentNodes concurrentNodes or {@code null} for none
   */
  public BareMetalParallelUpgradeConfig setConcurrentNodes(java.lang.Integer concurrentNodes) {
    this.concurrentNodes = concurrentNodes;
    return this;
  }

  /**
   * The minimum number of nodes that should be healthy and available during an upgrade. If set to
   * the default value of 0, it is possible that none of the nodes will be available during an
   * upgrade.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinimumAvailableNodes() {
    return minimumAvailableNodes;
  }

  /**
   * The minimum number of nodes that should be healthy and available during an upgrade. If set to
   * the default value of 0, it is possible that none of the nodes will be available during an
   * upgrade.
   * @param minimumAvailableNodes minimumAvailableNodes or {@code null} for none
   */
  public BareMetalParallelUpgradeConfig setMinimumAvailableNodes(java.lang.Integer minimumAvailableNodes) {
    this.minimumAvailableNodes = minimumAvailableNodes;
    return this;
  }

  @Override
  public BareMetalParallelUpgradeConfig set(String fieldName, Object value) {
    return (BareMetalParallelUpgradeConfig) super.set(fieldName, value);
  }

  @Override
  public BareMetalParallelUpgradeConfig clone() {
    return (BareMetalParallelUpgradeConfig) super.clone();
  }

}