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

import com.alibaba.xingchen.model.ext.chat.ChatSampleItem;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatReqParams
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class ChatReqParams {
  private CharacterKey botProfile;

  private List<Message> messages = new ArrayList<>();

  private List<ChatSampleItem> sampleMessages = new ArrayList<>();

  private AdvancedSettings advancedSettings;

  private ModelParameters modelParameters;

  private UserProfile userProfile;

  private Scenario scenario;

  private Boolean streaming;

  private Context context;

  private String source;
}

