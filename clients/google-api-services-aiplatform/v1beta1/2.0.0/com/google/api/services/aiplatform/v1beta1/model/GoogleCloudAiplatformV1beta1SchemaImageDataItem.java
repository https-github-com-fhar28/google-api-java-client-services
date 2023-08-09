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
 * Payload of Image DataItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaImageDataItem extends com.google.api.client.json.GenericJson {

  /**
   * Required. Google Cloud Storage URI points to the original image in user's bucket. The image is
   * up to 30MB in size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsUri;

  /**
   * Output only. The mime type of the content of the image. Only the images in below listed mime
   * types are supported. - image/jpeg - image/gif - image/png - image/webp - image/bmp - image/tiff
   * - image/vnd.microsoft.icon
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Required. Google Cloud Storage URI points to the original image in user's bucket. The image is
   * up to 30MB in size.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsUri() {
    return gcsUri;
  }

  /**
   * Required. Google Cloud Storage URI points to the original image in user's bucket. The image is
   * up to 30MB in size.
   * @param gcsUri gcsUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaImageDataItem setGcsUri(java.lang.String gcsUri) {
    this.gcsUri = gcsUri;
    return this;
  }

  /**
   * Output only. The mime type of the content of the image. Only the images in below listed mime
   * types are supported. - image/jpeg - image/gif - image/png - image/webp - image/bmp - image/tiff
   * - image/vnd.microsoft.icon
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Output only. The mime type of the content of the image. Only the images in below listed mime
   * types are supported. - image/jpeg - image/gif - image/png - image/webp - image/bmp - image/tiff
   * - image/vnd.microsoft.icon
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaImageDataItem setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaImageDataItem set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaImageDataItem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaImageDataItem clone() {
    return (GoogleCloudAiplatformV1beta1SchemaImageDataItem) super.clone();
  }

}