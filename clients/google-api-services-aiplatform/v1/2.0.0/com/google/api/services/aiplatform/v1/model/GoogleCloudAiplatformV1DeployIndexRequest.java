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
 * Request message for IndexEndpointService.DeployIndex.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1DeployIndexRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DeployedIndex deployedIndex;

  /**
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex getDeployedIndex() {
    return deployedIndex;
  }

  /**
   * Required. The DeployedIndex to be created within the IndexEndpoint.
   * @param deployedIndex deployedIndex or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployIndexRequest setDeployedIndex(GoogleCloudAiplatformV1DeployedIndex deployedIndex) {
    this.deployedIndex = deployedIndex;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1DeployIndexRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1DeployIndexRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1DeployIndexRequest clone() {
    return (GoogleCloudAiplatformV1DeployIndexRequest) super.clone();
  }

}