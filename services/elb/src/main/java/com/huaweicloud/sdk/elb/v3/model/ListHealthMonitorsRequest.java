package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListHealthMonitorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    
    private List<Integer> delay = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private List<String> domainName = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private List<String> enterpriseProjectId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expected_codes")
    
    private List<String> expectedCodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_method")
    
    private List<String> httpMethod = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_retries")
    
    private List<Integer> maxRetries = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_retries_down")
    
    private List<Integer> maxRetriesDown = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="monitor_port")
    
    private List<Integer> monitorPort = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private List<String> type = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_path")
    
    private List<String> urlPath = null;
    
    public ListHealthMonitorsRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 健康检查的管理状态；该字段虽然支持创建、更新，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。该字段虽然支持创建、更新，但实际取值决定于member对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public ListHealthMonitorsRequest withDelay(List<Integer> delay) {
        this.delay = delay;
        return this;
    }

    
    public ListHealthMonitorsRequest addDelayItem(Integer delayItem) {
        if(this.delay == null) {
            this.delay = new ArrayList<>();
        }
        this.delay.add(delayItem);
        return this;
    }

    public ListHealthMonitorsRequest withDelay(Consumer<List<Integer>> delaySetter) {
        if(this.delay == null) {
            this.delay = new ArrayList<>();
        }
        delaySetter.accept(this.delay);
        return this;
    }

    /**
     * 健康检查间隔。
     * @return delay
     */
    public List<Integer> getDelay() {
        return delay;
    }

    public void setDelay(List<Integer> delay) {
        this.delay = delay;
    }

    

    public ListHealthMonitorsRequest withDomainName(List<String> domainName) {
        this.domainName = domainName;
        return this;
    }

    
    public ListHealthMonitorsRequest addDomainNameItem(String domainNameItem) {
        if(this.domainName == null) {
            this.domainName = new ArrayList<>();
        }
        this.domainName.add(domainNameItem);
        return this;
    }

    public ListHealthMonitorsRequest withDomainName(Consumer<List<String>> domainNameSetter) {
        if(this.domainName == null) {
            this.domainName = new ArrayList<>();
        }
        domainNameSetter.accept(this.domainName);
        return this;
    }

    /**
     * 功能说明：健康检查测试member健康状态时，发送的http请求的域名。仅当type为HTTP时生效。使用说明：默认为空，表示使用负载均衡器的vip作为http请求的目的地址。以数字或字母开头，只能包含数字、字母、’-’、’.’。
     * @return domainName
     */
    public List<String> getDomainName() {
        return domainName;
    }

    public void setDomainName(List<String> domainName) {
        this.domainName = domainName;
    }

    

    public ListHealthMonitorsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    
    public ListHealthMonitorsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if(this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListHealthMonitorsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if(this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListHealthMonitorsRequest withExpectedCodes(List<String> expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    
    public ListHealthMonitorsRequest addExpectedCodesItem(String expectedCodesItem) {
        if(this.expectedCodes == null) {
            this.expectedCodes = new ArrayList<>();
        }
        this.expectedCodes.add(expectedCodesItem);
        return this;
    }

    public ListHealthMonitorsRequest withExpectedCodes(Consumer<List<String>> expectedCodesSetter) {
        if(this.expectedCodes == null) {
            this.expectedCodes = new ArrayList<>();
        }
        expectedCodesSetter.accept(this.expectedCodes);
        return this;
    }

    /**
     * 期望HTTP响应状态码，指定下列值：单值，例如200；列表，例如200，202；区间，例如200-204。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * @return expectedCodes
     */
    public List<String> getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(List<String> expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    

    public ListHealthMonitorsRequest withHttpMethod(List<String> httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    
    public ListHealthMonitorsRequest addHttpMethodItem(String httpMethodItem) {
        if(this.httpMethod == null) {
            this.httpMethod = new ArrayList<>();
        }
        this.httpMethod.add(httpMethodItem);
        return this;
    }

    public ListHealthMonitorsRequest withHttpMethod(Consumer<List<String>> httpMethodSetter) {
        if(this.httpMethod == null) {
            this.httpMethod = new ArrayList<>();
        }
        httpMethodSetter.accept(this.httpMethod);
        return this;
    }

    /**
     * HTTP方法，可以为GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * @return httpMethod
     */
    public List<String> getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(List<String> httpMethod) {
        this.httpMethod = httpMethod;
    }

    

    public ListHealthMonitorsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListHealthMonitorsRequest addIdItem(String idItem) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListHealthMonitorsRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 健康检查ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    public ListHealthMonitorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的个数。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListHealthMonitorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 上一页最后一条记录的ID。  使用说明：  - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListHealthMonitorsRequest withMaxRetries(List<Integer> maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    
    public ListHealthMonitorsRequest addMaxRetriesItem(Integer maxRetriesItem) {
        if(this.maxRetries == null) {
            this.maxRetries = new ArrayList<>();
        }
        this.maxRetries.add(maxRetriesItem);
        return this;
    }

    public ListHealthMonitorsRequest withMaxRetries(Consumer<List<Integer>> maxRetriesSetter) {
        if(this.maxRetries == null) {
            this.maxRetries = new ArrayList<>();
        }
        maxRetriesSetter.accept(this.maxRetries);
        return this;
    }

    /**
     * 最大重试次数。
     * @return maxRetries
     */
    public List<Integer> getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(List<Integer> maxRetries) {
        this.maxRetries = maxRetries;
    }

    

    public ListHealthMonitorsRequest withMaxRetriesDown(List<Integer> maxRetriesDown) {
        this.maxRetriesDown = maxRetriesDown;
        return this;
    }

    
    public ListHealthMonitorsRequest addMaxRetriesDownItem(Integer maxRetriesDownItem) {
        if(this.maxRetriesDown == null) {
            this.maxRetriesDown = new ArrayList<>();
        }
        this.maxRetriesDown.add(maxRetriesDownItem);
        return this;
    }

    public ListHealthMonitorsRequest withMaxRetriesDown(Consumer<List<Integer>> maxRetriesDownSetter) {
        if(this.maxRetriesDown == null) {
            this.maxRetriesDown = new ArrayList<>();
        }
        maxRetriesDownSetter.accept(this.maxRetriesDown);
        return this;
    }

    /**
     * 健康检查连续成功多少次后，将后端服务器的健康检查状态由ONLINE判定为OFFLINE，取值范围[1，10]。
     * @return maxRetriesDown
     */
    public List<Integer> getMaxRetriesDown() {
        return maxRetriesDown;
    }

    public void setMaxRetriesDown(List<Integer> maxRetriesDown) {
        this.maxRetriesDown = maxRetriesDown;
    }

    

    public ListHealthMonitorsRequest withMonitorPort(List<Integer> monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    
    public ListHealthMonitorsRequest addMonitorPortItem(Integer monitorPortItem) {
        if(this.monitorPort == null) {
            this.monitorPort = new ArrayList<>();
        }
        this.monitorPort.add(monitorPortItem);
        return this;
    }

    public ListHealthMonitorsRequest withMonitorPort(Consumer<List<Integer>> monitorPortSetter) {
        if(this.monitorPort == null) {
            this.monitorPort = new ArrayList<>();
        }
        monitorPortSetter.accept(this.monitorPort);
        return this;
    }

    /**
     * 健康检查端口号。
     * @return monitorPort
     */
    public List<Integer> getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(List<Integer> monitorPort) {
        this.monitorPort = monitorPort;
    }

    

    public ListHealthMonitorsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListHealthMonitorsRequest addNameItem(String nameItem) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListHealthMonitorsRequest withName(Consumer<List<String>> nameSetter) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 健康检查名称。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    

    public ListHealthMonitorsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 使用说明：必须与limit一起使用。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListHealthMonitorsRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 健康检查的超时时间。建议该值小于delay的值。
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    

    public ListHealthMonitorsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    
    public ListHealthMonitorsRequest addTypeItem(String typeItem) {
        if(this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListHealthMonitorsRequest withType(Consumer<List<String>> typeSetter) {
        if(this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 健康检查类型。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    

    public ListHealthMonitorsRequest withUrlPath(List<String> urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    
    public ListHealthMonitorsRequest addUrlPathItem(String urlPathItem) {
        if(this.urlPath == null) {
            this.urlPath = new ArrayList<>();
        }
        this.urlPath.add(urlPathItem);
        return this;
    }

    public ListHealthMonitorsRequest withUrlPath(Consumer<List<String>> urlPathSetter) {
        if(this.urlPath == null) {
            this.urlPath = new ArrayList<>();
        }
        urlPathSetter.accept(this.urlPath);
        return this;
    }

    /**
     * 功能说明：健康检查测试member健康时发送的http请求路径。默认为“/”。使用说明：以“/”开头。仅当type为HTTP时生效。
     * @return urlPath
     */
    public List<String> getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(List<String> urlPath) {
        this.urlPath = urlPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHealthMonitorsRequest listHealthMonitorsRequest = (ListHealthMonitorsRequest) o;
        return Objects.equals(this.adminStateUp, listHealthMonitorsRequest.adminStateUp) &&
            Objects.equals(this.delay, listHealthMonitorsRequest.delay) &&
            Objects.equals(this.domainName, listHealthMonitorsRequest.domainName) &&
            Objects.equals(this.enterpriseProjectId, listHealthMonitorsRequest.enterpriseProjectId) &&
            Objects.equals(this.expectedCodes, listHealthMonitorsRequest.expectedCodes) &&
            Objects.equals(this.httpMethod, listHealthMonitorsRequest.httpMethod) &&
            Objects.equals(this.id, listHealthMonitorsRequest.id) &&
            Objects.equals(this.limit, listHealthMonitorsRequest.limit) &&
            Objects.equals(this.marker, listHealthMonitorsRequest.marker) &&
            Objects.equals(this.maxRetries, listHealthMonitorsRequest.maxRetries) &&
            Objects.equals(this.maxRetriesDown, listHealthMonitorsRequest.maxRetriesDown) &&
            Objects.equals(this.monitorPort, listHealthMonitorsRequest.monitorPort) &&
            Objects.equals(this.name, listHealthMonitorsRequest.name) &&
            Objects.equals(this.pageReverse, listHealthMonitorsRequest.pageReverse) &&
            Objects.equals(this.timeout, listHealthMonitorsRequest.timeout) &&
            Objects.equals(this.type, listHealthMonitorsRequest.type) &&
            Objects.equals(this.urlPath, listHealthMonitorsRequest.urlPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, delay, domainName, enterpriseProjectId, expectedCodes, httpMethod, id, limit, marker, maxRetries, maxRetriesDown, monitorPort, name, pageReverse, timeout, type, urlPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthMonitorsRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    maxRetriesDown: ").append(toIndentedString(maxRetriesDown)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

