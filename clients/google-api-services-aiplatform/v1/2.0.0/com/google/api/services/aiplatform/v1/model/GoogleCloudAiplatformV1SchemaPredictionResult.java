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
 * Represents a line of JSONL in the batch prediction output file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaPredictionResult extends com.google.api.client.json.GenericJson {

  /**
   * The error result. Do not set prediction if this is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaPredictionResultError error;

  /**
   * User's input instance. Struct is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> instance;

  /**
   * Optional user-provided key from the input instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The prediction result. Value is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON and so we can represent array of objects.
   * Do not set error if this is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object prediction;

  /**
   * The error result. Do not set prediction if this is set.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictionResultError getError() {
    return error;
  }

  /**
   * The error result. Do not set prediction if this is set.
   * @param error error or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictionResult setError(GoogleCloudAiplatformV1SchemaPredictionResultError error) {
    this.error = error;
    return this;
  }

  /**
   * User's input instance. Struct is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getInstance() {
    return instance;
  }

  /**
   * User's input instance. Struct is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON.
   * @param instance instance or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictionResult setInstance(java.util.Map<String, java.lang.Object> instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Optional user-provided key from the input instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Optional user-provided key from the input instance.
   * @param key key or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictionResult setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The prediction result. Value is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON and so we can represent array of objects.
   * Do not set error if this is set.
   * @return value or {@code null} for none
   */
  public java.lang.Object getPrediction() {
    return prediction;
  }

  /**
   * The prediction result. Value is used here instead of Any so that JsonFormat does not append an
   * extra "@type" field when we convert the proto to JSON and so we can represent array of objects.
   * Do not set error if this is set.
   * @param prediction prediction or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictionResult setPrediction(java.lang.Object prediction) {
    this.prediction = prediction;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictionResult set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaPredictionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictionResult clone() {
    return (GoogleCloudAiplatformV1SchemaPredictionResult) super.clone();
  }

}