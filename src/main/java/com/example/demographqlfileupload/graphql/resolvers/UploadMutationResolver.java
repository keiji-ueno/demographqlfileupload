package com.example.demographqlfileupload.graphql.resolvers;


/**
 * ファイルをアップロードする
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-10-22T15:11:53+0900"
)
public interface UploadMutationResolver {

    /**
     * ファイルをアップロードする
     */
    Boolean upload(javax.servlet.http.Part file) throws Exception;

}
