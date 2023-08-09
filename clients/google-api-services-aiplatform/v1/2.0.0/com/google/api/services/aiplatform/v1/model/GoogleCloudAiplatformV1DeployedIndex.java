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
 * A deployment of an Index. IndexEndpoints contain one or more DeployedIndexes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1DeployedIndex extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A description of resources that the DeployedIndex uses, which to large degree are
   * decided by Vertex AI, and optionally allows only a modest additional configuration. If
   * min_replica_count is not set, the default value is 2 (we don't provide SLA when
   * min_replica_count=1). If max_replica_count is not set, the default value is min_replica_count.
   * The max allowed replica count is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1AutomaticResources automaticResources;

  /**
   * Output only. Timestamp when the DeployedIndex was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A description of resources that are dedicated to the DeployedIndex, and that need a
   * higher degree of manual configuration. If min_replica_count is not set, the default value is 2
   * (we don't provide SLA when min_replica_count=1). If max_replica_count is not set, the default
   * value is min_replica_count. The max allowed replica count is 1000. Available machine types for
   * SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
   * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for
   * LARGE shard. Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
   * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and
   * e2-highmem-16 for cost efficiency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DedicatedResources dedicatedResources;

  /**
   * Optional. If set, the authentication is enabled for the private endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DeployedIndexAuthConfig deployedIndexAuthConfig;

  /**
   * Optional. The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not
   * set, we will use the 'default' deployment group. Creating `deployment_groups` with
   * `reserved_ip_ranges` is a recommended practice when the peered network has multiple peering
   * ranges. This creates your deployments from predictable IP spaces for easier traffic
   * administration. Also, one deployment_group (except 'default') can only be used with the same
   * reserved_ip_ranges which means if the deployment_group has been used with reserved_ip_ranges:
   * [a, b, c], using it with [a, b] or [d, e] is disallowed. Note: we only support up to 5
   * deployment groups(not including 'default').
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentGroup;

  /**
   * The display name of the DeployedIndex. If not provided upon creation, the Index's display_name
   * is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. If true, private endpoint's access logs are sent to Cloud Logging. These logs are
   * like standard server access logs, containing information like timestamp and latency for each
   * MatchRequest. Note that logs may incur a cost, especially if the deployed index receives a high
   * queries per second rate (QPS). Estimate your costs before enabling this option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAccessLogging;

  /**
   * Required. The user specified ID of the DeployedIndex. The ID can be up to 128 characters long
   * and must start with a letter and only contain letters, numbers, and underscores. The ID must be
   * unique within the project it is created in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. The name of the Index this is the deployment of. We may refer to this Index as the
   * DeployedIndex's "original" Index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String index;

  /**
   * Output only. The DeployedIndex may depend on various data on its original Index. Additionally
   * when certain changes to the original Index are being done (e.g. when what the Index contains is
   * being changed) the DeployedIndex may be asynchronously updated in the background to reflect
   * these changes. If this timestamp's value is at least the Index.update_time of the original
   * Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp
   * is older, then to see which updates this DeployedIndex already contains (and which it does
   * not), one must list the operations that are running on the original Index. Only the
   * successfully completed Operations with update_time equal or before this sync time are contained
   * in this DeployedIndex.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String indexSyncTime;

  /**
   * Output only. Provides paths for users to send requests directly to the deployed index services
   * running on Cloud via private services access. This field is populated if network is configured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1IndexPrivateEndpoints privateEndpoints;

  /**
   * Optional. A list of reserved ip ranges under the VPC network that can be used for this
   * DeployedIndex. If set, we will deploy the index within the provided ip ranges. Otherwise, the
   * index might be deployed to any ip ranges under the provided VPC network. The value should be
   * the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reservedIpRanges;

  /**
   * Optional. A description of resources that the DeployedIndex uses, which to large degree are
   * decided by Vertex AI, and optionally allows only a modest additional configuration. If
   * min_replica_count is not set, the default value is 2 (we don't provide SLA when
   * min_replica_count=1). If max_replica_count is not set, the default value is min_replica_count.
   * The max allowed replica count is 1000.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1AutomaticResources getAutomaticResources() {
    return automaticResources;
  }

  /**
   * Optional. A description of resources that the DeployedIndex uses, which to large degree are
   * decided by Vertex AI, and optionally allows only a modest additional configuration. If
   * min_replica_count is not set, the default value is 2 (we don't provide SLA when
   * min_replica_count=1). If max_replica_count is not set, the default value is min_replica_count.
   * The max allowed replica count is 1000.
   * @param automaticResources automaticResources or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setAutomaticResources(GoogleCloudAiplatformV1AutomaticResources automaticResources) {
    this.automaticResources = automaticResources;
    return this;
  }

  /**
   * Output only. Timestamp when the DeployedIndex was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the DeployedIndex was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A description of resources that are dedicated to the DeployedIndex, and that need a
   * higher degree of manual configuration. If min_replica_count is not set, the default value is 2
   * (we don't provide SLA when min_replica_count=1). If max_replica_count is not set, the default
   * value is min_replica_count. The max allowed replica count is 1000. Available machine types for
   * SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
   * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for
   * LARGE shard. Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
   * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and
   * e2-highmem-16 for cost efficiency.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DedicatedResources getDedicatedResources() {
    return dedicatedResources;
  }

  /**
   * Optional. A description of resources that are dedicated to the DeployedIndex, and that need a
   * higher degree of manual configuration. If min_replica_count is not set, the default value is 2
   * (we don't provide SLA when min_replica_count=1). If max_replica_count is not set, the default
   * value is min_replica_count. The max allowed replica count is 1000. Available machine types for
   * SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
   * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for
   * LARGE shard. Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
   * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and
   * e2-highmem-16 for cost efficiency.
   * @param dedicatedResources dedicatedResources or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setDedicatedResources(GoogleCloudAiplatformV1DedicatedResources dedicatedResources) {
    this.dedicatedResources = dedicatedResources;
    return this;
  }

  /**
   * Optional. If set, the authentication is enabled for the private endpoint.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndexAuthConfig getDeployedIndexAuthConfig() {
    return deployedIndexAuthConfig;
  }

  /**
   * Optional. If set, the authentication is enabled for the private endpoint.
   * @param deployedIndexAuthConfig deployedIndexAuthConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setDeployedIndexAuthConfig(GoogleCloudAiplatformV1DeployedIndexAuthConfig deployedIndexAuthConfig) {
    this.deployedIndexAuthConfig = deployedIndexAuthConfig;
    return this;
  }

  /**
   * Optional. The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not
   * set, we will use the 'default' deployment group. Creating `deployment_groups` with
   * `reserved_ip_ranges` is a recommended practice when the peered network has multiple peering
   * ranges. This creates your deployments from predictable IP spaces for easier traffic
   * administration. Also, one deployment_group (except 'default') can only be used with the same
   * reserved_ip_ranges which means if the deployment_group has been used with reserved_ip_ranges:
   * [a, b, c], using it with [a, b] or [d, e] is disallowed. Note: we only support up to 5
   * deployment groups(not including 'default').
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentGroup() {
    return deploymentGroup;
  }

  /**
   * Optional. The deployment group can be no longer than 64 characters (eg: 'test', 'prod'). If not
   * set, we will use the 'default' deployment group. Creating `deployment_groups` with
   * `reserved_ip_ranges` is a recommended practice when the peered network has multiple peering
   * ranges. This creates your deployments from predictable IP spaces for easier traffic
   * administration. Also, one deployment_group (except 'default') can only be used with the same
   * reserved_ip_ranges which means if the deployment_group has been used with reserved_ip_ranges:
   * [a, b, c], using it with [a, b] or [d, e] is disallowed. Note: we only support up to 5
   * deployment groups(not including 'default').
   * @param deploymentGroup deploymentGroup or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setDeploymentGroup(java.lang.String deploymentGroup) {
    this.deploymentGroup = deploymentGroup;
    return this;
  }

  /**
   * The display name of the DeployedIndex. If not provided upon creation, the Index's display_name
   * is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the DeployedIndex. If not provided upon creation, the Index's display_name
   * is used.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. If true, private endpoint's access logs are sent to Cloud Logging. These logs are
   * like standard server access logs, containing information like timestamp and latency for each
   * MatchRequest. Note that logs may incur a cost, especially if the deployed index receives a high
   * queries per second rate (QPS). Estimate your costs before enabling this option.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAccessLogging() {
    return enableAccessLogging;
  }

  /**
   * Optional. If true, private endpoint's access logs are sent to Cloud Logging. These logs are
   * like standard server access logs, containing information like timestamp and latency for each
   * MatchRequest. Note that logs may incur a cost, especially if the deployed index receives a high
   * queries per second rate (QPS). Estimate your costs before enabling this option.
   * @param enableAccessLogging enableAccessLogging or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setEnableAccessLogging(java.lang.Boolean enableAccessLogging) {
    this.enableAccessLogging = enableAccessLogging;
    return this;
  }

  /**
   * Required. The user specified ID of the DeployedIndex. The ID can be up to 128 characters long
   * and must start with a letter and only contain letters, numbers, and underscores. The ID must be
   * unique within the project it is created in.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The user specified ID of the DeployedIndex. The ID can be up to 128 characters long
   * and must start with a letter and only contain letters, numbers, and underscores. The ID must be
   * unique within the project it is created in.
   * @param id id or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The name of the Index this is the deployment of. We may refer to this Index as the
   * DeployedIndex's "original" Index.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndex() {
    return index;
  }

  /**
   * Required. The name of the Index this is the deployment of. We may refer to this Index as the
   * DeployedIndex's "original" Index.
   * @param index index or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setIndex(java.lang.String index) {
    this.index = index;
    return this;
  }

  /**
   * Output only. The DeployedIndex may depend on various data on its original Index. Additionally
   * when certain changes to the original Index are being done (e.g. when what the Index contains is
   * being changed) the DeployedIndex may be asynchronously updated in the background to reflect
   * these changes. If this timestamp's value is at least the Index.update_time of the original
   * Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp
   * is older, then to see which updates this DeployedIndex already contains (and which it does
   * not), one must list the operations that are running on the original Index. Only the
   * successfully completed Operations with update_time equal or before this sync time are contained
   * in this DeployedIndex.
   * @return value or {@code null} for none
   */
  public String getIndexSyncTime() {
    return indexSyncTime;
  }

  /**
   * Output only. The DeployedIndex may depend on various data on its original Index. Additionally
   * when certain changes to the original Index are being done (e.g. when what the Index contains is
   * being changed) the DeployedIndex may be asynchronously updated in the background to reflect
   * these changes. If this timestamp's value is at least the Index.update_time of the original
   * Index, it means that this DeployedIndex and the original Index are in sync. If this timestamp
   * is older, then to see which updates this DeployedIndex already contains (and which it does
   * not), one must list the operations that are running on the original Index. Only the
   * successfully completed Operations with update_time equal or before this sync time are contained
   * in this DeployedIndex.
   * @param indexSyncTime indexSyncTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setIndexSyncTime(String indexSyncTime) {
    this.indexSyncTime = indexSyncTime;
    return this;
  }

  /**
   * Output only. Provides paths for users to send requests directly to the deployed index services
   * running on Cloud via private services access. This field is populated if network is configured.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1IndexPrivateEndpoints getPrivateEndpoints() {
    return privateEndpoints;
  }

  /**
   * Output only. Provides paths for users to send requests directly to the deployed index services
   * running on Cloud via private services access. This field is populated if network is configured.
   * @param privateEndpoints privateEndpoints or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setPrivateEndpoints(GoogleCloudAiplatformV1IndexPrivateEndpoints privateEndpoints) {
    this.privateEndpoints = privateEndpoints;
    return this;
  }

  /**
   * Optional. A list of reserved ip ranges under the VPC network that can be used for this
   * DeployedIndex. If set, we will deploy the index within the provided ip ranges. Otherwise, the
   * index might be deployed to any ip ranges under the provided VPC network. The value should be
   * the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReservedIpRanges() {
    return reservedIpRanges;
  }

  /**
   * Optional. A list of reserved ip ranges under the VPC network that can be used for this
   * DeployedIndex. If set, we will deploy the index within the provided ip ranges. Otherwise, the
   * index might be deployed to any ip ranges under the provided VPC network. The value should be
   * the name of the address (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * @param reservedIpRanges reservedIpRanges or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedIndex setReservedIpRanges(java.util.List<java.lang.String> reservedIpRanges) {
    this.reservedIpRanges = reservedIpRanges;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1DeployedIndex set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1DeployedIndex) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1DeployedIndex clone() {
    return (GoogleCloudAiplatformV1DeployedIndex) super.clone();
  }

}