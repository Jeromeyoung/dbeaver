/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License")),
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

package org.jkiss.dbeaver.ui.editors.sql.syntax.tokens;

import org.jkiss.dbeaver.model.text.parser.TPTokenType;

/**
 * SQL token type
 */
public enum SQLTokenType implements TPTokenType {

    T_UNKNOWN(1000),
    T_BLOCK_BEGIN(1001),
    T_BLOCK_END(1002),
    T_BLOCK_TOGGLE(1003),
    T_BLOCK_HEADER(1004),

    T_COMMENT(1005),
    T_CONTROL(1006),
    T_DELIMITER(1007),
    T_SET_DELIMITER(1008),
    T_PARAMETER(1009),
    T_VARIABLE(1010);

    private final int type;

    SQLTokenType(int type) {
        this.type = type;
    }

    @Override
    public int getTokenType() {
        return type;
    }

    @Override
    public String getTypeId() {
        return null;
    }

}