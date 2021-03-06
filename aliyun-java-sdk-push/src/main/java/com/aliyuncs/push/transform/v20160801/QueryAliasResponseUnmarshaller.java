/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryAliasResponse;
import com.aliyuncs.push.model.v20160801.QueryAliasResponse.AliasInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAliasResponseUnmarshaller {

	public static QueryAliasResponse unmarshall(QueryAliasResponse queryAliasResponse, UnmarshallerContext context) {
		
		queryAliasResponse.setRequestId(context.stringValue("QueryAliasResponse.RequestId"));

		List<AliasInfo> aliasInfos = new ArrayList<AliasInfo>();
		for (int i = 0; i < context.lengthValue("QueryAliasResponse.AliasInfos.Length"); i++) {
			AliasInfo aliasInfo = new AliasInfo();
			aliasInfo.setAliasName(context.stringValue("QueryAliasResponse.AliasInfos["+ i +"].AliasName"));

			aliasInfos.add(aliasInfo);
		}
		queryAliasResponse.setAliasInfos(aliasInfos);
	 
	 	return queryAliasResponse;
	}
}