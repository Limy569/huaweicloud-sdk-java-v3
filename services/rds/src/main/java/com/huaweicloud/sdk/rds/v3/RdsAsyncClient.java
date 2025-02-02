package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rds.v3.model.*;

public class RdsAsyncClient {
    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RdsAsyncClient::new);
    }


    /**
     * 绑定和解绑弹性公网IP
     * 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 绑定和解绑弹性公网IP
     * 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    /**
     * 批量添加标签
     * 批量添加标签。
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return CompletableFuture<BatchTagAddActionResponse>
     */
    public CompletableFuture<BatchTagAddActionResponse> batchTagAddActionAsync(BatchTagAddActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    /**
     * 批量添加标签
     * 批量添加标签。
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>
     */
    public AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionAsyncInvoker(BatchTagAddActionRequest request) {
        return new AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction, hcClient);
    }

    /**
     * 批量删除标签
     * 批量删除标签。
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return CompletableFuture<BatchTagDelActionResponse>
     */
    public CompletableFuture<BatchTagDelActionResponse> batchTagDelActionAsync(BatchTagDelActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    /**
     * 批量删除标签
     * 批量删除标签。
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>
     */
    public AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionAsyncInvoker(BatchTagDelActionRequest request) {
        return new AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction, hcClient);
    }

    /**
     * 更改主备实例的数据同步方式
     * 更改主备实例的数据同步方式。
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return CompletableFuture<ChangeFailoverModeResponse>
     */
    public CompletableFuture<ChangeFailoverModeResponse> changeFailoverModeAsync(ChangeFailoverModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 更改主备实例的数据同步方式
     * 更改主备实例的数据同步方式。
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>
     */
    public AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeAsyncInvoker(ChangeFailoverModeRequest request) {
        return new AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request, RdsMeta.changeFailoverMode, hcClient);
    }

    /**
     * 切换主备实例的倒换策略
     * 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return CompletableFuture<ChangeFailoverStrategyResponse>
     */
    public CompletableFuture<ChangeFailoverStrategyResponse> changeFailoverStrategyAsync(ChangeFailoverStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 切换主备实例的倒换策略
     * 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>
     */
    public AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyAsyncInvoker(ChangeFailoverStrategyRequest request) {
        return new AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request, RdsMeta.changeFailoverStrategy, hcClient);
    }

    /**
     * 设置可维护时间段
     * 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     * 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(ChangeOpsWindowRequest request) {
        return new AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow, hcClient);
    }

    /**
     * 创建参数模板
     * 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     * 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request, RdsMeta.createConfiguration, hcClient);
    }

    /**
     * 申请域名
     * 申请域名
     *
     * @param CreateDnsNameRequest 请求对象
     * @return CompletableFuture<CreateDnsNameResponse>
     */
    public CompletableFuture<CreateDnsNameResponse> createDnsNameAsync(CreateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDnsName);
    }

    /**
     * 申请域名
     * 申请域名
     *
     * @param CreateDnsNameRequest 请求对象
     * @return AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>
     */
    public AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameAsyncInvoker(CreateDnsNameRequest request) {
        return new AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    /**
     * 创建数据库实例
     * 创建数据库实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 创建数据库实例
     * 创建数据库实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance, hcClient);
    }

    /**
     * 创建手动备份
     * 创建手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(CreateManualBackupRequest request) {
        return new AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request, RdsMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     * 恢复到新实例。
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return CompletableFuture<CreateRestoreInstanceResponse>
     */
    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     * 恢复到新实例。
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request, RdsMeta.createRestoreInstance, hcClient);
    }

    /**
     * 删除参数模板
     * 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     * 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request, RdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除手动备份
     * 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     * 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(DeleteManualBackupRequest request) {
        return new AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request, RdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 获取慢日志下载链接
     * 获取慢日志下载链接。
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     * 获取慢日志下载链接。
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(DownloadSlowlogRequest request) {
        return new AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog, hcClient);
    }

    /**
     * 应用参数模板
     * 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return CompletableFuture<EnableConfigurationResponse>
     */
    public CompletableFuture<EnableConfigurationResponse> enableConfigurationAsync(EnableConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 应用参数模板
     * 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>
     */
    public AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationAsyncInvoker(EnableConfigurationRequest request) {
        return new AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request, RdsMeta.enableConfiguration, hcClient);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(ListAuditlogsRequest request) {
        return new AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 获取备份列表
     * 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 获取备份列表
     * 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    /**
     * 查询SQLServer可用字符集
     * 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return CompletableFuture<ListCollationsResponse>
     */
    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 查询SQLServer可用字符集
     * 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return AsyncInvoker<ListCollationsRequest, ListCollationsResponse>
     */
    public AsyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsAsyncInvoker(ListCollationsRequest request) {
        return new AsyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations, hcClient);
    }

    /**
     * 获取参数模板列表
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request, RdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     * 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     * 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(ListDatastoresRequest request) {
        return new AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(ListErrorLogsRequest request) {
        return new AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     * 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     * 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询数据库实例列表
     * 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 查询数据库实例列表
     * 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return CompletableFuture<ListJobInfoResponse>
     */
    public CompletableFuture<ListJobInfoResponse> listJobInfoAsync(ListJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>
     */
    public AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoAsyncInvoker(ListJobInfoRequest request) {
        return new AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return CompletableFuture<ListJobInfoDetailResponse>
     */
    public CompletableFuture<ListJobInfoDetailResponse> listJobInfoDetailAsync(ListJobInfoDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>
     */
    public AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailAsyncInvoker(ListJobInfoDetailRequest request) {
        return new AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail, hcClient);
    }

    /**
     * 查询跨区域备份列表
     * 查询跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return CompletableFuture<ListOffSiteBackupsResponse>
     */
    public CompletableFuture<ListOffSiteBackupsResponse> listOffSiteBackupsAsync(ListOffSiteBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 查询跨区域备份列表
     * 查询跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>
     */
    public AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsAsyncInvoker(ListOffSiteBackupsRequest request) {
        return new AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request, RdsMeta.listOffSiteBackups, hcClient);
    }

    /**
     * 查询跨区域备份实例列表
     * 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return CompletableFuture<ListOffSiteInstancesResponse>
     */
    public CompletableFuture<ListOffSiteInstancesResponse> listOffSiteInstancesAsync(ListOffSiteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域备份实例列表
     * 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>
     */
    public AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesAsyncInvoker(ListOffSiteInstancesRequest request) {
        return new AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request, RdsMeta.listOffSiteInstances, hcClient);
    }

    /**
     * 查询跨区域备份可恢复时间段
     * 查询跨区域备份可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListOffSiteRestoreTimesResponse>
     */
    public CompletableFuture<ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsync(ListOffSiteRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询跨区域备份可恢复时间段
     * 查询跨区域备份可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>
     */
    public AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsyncInvoker(ListOffSiteRestoreTimesRequest request) {
        return new AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request, RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询可恢复时间段
     * 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     * 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(ListRestoreTimesRequest request) {
        return new AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取慢日志统计信息
     * 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return CompletableFuture<ListSlowlogStatisticsResponse>
     */
    public CompletableFuture<ListSlowlogStatisticsResponse> listSlowlogStatisticsAsync(ListSlowlogStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 获取慢日志统计信息
     * 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>
     */
    public AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsAsyncInvoker(ListSlowlogStatisticsRequest request) {
        return new AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request, RdsMeta.listSlowlogStatistics, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     * 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     * 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(ListStorageTypesRequest request) {
        return new AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes, hcClient);
    }

    /**
     * 迁移主备实例的备机
     * 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return CompletableFuture<MigrateFollowerResponse>
     */
    public CompletableFuture<MigrateFollowerResponse> migrateFollowerAsync(MigrateFollowerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 迁移主备实例的备机
     * 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>
     */
    public AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerAsyncInvoker(MigrateFollowerRequest request) {
        return new AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     * 表级时间点恢复(MySQL)。
     *
     * @param RestoreTablesRequest 请求对象
     * @return CompletableFuture<RestoreTablesResponse>
     */
    public CompletableFuture<RestoreTablesResponse> restoreTablesAsync(RestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 表级时间点恢复(MySQL)
     * 表级时间点恢复(MySQL)。
     *
     * @param RestoreTablesRequest 请求对象
     * @return AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>
     */
    public AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesAsyncInvoker(RestoreTablesRequest request) {
        return new AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    /**
     * 恢复到已有实例
     * 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreToExistingInstanceResponse>
     */
    public CompletableFuture<RestoreToExistingInstanceResponse> restoreToExistingInstanceAsync(RestoreToExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 恢复到已有实例
     * 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>
     */
    public AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceAsyncInvoker(RestoreToExistingInstanceRequest request) {
        return new AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request, RdsMeta.restoreToExistingInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置跨区域备份策略
     * 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsync(SetOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     * 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsyncInvoker(SetOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request, RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /**
     * 修改安全组
     * 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return CompletableFuture<SetSecurityGroupResponse>
     */
    public CompletableFuture<SetSecurityGroupResponse> setSecurityGroupAsync(SetSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 修改安全组
     * 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>
     */
    public AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupAsyncInvoker(SetSecurityGroupRequest request) {
        return new AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup, hcClient);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowAuditlogDownloadLinkResponse>
     */
    public CompletableFuture<ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsync(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>
     */
    public AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsyncInvoker(ShowAuditlogDownloadLinkRequest request) {
        return new AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request, RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request, RdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request, RdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     * 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     * 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(ShowConfigurationRequest request) {
        return new AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     * 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     * 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request, RdsMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询跨区域备份策略
     * 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsync(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 查询跨区域备份策略
     * 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsyncInvoker(ShowOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request, RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /**
     * 查询配额
     * 查询当前项目下资源配额情况。
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showQuotas);
    }

    /**
     * 查询配额
     * 查询当前项目下资源配额情况。
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    /**
     * 手动倒换主备
     * 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return CompletableFuture<StartFailoverResponse>
     */
    public CompletableFuture<StartFailoverResponse> startFailoverAsync(StartFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 手动倒换主备
     * 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return AsyncInvoker<StartFailoverRequest, StartFailoverResponse>
     */
    public AsyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverAsyncInvoker(StartFailoverRequest request) {
        return new AsyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    /**
     * 扩容数据库实例的磁盘空间
     * 扩容数据库实例的磁盘空间。
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return CompletableFuture<StartInstanceEnlargeVolumeActionResponse>
     */
    public CompletableFuture<StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsync(StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    /**
     * 扩容数据库实例的磁盘空间
     * 扩容数据库实例的磁盘空间。
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>
     */
    public AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsyncInvoker(StartInstanceEnlargeVolumeActionRequest request) {
        return new AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    /**
     * 重启数据库实例
     * 重启数据库实例。
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return CompletableFuture<StartInstanceRestartActionResponse>
     */
    public CompletableFuture<StartInstanceRestartActionResponse> startInstanceRestartActionAsync(StartInstanceRestartActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    /**
     * 重启数据库实例
     * 重启数据库实例。
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>
     */
    public AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionAsyncInvoker(StartInstanceRestartActionRequest request) {
        return new AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request, RdsMeta.startInstanceRestartAction, hcClient);
    }

    /**
     * 单机转主备实例
     * 单机转主备实例。
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return CompletableFuture<StartInstanceSingleToHaActionResponse>
     */
    public CompletableFuture<StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsync(StartInstanceSingleToHaActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    /**
     * 单机转主备实例
     * 单机转主备实例。
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>
     */
    public AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsyncInvoker(StartInstanceSingleToHaActionRequest request) {
        return new AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request, RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    /**
     * 设置回收站策略
     * 设置回收站策略。
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return CompletableFuture<StartRecyclePolicyResponse>
     */
    public CompletableFuture<StartRecyclePolicyResponse> startRecyclePolicyAsync(StartRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    /**
     * 设置回收站策略
     * 设置回收站策略。
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>
     */
    public AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyAsyncInvoker(StartRecyclePolicyRequest request) {
        return new AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request, RdsMeta.startRecyclePolicy, hcClient);
    }

    /**
     * 变更数据库实例的规格
     * 变更数据库实例的规格。
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return CompletableFuture<StartResizeFlavorActionResponse>
     */
    public CompletableFuture<StartResizeFlavorActionResponse> startResizeFlavorActionAsync(StartResizeFlavorActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    /**
     * 变更数据库实例的规格
     * 变更数据库实例的规格。
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>
     */
    public AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionAsyncInvoker(StartResizeFlavorActionRequest request) {
        return new AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request, RdsMeta.startResizeFlavorAction, hcClient);
    }

    /**
     * 设置SSL数据加密
     * 设置SSL数据加密。
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * 设置SSL数据加密
     * 设置SSL数据加密。
     *
     * @param SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    /**
     * 修改参数模板参数
     * 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     * 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request, RdsMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改内网地址
     * 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return CompletableFuture<UpdateDataIpResponse>
     */
    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改内网地址
     * 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>
     */
    public AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpAsyncInvoker(UpdateDataIpRequest request) {
        return new AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    /**
     * 修改域名
     * 修改域名
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return CompletableFuture<UpdateDnsNameResponse>
     */
    public CompletableFuture<UpdateDnsNameResponse> updateDnsNameAsync(UpdateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    /**
     * 修改域名
     * 修改域名
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>
     */
    public AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameAsyncInvoker(UpdateDnsNameRequest request) {
        return new AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request, RdsMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request, RdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     * 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 修改数据库端口
     * 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    /**
     * 修改实例备注信息
     * 修改指定数据库实例的备注信息。
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlInstanceAliasResponse>
     */
    public CompletableFuture<UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsync(UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    /**
     * 修改实例备注信息
     * 修改指定数据库实例的备注信息。
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>
     */
    public AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsyncInvoker(UpdatePostgresqlInstanceAliasRequest request) {
        return new AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request, RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsyncInvoker(AllowDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request, RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(CreateDbUserRequest request) {
        return new AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /**
     * 查询指定用户的已授权数据库
     * 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDatabasesResponse>
     */
    public CompletableFuture<ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsync(ListAuthorizedDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定用户的已授权数据库
     * 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>
     */
    public AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsyncInvoker(ListAuthorizedDatabasesRequest request) {
        return new AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request, RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsync(ListAuthorizedDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsyncInvoker(ListAuthorizedDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request, RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return CompletableFuture<RevokeResponse>
     */
    public CompletableFuture<RevokeResponse> revokeAsync(RevokeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return AsyncInvoker<RevokeRequest, RevokeResponse>
     */
    public AsyncInvoker<RevokeRequest, RevokeResponse> revokeAsyncInvoker(RevokeRequest request) {
        return new AsyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    /**
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /**
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(SetDbUserPwdRequest request) {
        return new AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    /**
     * 授权数据库帐号
     * 在指定实例的数据库中, 设置帐号的权限。
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbPrivilegeResponse>
     */
    public CompletableFuture<AllowDbPrivilegeResponse> allowDbPrivilegeAsync(AllowDbPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    /**
     * 授权数据库帐号
     * 在指定实例的数据库中, 设置帐号的权限。
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeAsyncInvoker(AllowDbPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege, hcClient);
    }

    /**
     * 创建数据库
     * 在指定实例中创建数据库。
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsync(CreatePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    /**
     * 创建数据库
     * 在指定实例中创建数据库。
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsyncInvoker(CreatePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request, RdsMeta.createPostgresqlDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     * 在指定实例的数据库中, 创建数据库schema。
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseSchemaResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsync(CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    /**
     * 创建数据库SCHEMA
     * 在指定实例的数据库中, 创建数据库schema。
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsyncInvoker(CreatePostgresqlDatabaseSchemaRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request, RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    /**
     * 创建数据库用户
     * 在指定实例中创建数据库用户。
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDbUserResponse>
     */
    public CompletableFuture<CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsync(CreatePostgresqlDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    /**
     * 创建数据库用户
     * 在指定实例中创建数据库用户。
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>
     */
    public AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsyncInvoker(CreatePostgresqlDbUserRequest request) {
        return new AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request, RdsMeta.createPostgresqlDbUser, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     * 查询指定实例的数据库SCHEMA列表。
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabaseSchemasResponse>
     */
    public CompletableFuture<ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsync(ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     * 查询指定实例的数据库SCHEMA列表。
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsyncInvoker(ListPostgresqlDatabaseSchemasRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request, RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     * 查询指定实例中的数据库列表。
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabasesResponse>
     */
    public CompletableFuture<ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsync(ListPostgresqlDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    /**
     * 查询数据库列表
     * 查询指定实例中的数据库列表。
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsyncInvoker(ListPostgresqlDatabasesRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request, RdsMeta.listPostgresqlDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 在指定实例中查询数据库用户列表。
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDbUserPaginatedResponse>
     */
    public CompletableFuture<ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsync(ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    /**
     * 查询数据库用户列表
     * 在指定实例中查询数据库用户列表。
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>
     */
    public AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsyncInvoker(ListPostgresqlDbUserPaginatedRequest request) {
        return new AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request, RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    /**
     * 重置数据库帐号密码
     * 重置指定数据库帐号的密码。
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetPostgresqlDbUserPwdResponse>
     */
    public CompletableFuture<SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsync(SetPostgresqlDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     * 重置指定数据库帐号的密码。
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>
     */
    public AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsyncInvoker(SetPostgresqlDbUserPwdRequest request) {
        return new AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request, RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsync(AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsyncInvoker(AllowSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request, RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDatabaseResponse>
     */
    public CompletableFuture<CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsync(CreateSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>
     */
    public AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsyncInvoker(CreateSqlserverDatabaseRequest request) {
        return new AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request, RdsMeta.createSqlserverDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDbUserResponse>
     */
    public CompletableFuture<CreateSqlserverDbUserResponse> createSqlserverDbUserAsync(CreateSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>
     */
    public AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserAsyncInvoker(CreateSqlserverDbUserRequest request) {
        return new AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request, RdsMeta.createSqlserverDbUser, hcClient);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDatabaseResponse>
     */
    public CompletableFuture<DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsync(DeleteSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>
     */
    public AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsyncInvoker(DeleteSqlserverDatabaseRequest request) {
        return new AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request, RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDbUserResponse>
     */
    public CompletableFuture<DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsync(DeleteSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>
     */
    public AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsyncInvoker(DeleteSqlserverDbUserRequest request) {
        return new AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request, RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsync(ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsyncInvoker(ListAuthorizedSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request, RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return CompletableFuture<ListSqlserverDatabasesResponse>
     */
    public CompletableFuture<ListSqlserverDatabasesResponse> listSqlserverDatabasesAsync(ListSqlserverDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>
     */
    public AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesAsyncInvoker(ListSqlserverDatabasesRequest request) {
        return new AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request, RdsMeta.listSqlserverDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListSqlserverDbUsersResponse> listSqlserverDbUsersAsync(ListSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersAsyncInvoker(ListSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request, RdsMeta.listSqlserverDbUsers, hcClient);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsync(RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsyncInvoker(RevokeSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request, RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

}