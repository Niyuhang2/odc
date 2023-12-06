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

package com.oceanbase.odc.service.task.schedule;

import com.oceanbase.odc.service.task.caller.DefaultJobContext;
import com.oceanbase.odc.service.task.caller.JobContext;
import com.oceanbase.odc.service.task.config.JobConfiguration;
import com.oceanbase.odc.service.task.config.JobConfigurationHolder;

/**
 * @author yaobin
 * @date 2023-11-30
 * @since 4.2.4
 */
public class DefaultJobContextBuilder implements JobContextBuilder {
    @Override
    public JobContext build(JobDefinition jd) {
        JobConfiguration configuration = JobConfigurationHolder.getJobConfiguration();
        DefaultJobContext jobContext = new DefaultJobContext();
        jobContext.setJobIdentity(jd.getJobIdentity());
        jobContext.setJobData(jd.getJobData());
        jobContext.setHostUrls(configuration.getHostUrlProvider().hostUrl());
        return jobContext;
    }
}
