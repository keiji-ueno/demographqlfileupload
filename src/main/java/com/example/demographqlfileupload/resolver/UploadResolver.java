package com.example.demographqlfileupload.resolver;

import javax.servlet.http.Part;

import org.springframework.stereotype.Component;

import com.example.demographqlfileupload.graphql.resolvers.QueryResolver;
import com.example.demographqlfileupload.graphql.resolvers.UploadMutationResolver;

@Component
public class UploadResolver
    implements UploadMutationResolver, QueryResolver {

	@Override
	public Boolean upload(Part file) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
