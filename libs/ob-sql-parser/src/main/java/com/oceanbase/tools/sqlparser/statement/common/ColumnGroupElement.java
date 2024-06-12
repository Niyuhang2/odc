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
package com.oceanbase.tools.sqlparser.statement.common;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import com.oceanbase.tools.sqlparser.statement.BaseStatement;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author: liuyizhuo.lyz
 * @date: 2024/4/28
 */
@Getter
@EqualsAndHashCode(callSuper = false)
public class ColumnGroupElement extends BaseStatement {

    private boolean allColumns;
    private boolean eachColumn;
    private String groupName;
    private List<String> columnNames;

    public ColumnGroupElement(boolean allColumns, boolean eachColumn) {
        this.allColumns = allColumns;
        this.eachColumn = eachColumn;
    }

    public ColumnGroupElement(String groupName, List<String> columnNames) {
        this.groupName = groupName;
        this.columnNames = columnNames;
    }

    public ColumnGroupElement(ParserRuleContext ruleNode, boolean allColumns, boolean eachColumn) {
        super(ruleNode);
        this.allColumns = allColumns;
        this.eachColumn = eachColumn;
    }

    public ColumnGroupElement(ParserRuleContext ruleNode, String groupName, List<String> columnNames) {
        super(ruleNode);
        this.groupName = groupName;
        this.columnNames = columnNames;
    }

    @Override
    public String toString() {
        if (isAllColumns()) {
            return "ALL COLUMNS";
        } else if (isEachColumn()) {
            return "EACH COLUMN";
        }
        return String.format("%s(%s)", groupName, String.join(",", columnNames));
    }

}
