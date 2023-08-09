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
 * Represents the spec of a worker pool in a job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1WorkerPoolSpec extends com.google.api.client.json.GenericJson {

  /**
   * The custom container task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ContainerSpec containerSpec;

  /**
   * Disk spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DiskSpec diskSpec;

  /**
   * Optional. Immutable. The specification of a single machine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1MachineSpec machineSpec;

  /**
   * Optional. List of NFS mount spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1NfsMount> nfsMounts;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1NfsMount used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1NfsMount.class);
  }

  /**
   * The Python packaged task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1PythonPackageSpec pythonPackageSpec;

  /**
   * Optional. The number of worker replicas to use for this worker pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long replicaCount;

  /**
   * The custom container task.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ContainerSpec getContainerSpec() {
    return containerSpec;
  }

  /**
   * The custom container task.
   * @param containerSpec containerSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setContainerSpec(GoogleCloudAiplatformV1ContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
    return this;
  }

  /**
   * Disk spec.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DiskSpec getDiskSpec() {
    return diskSpec;
  }

  /**
   * Disk spec.
   * @param diskSpec diskSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setDiskSpec(GoogleCloudAiplatformV1DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  /**
   * Optional. Immutable. The specification of a single machine.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1MachineSpec getMachineSpec() {
    return machineSpec;
  }

  /**
   * Optional. Immutable. The specification of a single machine.
   * @param machineSpec machineSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setMachineSpec(GoogleCloudAiplatformV1MachineSpec machineSpec) {
    this.machineSpec = machineSpec;
    return this;
  }

  /**
   * Optional. List of NFS mount spec.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1NfsMount> getNfsMounts() {
    return nfsMounts;
  }

  /**
   * Optional. List of NFS mount spec.
   * @param nfsMounts nfsMounts or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setNfsMounts(java.util.List<GoogleCloudAiplatformV1NfsMount> nfsMounts) {
    this.nfsMounts = nfsMounts;
    return this;
  }

  /**
   * The Python packaged task.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1PythonPackageSpec getPythonPackageSpec() {
    return pythonPackageSpec;
  }

  /**
   * The Python packaged task.
   * @param pythonPackageSpec pythonPackageSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setPythonPackageSpec(GoogleCloudAiplatformV1PythonPackageSpec pythonPackageSpec) {
    this.pythonPackageSpec = pythonPackageSpec;
    return this;
  }

  /**
   * Optional. The number of worker replicas to use for this worker pool.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReplicaCount() {
    return replicaCount;
  }

  /**
   * Optional. The number of worker replicas to use for this worker pool.
   * @param replicaCount replicaCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1WorkerPoolSpec setReplicaCount(java.lang.Long replicaCount) {
    this.replicaCount = replicaCount;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1WorkerPoolSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1WorkerPoolSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1WorkerPoolSpec clone() {
    return (GoogleCloudAiplatformV1WorkerPoolSpec) super.clone();
  }

}