package com.example.demographqlfileupload.graphql.resolvers;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-10-22T15:11:53+0900"
)
public interface MutationResolver {

    /**
     * ファイルをアップロードする
     */
    Boolean upload(javax.servlet.http.Part file) throws Exception;

}
