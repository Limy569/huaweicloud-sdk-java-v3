package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ConferenceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateMeetingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private List<ConferenceInfo> data = null;
    
    public UpdateMeetingResponse withData(List<ConferenceInfo> data) {
        this.data = data;
        return this;
    }

    
    public UpdateMeetingResponse addDataItem(ConferenceInfo dataItem) {
        this.data.add(dataItem);
        return this;
    }

    public UpdateMeetingResponse withData(Consumer<List<ConferenceInfo>> dataSetter) {
        if(this.data == null ){
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 会议信息
     * @return data
     */
    public List<ConferenceInfo> getData() {
        return data;
    }

    public void setData(List<ConferenceInfo> data) {
        this.data = data;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMeetingResponse updateMeetingResponse = (UpdateMeetingResponse) o;
        return Objects.equals(this.data, updateMeetingResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMeetingResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
