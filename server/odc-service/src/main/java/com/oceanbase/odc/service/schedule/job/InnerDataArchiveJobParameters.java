/*
 * Copyright (c) 2024 OceanBase.
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

package com.oceanbase.odc.service.schedule.job;

import java.util.Date;
import java.util.List;

import com.oceanbase.odc.service.connection.model.ConnectionConfig;
import com.oceanbase.odc.service.dlm.model.DataArchiveTableConfig;
import com.oceanbase.odc.service.dlm.model.RateLimitConfiguration;
import com.oceanbase.tools.migrator.common.enums.MigrationInsertAction;
import com.oceanbase.tools.migrator.common.enums.ShardingStrategy;

import lombok.Data;

/**
 * @Author：tinker
 * @Date: 2024/1/31 15:43
 * @Descripition:
 */

@Data
public class InnerDataArchiveJobParameters {

    private List<DataArchiveTableConfig> tables;

    private ConnectionConfig sourceDs;

    private ConnectionConfig targetDs;

    private boolean deleteAfterMigration;

    private MigrationInsertAction migrationInsertAction;

    private boolean needPrintSqlTrace;

    private RateLimitConfiguration rateLimit;

    private int readThreadCount;

    private int writeThreadCount;

    private int queryTimeout;

    private ShardingStrategy shardingStrategy;

    private int scanBatchSize;

}