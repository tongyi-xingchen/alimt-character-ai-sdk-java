/*
 * XingChen 开放接口定义
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alibaba.xingchen.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * MessageRatingRequest
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class MessageRatingRequest {
  private String messageId;

  private Integer rating;
}

