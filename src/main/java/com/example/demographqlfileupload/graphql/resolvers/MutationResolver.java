package com.example.demographqlfileupload.graphql.resolvers;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-10-25T19:12:40+0900"
)
public interface MutationResolver extends graphql.kickstart.tools.GraphQLMutationResolver {

    /**
     * ファイルをアップロードする
     */
    Boolean upload(javax.servlet.http.Part file) throws Exception;

}
