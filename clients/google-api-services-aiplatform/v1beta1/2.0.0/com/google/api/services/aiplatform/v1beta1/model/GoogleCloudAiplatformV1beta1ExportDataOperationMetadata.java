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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Runtime operation information for DatasetService.ExportData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ExportDataOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * A Google Cloud Storage directory which path ends with '/'. The exported data is stored in the
   * directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsOutputDirectory;

  /**
   * The common part of the operation metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1GenericOperationMetadata genericMetadata;

  /**
   * A Google Cloud Storage directory which path ends with '/'. The exported data is stored in the
   * directory.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsOutputDirectory() {
    return gcsOutputDirectory;
  }

  /**
   * A Google Cloud Storage directory which path ends with '/'. The exported data is stored in the
   * directory.
   * @param gcsOutputDirectory gcsOutputDirectory or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExportDataOperationMetadata setGcsOutputDirectory(java.lang.String gcsOutputDirectory) {
    this.gcsOutputDirectory = gcsOutputDirectory;
    return this;
  }

  /**
   * The common part of the operation metadata.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GenericOperationMetadata getGenericMetadata() {
    return genericMetadata;
  }

  /**
   * The common part of the operation metadata.
   * @param genericMetadata genericMetadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExportDataOperationMetadata setGenericMetadata(GoogleCloudAiplatformV1beta1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExportDataOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ExportDataOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExportDataOperationMetadata clone() {
    return (GoogleCloudAiplatformV1beta1ExportDataOperationMetadata) super.clone();
  }

}