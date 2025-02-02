package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.CommonQueryTaskRsp;
import com.huaweicloud.sdk.mpc.v1.model.RemuxTask;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRemuxTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<RemuxTask> tasks = null;
    
    public ListRemuxTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 任务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListRemuxTaskResponse withTasks(List<RemuxTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ListRemuxTaskResponse addTasksItem(RemuxTask tasksItem) {
        if(this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListRemuxTaskResponse withTasks(Consumer<List<RemuxTask>> tasksSetter) {
        if(this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务列表
     * @return tasks
     */
    public List<RemuxTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<RemuxTask> tasks) {
        this.tasks = tasks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRemuxTaskResponse listRemuxTaskResponse = (ListRemuxTaskResponse) o;
        return Objects.equals(this.total, listRemuxTaskResponse.total) &&
            Objects.equals(this.tasks, listRemuxTaskResponse.tasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, tasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRemuxTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

