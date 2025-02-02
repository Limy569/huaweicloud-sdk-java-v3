package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mrs.v1.model.*;

public class MrsClient {
    protected HcClient hcClient;

    public MrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsClient> newBuilder() {
        return new ClientBuilder<>(MrsClient::new);
    }


    /**
     * 查询特定标签的集群列表
     * 使用标签过滤集群。  集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return ListClustersByTagsResponse
     */
    public ListClustersByTagsResponse listClustersByTags(ListClustersByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listClustersByTags);
    }

    /**
     * 查询特定标签的集群列表
     * 使用标签过滤集群。  集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>
     */
    public SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse> listClustersByTagsInvoker(ListClustersByTagsRequest request) {
        return new SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>(request, MrsMeta.listClustersByTags, hcClient);
    }

    /**
     * 批量添加集群标签
     * 为指定集群批量添加标签。  一个集群上最多有10个标签。  此接口为幂等接口：  - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return BatchCreateClusterTagsResponse
     */
    public BatchCreateClusterTagsResponse batchCreateClusterTags(BatchCreateClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.batchCreateClusterTags);
    }

    /**
     * 批量添加集群标签
     * 为指定集群批量添加标签。  一个集群上最多有10个标签。  此接口为幂等接口：  - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsInvoker(BatchCreateClusterTagsRequest request) {
        return new SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request, MrsMeta.batchCreateClusterTags, hcClient);
    }

    /**
     * 批量删除集群标签
     * 为指定集群批量删除标签。  一个集群上最多有10个标签。  此接口为幂等接口：   - 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return BatchDeleteClusterTagsResponse
     */
    public BatchDeleteClusterTagsResponse batchDeleteClusterTags(BatchDeleteClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.batchDeleteClusterTags);
    }

    /**
     * 批量删除集群标签
     * 为指定集群批量删除标签。  一个集群上最多有10个标签。  此接口为幂等接口：   - 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsInvoker(BatchDeleteClusterTagsRequest request) {
        return new SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request, MrsMeta.batchDeleteClusterTags, hcClient);
    }

    /**
     * 创建集群并执行作业
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。 支持同一时间并发创建10个集群。 使用接口前，您需要先获取如[表1](mrs_02_0028.xml#mrs_02_0028__tbbd2986d18874f82a8ab886ac25a57f8)所示的资源信息。 约束说明： 1.针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时需要配置cluster_admin_secret。 针对MRS 1.8.0及以后版本，cluster_admin_secret为必选参数，不受参数“safe_mode”配置的影响。 2.集群登录方式有密码和密钥对两种，两者必选其一。 使用密码方式需要配置访问集群节点的root密码，即cluster_master_secret。 使用密钥对方式需要配置密钥对名称，即node_public_cert_name 3.磁盘参数可以使用volume_type和volume_size表示，也可以使用多磁盘相关的参数（master_data_volume_type、master_data_volume_size、master_data_volume_count、core_data_volume_type、core_data_volume_size和core_data_volume_count）表示。  
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createCluster);
    }

    /**
     * 创建集群并执行作业
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。 支持同一时间并发创建10个集群。 使用接口前，您需要先获取如[表1](mrs_02_0028.xml#mrs_02_0028__tbbd2986d18874f82a8ab886ac25a57f8)所示的资源信息。 约束说明： 1.针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时需要配置cluster_admin_secret。 针对MRS 1.8.0及以后版本，cluster_admin_secret为必选参数，不受参数“safe_mode”配置的影响。 2.集群登录方式有密码和密钥对两种，两者必选其一。 使用密码方式需要配置访问集群节点的root密码，即cluster_master_secret。 使用密钥对方式需要配置密钥对名称，即node_public_cert_name 3.磁盘参数可以使用volume_type和volume_size表示，也可以使用多磁盘相关的参数（master_data_volume_type、master_data_volume_size、master_data_volume_count、core_data_volume_type、core_data_volume_size和core_data_volume_count）表示。  
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, MrsMeta.createCluster, hcClient);
    }

    /**
     * 给指定集群添加标签
     * 为特定的集群添加一个tag。 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateClusterTagRequest 请求对象
     * @return CreateClusterTagResponse
     */
    public CreateClusterTagResponse createClusterTag(CreateClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createClusterTag);
    }

    /**
     * 给指定集群添加标签
     * 为特定的集群添加一个tag。 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateClusterTagRequest 请求对象
     * @return SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>
     */
    public SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse> createClusterTagInvoker(CreateClusterTagRequest request) {
        return new SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>(request, MrsMeta.createClusterTag, hcClient);
    }

    /**
     * 删除集群
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。  处于如下状态的集群不允许删除： scaling-out：扩容中 scaling-in：缩容中 starting：启动中 terminating：删除中 terminated：已删除 failed：失败
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteCluster);
    }

    /**
     * 删除集群
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。  处于如下状态的集群不允许删除： scaling-out：扩容中 scaling-in：缩容中 starting：启动中 terminating：删除中 terminated：已删除 failed：失败
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, MrsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除指定集群的标签
     * 删除特定集群的标签。
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return DeleteClusterTagResponse
     */
    public DeleteClusterTagResponse deleteClusterTag(DeleteClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteClusterTag);
    }

    /**
     * 删除指定集群的标签
     * 删除特定集群的标签。
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>
     */
    public SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse> deleteClusterTagInvoker(DeleteClusterTagRequest request) {
        return new SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>(request, MrsMeta.deleteClusterTag, hcClient);
    }

    /**
     * 查询所有标签
     * 查询租户在指定Region下的所有标签集合 。
     *
     * @param ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listAllTags);
    }

    /**
     * 查询所有标签
     * 查询租户在指定Region下的所有标签集合 。
     *
     * @param ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>(request, MrsMeta.listAllTags, hcClient);
    }

    /**
     * 查询指定集群的标签
     * 查询指定集群的标签信息。
     *
     * @param ListClusterTagsRequest 请求对象
     * @return ListClusterTagsResponse
     */
    public ListClusterTagsResponse listClusterTags(ListClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listClusterTags);
    }

    /**
     * 查询指定集群的标签
     * 查询指定集群的标签信息。
     *
     * @param ListClusterTagsRequest 请求对象
     * @return SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsInvoker(ListClusterTagsRequest request) {
        return new SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>(request, MrsMeta.listClusterTags, hcClient);
    }

}