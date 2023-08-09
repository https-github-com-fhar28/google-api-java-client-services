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
 * The detail of a container execution. It contains the job names of the lifecycle of a container
 * execution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The names of the previously failed CustomJob for the main container executions.
   * The list includes the all attempts in chronological order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> failedMainJobs;

  /**
   * Output only. The names of the previously failed CustomJob for the pre-caching-check container
   * executions. This job will be available if the PipelineJob.pipeline_spec specifies the
   * `pre_caching_check` hook in the lifecycle events. The list includes the all attempts in
   * chronological order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> failedPreCachingCheckJobs;

  /**
   * Output only. The name of the CustomJob for the main container execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainJob;

  /**
   * Output only. The name of the CustomJob for the pre-caching-check container execution. This job
   * will be available if the PipelineJob.pipeline_spec specifies the `pre_caching_check` hook in
   * the lifecycle events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String preCachingCheckJob;

  /**
   * Output only. The names of the previously failed CustomJob for the main container executions.
   * The list includes the all attempts in chronological order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFailedMainJobs() {
    return failedMainJobs;
  }

  /**
   * Output only. The names of the previously failed CustomJob for the main container executions.
   * The list includes the all attempts in chronological order.
   * @param failedMainJobs failedMainJobs or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail setFailedMainJobs(java.util.List<java.lang.String> failedMainJobs) {
    this.failedMainJobs = failedMainJobs;
    return this;
  }

  /**
   * Output only. The names of the previously failed CustomJob for the pre-caching-check container
   * executions. This job will be available if the PipelineJob.pipeline_spec specifies the
   * `pre_caching_check` hook in the lifecycle events. The list includes the all attempts in
   * chronological order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFailedPreCachingCheckJobs() {
    return failedPreCachingCheckJobs;
  }

  /**
   * Output only. The names of the previously failed CustomJob for the pre-caching-check container
   * executions. This job will be available if the PipelineJob.pipeline_spec specifies the
   * `pre_caching_check` hook in the lifecycle events. The list includes the all attempts in
   * chronological order.
   * @param failedPreCachingCheckJobs failedPreCachingCheckJobs or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail setFailedPreCachingCheckJobs(java.util.List<java.lang.String> failedPreCachingCheckJobs) {
    this.failedPreCachingCheckJobs = failedPreCachingCheckJobs;
    return this;
  }

  /**
   * Output only. The name of the CustomJob for the main container execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getMainJob() {
    return mainJob;
  }

  /**
   * Output only. The name of the CustomJob for the main container execution.
   * @param mainJob mainJob or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail setMainJob(java.lang.String mainJob) {
    this.mainJob = mainJob;
    return this;
  }

  /**
   * Output only. The name of the CustomJob for the pre-caching-check container execution. This job
   * will be available if the PipelineJob.pipeline_spec specifies the `pre_caching_check` hook in
   * the lifecycle events.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreCachingCheckJob() {
    return preCachingCheckJob;
  }

  /**
   * Output only. The name of the CustomJob for the pre-caching-check container execution. This job
   * will be available if the PipelineJob.pipeline_spec specifies the `pre_caching_check` hook in
   * the lifecycle events.
   * @param preCachingCheckJob preCachingCheckJob or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail setPreCachingCheckJob(java.lang.String preCachingCheckJob) {
    this.preCachingCheckJob = preCachingCheckJob;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail clone() {
    return (GoogleCloudAiplatformV1PipelineTaskExecutorDetailContainerDetail) super.clone();
  }

}