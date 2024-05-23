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
package com.oceanbase.odc.service.queryprofile.model;

/**
 * @author: liuyizhuo.lyz
 * @date: 2024/4/19
 */
public class ProfileConstants {

    public static final String DB_TIME = "DB Time";
    public static final String CHANGE_TIME = "Change Time";
    public static final String IO_READ_BYTES = "total io bytes read from disk";
    public static final String BYTES_IN_TOTAL = "total bytes processed by ssstore";
    public static final String SSSTORE_ROWS_IN_TOTAL = "total rows processed by ssstore";
    public static final String MEMSTORE_ROWS_IN_TOTAL = "total rows processed by memstore";
    public static final String RESCAN_TIMES = "rescan times";

    public static final String REMOTE_IO_READ_BYTES = "remote io bytes";
    public static final String REMOTE_BYTES_IN_TOTAL = "remote bytes processed";
    public static final String REMOTE_ROWS_IN_TOTAL = "remote rows processed";

    public static final String OTHER_STATS = "Other Stats";
    public static final String STATUS = "Status";

    public static final String PROFILE_NOT_SUPPORT = "${com.oceanbase.odc.ErrorCodes.ObQueryProfileNotSupported}";
    public static final String SQL_TYPE_NOT_SUPPORT = "${com.oceanbase.odc.ErrorCodes.SqlTypeNotSupported}";

}
