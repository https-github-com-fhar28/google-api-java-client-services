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

package com.google.api.services.retail.v2.model;

/**
 * Response of the PurgeProductsRequest. If the long running operation is successfully done, then
 * this message is returned by the google.longrunning.Operations.response field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2PurgeProductsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The total count of products purged as a result of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long purgeCount;

  /**
   * A sample of the product names that will be deleted. Only populated if `force` is set to false.
   * A max of 100 names will be returned and the names are chosen at random.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> purgeSample;

  /**
   * The total count of products purged as a result of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPurgeCount() {
    return purgeCount;
  }

  /**
   * The total count of products purged as a result of the operation.
   * @param purgeCount purgeCount or {@code null} for none
   */
  public GoogleCloudRetailV2PurgeProductsResponse setPurgeCount(java.lang.Long purgeCount) {
    this.purgeCount = purgeCount;
    return this;
  }

  /**
   * A sample of the product names that will be deleted. Only populated if `force` is set to false.
   * A max of 100 names will be returned and the names are chosen at random.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPurgeSample() {
    return purgeSample;
  }

  /**
   * A sample of the product names that will be deleted. Only populated if `force` is set to false.
   * A max of 100 names will be returned and the names are chosen at random.
   * @param purgeSample purgeSample or {@code null} for none
   */
  public GoogleCloudRetailV2PurgeProductsResponse setPurgeSample(java.util.List<java.lang.String> purgeSample) {
    this.purgeSample = purgeSample;
    return this;
  }

  @Override
  public GoogleCloudRetailV2PurgeProductsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2PurgeProductsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2PurgeProductsResponse clone() {
    return (GoogleCloudRetailV2PurgeProductsResponse) super.clone();
  }

}