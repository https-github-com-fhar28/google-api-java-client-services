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
 * Request message for TensorboardService.WriteTensorboardRunData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1WriteTensorboardRunDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The resource name of the TensorboardRun to write data to. Format: `projects/{project}
   * /locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tensorboardRun;

  /**
   * Required. The TensorboardTimeSeries data to write. Values with in a time series are indexed by
   * their step value. Repeated writes to the same step will overwrite the existing value for that
   * step. The upper limit of data points per write request is 5000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1TimeSeriesData> timeSeriesData;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1TimeSeriesData used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1TimeSeriesData.class);
  }

  /**
   * Required. The resource name of the TensorboardRun to write data to. Format: `projects/{project}
   * /locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * @return value or {@code null} for none
   */
  public java.lang.String getTensorboardRun() {
    return tensorboardRun;
  }

  /**
   * Required. The resource name of the TensorboardRun to write data to. Format: `projects/{project}
   * /locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * @param tensorboardRun tensorboardRun or {@code null} for none
   */
  public GoogleCloudAiplatformV1WriteTensorboardRunDataRequest setTensorboardRun(java.lang.String tensorboardRun) {
    this.tensorboardRun = tensorboardRun;
    return this;
  }

  /**
   * Required. The TensorboardTimeSeries data to write. Values with in a time series are indexed by
   * their step value. Repeated writes to the same step will overwrite the existing value for that
   * step. The upper limit of data points per write request is 5000.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1TimeSeriesData> getTimeSeriesData() {
    return timeSeriesData;
  }

  /**
   * Required. The TensorboardTimeSeries data to write. Values with in a time series are indexed by
   * their step value. Repeated writes to the same step will overwrite the existing value for that
   * step. The upper limit of data points per write request is 5000.
   * @param timeSeriesData timeSeriesData or {@code null} for none
   */
  public GoogleCloudAiplatformV1WriteTensorboardRunDataRequest setTimeSeriesData(java.util.List<GoogleCloudAiplatformV1TimeSeriesData> timeSeriesData) {
    this.timeSeriesData = timeSeriesData;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1WriteTensorboardRunDataRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1WriteTensorboardRunDataRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1WriteTensorboardRunDataRequest clone() {
    return (GoogleCloudAiplatformV1WriteTensorboardRunDataRequest) super.clone();
  }

}