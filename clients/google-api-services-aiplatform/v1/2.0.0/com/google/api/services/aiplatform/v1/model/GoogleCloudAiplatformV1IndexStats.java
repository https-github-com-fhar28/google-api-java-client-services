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
 * Stats of the Index.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1IndexStats extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The number of shards in the Index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer shardsCount;

  /**
   * Output only. The number of vectors in the Index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long vectorsCount;

  /**
   * Output only. The number of shards in the Index.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getShardsCount() {
    return shardsCount;
  }

  /**
   * Output only. The number of shards in the Index.
   * @param shardsCount shardsCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1IndexStats setShardsCount(java.lang.Integer shardsCount) {
    this.shardsCount = shardsCount;
    return this;
  }

  /**
   * Output only. The number of vectors in the Index.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVectorsCount() {
    return vectorsCount;
  }

  /**
   * Output only. The number of vectors in the Index.
   * @param vectorsCount vectorsCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1IndexStats setVectorsCount(java.lang.Long vectorsCount) {
    this.vectorsCount = vectorsCount;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1IndexStats set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1IndexStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1IndexStats clone() {
    return (GoogleCloudAiplatformV1IndexStats) super.clone();
  }

}