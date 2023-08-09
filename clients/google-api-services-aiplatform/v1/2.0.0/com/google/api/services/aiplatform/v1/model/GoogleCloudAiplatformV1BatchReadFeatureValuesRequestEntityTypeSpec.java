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

package com.google.api.services.aiplatform.v1.model;

/**
 * Selects Features of an EntityType to read values of and specifies read settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec extends com.google.api.client.json.GenericJson {

  /**
   * Required. ID of the EntityType to select Features. The EntityType id is the entity_type_id
   * specified during EntityType creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityTypeId;

  /**
   * Required. Selectors choosing which Feature values to read from the EntityType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FeatureSelector featureSelector;

  /**
   * Per-Feature settings for the batch read.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings;

  /**
   * Required. ID of the EntityType to select Features. The EntityType id is the entity_type_id
   * specified during EntityType creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityTypeId() {
    return entityTypeId;
  }

  /**
   * Required. ID of the EntityType to select Features. The EntityType id is the entity_type_id
   * specified during EntityType creation.
   * @param entityTypeId entityTypeId or {@code null} for none
   */
  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec setEntityTypeId(java.lang.String entityTypeId) {
    this.entityTypeId = entityTypeId;
    return this;
  }

  /**
   * Required. Selectors choosing which Feature values to read from the EntityType.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureSelector getFeatureSelector() {
    return featureSelector;
  }

  /**
   * Required. Selectors choosing which Feature values to read from the EntityType.
   * @param featureSelector featureSelector or {@code null} for none
   */
  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec setFeatureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
    return this;
  }

  /**
   * Per-Feature settings for the batch read.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> getSettings() {
    return settings;
  }

  /**
   * Per-Feature settings for the batch read.
   * @param settings settings or {@code null} for none
   */
  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec setSettings(java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings) {
    this.settings = settings;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec clone() {
    return (GoogleCloudAiplatformV1BatchReadFeatureValuesRequestEntityTypeSpec) super.clone();
  }

}