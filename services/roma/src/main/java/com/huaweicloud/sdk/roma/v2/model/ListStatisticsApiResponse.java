package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Statistics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatisticsApiResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<Statistics> list = null;
    
    public ListStatisticsApiResponse withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public ListStatisticsApiResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 统计起始时间UTC的时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public ListStatisticsApiResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 统计结束时间UTC的时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public ListStatisticsApiResponse withList(List<Statistics> list) {
        this.list = list;
        return this;
    }

    
    public ListStatisticsApiResponse addListItem(Statistics listItem) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListStatisticsApiResponse withList(Consumer<List<Statistics>> listSetter) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * APP维度下不同周期指标列表
     * @return list
     */
    public List<Statistics> getList() {
        return list;
    }

    public void setList(List<Statistics> list) {
        this.list = list;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsApiResponse listStatisticsApiResponse = (ListStatisticsApiResponse) o;
        return Objects.equals(this.code, listStatisticsApiResponse.code) &&
            Objects.equals(this.startTime, listStatisticsApiResponse.startTime) &&
            Objects.equals(this.endTime, listStatisticsApiResponse.endTime) &&
            Objects.equals(this.list, listStatisticsApiResponse.list);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, startTime, endTime, list);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsApiResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

