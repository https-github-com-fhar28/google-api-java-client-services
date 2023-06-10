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

package com.google.api.services.compute.model;

/**
 * A transient resource used in compute.disks.bulkInsert and compute.regionDisks.bulkInsert. It is
 * only used to process requests and is not persisted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BulkInsertDiskResource extends com.google.api.client.json.GenericJson {

  /**
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full
   * or partial URL, such as: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region
   * /resourcePolicies/resourcePolicy -
   * projects/project/regions/region/resourcePolicies/resourcePolicy -
   * regions/region/resourcePolicies/resourcePolicy
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceConsistencyGroupPolicy;

  /**
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full
   * or partial URL, such as: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region
   * /resourcePolicies/resourcePolicy -
   * projects/project/regions/region/resourcePolicies/resourcePolicy -
   * regions/region/resourcePolicies/resourcePolicy
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceConsistencyGroupPolicy() {
    return sourceConsistencyGroupPolicy;
  }

  /**
   * The URL of the DiskConsistencyGroupPolicy for the group of disks to clone. This may be a full
   * or partial URL, such as: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region
   * /resourcePolicies/resourcePolicy -
   * projects/project/regions/region/resourcePolicies/resourcePolicy -
   * regions/region/resourcePolicies/resourcePolicy
   * @param sourceConsistencyGroupPolicy sourceConsistencyGroupPolicy or {@code null} for none
   */
  public BulkInsertDiskResource setSourceConsistencyGroupPolicy(java.lang.String sourceConsistencyGroupPolicy) {
    this.sourceConsistencyGroupPolicy = sourceConsistencyGroupPolicy;
    return this;
  }

  @Override
  public BulkInsertDiskResource set(String fieldName, Object value) {
    return (BulkInsertDiskResource) super.set(fieldName, value);
  }

  @Override
  public BulkInsertDiskResource clone() {
    return (BulkInsertDiskResource) super.clone();
  }

}