package com.huaweicloud.sdk.functiongraph.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.FuncAsyncDestinationConfig;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 函数异步配置请求体。
 */
public class UpdateFunctionAsyncInvokeConfigRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_async_event_age_in_seconds")
    
    private Integer maxAsyncEventAgeInSeconds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_async_retry_attempts")
    
    private Integer maxAsyncRetryAttempts;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_config")
    
    private FuncAsyncDestinationConfig destinationConfig;

    public UpdateFunctionAsyncInvokeConfigRequestBody withMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }

    


    /**
     * 消息最大存活时长，取值范围[1，86400]，单位：秒，默认值为3600。
     * @return maxAsyncEventAgeInSeconds
     */
    public Integer getMaxAsyncEventAgeInSeconds() {
        return maxAsyncEventAgeInSeconds;
    }

    public void setMaxAsyncEventAgeInSeconds(Integer maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
    }

    

    public UpdateFunctionAsyncInvokeConfigRequestBody withMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }

    


    /**
     * 异步调用失败后的最大重试次数，默认值为1。取值范围[0，3]。
     * @return maxAsyncRetryAttempts
     */
    public Integer getMaxAsyncRetryAttempts() {
        return maxAsyncRetryAttempts;
    }

    public void setMaxAsyncRetryAttempts(Integer maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
    }

    

    public UpdateFunctionAsyncInvokeConfigRequestBody withDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    public UpdateFunctionAsyncInvokeConfigRequestBody withDestinationConfig(Consumer<FuncAsyncDestinationConfig> destinationConfigSetter) {
        if(this.destinationConfig == null ){
            this.destinationConfig = new FuncAsyncDestinationConfig();
            destinationConfigSetter.accept(this.destinationConfig);
        }
        
        return this;
    }


    /**
     * Get destinationConfig
     * @return destinationConfig
     */
    public FuncAsyncDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    public void setDestinationConfig(FuncAsyncDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFunctionAsyncInvokeConfigRequestBody updateFunctionAsyncInvokeConfigRequestBody = (UpdateFunctionAsyncInvokeConfigRequestBody) o;
        return Objects.equals(this.maxAsyncEventAgeInSeconds, updateFunctionAsyncInvokeConfigRequestBody.maxAsyncEventAgeInSeconds) &&
            Objects.equals(this.maxAsyncRetryAttempts, updateFunctionAsyncInvokeConfigRequestBody.maxAsyncRetryAttempts) &&
            Objects.equals(this.destinationConfig, updateFunctionAsyncInvokeConfigRequestBody.destinationConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maxAsyncEventAgeInSeconds, maxAsyncRetryAttempts, destinationConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionAsyncInvokeConfigRequestBody {\n");
        sb.append("    maxAsyncEventAgeInSeconds: ").append(toIndentedString(maxAsyncEventAgeInSeconds)).append("\n");
        sb.append("    maxAsyncRetryAttempts: ").append(toIndentedString(maxAsyncRetryAttempts)).append("\n");
        sb.append("    destinationConfig: ").append(toIndentedString(destinationConfig)).append("\n");
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

