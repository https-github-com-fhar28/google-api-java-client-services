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
 * Represents export format supported by the Model. All formats export to Google Cloud Storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ModelExportFormat extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The content of this Model that may be exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exportableContents;

  /**
   * Output only. The ID of the export format. The possible format IDs are: * `tflite` Used for
   * Android mobile devices. * `edgetpu-tflite` Used for [Edge TPU](https://cloud.google.com/edge-
   * tpu/) devices. * `tf-saved-model` A tensorflow model in SavedModel format. * `tf-js` A
   * [TensorFlow.js](https://www.tensorflow.org/js) model that can be used in the browser and in
   * Node.js using JavaScript. * `core-ml` Used for iOS mobile devices. * `custom-trained` A Model
   * that was uploaded or trained by custom code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. The content of this Model that may be exported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExportableContents() {
    return exportableContents;
  }

  /**
   * Output only. The content of this Model that may be exported.
   * @param exportableContents exportableContents or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelExportFormat setExportableContents(java.util.List<java.lang.String> exportableContents) {
    this.exportableContents = exportableContents;
    return this;
  }

  /**
   * Output only. The ID of the export format. The possible format IDs are: * `tflite` Used for
   * Android mobile devices. * `edgetpu-tflite` Used for [Edge TPU](https://cloud.google.com/edge-
   * tpu/) devices. * `tf-saved-model` A tensorflow model in SavedModel format. * `tf-js` A
   * [TensorFlow.js](https://www.tensorflow.org/js) model that can be used in the browser and in
   * Node.js using JavaScript. * `core-ml` Used for iOS mobile devices. * `custom-trained` A Model
   * that was uploaded or trained by custom code.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The ID of the export format. The possible format IDs are: * `tflite` Used for
   * Android mobile devices. * `edgetpu-tflite` Used for [Edge TPU](https://cloud.google.com/edge-
   * tpu/) devices. * `tf-saved-model` A tensorflow model in SavedModel format. * `tf-js` A
   * [TensorFlow.js](https://www.tensorflow.org/js) model that can be used in the browser and in
   * Node.js using JavaScript. * `core-ml` Used for iOS mobile devices. * `custom-trained` A Model
   * that was uploaded or trained by custom code.
   * @param id id or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelExportFormat setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelExportFormat set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ModelExportFormat) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelExportFormat clone() {
    return (GoogleCloudAiplatformV1beta1ModelExportFormat) super.clone();
  }

}