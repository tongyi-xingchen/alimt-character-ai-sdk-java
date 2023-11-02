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
 * 角色版本创建或更新对象
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class CharacterVersionCreateOrUpdateDTO {
  private String name;

  private FileInfoVO avatar;

  private String introduction;

  private String basicInformation;

  private String openingLine;

  private String traits;

  private String chatExample;

  private String type;

  private String chatObjective;

  private CharacterAdvancedConfig advancedConfig;

  private String characterId;

  private Integer version;
}

