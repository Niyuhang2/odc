/*
 * Copyright (c) 2023 OceanBase.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oceanbase.odc.service.task.executor.task;

import java.io.Serializable;

import com.oceanbase.odc.core.shared.constant.TaskStatus;
import com.oceanbase.odc.service.task.model.ExecutorInfo;
import com.oceanbase.odc.service.task.schedule.JobIdentity;

import lombok.Data;

/**
 * @author yaobin
 * @date 2023-11-29
 * @since 4.2.4
 */
@Data
public class DefaultTaskResult implements TaskResult, Serializable {

    private JobIdentity jobIdentity;

    private TaskStatus taskStatus;

    private String resultJson;

    private ExecutorInfo executorInfo;

    private double progress;

    private boolean finished;

}