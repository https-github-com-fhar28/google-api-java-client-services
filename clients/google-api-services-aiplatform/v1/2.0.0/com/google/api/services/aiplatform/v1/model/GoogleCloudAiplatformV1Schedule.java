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
 * An instance of a Schedule periodically schedules runs to make API calls based on user specified
 * time specification and API request type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Schedule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Whether new scheduled runs can be queued when max_concurrent_runs limit is reached.
   * If set to true, new runs will be queued instead of skipped. Default to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowQueueing;

  /**
   * Output only. Whether to backfill missed runs when the schedule is resumed from PAUSED state. If
   * set to true, all missed runs will be scheduled. New runs will be scheduled after the backfill
   * is complete. Default to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean catchUp;

  /**
   * Request for PipelineService.CreatePipelineJob. CreatePipelineJobRequest.parent field is
   * required (format: projects/{project}/locations/{location}).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1CreatePipelineJobRequest createPipelineJobRequest;

  /**
   * Output only. Timestamp when this Schedule was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled runs. To explicitly set
   * a timezone to the cron tab, apply a prefix in the cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or
   * "TZ=${IANA_TIME_ZONE}". The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or "TZ=America/New_York 1 * * *
   * *".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cron;

  /**
   * Required. User provided name of the Schedule. The name can be up to 128 characters long and can
   * consist of any UTF-8 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Timestamp after which no new runs can be scheduled. If specified, The schedule will
   * be completed when either end_time is reached or when scheduled_run_count >= max_run_count. If
   * not specified, new runs will keep getting scheduled until this Schedule is paused or deleted.
   * Already scheduled runs will be allowed to complete. Unset if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. Timestamp when this Schedule was last paused. Unset if never paused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPauseTime;

  /**
   * Output only. Timestamp when this Schedule was last resumed. Unset if never resumed from pause.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastResumeTime;

  /**
   * Output only. Response of the last scheduled run. This is the response for starting the
   * scheduled requests and not the execution of the operations/jobs created by the requests (if
   * applicable). Unset if no run has been scheduled yet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ScheduleRunResponse lastScheduledRunResponse;

  /**
   * Required. Maximum number of runs that can be started concurrently for this Schedule. This is
   * the limit for starting the scheduled requests and not the execution of the operations/jobs
   * created by the requests (if applicable).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxConcurrentRunCount;

  /**
   * Optional. Maximum run count of the schedule. If specified, The schedule will be completed when
   * either started_run_count >= max_run_count or when end_time is reached. If not specified, new
   * runs will keep getting scheduled until this Schedule is paused or deleted. Already scheduled
   * runs will be allowed to complete. Unset if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxRunCount;

  /**
   * Immutable. The resource name of the Schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Timestamp when this Schedule should schedule the next run. Having a next_run_time
   * in the past means the runs are being started behind schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nextRunTime;

  /**
   * Optional. Timestamp after which the first run can be scheduled. Default to Schedule create time
   * if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The number of runs started by this schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startedRunCount;

  /**
   * Output only. The state of this Schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Timestamp when this Schedule was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Whether new scheduled runs can be queued when max_concurrent_runs limit is reached.
   * If set to true, new runs will be queued instead of skipped. Default to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowQueueing() {
    return allowQueueing;
  }

  /**
   * Optional. Whether new scheduled runs can be queued when max_concurrent_runs limit is reached.
   * If set to true, new runs will be queued instead of skipped. Default to false.
   * @param allowQueueing allowQueueing or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setAllowQueueing(java.lang.Boolean allowQueueing) {
    this.allowQueueing = allowQueueing;
    return this;
  }

  /**
   * Output only. Whether to backfill missed runs when the schedule is resumed from PAUSED state. If
   * set to true, all missed runs will be scheduled. New runs will be scheduled after the backfill
   * is complete. Default to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCatchUp() {
    return catchUp;
  }

  /**
   * Output only. Whether to backfill missed runs when the schedule is resumed from PAUSED state. If
   * set to true, all missed runs will be scheduled. New runs will be scheduled after the backfill
   * is complete. Default to false.
   * @param catchUp catchUp or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setCatchUp(java.lang.Boolean catchUp) {
    this.catchUp = catchUp;
    return this;
  }

  /**
   * Request for PipelineService.CreatePipelineJob. CreatePipelineJobRequest.parent field is
   * required (format: projects/{project}/locations/{location}).
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1CreatePipelineJobRequest getCreatePipelineJobRequest() {
    return createPipelineJobRequest;
  }

  /**
   * Request for PipelineService.CreatePipelineJob. CreatePipelineJobRequest.parent field is
   * required (format: projects/{project}/locations/{location}).
   * @param createPipelineJobRequest createPipelineJobRequest or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setCreatePipelineJobRequest(GoogleCloudAiplatformV1CreatePipelineJobRequest createPipelineJobRequest) {
    this.createPipelineJobRequest = createPipelineJobRequest;
    return this;
  }

  /**
   * Output only. Timestamp when this Schedule was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this Schedule was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled runs. To explicitly set
   * a timezone to the cron tab, apply a prefix in the cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or
   * "TZ=${IANA_TIME_ZONE}". The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or "TZ=America/New_York 1 * * *
   * *".
   * @return value or {@code null} for none
   */
  public java.lang.String getCron() {
    return cron;
  }

  /**
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled runs. To explicitly set
   * a timezone to the cron tab, apply a prefix in the cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or
   * "TZ=${IANA_TIME_ZONE}". The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or "TZ=America/New_York 1 * * *
   * *".
   * @param cron cron or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setCron(java.lang.String cron) {
    this.cron = cron;
    return this;
  }

  /**
   * Required. User provided name of the Schedule. The name can be up to 128 characters long and can
   * consist of any UTF-8 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. User provided name of the Schedule. The name can be up to 128 characters long and can
   * consist of any UTF-8 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Timestamp after which no new runs can be scheduled. If specified, The schedule will
   * be completed when either end_time is reached or when scheduled_run_count >= max_run_count. If
   * not specified, new runs will keep getting scheduled until this Schedule is paused or deleted.
   * Already scheduled runs will be allowed to complete. Unset if not specified.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Optional. Timestamp after which no new runs can be scheduled. If specified, The schedule will
   * be completed when either end_time is reached or when scheduled_run_count >= max_run_count. If
   * not specified, new runs will keep getting scheduled until this Schedule is paused or deleted.
   * Already scheduled runs will be allowed to complete. Unset if not specified.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Timestamp when this Schedule was last paused. Unset if never paused.
   * @return value or {@code null} for none
   */
  public String getLastPauseTime() {
    return lastPauseTime;
  }

  /**
   * Output only. Timestamp when this Schedule was last paused. Unset if never paused.
   * @param lastPauseTime lastPauseTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setLastPauseTime(String lastPauseTime) {
    this.lastPauseTime = lastPauseTime;
    return this;
  }

  /**
   * Output only. Timestamp when this Schedule was last resumed. Unset if never resumed from pause.
   * @return value or {@code null} for none
   */
  public String getLastResumeTime() {
    return lastResumeTime;
  }

  /**
   * Output only. Timestamp when this Schedule was last resumed. Unset if never resumed from pause.
   * @param lastResumeTime lastResumeTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setLastResumeTime(String lastResumeTime) {
    this.lastResumeTime = lastResumeTime;
    return this;
  }

  /**
   * Output only. Response of the last scheduled run. This is the response for starting the
   * scheduled requests and not the execution of the operations/jobs created by the requests (if
   * applicable). Unset if no run has been scheduled yet.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ScheduleRunResponse getLastScheduledRunResponse() {
    return lastScheduledRunResponse;
  }

  /**
   * Output only. Response of the last scheduled run. This is the response for starting the
   * scheduled requests and not the execution of the operations/jobs created by the requests (if
   * applicable). Unset if no run has been scheduled yet.
   * @param lastScheduledRunResponse lastScheduledRunResponse or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setLastScheduledRunResponse(GoogleCloudAiplatformV1ScheduleRunResponse lastScheduledRunResponse) {
    this.lastScheduledRunResponse = lastScheduledRunResponse;
    return this;
  }

  /**
   * Required. Maximum number of runs that can be started concurrently for this Schedule. This is
   * the limit for starting the scheduled requests and not the execution of the operations/jobs
   * created by the requests (if applicable).
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxConcurrentRunCount() {
    return maxConcurrentRunCount;
  }

  /**
   * Required. Maximum number of runs that can be started concurrently for this Schedule. This is
   * the limit for starting the scheduled requests and not the execution of the operations/jobs
   * created by the requests (if applicable).
   * @param maxConcurrentRunCount maxConcurrentRunCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setMaxConcurrentRunCount(java.lang.Long maxConcurrentRunCount) {
    this.maxConcurrentRunCount = maxConcurrentRunCount;
    return this;
  }

  /**
   * Optional. Maximum run count of the schedule. If specified, The schedule will be completed when
   * either started_run_count >= max_run_count or when end_time is reached. If not specified, new
   * runs will keep getting scheduled until this Schedule is paused or deleted. Already scheduled
   * runs will be allowed to complete. Unset if not specified.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxRunCount() {
    return maxRunCount;
  }

  /**
   * Optional. Maximum run count of the schedule. If specified, The schedule will be completed when
   * either started_run_count >= max_run_count or when end_time is reached. If not specified, new
   * runs will keep getting scheduled until this Schedule is paused or deleted. Already scheduled
   * runs will be allowed to complete. Unset if not specified.
   * @param maxRunCount maxRunCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setMaxRunCount(java.lang.Long maxRunCount) {
    this.maxRunCount = maxRunCount;
    return this;
  }

  /**
   * Immutable. The resource name of the Schedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name of the Schedule.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Timestamp when this Schedule should schedule the next run. Having a next_run_time
   * in the past means the runs are being started behind schedule.
   * @return value or {@code null} for none
   */
  public String getNextRunTime() {
    return nextRunTime;
  }

  /**
   * Output only. Timestamp when this Schedule should schedule the next run. Having a next_run_time
   * in the past means the runs are being started behind schedule.
   * @param nextRunTime nextRunTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setNextRunTime(String nextRunTime) {
    this.nextRunTime = nextRunTime;
    return this;
  }

  /**
   * Optional. Timestamp after which the first run can be scheduled. Default to Schedule create time
   * if not specified.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Optional. Timestamp after which the first run can be scheduled. Default to Schedule create time
   * if not specified.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The number of runs started by this schedule.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartedRunCount() {
    return startedRunCount;
  }

  /**
   * Output only. The number of runs started by this schedule.
   * @param startedRunCount startedRunCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setStartedRunCount(java.lang.Long startedRunCount) {
    this.startedRunCount = startedRunCount;
    return this;
  }

  /**
   * Output only. The state of this Schedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of this Schedule.
   * @param state state or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Timestamp when this Schedule was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this Schedule was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Schedule setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Schedule set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Schedule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Schedule clone() {
    return (GoogleCloudAiplatformV1Schedule) super.clone();
  }

}