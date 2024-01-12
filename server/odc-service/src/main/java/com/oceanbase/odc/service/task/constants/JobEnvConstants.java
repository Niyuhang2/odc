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

package com.oceanbase.odc.service.task.constants;

/**
 * Task framework environment constants. Using 'ODC_' prefix to avoid duplication.
 * 
 * @author yaobin
 * @date 2023-11-21
 * @since 4.2.4
 */
public class JobEnvConstants {

    public static final String TASK_ALL_PARAMETERS = "ODC_TASK_ALL_PARAMETERS";

    public static final String TASK_RUN_MODE = "ODC_TASK_RUN_MODE";

    public static final String BOOT_MODE = "ODC_BOOT_MODE";

    public static final String LOG_DIRECTORY = "odc.log.directory";

    public static final String ODC_SERVER_PORT = "ODC_SERVER_PORT";

    public static final String ODC_SERVICE_HOST = "ODC_SERVICE_HOST";

    public static final String ODC_SERVICE_PORT = "ODC_SERVICE_PORT";

    public static final String ODC_IMAGE_NAME = "ODC_IMAGE_NAME";

}