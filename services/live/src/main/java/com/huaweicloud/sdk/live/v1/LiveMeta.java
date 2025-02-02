package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForcreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForcreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LiveDomainCreateReq.class,
            f -> f.withMarshaller(CreateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMapping = genForcreateDomainMapping();

    private static HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> genForcreateDomainMapping() {
        // basic
        HttpRequestDef.Builder<CreateDomainMappingRequest, CreateDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateDomainMappingRequest.class, CreateDomainMappingResponse.class)
                .withName("CreateDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDomainMappingRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DomainMapping.class,
            f -> f.withMarshaller(CreateDomainMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordConfigRequest, CreateRecordConfigResponse> createRecordConfig = genForcreateRecordConfig();

    private static HttpRequestDef<CreateRecordConfigRequest, CreateRecordConfigResponse> genForcreateRecordConfig() {
        // basic
        HttpRequestDef.Builder<CreateRecordConfigRequest, CreateRecordConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordConfigRequest.class, CreateRecordConfigResponse.class)
                .withName("CreateRecordConfig")
                .withUri("/v1/{project_id}/record/config")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecordConfigInfo.class,
            f -> f.withMarshaller(CreateRecordConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbidden = genForcreateStreamForbidden();

    private static HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> genForcreateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStreamForbiddenRequest.class, CreateStreamForbiddenResponse.class)
                .withName("CreateStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamForbiddenSetting.class,
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplate = genForcreateTranscodingsTemplate();

    private static HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> genForcreateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTranscodingsTemplateRequest.class, CreateTranscodingsTemplateResponse.class)
                .withName("CreateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamTranscodingTemplate.class,
            f -> f.withMarshaller(CreateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genFordeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genFordeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMapping = genFordeleteDomainMapping();

    private static HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> genFordeleteDomainMapping() {
        // basic
        HttpRequestDef.Builder<DeleteDomainMappingRequest, DeleteDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainMappingRequest.class, DeleteDomainMappingResponse.class)
                .withName("DeleteDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("pull_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPullDomain, (req, v) -> {
                req.setPullDomain(v);
            })
        );
        builder.withRequestField("push_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPushDomain, (req, v) -> {
                req.setPushDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordConfigRequest, DeleteRecordConfigResponse> deleteRecordConfig = genFordeleteRecordConfig();

    private static HttpRequestDef<DeleteRecordConfigRequest, DeleteRecordConfigResponse> genFordeleteRecordConfig() {
        // basic
        HttpRequestDef.Builder<DeleteRecordConfigRequest, DeleteRecordConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordConfigRequest.class, DeleteRecordConfigResponse.class)
                .withName("DeleteRecordConfig")
                .withUri("/v1/{project_id}/record/config")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRecordConfigRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRecordConfigRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbidden = genFordeleteStreamForbidden();

    private static HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> genFordeleteStreamForbidden() {
        // basic
        HttpRequestDef.Builder<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStreamForbiddenRequest.class, DeleteStreamForbiddenResponse.class)
                .withName("DeleteStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplate = genFordeleteTranscodingsTemplate();

    private static HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> genFordeleteTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTranscodingsTemplateRequest.class, DeleteTranscodingsTemplateResponse.class)
                .withName("DeleteTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogs = genForlistLiveSampleLogs();

    private static HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> genForlistLiveSampleLogs() {
        // basic
        HttpRequestDef.Builder<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveSampleLogsRequest.class, ListLiveSampleLogsResponse.class)
                .withName("ListLiveSampleLogs")
                .withUri("/v1/{project_id}/logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            OffsetDateTime.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            OffsetDateTime.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnline = genForlistLiveStreamsOnline();

    private static HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> genForlistLiveStreamsOnline() {
        // basic
        HttpRequestDef.Builder<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveStreamsOnlineRequest.class, ListLiveStreamsOnlineResponse.class)
                .withName("ListLiveStreamsOnline")
                .withUri("/v1/{project_id}/realtime/streams")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRecordConfigsRequest, ListRecordConfigsResponse> listRecordConfigs = genForlistRecordConfigs();

    private static HttpRequestDef<ListRecordConfigsRequest, ListRecordConfigsResponse> genForlistRecordConfigs() {
        // basic
        HttpRequestDef.Builder<ListRecordConfigsRequest, ListRecordConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordConfigsRequest.class, ListRecordConfigsResponse.class)
                .withName("ListRecordConfigs")
                .withUri("/v1/{project_id}/record/config")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListRecordConfigsRequest.RecordTypeEnum.class,
            f -> f.withMarshaller(ListRecordConfigsRequest::getRecordType, (req, v) -> {
                req.setRecordType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbidden = genForlistStreamForbidden();

    private static HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> genForlistStreamForbidden() {
        // basic
        HttpRequestDef.Builder<ListStreamForbiddenRequest, ListStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStreamForbiddenRequest.class, ListStreamForbiddenResponse.class)
                .withName("ListStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth = genForshowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForshowBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthRequest, ShowBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthRequest.class, ShowBandwidthResponse.class)
                .withName("ShowBandwidth")
                .withUri("/v1/{project_id}/stream/bandwidth")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBandwidthRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBandwidthRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBandwidthRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("step",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowBandwidthRequest::getStep, (req, v) -> {
                req.setStep(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForshowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForshowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowOnlineUsersRequest, ShowOnlineUsersResponse> showOnlineUsers = genForshowOnlineUsers();

    private static HttpRequestDef<ShowOnlineUsersRequest, ShowOnlineUsersResponse> genForshowOnlineUsers() {
        // basic
        HttpRequestDef.Builder<ShowOnlineUsersRequest, ShowOnlineUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOnlineUsersRequest.class, ShowOnlineUsersResponse.class)
                .withName("ShowOnlineUsers")
                .withUri("/v1/{project_id}/stream/users")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            OffsetDateTime.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            OffsetDateTime.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("step",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowOnlineUsersRequest::getStep, (req, v) -> {
                req.setStep(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficRequest, ShowTrafficResponse> showTraffic = genForshowTraffic();

    private static HttpRequestDef<ShowTrafficRequest, ShowTrafficResponse> genForshowTraffic() {
        // basic
        HttpRequestDef.Builder<ShowTrafficRequest, ShowTrafficResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTrafficRequest.class, ShowTrafficResponse.class)
                .withName("ShowTraffic")
                .withUri("/v1/{project_id}/stream/traffic")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTrafficRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTrafficRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTrafficRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("step",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTrafficRequest::getStep, (req, v) -> {
                req.setStep(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplate = genForshowTranscodingsTemplate();

    private static HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> genForshowTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTranscodingsTemplateRequest.class, ShowTranscodingsTemplateResponse.class)
                .withName("ShowTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForupdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForupdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LiveDomainModifyReq.class,
            f -> f.withMarshaller(UpdateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbidden = genForupdateStreamForbidden();

    private static HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> genForupdateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStreamForbiddenRequest.class, UpdateStreamForbiddenResponse.class)
                .withName("UpdateStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamForbiddenSetting.class,
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplate = genForupdateTranscodingsTemplate();

    private static HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> genForupdateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTranscodingsTemplateRequest.class, UpdateTranscodingsTemplateResponse.class)
                .withName("UpdateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamTranscodingTemplate.class,
            f -> f.withMarshaller(UpdateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
